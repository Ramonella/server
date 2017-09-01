/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecucion;

import Analizador.SimpleNode;
import Tablas.Tabla;
import java.util.LinkedList;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Select {
    
    private SimpleNode nodo;
    
    public Select(SimpleNode nodo){
        this.nodo=nodo;
    }
    
    public void Ejecutar() {
        
        int no_hijos = nodo.jjtGetNumChildren();
        LinkedList<Tabla> tablas = l_tablas((SimpleNode) nodo.jjtGetChild(1));
        if (tablas.size() == nodo.jjtGetChild(1).jjtGetNumChildren()) {
            if (no_hijos == 2) {
                // no posee condicion ni orden
                
            } else if (no_hijos == 4) {
                //posee condicon y orden
            } else if (no_hijos == 3 && nodo.jjtGetChild(2).toString().equalsIgnoreCase("Donde")) {
                
            } else {// tiene 3 hios pero es con orden 
                
            }            
        } else {
            glob.l_errores.agregar_error("No se puede realizar el Select, ha ingresado mal alguna tabla");
        }
        
    }
    
    
    public LinkedList<Tabla> l_tablas(SimpleNode nodo){
        
        String nombre;
        LinkedList<Tabla> tablas= new LinkedList();
        for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
            nombre= nodo.jjtGetChild(i).toString();
            Tabla n = glob.base_actual.getTabla(nombre);
            if(n!= null){
                tablas.add(n);
            }else{
                glob.l_errores.agregar_error("La tabla "+ nombre+" no existe dentro la base en uso, "+ glob.base_actual.nombre);
            }
        }
        return tablas;
    }
    
}
