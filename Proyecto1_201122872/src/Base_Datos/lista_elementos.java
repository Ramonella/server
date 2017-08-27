/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos;

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
