/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Base_Datos.objeto_base;

/**
 *
 * @author alina
 */
public class Usuario extends objeto_base{
    
    public String password;
    
    public Usuario(){
        this.nombre="";
        this.password="";
    }
    
    public Usuario(String nombre, String pass){
        this.nombre= nombre;
        this.password=pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
