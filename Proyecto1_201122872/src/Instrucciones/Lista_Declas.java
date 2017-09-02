/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import Analizador.SimpleNode;
import Tabla_Simbolos.tabla_simbolos;
import java.util.LinkedList;

/**
 *
 * @author alina
 */
public class Lista_Declas extends instruccion_generica {
    
    private LinkedList<instruccion_generica> l_declas;
    private SimpleNode nodo;
    
    public Lista_Declas(SimpleNode nodo){
        this.l_declas = new LinkedList();
        this.nodo= (SimpleNode)nodo.jjtGetChild(0);
    }
    
    private void generar_lista(){
        String opcion = nodo.jjtGetChild(0).toString();
        switch(opcion){
            
            case "l_variables":{    
                int no_hijos = nodo.jjtGetNumChildren();
                String tipo= nodo.jjtGetChild(1).toString();
                Declaracion decla; 
                if(no_hijos==2){
                    //no posee expresion
                    for (int i = 0; i < nodo.jjtGetChild(0).jjtGetNumChildren(); i++) {
                        decla= new Declaracion(nodo.jjtGetChild(0).jjtGetChild(i).toString(),tipo);
                        l_declas.add(decla);
                    }
                }else if(no_hijos==3){
                    //posee expresion
                    String nombre_ultimo;
                    SimpleNode ultimo=null;
                    for (int i = 0; i < nodo.jjtGetChild(0).jjtGetNumChildren(); i++) {
                        nombre_ultimo =nodo.jjtGetChild(0).jjtGetChild(i).toString(); 
                        ultimo = (SimpleNode)nodo.jjtGetChild(0).jjtGetChild(i);
                        decla= new Declaracion(nombre_ultimo,tipo);
                        l_declas.add(decla);
                    }
                    Asignacion asi = new Asignacion("VAR",ultimo,(SimpleNode) nodo.jjtGetChild(2));
                    l_declas.add(asi);  
                    
                }
                
                break;
            }
            case "INSTANCIA":{
                
                
                break;
            }
            
            
            
        }
        
    }
    
    @Override
    public resultado Ejecutar(tabla_simbolos vars){
        resultado nuevo = new resultado();
        nuevo.setTabla(vars);
        generar_lista();
        for (int i = 0; i < l_declas.size(); i++) {
            instruccion_generica inst = l_declas.get(i);
            nuevo = inst.Ejecutar(nuevo.tabla);
        }  
       //nuevo.setTabla(vars);
        return nuevo;
    }
    
    
    
}
