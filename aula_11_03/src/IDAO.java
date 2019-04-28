
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public interface IDAO<T>{
    void inserir(T o);
    
    void alterar(T o);
    
    List listar();
}
