/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

/**
 *
 * @author Alina
 */
public class ErrorE {
    
    public String descripcion;
    public String columna;
    public String fila;
    public String tipo;
    public String lenguaje;

    public ErrorE(String descripcion, String columna, String fila, String tipo, String lenguaje) {
        this.descripcion = descripcion;
        this.columna = columna;
        this.fila = fila;
        this.tipo = tipo;
        this.lenguaje = lenguaje;
    }
    
    
    public void MostrarError(){
        System.out.println("Descripcion: "+ this.descripcion
                + "\nTipo: "+ this.tipo
                + "\n");
                
    }
    
}
