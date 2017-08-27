/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedimientos;

import Analizador.SimpleNode;
import Base_Datos.objeto_base;
import Objetos.Tabla_Atributos;

/**
 *
 * @author alina
 */
public class Procedimiento extends objeto_base {
    
    public String nombre;
    public Tabla_Atributos parametros;
    public SimpleNode cuerpo;
  
    
    public Procedimiento(String nombre, SimpleNode cuerpo){
        
        this.nombre=nombre;
        this.cuerpo=cuerpo;
        this.parametros= new Tabla_Atributos();
    }
    
    public void addParametros(SimpleNode pars){
        this.parametros.guardar_atributos(pars);
    }
    
    
    
}
