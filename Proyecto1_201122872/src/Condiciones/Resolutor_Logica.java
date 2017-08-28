/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condiciones;

import Analizador.SimpleNode;
import Clases_resolver_expresiones.resolver_expresiones;
import static proyecto1_201122872.Proyecto1_201122872.glob;
import Errores.ErrorE;


/**
 *
 * @author alina
 */
public class Resolutor_Logica extends resolver_expresiones {
    
    public Resolutor_Logica(){
        
    }
    
     public int Resolver(SimpleNode nodo){
         Object val1= nodo.jjtGetChild(0);
         String simb= nodo.jjtGetChild(1).toString();
         Object val2= nodo.jjtGetChild(2);
         
        switch (simb) {
            case "&&": {
                return OperarAnd(val1, val2);
            }
            case "||": {
                return OperarOr(val1, val2);
            }  

        }
        return 0;
    }

    public int OperarAnd(Object val1, Object val2) {
        String tipo1= comprobar_tipo(val1);
        String tipo2= comprobar_tipo(val2);
        
        try {
           int v1= Integer.parseInt(val1.toString());
           int v2= Integer.parseInt(val2.toString());
           if (esUno(v1)&& esUno(v2))
               return 1;
           else
               return 0;   
        }catch(Exception e){
            
        }
        
        String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una condicion \" && \".";
           ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo); 
        return 0;
    }

    public int OperarOr(Object val1, Object val2) {
        String tipo1= comprobar_tipo(val1);
        String tipo2= comprobar_tipo(val2);
        
        try {
           int v1= Integer.parseInt(val1.toString());
           int v2= Integer.parseInt(val2.toString());
           if (esUno(v1)|| esUno(v2))
               return 1;
           else
               return 0;   
        }catch(Exception e){
            
        }
        
        String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una condicion \" || \".";
           ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo); 
        return 0;
    }
    
    
    
}
