/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Series implements Serializable{
        
    private String titulo;
    private String productores;
    private String genero;
    private int anyo;
    private int temporadas;
    private int nota;
    
    public Series(){
    
        this.titulo ="";
        this.productores = "";
        this.genero = "";
        this.anyo = 0;
        this.temporadas =0;
        this.nota = 0;
    }
    
     public Series(String titulo, String productores, String genero, int anyo, int temporadas, int nota){
    
        this.titulo= titulo;
        this.productores = productores;
        this.genero = genero;
        this.anyo = anyo;
        this.temporadas = temporadas;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProductores() {
        return productores;
    }

    public void setProductores(String productores) {
        this.productores = productores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
   
    
    
}
