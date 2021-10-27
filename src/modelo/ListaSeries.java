/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alumno
 */

import java.io.Serializable;
import java.util.ArrayList;

public class ListaSeries implements Serializable{
    
    
    private ArrayList<Series> listaseries;
    
    public ListaSeries(){
    
        listaseries = new ArrayList<>();
        
    }
    public Series getSerie(int p){
    
        return listaseries.get(p);
    
    }
    
    public void setSerie(Series ls){
    
        listaseries.add(ls);
    
    }
    
    public int longitud(){
    
        return listaseries.size();
    }
    public void eliminar(int p){
    
        listaseries.remove(p);
    
    
    }
    public void actualizar(Series lb, int p){
    
        listaseries.get(p).setTitulo(lb.getTitulo());
        listaseries.get(p).setProductores(lb.getProductores());
        listaseries.get(p).setGenero(lb.getGenero());
        listaseries.get(p).setAnyo(lb.getAnyo());
        listaseries.get(p).setTemporadas(lb.getTemporadas());
        listaseries.get(p).setNota(lb.getNota());
    }
}
