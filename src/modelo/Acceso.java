
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Controlador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;

/**
 *
 * @author alumno
 */
public class Acceso {
    
    private static File f = new File("series.dat");
    private java.io.File archivo;
    Controlador c = new Controlador();

    
    public static void crear(){
    
      JFileChooser jFileChooserSelector = new JFileChooser();
        
        int seleccion = jFileChooserSelector.showOpenDialog(null);
         
        if (seleccion == JFileChooser.APPROVE_OPTION){
        jFileChooserSelector = new javax.swing.JFileChooser();
        jFileChooserSelector.showOpenDialog(null);
        File fichero = jFileChooserSelector.getSelectedFile();
    
        }
        
        else if(seleccion == JFileChooser.CANCEL_OPTION){
        
            
        }
        
      else{
        
        
        }
    
    }
  
    public static void guardarLL(ListaSeries ls) {

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();

        } catch (IOException ex) {

            System.out.println("Fallo al guardar fichero");
        }

    }

    public static ListaSeries cargarLS() throws ClassNotFoundException {

        ListaSeries ls = new ListaSeries();
        ObjectInputStream ois = null;
        try {

            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ls = (ListaSeries) ois.readObject();
            ois.close();

        } catch (IOException io) {

            System.out.println("Fallo al abrir el fichero");

        } finally {
            return ls;
        }

    }
    
    
}
