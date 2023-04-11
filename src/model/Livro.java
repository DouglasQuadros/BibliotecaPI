/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 181910101
 */
public class Livro {
    private int idLivro;
    private String titulo;
    private String ano;
    private String ISBN;
    
    public Livro(){
    }
    /**
     * Construtor da Classe Pessoa inicializando todos os atributos
     * @param idLivro
     * @param titulo
     * @param ano
     * @param ISBN
     */

    public Livro(int idLivro, String titulo, String ano, String ISBN) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.ano = ano;
        this.ISBN = ISBN;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "\n---" + "\nidLivro:\t" + idLivro + "\ntitulo:\t" + titulo + "\nano:\t" + ano + "\nISBN:\t" + ISBN ;
    }
    
    
}
