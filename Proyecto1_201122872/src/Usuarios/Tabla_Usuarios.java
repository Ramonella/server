/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.util.LinkedList;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Tabla_Usuarios {
    
    public LinkedList<Usuario> l_usuarios;
    
    public Tabla_Usuarios(){
        this.l_usuarios= new LinkedList();
    }
    
    public boolean existe(String nombre){
        
        for(Usuario usr: l_usuarios){
            if(usr.nombre.equalsIgnoreCase(nombre))
                return true;
        }
        return false;
    }
    
    public boolean insertar(Usuario nuevo){
        if(!existe(nuevo.nombre)){
            l_usuarios.add(nuevo);
            return true;
        }
        
        glob.l_errores.agregar_error("No se pudo crear el usuario "+ nuevo.nombre+", ya existe uno con ese nombre");
        return false;
    }
    
    
}
