/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author alina
 */
public class Usuario {
    
    public String nombre;
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
