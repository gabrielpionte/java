/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Aula_11_03 {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) throws Exception
    {
        System.out.println(JdbcUtil.getConnection());
        AlunoDao alunoDao = new AlunoDao(JdbcUtil.getConnection());       
        ProfessorDao ProfDao= new ProfessorDao(JdbcUtil.getConnection());
        UsuarioDao UserDao = new UsuarioDao(JdbcUtil.getConnection());
        
        Aluno a1 = new Aluno("noTest2");
        a1.setCod("");
        alunoDao.inserir(a1);
       
        Professor p1 = new Professor("ProfTes2");
        p1.setCod("");
        ProfDao.inserir(p1);
        
        Usuario u1 = new Usuario();
        u1.setSenha("123");
        u1.setNome("Pionte");
        UserDao.inserir(u1);
        UserDao.Login(u1);
        
        
    }
    
    }   
