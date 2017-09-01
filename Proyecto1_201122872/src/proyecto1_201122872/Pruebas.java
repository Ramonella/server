/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201122872;

import Analizador.SimpleNode;
import Analizador.analizador;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;

/**
 *
 * @author alina
 */
public class Pruebas {
    
    
    
    public void resolverExpresion(SimpleNode nodo){
        
        
        
    }
    
    public void Analizar() {
         InputStream is = new ByteArrayInputStream(Leer_Archivo().getBytes());
        analizador analizar = new analizador(is);
        try {
            SimpleNode n = analizar.Start();
            n.dump("");
           System.out.println("--------- Analizador Finalizado --------------");
        } catch (Exception e) {
           System.out.println("Un error en la sintaxis.");
           e.printStackTrace();
           
       }
    }
    
    
    public String Leer_Archivo() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String cadena = "";
        try {
            archivo = new File("/home/alina/Documentos/Repositorios/server/Proyecto1_201122872/Archivos_Entrada/prueba.txt");
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
