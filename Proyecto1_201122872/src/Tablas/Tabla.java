/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Analizador.SimpleNode;
import Base_Datos.objeto_base;

/**
 *
 * @author alina
 */
public class Tabla extends objeto_base{
    
   
    public lista_campos campos;
    
    public Tabla(String nombre){
        this.nombre= nombre;
        this.campos= new lista_campos(nombre);
    }
    
    public void  agregar_campos(SimpleNode campos_nuevos){
        campos.agregar_campos(campos_nuevos);

    }
    
    @Override
    public String getXML(){
        String ret="<tabla>\n"
                + "<nombre> "+ this.nombre+" </tabla>\n"
                + this.campos.getCadena()
                +"</tabla>";
    
           return ret;          
    } 
    
    
    
    
    
    
    
}
