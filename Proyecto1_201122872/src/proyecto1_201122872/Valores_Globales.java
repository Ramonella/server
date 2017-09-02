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
import Usuarios.Tabla_Usuarios;
import Usuarios.Usuario;
import XML.Arch_Maestro;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alina
 */
public class Valores_Globales {
    
    private Arch_Maestro master;
    
    public  Tabla_Errores l_errores;
    public  Usuario sesion;
    public  base_datos base_actual;
    public  String log_consola="";
    public  Bases_datos_tabla l_bases;
    public Tabla_Usuarios l_usuarios;
    public String ruta_global="/home/alina/Documentos/USQL/";
            
   
    
    
    public Valores_Globales(){
        this.l_errores= new Tabla_Errores();
        this.sesion= new Usuario();
        this.base_actual= new base_datos();
        log_consola="";
        this.l_bases= new Bases_datos_tabla();
        l_usuarios= new Tabla_Usuarios();
        master = new Arch_Maestro();
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
    
    public void add_elemento_base_actual(objeto_base nuevo) throws IOException{
        
        if(nuevo instanceof base_datos){
            
            agregar_base_nueva((base_datos) nuevo);
            
        }else if(nuevo instanceof Usuario){
            if(l_usuarios.insertar((Usuario)nuevo))
            {
                agregarConsola("Se ha creado con exito el nuevo usuario, "+ nuevo.nombre);
           
                
            }else{
                agregarConsola("No se ha podido crear el nuevo usuario "+ nuevo.nombre+", ya existe");  
            
            }
            
        }else{
          if(this.base_actual.objetos_usql.insertar_elemento(nuevo))  {
            agregarConsola("Se ha creado el elemento "+ nuevo.nombre+" con exito en la base de datos "+ base_actual.nombre);
             
            
          }
            else
             agregarConsola("No se ha podido crear el elemento "+ nuevo.nombre+" en la base de datos "+ base_actual.nombre+", ya hay otro elemento con el mismo nombre"); 
        }
        
    }
    
    
    private boolean crearArchivos(String ruta) throws IOException{
        File carpeta = new File(ruta);
        File db = new File(ruta+"/DB.usac");
        File tabla = new File(ruta+"/TABLA.usac");
        File procedimientos = new File(ruta+"/PROCEDURE.usac");
        File objetos = new File(ruta+"/OBJECT.usac");
        
        return (carpeta.mkdirs()&& db.createNewFile()&& tabla.createNewFile()&&
                procedimientos.createNewFile() && objetos.createNewFile());
        
    } 
    
    
    public void agregar_base_nueva(base_datos nueva) throws IOException{
        if(l_bases.nueva_base(nueva)){
           String nueva_ruta=  ruta_global+nueva.nombre;
           if(crearArchivos(nueva_ruta)){
               agregarConsola("La Base de datos "+ nueva.nombre+" ha sido creada con exito");
           }else{
               agregarConsola("La Base de datos "+ nueva.nombre+" no ha sido creada");
           }
              
        }else{
           agregarConsola("La Base de datos "+ nueva.nombre+" no ha sido creada"); 
        }
           
    }
    
    
    
    
    
    /* ======================= Acciones con los XML ----------------------------- */
    
    public void Ejecutar_Maestro() throws IOException{
        master.Cargar_Maestro();
    }
   
    
   
    
}
