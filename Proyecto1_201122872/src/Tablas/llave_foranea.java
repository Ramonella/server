/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Analizador.SimpleNode;

/**
 *
 * @author alina
 */
public class llave_foranea {
    public String nombre_tabla;
    public String nombre_campo;
    public boolean bandera;

    public llave_foranea(){
        this.bandera=false;
        this.nombre_campo="";
        this.nombre_tabla="";
    }
    
    public llave_foranea(SimpleNode val){
        this.bandera=true;
        this.nombre_tabla= val.jjtGetChild(0).toString();
        this.nombre_campo= val.jjtGetChild(1).toString();
        
    }
    /*
    public llave_foranea(String nombre, boolean bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
    }*/
    public boolean esForanea(){
        return bandera;
    }
    
}
