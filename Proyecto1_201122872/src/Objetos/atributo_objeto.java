/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Analizador.SimpleNode;

/**
 *
 * @author alina
 */
public class atributo_objeto {
    
    public String nombre;
    public String tipo;
    public Object valor;

    public atributo_objeto(SimpleNode nuevo){
       if(nuevo.jjtGetNumChildren()==2){
           this.tipo= nuevo.jjtGetChild(0).toString();
           this.nombre= nuevo.jjtGetChild(1).toString();
           this.valor="nulo";
       }
    }
    
    public atributo_objeto(){
        this.nombre="";
        this.tipo="";
        this.valor=null;
    }
    public atributo_objeto clonar(){
        
        atributo_objeto  retorno = new atributo_objeto();
        retorno.nombre=this.nombre;
        retorno.tipo= this.tipo;
        retorno.valor= this.valor;
        return retorno;
        
    } 
    
    public String getCadena_atributo(){
        return  "<"+ this.tipo+"> "+this.nombre+" </"+this.tipo+">\n";
        
    }
    public atributo_objeto(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
    
    
}
