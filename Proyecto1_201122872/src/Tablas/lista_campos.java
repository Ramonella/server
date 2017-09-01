/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Analizador.SimpleNode;
import java.util.LinkedList;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class lista_campos {
    
    public LinkedList<Campo> l_campos;
    public String nombre_tabla;
    
    public lista_campos(String nombre){
        l_campos= new LinkedList();
        nombre_tabla=nombre;
    }
    
    
//    public boolean validar_Tupla(String[]valores){
//        
//    }
//    
    
    public String[] getCampos(){
        String []  val = new String[l_campos.size()];
        for (int i = 0; i < l_campos.size(); i++) {
            val[i]= l_campos.get(i).nombre;
        }
        
        return val;
    }
    
    public void agregar_campos(SimpleNode campos){
        int hijos;
        Campo nuevo_campo;
        SimpleNode aux;
        for (int i = 0; i < campos.jjtGetNumChildren(); i++) {
              hijos = campos.jjtGetChild(i).jjtGetNumChildren();
              aux=(SimpleNode) campos.jjtGetChild(i);
              nuevo_campo= new Campo();
              if(hijos==2){
                  //posee complementos
                  nuevo_campo.asignar_campo((SimpleNode)aux.jjtGetChild(0));
                  nuevo_campo.asignar_complemento((SimpleNode)aux.jjtGetChild(1));
                  insertar_campo(nuevo_campo);
              }else{
                  //no posee complementos
                  nuevo_campo.asignar_campo((SimpleNode)aux.jjtGetChild(0));
                  insertar_campo(nuevo_campo);
              }
            
        }
        
    }
    
    public String getCadena(){
        String ret="";
        for (int i = 0; i < l_campos.size(); i++) {
           Campo  n= l_campos.get(i);
           ret+=n.getCadena();
        }
         
        return ret;
    }
    
    public boolean insertar_campo(Campo nuevo){
        if(!existe(nuevo)){
            l_campos.add(nuevo);
            return true;
        }
        
        glob.l_errores.agregar_error("El campo "+ nuevo.nombre+" ya existe dentro de la tabla "+nombre_tabla);
        return false;
    }
    
    
    public boolean existe(Campo nuevo){
        
        for(Campo val: l_campos){
            if(val.nombre.equalsIgnoreCase(nuevo.nombre)){
                return true;
            }
        }
        return false;
    }
    
    
    public boolean eliminar(String nombre_campo)
    {
        for (int i = 0; i < l_campos.size(); i++) {
            if(l_campos.get(i).nombre.equalsIgnoreCase(nombre_campo)){
               l_campos.remove(i);
               return true;
            }
            
        }
        
        return false;
    }
    
}
