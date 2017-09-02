/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecucion;

import Analizador.SimpleNode;
import Condiciones.Resolutor_Expresiones;
import Instrucciones.instruccion_generica;
import Tabla_Simbolos.tabla_simbolos;

/**
 *
 * @author alina
 */
public class Actualizar extends instruccion_generica{
    
    private SimpleNode nodo;
    
    public Actualizar(SimpleNode nodo){
        this.nodo= nodo;
    }
    
    
    private String [] getCampos (SimpleNode nodo){
      String[] retorno = new String[nodo.jjtGetNumChildren()];
        for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
            retorno[i]= nodo.jjtGetChild(i).toString();
        }
      
        return retorno;
    }
    
    
    //@Override
    public void Ejecutarggg(tabla_simbolos vars){
        Resolutor_Expresiones exps = new Resolutor_Expresiones();
        int no_hijos = nodo.jjtGetNumChildren();
        String nombreTabla= nodo.jjtGetChild(0).toString();
        String [] campos= getCampos((SimpleNode)nodo.jjtGetChild(1));
        Object [] valores = exps.resolver_lista_object((SimpleNode)nodo.jjtGetChild(2));
        if(no_hijos == 3){
            //no posee where
            
            
            
        }else {
            //posee where
        }
        
    }
    
}
