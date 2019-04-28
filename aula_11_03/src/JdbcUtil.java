

import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import java.sql.Connection;
import java.sql.DriverManager;
class JdbcUtil {
        private static Connection conn;
    
    private static String strConn = "jdbc:mysql://localhost/escola";
    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        
        if(JdbcUtil.conn != null)
        {
        return JdbcUtil.conn;
        }
        else
        {
          JdbcUtil.conn = DriverManager.getConnection(strConn,"root","");
          return JdbcUtil.conn;
        }
    }
        private String getNome;
    
        
        
        
    public JdbcUtil(Connection c ){
        
        this.conn = c;
    
    }
            public void insere (JdbcUtil a) throws SQLException{
            
            String sql = "insert into aluno nome_tabela(nome) values ("+a.getNome+")";
            
            PreparedStatement ps = this.conn.prepareStatement(sql);
            
            ps.executeUpdate();
            ps.close();
            
            }  
}

