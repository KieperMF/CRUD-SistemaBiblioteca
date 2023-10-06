/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiepe
 */
public class LivroModel {
    int id;
    String titulo;
    String autor;
    String data;
    int secaoId;
    int subsecaoId;

    public LivroModel(String titulo, String autor, int secaoId, int subsecaoId) {
        this.titulo = titulo;
        this.autor = autor;
        this.secaoId = secaoId;
        this.subsecaoId = subsecaoId;
    }

    public LivroModel(int id, String titulo, String autor, int secaoId, int subsecaoId) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.secaoId = secaoId;
        this.subsecaoId = subsecaoId;
    }

    

    
    
    public LivroModel() {
    }
    

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getSecaoId() {
        return secaoId;
    }

    public void setSecaoId(int secaoId) {
        this.secaoId = secaoId;
    }

    public int getSubsecaoId() {
        return subsecaoId;
    }

    public void setSubsecaoId(int subsecaoId) {
        this.subsecaoId = subsecaoId;
    }
    
    
}
