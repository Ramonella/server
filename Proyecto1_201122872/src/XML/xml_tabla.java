/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author alina
 */
public class xml_tabla {
    
    private String nombre_tabla;
    private File archivo_tabla;
    private String ruta;
    private String encabezaodo;
    
    public xml_tabla(String nombre, String ruta, String encabezado){
        this.ruta= ruta+"/"+nombre+".usac";
        this.nombre_tabla= nombre;
        
        this.encabezaodo= encabezado;
        this.archivo_tabla = new File(this.ruta);
    }

    public void setArchivo_tabla(File archivo_tabla) {
        this.archivo_tabla = archivo_tabla;
    }
    
    
    public xml_tabla(String nombre, String ruta, File archivo, String encabezado){
        this.ruta= ruta+"/"+nombre+".usac";
        this.nombre_tabla= nombre;
        this.archivo_tabla = archivo;
        
    }

    public String getEncabezado() {
        return encabezaodo;
    }

    public void setEncabezaodo(String encabezaodo) {
        this.encabezaodo = encabezaodo;
    }
    
    
    public boolean crearArchivo() throws IOException{
        return this.archivo_tabla.createNewFile();
    }
    
    
    
    
    
}
