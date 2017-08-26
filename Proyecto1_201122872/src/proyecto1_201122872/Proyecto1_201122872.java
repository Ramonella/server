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
    public static Tabla_Errores l_errores;
    public static  Usuario sesion;
    public static base_datos base_actual;
    public static String log_consola="";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        sesion= new Usuario();
        base_actual= new base_datos();
        
        l_errores= new Tabla_Errores();
        Pruebas nueva = new Pruebas();
        nueva.Analizar();
        l_errores.PrintErrores();
    }
    
    
    
    
    
}
