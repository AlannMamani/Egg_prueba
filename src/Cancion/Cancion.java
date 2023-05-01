package Cancion;

import java.util.Scanner;

public class Cancion {
    private String titulo;
    private String autor;
    private Scanner teclado;
    private String s1;
    private String s2;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

     public String dameTitulo(){
        return titulo;
    }
    
    public void ponTitulo (String titulo) {
        this.titulo=titulo;
    }
    
    public String dameAutor(){
        return autor;
    }
    
    public void ponAutor (String autor) {
        this.autor=autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
               
}