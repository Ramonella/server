/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import Analizador.SimpleNode;
import Condiciones.Resolutor_Expresiones;
import Tabla_Simbolos.tabla_simbolos;

/**
 *
 * @author alina
 */
public class Asignacion extends instruccion_generica{
    
    private String tipo_id;
    private SimpleNode id;
    private SimpleNode expresion;
    
    
    public Asignacion(SimpleNode nodo){
        this.id=(SimpleNode) nodo.jjtGetChild(0);
        this.tipo_id= id.toString();
        this.expresion= (SimpleNode) nodo.jjtGetChild(1);
        
    }
    
    public Asignacion(String tipo_id, SimpleNode id, SimpleNode exp ){
        this.tipo_id=tipo_id;
        this.expresion=exp;
        this.id=id;
    }
    
    @Override
    public resultado Ejecutar(tabla_simbolos vars){
        resultado ret = new resultado();
        Resolutor_Expresiones  resolutor = new Resolutor_Expresiones();
        Object res= resolutor.Resolver(expresion, vars);
        if(tipo_id.equalsIgnoreCase("ATRI_OBJ")){
            String nombre_obj = id.jjtGetChild(0).toString();
            String nombre_atri = id.jjtGetChild(1).toString();
            vars.asignar(nombre_obj, nombre_atri, res);
            
        }else {
            if(id.jjtGetNumChildren()==1){
               String nombre_var= id.jjtGetChild(0).toString();
            vars.asignar(nombre_var, res); 
            }else if(id.jjtGetNumChildren()==0){
                
                String nombre_var= id.toString();
            vars.asignar(nombre_var, res);  
            }
            
        }
        ret.setTabla(vars);
        return ret;
    }
    
}
