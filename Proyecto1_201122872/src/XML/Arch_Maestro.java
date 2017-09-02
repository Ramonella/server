/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Base_Datos.base_datos;
import XML.Maestro.Analizador_Maestro;
import XML.Maestro.SimpleNode;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Arch_Maestro {
    
     private String ruta_maestro="/home/alina/Documentos/USQL/usql_maestro.usac";
     
     private SimpleNode Leer_Maestro(){
        SimpleNode n = null;
        InputStream is = new ByteArrayInputStream(Leer_Archivo(ruta_maestro).getBytes());
        Analizador_Maestro analizar = new Analizador_Maestro(is);
        try {
            
            n = analizar.Start();
            n.dump("");
           System.out.println("--------- Analizador Finalizado --------------");
        } catch (Exception e) {
           System.out.println("Un error en la sintaxis.");
           e.printStackTrace();
           
       }
       
        return n;
    }
    
    
    public void Cargar_Maestro() throws IOException{
        SimpleNode nodo = Leer_Maestro();
        if(nodo!=null){
           analizar(nodo);     
        }
    }
    
    
    private SimpleNode analizar(SimpleNode nodo) throws IOException{
        
        if(nodo!=null){
           switch(nodo.toString()){
          
            case "Inicio":{
                analizar((SimpleNode)nodo.jjtGetChild(0));
                break;
            }
            
            case "Start":{
                analizar((SimpleNode)nodo.jjtGetChild(0));
                break;
            }
            
            case "sentencias":{
                for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
                    analizar((SimpleNode)nodo.jjtGetChild(i));
                }
                break;
            }
            
            case "base":{
                String nombre = nodo.jjtGetChild(0).toString();
                String ruta = nodo.jjtGetChild(1).toString();
                base_datos nueva = new base_datos(nombre);
                glob.agregar_base_nueva(nueva);
                
            }
        } 
        }
        
        return null;
    }
    
    
    
    private String Leer_Archivo(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String cadena = "";
        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero

            String linea;
            while ((linea = br.readLine()) != null) {
                cadena += linea + "\n";
            }
        } catch (Exception e) {
            System.out.println("NO se pudo abiri el archivo" + e);
        }
        return cadena;
    }
}
