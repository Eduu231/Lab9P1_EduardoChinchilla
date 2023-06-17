package lab9p1_eduardochinchilla;

import java.util.*;

public class Libros {

    private String titulo;
    private String NombreA;
    private String Genero;
    private int edadM;
    
    public Libros(){
        
    }
   
    public Libros(String titulo, String NombreA, String Genero, int edadM) {
        this.titulo = titulo;
        this.NombreA = NombreA;
        this.Genero = Genero;
        this.edadM = edadM;
    }
    public String toString(){
        
        String s = " ";
        
        s+= "\n"+"Libro "+"\n" + "Titulo: "+titulo + "\n" +"Autor: "+NombreA+ "\n" + "Genero: " + Genero + "\n" + "Edad Minima: "+edadM;
        return s; 
        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdadM() {
        return edadM;
    }

    public void setEdadM(int edadM) {
        this.edadM = edadM;
    }
    
    
}
