/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import Objetos.Tabla_Atributos;
import Tabla_Simbolos.Simbolo;
import Tabla_Simbolos.objeto_instancia;
import Tabla_Simbolos.tabla_simbolos;

/**
 *
 * @author alina
 */
public class Instancia extends instruccion_generica {
    
    public String nombre;
    public String tipo;
    
    
    public Instancia(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
        
    }
    
    @Override
    public void Ejecutar(tabla_simbolos vars){
        Simbolo n = new Simbolo();
        Simbolo nuevo = n.getElemento(tipo);
        objeto_instancia nuevo_objeto = (objeto_instancia)nuevo;
        nuevo.nombre=nombre;
        nuevo.tipo=tipo;
        vars.insertar(nuevo_objeto);
    }
    
    
}
