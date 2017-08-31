/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos;

import Analizador.SimpleNode;
import Tablas.Tabla;
import java.util.LinkedList;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class lista_elementos {
    
    public LinkedList<objeto_base> elementos;
    public String nombre_base;
     
    
    public lista_elementos(String nombre) {
        
        this.elementos = new LinkedList();
        nombre_base=nombre;
        
    }
    
    public boolean insertarTabla(String nombre, SimpleNode nodo){
       
        for(int i=0; i< elementos.size(); i++){
            objeto_base elem = elementos.get(i);
            if(elem.nombre.equalsIgnoreCase(nombre)){
                if(elem instanceof Tabla){
                     Tabla temp= (Tabla) elem;
                     return temp.agregarTupla(nodo);
                }
            }
        }
        return false;
    }
    
    public boolean existe(String nombre){
        for(objeto_base elem: elementos){
            if(elem.nombre.equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
    
    
    public boolean insertar_elemento(objeto_base nuevo){
        
        if(!(existe(nuevo.nombre))){
            elementos.add(nuevo);
            return true;
        }else{
          
            glob.l_errores.agregar_error("No se pudo crear el elmento "+ nuevo.nombre+", ya existe.");
            return false;
        }
        
    }
    
}
