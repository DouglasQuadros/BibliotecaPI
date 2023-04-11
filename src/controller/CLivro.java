/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.ArrayList;
import model.Livro;

/**
 *
 * @author 181910101
 */
public class CLivro {

    ArrayList<Livro> livros = new ArrayList();

    public void addLivro(Livro c) {
        this.livros.add(c);
    }

    public void removeLivro(Livro c) {
        this.livros.remove(c);
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    public Livro getLivroISBN(String ISBN) {
        Livro c = null;
        for (Livro livro : livros) {
            if (livro.getISBN().equals(ISBN)) {
                c = livro;
                break;
            }
        }
        return c;
    }
    
    public void mockLivros(){
        Livro L1 = new Livro();
        L1.setTitulo("ABC1F34");
        L1.setAno(2023);
        L1.setISBN(2023);
        addLivro(L1);
       Livro L2 = new Livro();
        L2.setTitulo("ABC1F34");
        L2.setAno(2023);
        L2.setISBN(2023);
        addLivro(L2);
    }

}//fim Classe CCarro
