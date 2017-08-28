/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201122872;

import Base_Datos.Bases_datos_tabla;
import Base_Datos.base_datos;
import Errores.Tabla_Errores;
import Usuarios.Usuario;

/**
 *
 * @author alina
 */
public class Valores_Globales {
    
    public  Tabla_Errores l_errores;
    public  Usuario sesion;
    public  base_datos base_actual;
    public  String log_consola="";
    public  Bases_datos_tabla l_bases;
    
    
    public Valores_Globales(){
        this.l_errores= new Tabla_Errores();
        this.sesion= new Usuario();
        this.base_actual= new base_datos();
        log_consola="";
        this.l_bases= new Bases_datos_tabla();
    }
    
    
}
