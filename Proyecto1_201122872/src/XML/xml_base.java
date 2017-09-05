/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Base_Datos.base_datos;
import Base_Datos.lista_elementos;
import Base_Datos.objeto_base;
import Objetos.Objeto;
import Tablas.Tabla;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author alina
 */
public class xml_base {
    
    private File archivo_base;
    private File archivo_procedure;
    private File archivo_object;
    private LinkedList<xml_tabla> archivos_tablas;
    private base_datos baseDatos;
    private String ruta_general;
    
    public xml_base(base_datos base) throws IOException{
        this.baseDatos=base;
        
        /*
            File carpeta = new File(ruta);
        File db = new File(ruta+"/DB.usac");
        File tabla = new File(ruta+"/TABLA.usac");
        File procedimientos = new File(ruta+"/PROCEDURE.usac");
        File objetos = new File(ruta+"/OBJECT.usac");
        
        */
        this.ruta_general= "/home/alina/Documentos/USQL/"+base.nombre+"/";
        this.archivo_object= new File(this.ruta_general+"OBJECT.usac");
        this.archivos_tablas= new LinkedList();
        this.archivo_procedure = new File(this.ruta_general+ "PROCEDURE.usac");
        this.archivo_base= new File(this.ruta_general+ "DB.usac");
        this.archivo_procedure.createNewFile();
        
    }
    
    public void subirArchivos() throws IOException{
        gen_archivo_objetos();
        gen_archivos_Tuplas();
        gen_archivo_Base();
        
        
    }
    
    
    
    private void gen_archivos_Tuplas() throws IOException {
        File arch_temporal;
        lista_elementos l_temporal = this.baseDatos.objetos_usql;
        for (objeto_base objTemp : l_temporal.elementos) {
            String cadena = "";

            if (objTemp instanceof Tabla) {
                Tabla t_obj = (Tabla) objTemp;
                cadena += t_obj.getXML_tuplas();
                String encabezado = t_obj.getXML();
               
                String ruta = this.ruta_general + t_obj.nombre + ".usac";
                arch_temporal = new File(ruta);
                xml_tabla nuevo = new xml_tabla(t_obj.nombre, ruta, arch_temporal, encabezado);
                
                nuevo.crearArchivo();
                nuevo.setEncabezaodo(encabezado);
                this.archivos_tablas.add(nuevo);
                if (arch_temporal.createNewFile() || arch_temporal.exists()) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arch_temporal))) {
                        bw.write("");
                        bw.write(cadena);
                        nuevo.setArchivo_tabla(arch_temporal);
                    }

                }

            }
        }

        
    }
    
    
    
    private void gen_archivo_Base() throws IOException{
     String contenido ="<Procedure>\n"
             + "<path>"+ this.archivo_procedure.getPath()+"</path>\n"
             + "</Procedure>"
             + "<Object>\n"
             +"<path>"+ this.archivo_object.getPath()+"</path>\n"
             + "</Object>\n";
     
        if( this.archivo_base.createNewFile()|| this.archivo_base.exists()){
         for(xml_tabla arch: archivos_tablas){
             contenido+= arch.getEncabezado();
         }
         
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivo_base))) {
                        bw.write("");
                         bw.write(contenido);
                
                        } 
         
         
     }else{
         //hubo un error
         
         
     }
             
        
    }
    
    
    
    
    private boolean gen_archivo_objetos() throws IOException{
        
        String cadena="";
        lista_elementos l_temporal= this.baseDatos.objetos_usql;
        if(this.archivo_object.createNewFile()|| this.archivo_object.exists()){
          for(objeto_base objTemp : l_temporal.elementos){
              if(objTemp instanceof Objeto){
                  Objeto t_obj = (Objeto)objTemp;
                  cadena +=t_obj.getXML();
              }
          }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivo_object))) {
                bw.write("");
                bw.write(cadena);
                return true; 
            }
           
        }
        
        return false;
    }
    
    
    
    
    
    
    
    
    
    
}
