/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiepe
 */
public class UsuarioModel {
    int id;
    String nome;
    String cpf;
    String livroNome;
    int livroId;

    public UsuarioModel(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public UsuarioModel(int id, String nome, String cpf, int livroId) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.livroId = livroId;
    }

    public UsuarioModel(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public UsuarioModel(int id, String livroNome) {
        this.id = id;
        this.livroNome = livroNome;
    }

   

   
    
    

    public UsuarioModel() {
    }

    public String getLivroNome() {
        return livroNome;
    }

    public void setLivroNome(String livroNome) {
        this.livroNome = livroNome;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getLivroId() {
        return livroId;
    }

    public void setLivroId(int livroId) {
        this.livroId = livroId;
    }
    
    
}
