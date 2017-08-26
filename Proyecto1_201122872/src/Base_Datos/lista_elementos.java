/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos;

import java.util.LinkedList;

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
    
    
    
    
}
