/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla_Simbolos;

/**
 *
 * @author alina
 */
public class variable extends Simbolo {
    
    public Object valor;
    
    public variable(){
        
    }
    
    public variable(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }
    
    public void setValor(Object val){
        this.valor=val;
    }
    
    
    @Override
    public String getCad(){
        return "Nombre: "+ this.nombre+
                "\nTipo: "+this.tipo+
                "\nValor: "+ this.valor+"\n";
    }
}
