/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201122872;

import Base_Datos.base_datos;
import Errores.Tabla_Errores;
import Usuarios.Usuario;


/**
 *
 * @author alina
 */
public class Proyecto1_201122872 {
    
  public static Valores_Globales glob;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        glob= new Valores_Globales();
        
        
        Pruebas nueva = new Pruebas();
        nueva.Analizar();
        glob.l_errores.PrintErrores();
    }
    
    
    
    
    
}
