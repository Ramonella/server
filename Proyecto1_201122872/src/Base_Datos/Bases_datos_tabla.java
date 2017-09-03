/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos;

import java.io.IOException;
import java.util.LinkedList;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Bases_datos_tabla {
    
    public LinkedList<base_datos> lista_bases;
    
    public Bases_datos_tabla(){
        this.lista_bases= new LinkedList();
        
    }
    
    public void gen_Archivos() throws IOException{
        for(base_datos base : lista_bases){
            base.iniciar_xml();
            base.archivos.subirArchivos();
        }
    }
    
     public base_datos getBase(String nombre){
        for(base_datos base : lista_bases){
            if(base.nombre.equalsIgnoreCase(nombre))
                return base;
        }
        
        return null;
    }
    
    
   
    
    public boolean existe(String nombre){
        for(base_datos base : lista_bases){
            if(base.nombre.equalsIgnoreCase(nombre))
                return true;
        }
        
        return false;
    }
    
    public boolean nueva_base(base_datos nueva){
        if(!existe(nueva.nombre)){
            this.lista_bases.add(nueva);
            return true;
        }else{
           glob.l_errores.agregar_error("Error, no se ha podido crear la base con el nombre "+ nueva.nombre+", debido a que ya existe una con el mismo nombre.");
           return false;
        }
        
    }
    
}
