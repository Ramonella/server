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
    private String encabezado;
    
    public xml_tabla(String nombre, String ruta, String encabezado){
        this.ruta= ruta+"/"+nombre+".usac";
        this.nombre_tabla= nombre;
        this.archivo_tabla = new File(this.ruta);
    }
    
    
    public xml_tabla(String nombre, String ruta, File archivo, String encabezado){
        this.ruta= ruta+"/"+nombre+".usac";
        this.nombre_tabla= nombre;
        this.archivo_tabla = archivo;
    }

    public String getEncabezado() {
        return encabezado;
    }
    
    public boolean crearArchivo() throws IOException{
        return this.archivo_tabla.createNewFile();
    }
    
    
    
    
    
}
