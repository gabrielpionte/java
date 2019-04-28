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
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

public class UsuarioDao implements IDAO<Usuario>{
    private Connection conn;
    
    UsuarioDao(Connection c)           
    {
    this.conn=c;
    }
    @Override
     public void inserir(Usuario u) {
        try
        {
            String sql = "insert into usuario (nome, senha) values('"+u.getNome()+"','"+u.getSenha()+"')";
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Foi3");
        }
        catch(Exception ex){System.out.println(ex);}
    }
     @Override
     public void alterar(Usuario u) {
        try
        {
            String sql = "update into usuario (nome, senha) values('"+u.getNome()+"','"+u.getSenha()+"')";
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Foi3");
        }
        catch(Exception ex){System.out.println(ex);}
    }
     @Override
    public List listar() {
       String sql = "select * from usuario";
       System.out.println(sql);
       List usuarios = new ArrayList();
       String nome = null;
       String senha = null;
       
       try{
           PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
           ResultSet ps = prepareStatement.executeQuery();
           
           while(ps.next()) {
               int cod = ps.getInt("COD_Usuario");
               nome=ps.getString("Nome");
               senha=ps.getString("Senha");
               
               usuarios.add("\nCOD_Usuario: "+cod+"\nNome: "+nome+"\nSenha: "+senha);
               System.out.println(usuarios);
           } 
       } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public boolean Login(Usuario u) throws SQLException{
        boolean x = false;
        
        String sql = "select * from usuario where Nome='"+u.getNome()+"' and senha='"+u.getSenha()+"' ";
        System.out.println(sql);
        List usuario = new ArrayList();
        String nome = null;
        String senha = null;
        
        try{
            PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
            ResultSet ps = prepareStatement.executeQuery();
            while(ps.next()){
                int cod = ps.getInt("cod");;
                nome = ps.getString("Nome");
                senha = ps.getString("Senha");
                if(nome.equals(u.getNome()) && senha.equals(u.getSenha())){
                    showMessageDialog(null, "Login Efetuado");
                    return true;
                }
                else{
                    showMessageDialog(null, "Usuario Registrado");
                    return false;
                }
            }
            prepareStatement.close();
        }catch(SQLException e){showMessageDialog(null, e);
        return false;
}
        return false;

    }
}

