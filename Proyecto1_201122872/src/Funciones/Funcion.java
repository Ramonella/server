/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Analizador.SimpleNode;
import Base_Datos.objeto_base;
import Objetos.Tabla_Atributos;

/**
 *
 * @author alina
 */
public class Funcion extends objeto_base{
    
   
    public Tabla_Atributos parametros;
    public SimpleNode cuerpo;
    public String tipo_retorno;
    public Object retorno;
    
    public Funcion(String nombre, String tipo, SimpleNode cuerpo){
        
        this.nombre=nombre;
        this.tipo_retorno=tipo;
        this.cuerpo=cuerpo;
        this.parametros= new Tabla_Atributos();
    }
    
    public void addParametros(SimpleNode pars){
        this.parametros.guardar_atributos(pars);
    }
    
    
    
}
