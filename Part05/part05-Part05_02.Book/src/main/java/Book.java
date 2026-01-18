/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Book {

    private String author;
    private String name;
    private int pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    @Override
    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }

}


/*
1 - A classe deve descrever um livro
2 - Cada livro deve ter um autor, o nome do livro, e a quantidade de paginas
3 - Um metodo getAuthor que deve retornar o nome do autor do livro
4 - Metodo getName que deve retornar o nome do livro
5 - Metodo getPages que deve retornar a quantidade de paginas
6 - toString para imprimir seguindo o exemplo: J.K. Rowling, Harry Potter e a Pedra Filosofal, 223 páginas 
[Nome do author, nome do livro, quantidade de paginas]
 */
