/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos;

import java.util.LinkedList;
import static proyecto1_201122872.Valores_Globales.l_errores;

/**
 *
 * @author alina
 */
public class Bases_datos_tabla {
    
    public LinkedList<base_datos> lista_bases;
    
    public Bases_datos_tabla(){
        this.lista_bases= new LinkedList();
        
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
           l_errores.agregar_error("Error, no se ha podido crear la base con el nombre "+ nueva.nombre+", debido a que ya existe una con el mismo nombre.");
           return false;
        }
        
    }
    
}
