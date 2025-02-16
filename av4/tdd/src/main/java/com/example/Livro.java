package com.example;

public class Livro {

    private String titulo;
    private boolean disponibilidade;
    private int id;

    public Livro(String titulo, boolean disponibilidade, int id){
        this.titulo = titulo;
        this.disponibilidade = disponibilidade;
        this.id = id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }

    public int getId(){
        return this.id;
    }

    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }


    
}
