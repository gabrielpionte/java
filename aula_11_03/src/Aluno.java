/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Aluno {

    private String nome;
    private String cod;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    String getCod() {
        return this.cod;
    }

    
  
}
