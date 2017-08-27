/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecucion;

import Analizador.SimpleNode;
import Base_Datos.base_datos;
import Base_Datos.objeto_base;
import Funciones.Funcion;
import Objetos.Objeto;
import Procedimientos.Procedimiento;
import Tablas.Tabla;

/**
 *
 * @author alina
 */
public class Global {
    
    
    public Global(){
        
    }
    
    
    
     public objeto_base crear_objetos_usql(SimpleNode nodo_aux){
        int  no_hijos= nodo_aux.jjtGetNumChildren();
        
        switch (nodo_aux.toString()){
            
            
           case "BASE":{
               String nombre= nodo_aux.jjtGetChild(0).toString();
               base_datos nueva = new base_datos(nombre);  
               return nueva;
            }
           
           case "FUNCION":{
              String nombre;
              String tipo;
              SimpleNode cuerpo,parametros;
              
               if(no_hijos==4){
                   //posee parametros
                   nombre= nodo_aux.jjtGetChild(0).toString();
                   tipo = nodo_aux.jjtGetChild(1).toString();
                   parametros= (SimpleNode)nodo_aux.jjtGetChild(2);
                   cuerpo= (SimpleNode)nodo_aux.jjtGetChild(3);
                   Funcion nueva = new Funcion(nombre,tipo,cuerpo);
                   nueva.addParametros(parametros);
                   return nueva; 
    
               }else {//no posee parametros 
                   nombre= nodo_aux.jjtGetChild(0).toString();
                   tipo = nodo_aux.jjtGetChild(1).toString();
                   cuerpo= (SimpleNode)nodo_aux.jjtGetChild(2);
                   Funcion nueva = new Funcion(nombre,tipo,cuerpo);
                   return nueva;
                   
               }
    
           }
             
           case "PROCEDIMIENTO":{
              String nombre;
              SimpleNode cuerpo,parametros;
              
               if(no_hijos==3){
                   //posee parametros
                   nombre= nodo_aux.jjtGetChild(0).toString();
                   parametros= (SimpleNode)nodo_aux.jjtGetChild(1);
                   cuerpo= (SimpleNode)nodo_aux.jjtGetChild(2);
                   Procedimiento nueva = new Procedimiento(nombre,cuerpo);
                   nueva.addParametros(parametros);
                   return nueva; 
    
               }else {//no posee parametros 
                   nombre= nodo_aux.jjtGetChild(0).toString();
                   cuerpo= (SimpleNode)nodo_aux.jjtGetChild(1);
                   Procedimiento nueva = new Procedimiento(nombre,cuerpo);
                   return nueva;  
               } 
                 
           } 
            
            
            
            case "TABLA":{
               Tabla nueva_tabla;
               String nombre= nodo_aux.jjtGetChild(0).toString();
               nueva_tabla= new Tabla(nombre);
               
               if(no_hijos==2){
                   //posee campos
                   nueva_tabla.agregar_campos((SimpleNode)nodo_aux.jjtGetChild(1));
               }
               return nueva_tabla;
                
            }
            
            case "OBJETO":{
                Objeto obj;
                String nombre_objeto=nodo_aux.jjtGetChild(0).toString();
                obj= new Objeto(nombre_objeto);
                if(no_hijos==2){
                    //posee atributos
                    obj.atributos.guardar_atributos((SimpleNode)nodo_aux.jjtGetChild(1));
                    
                }
                return obj;
            }    
        }     
       return  null; 
    }
    
    
    
    public void  Ejecutar(SimpleNode nodo){
        
        /*
        void P_CREAR()#void:{}{
   BASE()
  |TABLA()
  |OBJETO()
  |PROCEDIMIENTO()
  |FUNCION()
  |USUARIO()
}
        */
        
        switch(nodo.toString()){
            
            case "CREAR":{
                
                break;
            }
            
            
            
          
            
            
            
            
            case "USUARIO":{
                
                break;
            }
            
        }
        
        
    }
    
}
