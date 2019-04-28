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

public class ProfessorDao implements IDAO<Professor>{
    private Connection conn;
    
    ProfessorDao(Connection c)           
    {
    this.conn=c;
    }
    @Override
     public void inserir(Professor p) {
        try
        {
            String sql = "insert into professor (nome) values('"+p.getNome()+"')";
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Foi2");
        }
        catch(Exception ex){System.out.println(ex);}
    }
     @Override
     public void alterar(Professor p) {
        try
        {
            String sql = "update into professor (nome) values('"+p.getNome()+"')";
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Foi2");
        }
        catch(Exception ex){System.out.println(ex);}
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
