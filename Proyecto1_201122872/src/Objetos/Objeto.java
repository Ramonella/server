/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Base_Datos.objeto_base;
import Objetos.Tabla_Atributos;
import Objetos.atributo_objeto;

/**
 *
 * @author alina
 */
public class Objeto extends objeto_base {
    
   
    public Tabla_Atributos atributos;

    public Objeto(String nombre) {
        this.nombre = nombre;
        this.atributos= new Tabla_Atributos(nombre);
    }
    
    public void agregar_atributo(atributo_objeto atri){
        this.atributos.insert(atri);
    }
    
    public void eliminar_atributo(String nombre){
        this.atributos.eliminar(nombre);
    }
    
    @Override
    public String getXML(){
       return "<Obj>\n"
               + "<nombre>"+ this.nombre+"</nombre>\n"+this.atributos.getCadena_atributos()+"</Obj>\n";
    }
}
