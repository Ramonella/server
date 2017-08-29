/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Analizador.SimpleNode;
import Base_Datos.objeto_base;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alina
 */
public class Tabla extends objeto_base{
    
   
    public lista_campos campos;
    public List<Tupla> tuplas;
    
    public Tabla(String nombre){
        this.nombre= nombre;
        this.campos= new lista_campos(nombre);
        tuplas = new LinkedList<>();
    }
    
    public void  agregar_campos(SimpleNode campos_nuevos){
        campos.agregar_campos(campos_nuevos);

    }
    
//    public boolean agregarTupla(SimpleNode nodo){
//        
//    }
    
    private boolean agregarTupla(String[] campos, String[] valores) throws Exception {
        Tupla tupla = new Tupla();
        for (int i = 0; i < campos.length; i++) {
            tupla.agregarValor(campos[i], valores[i]);
        }
        tuplas.add(tupla);
        return true;
    }
    
//    private boolean obtenerTupla(String[] campos, String[] valores) {
//        
//    }
    
    @Override
    public String getXML(){
        String ret="<tabla>\n"
                + "<nombre> "+ this.nombre+" </tabla>\n"
                + this.campos.getCadena()
                +"</tabla>";
    
           return ret;          
    } 
    
    
    
    
    
    
    
}
