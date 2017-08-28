/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Alina
 */
public class Tabla_Errores {
    
    public List<ErrorE> listado_errores;

    public Tabla_Errores() {
        this.listado_errores= new ArrayList<ErrorE>();
    }
    
    public void insertar(ErrorE nuevo){
        
        this.listado_errores.add(nuevo);
    }
    
    
    public void agregar_error(String error){
        
            ErrorE nuevo = new ErrorE(error, "", "", "Semantico", "USQL");
            insertar(nuevo);
    }
    
    public void PrintErrores(){
        for(ErrorE er : this.listado_errores){
            System.out.println("=================");
            er.MostrarError();
            System.out.println("=================\n");
        }
    }
    
    
}
