package com.example;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

     private Biblioteca biblioteca;
     private List<LivroDTO> livros;

     @BeforeEach
     void setUp(){
        this.biblioteca= new Biblioteca();
        this.livros = new ArrayList<>();
        
        this.biblioteca.cadastrarLivro("Livro1", true);
        this.biblioteca.cadastrarLivro("Livro2", false);
        this.biblioteca.cadastrarLivro("Livro2 Outro", true);
        this.biblioteca.cadastrarLivro("Livro3", true);
        this.biblioteca.cadastrarLivro("Livro4", true);

        this.biblioteca.cadastrarUsuario("fulano@example.com");
        this.biblioteca.cadastrarUsuario("sicrano@example.com");
     }

     @Test
     void listarLivroTest(){
        livros = this.biblioteca.listarLivro("Livro1");
        assertEquals(livros.get(0).getTitulo(), "Livro1");
        assertEquals(1, livros.size());

        livros = this.biblioteca.listarLivro("Livro2");
        assertEquals(2, livros.size());
        assertEquals(livros.get(0).getTitulo(), "Livro2");
        assertEquals(livros.get(1).getTitulo(), "Livro2 Outro");
     }

     @Test
     void listarLivroNaoExistenteTest(){
        IllegalArgumentException mensage = assertThrows(IllegalArgumentException.class, () -> {this.biblioteca.listarLivro("INEXISTE");});
        assertEquals(mensage.getMessage(), "TITULO INEXISTENTE");
     }

     @Test
     void listarLivrosDisponiveisTest(){
        livros = this.biblioteca.listarLivrosDisponiveis();

        assertEquals(4, livros.size());
        
        for(LivroDTO livro: livros){
            assertTrue(livro.getDisponibilidade());
        }
        
        assertEquals(livros.get(0).getTitulo(), "Livro1");
        assertEquals(livros.get(1).getTitulo(), "Livro2 Outro");
        assertEquals(livros.get(2).getTitulo(), "Livro3");
        assertEquals(livros.get(3).getTitulo(), "Livro4");
     }

     @Test
     void listarTodosLivros(){
        livros = this.biblioteca.listarLivros();

        assertEquals(5, livros.size());

        assertEquals(livros.get(0).getTitulo(), "Livro1");
        assertEquals(livros.get(1).getTitulo(), "Livro2");
        assertEquals(livros.get(2).getTitulo(), "Livro2 Outro");
        assertEquals(livros.get(3).getTitulo(), "Livro3");
        assertEquals(livros.get(4).getTitulo(), "Livro4");
     }

     @Test
     void reservarLivro(){
        
        assertEquals(this.biblioteca.reservarLivro(1, "fulano@example.com"), "LIVRO RESERVADO");

        assertEquals(this.biblioteca.reservarLivro(3, "fulano@example.com"), "LIVRO RESERVADO");

        assertEquals(this.biblioteca.reservarLivro(4, "sicrano@example.com"), "LIVRO RESERVADO");
     }

     @Test
     void reservarLivroIdInexistente(){
        IllegalArgumentException mensage = assertThrows(IllegalArgumentException.class, () -> {this.biblioteca.reservarLivro(0, "fulano@example.com");});
        assertEquals(mensage.getMessage(), "LIVRO INEXISTENTE");
     }

      
     @Test
     void reservarLivroUserInexistente(){
        IllegalArgumentException mensage = assertThrows(IllegalArgumentException.class, () -> {this.biblioteca.reservarLivro(1, "beltrano@example.com");});
        assertEquals(mensage.getMessage(), "USUARIO INEXISTENTE");
    }

     @Test
     void reservarLivroIndisponivel(){
        IllegalArgumentException mensage = assertThrows(IllegalArgumentException.class, () -> {this.biblioteca.reservarLivro(2, "fulano@example.com");});
        assertEquals(mensage.getMessage(), "LIVRO INDISPONIVEL");
     }


     
    
}
