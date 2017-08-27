/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla_Simbolos;

import Base_Datos.objeto_base;
import java.util.LinkedList;
import static proyecto1_201122872.Valores_Globales.l_errores;

/**
 *
 * @author alina
 */
public class tabla_simbolos {
    
    public LinkedList<Simbolo> l_simbolos;
    
    public tabla_simbolos(){
        this.l_simbolos= new LinkedList();
    }
    
    public boolean insertar(Simbolo nuevo){
       
        if(!existe(nuevo.nombre)){
            l_simbolos.add(nuevo);
            return true;
        }else{
            l_errores.agregar_error("No se ha podido crear el elemento "+ nuevo.nombre+", ya existe en el contexto actual.");
            return false;
        }
        
    }
    
    public boolean existe(String nombre){
     
        for(Simbolo sim: l_simbolos){
           if(sim.nombre.equalsIgnoreCase(nombre)){
               return true;
           }
        }
        return false;
    }
    
    public void imprimir(){
        for(Simbolo sim: l_simbolos){
            System.out.println(sim.getCad());
        }
    }
    
    
}
