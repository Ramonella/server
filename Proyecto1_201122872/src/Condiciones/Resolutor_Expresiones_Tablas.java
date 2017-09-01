/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condiciones;

import Analizador.SimpleNode;

/**
 *
 * @author alina
 */
public class Resolutor_Expresiones_Tablas {
    
    public Resolutor_Expresiones_Tablas(){
        
    }
    
    public Object Resolver(SimpleNode nodo){
       
        String nombre= nodo.toString();
        switch(nombre){
            
            case "l_opCampo":{
                return Resolver((SimpleNode)nodo.jjtGetChild(0));
            }
            case "tabla_campo":{
                String tabla= nodo.jjtGetChild(0).toString();
                String campo = nodo.jjtGetChild(1).toString();
                
                
                
            }
            
        }
        
        
        
        return null;
    }
            
    
}
