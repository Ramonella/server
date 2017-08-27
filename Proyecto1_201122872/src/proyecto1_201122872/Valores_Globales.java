/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201122872;

import Base_Datos.Bases_datos_tabla;
import Base_Datos.base_datos;
import Base_Datos.objeto_base;
import Errores.Tabla_Errores;
import Usuarios.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    
    
    public boolean usar_base(String nombre){
        
        if(l_bases.getBase(nombre)!=null){
            this.base_actual=l_bases.getBase(nombre);
            return true;
        }
        return false;
        
    }
    
    public void agregarConsola(String cadena){
       Date date = new Date();
       DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
       String linea =">> "+hourdateFormat.format(date)+" "+sesion.nombre+" ["+cadena+"]\n";
       this.log_consola+=linea;
        System.out.println("=========== ");
        System.out.println(log_consola);
    }
    
    public void add_elemento_base_actual(objeto_base nuevo){
        
        if(nuevo instanceof base_datos){
            if(l_bases.nueva_base((base_datos)nuevo))
            agregarConsola("Se ha creado con exito la nueva base de datos llamada "+ nuevo.nombre);
            else
              agregarConsola("No se ha podido crear la nueva base de datos "+ nuevo.nombre+", ya existe");  
            
        }else{
          if(this.base_actual.objetos_usql.insertar_elemento(nuevo))  
          agregarConsola("Se ha creado el elemento "+ nuevo.nombre+" con exito en la base de datos "+ base_actual.nombre);
          else
             agregarConsola("No se ha podido crear el elemento "+ nuevo.nombre+" en la base de datos "+ base_actual.nombre+", ya hay otro elemento con el mismo nombre"); 
        }
        
    }
}
