/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Usuario {
    
    private String nome;
    private String cod;
    private String senha;

    Usuario() {
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }

    public Usuario(String nome) {
        this.nome = nome;
    }
    
    public String getSenha(){
        return senha;
    }

    public String getNome() {
        return nome;
    }

    String getCod() {
        return this.cod;
    }

     
}

