/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201122872;

import java.io.IOException;


/**
 *
 * @author alina
 */
public class Proyecto1_201122872 {
    
  public static Valores_Globales glob;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        glob= new Valores_Globales();
        glob.Ejecutar_Maestro();
        
        Pruebas nueva = new Pruebas();
        nueva.Analizar();
        glob.l_errores.PrintErrores();
       // glob.l_bases.gen_Archivos();
        glob.base_actual.iniciar_xml();
        glob.base_actual.archivos.subirArchivos();
        //System.out.println("Numer de elementos en la base actual"+ glob.base_actual.objetos_usql.elementos.size());
        //System.out.println("Numer de bases de datos"+ glob.l_bases.lista_bases.size());
       
       
      
        
    }
    
    
    
    
    
}
