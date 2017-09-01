/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecucion;

/**
 *
 * @author alina
 */
public class campo_consulta {
    
    private String nombre;
    private String tabla;
    private String valor;

    public campo_consulta(String nombre, String tabla, String valor) {
        this.nombre = nombre;
        this.tabla = tabla;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTabla() {
        return tabla;
    }

    public String getValor() {
        return valor;
    }

    
    
    
    
    
    
}
