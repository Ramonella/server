/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import Tabla_Simbolos.tabla_simbolos;

/**
 *
 * @author alina
 */
public class resultado {
    
    public boolean continua=true;
    public Object valor;
    public tabla_simbolos tabla;
    
    public resultado(){
        tabla= new tabla_simbolos();
    }
    
    public void setTabla(tabla_simbolos t){
        this.tabla= t;
    }
    
}
