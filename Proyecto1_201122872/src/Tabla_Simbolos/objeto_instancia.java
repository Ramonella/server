/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla_Simbolos;

import Objetos.Tabla_Atributos;

/**
 *
 * @author alina
 */
public class objeto_instancia extends Simbolo{
    
    
    Tabla_Atributos atributos = new Tabla_Atributos();
    
    public objeto_instancia(String nombre, String tipo){
        this.nombre= nombre;
        this.tipo= tipo;
    }
    
    
    
}
