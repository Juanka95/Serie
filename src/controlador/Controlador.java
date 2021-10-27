/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Acceso;
import modelo.ListaSeries;
import modelo.Series;

public class Controlador {
    
    private int posicion;
    private ListaSeries ls;
    
    public Controlador(){
    
      
            posicion =0;
            ls=new ListaSeries();
        try {
            ls=Acceso.cargarLS();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public Series primero(){
    
        posicion = 0;
        return ls.getSerie(posicion);
    
    
    }
     public Series ultimo(){
    
        posicion = ls.longitud()-1;
        return ls.getSerie(posicion);
    }
    public Series anterior(){
    
        if (posicion >0){
            posicion--;
        }
        return ls.getSerie(posicion);
    }
    public Series siguiente(){
    
    
        posicion ++;
        if(posicion==ls.longitud()){
            posicion--;
        }
        return ls.getSerie(posicion);
    }
    
    public void nuevo (Series lb){
    
        ls.setSerie(lb);
        posicion = ls.longitud()-1;
        Acceso.guardarLL(ls);
        
    }
           
    
   public void eliminar(){
   
   
       ls.eliminar(posicion);
       Acceso.guardarLL(ls);
   
   }
   
   public void actualizar(Series lb){
   
       ls.actualizar(lb,posicion);
       Acceso.guardarLL(ls);
   }

    public void abrirArchivo(File archivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
