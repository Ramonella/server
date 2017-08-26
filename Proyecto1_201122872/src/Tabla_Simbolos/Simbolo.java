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
public class Simbolo {
    
    public String nombre;
    public String tipo;
    
    public String getTipo(Simbolo s){
        
        if(s instanceof objeto_instancia){
            return "obj";
        }else if(s instanceof variable){
            return "var";
        }else{
            return "simb";
        }
    }
    
    
    public String getCad(){return "";}
    
    public Simbolo getElemento(String tipo){
        if(tipo.equalsIgnoreCase("text") ||
                tipo.equalsIgnoreCase("integer")||
                tipo.equalsIgnoreCase("double")||
                tipo.equalsIgnoreCase("bool")||
                tipo.equalsIgnoreCase("date")||
                tipo.equalsIgnoreCase("datetime")){
            return (Simbolo) new variable();
        }else{
            return (Simbolo) new objeto_instancia();
        }
        
    }
}
