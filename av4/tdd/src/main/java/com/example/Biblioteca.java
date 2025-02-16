package com.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<String> usuarios;
    private List<Reserva> reservas;

    private int id;

    public Biblioteca(){
        this.livros = new ArrayList();
        this.usuarios = new ArrayList();
        this.reservas = new ArrayList<>();
        this.id = 0;
    }

    public String cadastrarLivro(String titulo, boolean disponibilidade){
        Livro livro = new Livro(titulo, disponibilidade, ++this.id);
        livros.add(livro);
        return "ID: " + this.id;
    }

    public List<LivroDTO> listarLivro(String titulo){
        List<LivroDTO> result = new ArrayList<>();
        for(Livro livro: livros){
            if(livro.getTitulo().contains(titulo)){
                result.add(new LivroDTO(livro.getTitulo(), livro.getDisponibilidade(), livro.getId()));
            }
        }

        if(result.size() == 0){
            throw new IllegalArgumentException("TITULO INEXISTENTE");
        }

        return result;
    }

    public List<LivroDTO> listarLivros(){
        List<LivroDTO> result = new ArrayList<>();
        for(Livro livro: livros){
            result.add(new LivroDTO(livro.getTitulo(), livro.getDisponibilidade(), livro.getId()));
        }

        return result;

    }

    public List<LivroDTO> listarLivrosDisponiveis(){
        List<LivroDTO> result = new ArrayList<>();

        for(Livro livro: this.livros){
            if(livro.getDisponibilidade()){
                result.add(new LivroDTO(livro.getTitulo(), livro.getDisponibilidade(), livro.getId()));
            }
        }

        return result;
    }


    public void cadastrarUsuario(String email){
        this.usuarios.add(email);
    }

    public String reservarLivro(int idLivro, String emailUser){
        if(idLivro > this.id || idLivro < 1){
            throw new IllegalArgumentException("LIVRO INEXISTENTE");
        }
        Livro livro = livros.get(idLivro-1);

        if (!livro.getDisponibilidade()){
            throw new IllegalArgumentException("LIVRO INDISPONIVEL");
        }

        if(!usuarios.contains(emailUser)){
            throw new IllegalArgumentException("USUARIO INEXISTENTE");
        }
        livro.setDisponibilidade(false);
        reservas.add(new Reserva(livro, emailUser));

        return "LIVRO RESERVADO";


    }
}


