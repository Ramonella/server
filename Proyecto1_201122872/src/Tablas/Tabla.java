/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Analizador.SimpleNode;
import Base_Datos.objeto_base;
import Condiciones.Resolutor_Expresiones;
import Tabla_Simbolos.tabla_simbolos;
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
       
    
    private boolean validar_campos(String [] valores){
        
        
        return false;
    } 
    
    public boolean agregarTupla(SimpleNode nodo){
        
        switch(nodo.toString()){
            
            case "forma1":{
                tabla_simbolos nueva_tabla = new tabla_simbolos();
                Resolutor_Expresiones exps = new Resolutor_Expresiones();
                String [] nombres= campos.getCampos();
                String [] valores = exps.resolver_lista((SimpleNode)nodo.jjtGetChild(0));
                for (int i = 0; i < valores.length; i++) {
                    System.out.println(nombres[i]+" -> "+valores[i]);
                }
                return agregarTupla(nombres,valores);  
            }
            case "forma2":{
                
                
            }
            
        }
        
        
        
        return false;
       
    }
    
    private boolean agregarTupla(String[] campos, String[] valores)  {
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
    
    
    
    
    
    private String[] getValoresCampos(String []campos){
        String [] ret= new String[tuplas.size()];
        for (int i = 0; i < tuplas.size(); i++) {
            Tupla t = tuplas.get(i);
            ret[i]= t.obtenerValor(campos[i]).toString();
        }
        return ret;
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
