/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import java.sql.*;
import java.util.*;

public class AlunoDao implements IDAO<Aluno>{
    private Connection conn;
    
    AlunoDao(Connection c)           
    {
    this.conn=c;
    }
    @Override
     public void inserir(Aluno a) {
        try
        {
            String sql = "insert into aluno (nome) values('"+a.getNome()+"')";
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Foi");
        }
        catch(Exception ex){System.out.println(ex);}
    }
     @Override
     public void alterar(Aluno a) {
        try
        {
            String sql = "update into aluno (nome) values('"+a.getNome()+"')";
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Foi");
        }
        catch(Exception ex){System.out.println(ex);}
        
    }
     //criar um BD
     @Override
     public List listar(){
         String sql = "select * from tb_vendas";
         System.out.println(sql);
         List vendas = new ArrayList();
         try{
             PreparedStatement ps = this.conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 int cod=rs.getInt("cod");
                 String nome=rs.getString("nome");
                 vendas.add("\nCOD: "+cod+"\nNome: "+nome);
                 
                 
                 
             }
             ps.close();
         } catch (SQLException e){
             e.printStackTrace();
         }
         return vendas;
     }
}
