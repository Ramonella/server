/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import Analizador.SimpleNode;
import Tabla_Simbolos.Simbolo;
import Tabla_Simbolos.tabla_simbolos;

/**
 *
 * @author alina
 */
public class Declaracion extends instruccion_generica{
    
    public String tipo;
    public String nombre;
   
    public Declaracion(String nombre, String tipo) {
        this.tipo = tipo;
        this.nombre = nombre;
    }
    
    @Override
    public resultado Ejecutar(tabla_simbolos vars){
        resultado ret= new resultado(); 
        Simbolo n = new Simbolo();
        Simbolo nuevo_elemento = n.getElemento(tipo);
        nuevo_elemento.nombre= nombre;
        nuevo_elemento.tipo= tipo;
        vars.insertar(nuevo_elemento);
        ret.setTabla(vars);
        return ret;
    }
    
}
