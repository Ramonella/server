/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos;

import Analizador.SimpleNode;
import Tablas.Tabla;

/**
 *
 * @author alina
 */
public class base_datos extends objeto_base{
    
    
    public lista_elementos objetos_usql;
    public String ruta="/home/alina/Documentos/USQL/";  
    
    
    public base_datos(String nombre) {
        this.nombre = nombre;
        this.ruta+=nombre;
        objetos_usql= new lista_elementos(nombre);
    }
    
    public base_datos() {
        this.nombre = "";
        
    }
    
    public void setRuta(String ruta){
        this.ruta= ruta;
    }
    
    public void iniciar_objetos(String nom){
        objetos_usql= new lista_elementos(nombre);
    }
    
    public boolean insertarTabla(String nombre, SimpleNode registro){
        return objetos_usql.insertarTabla(nombre, registro);
    }
    
    public Tabla getTabla(String nombre){
        
        return objetos_usql.getTabla(nombre);
    }
    
}
