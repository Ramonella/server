/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos;

/**
 *
 * @author alina
 */
public class base_datos extends objeto_base{
    
    public String nombre;
    public lista_elementos objetos_usql;

    
    public base_datos(String nombre) {
        this.nombre = nombre;
        objetos_usql= new lista_elementos(nombre);
    }
    
    public base_datos() {
        this.nombre = "";
        
    }
    public void iniciar_objetos(String nom){
        objetos_usql= new lista_elementos(nombre);
    }
    
    
}
