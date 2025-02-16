package com.example;

public class LivroDTO {
    
    private String titulo;
    private boolean disponibilidade;
    private int id;

    public LivroDTO(String titulo, boolean disponibilidade, int id){
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
}
