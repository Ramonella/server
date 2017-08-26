/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_resolver_expresiones;

import Errores.ErrorE;
import static proyecto1_201122872.Proyecto1_201122872.l_errores;

/**
 *
 * @author Alina
 */
public class Resta extends resolver_expresiones {
    
    public Resta() {

    }

    
    
    @Override
    public Object Resolver(Object val1, Object val2){
         String tipo1 = comprobar_tipo(val1);
         String tipo2 = comprobar_tipo(val2);
        int num1, num2;
        double dou1, dou2;
        
        if(esBool2(val1)&& esBool2(val2)){
            String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una resta.";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            l_errores.insertar(nuevo); 
          return "nulo"; 
        }
        else if(esEntero(tipo1)&& esEntero(tipo2)){
            return (int)(Integer.parseInt(val1+"")- Integer.parseInt(val2+"")); 
            
        }else if(esEntero(tipo1)&& esDecimal(tipo2)){
            return (double)(Integer.parseInt(val1+"")- Double.parseDouble(val2+""));
            
        }else if(esDecimal(tipo1)&& esEntero(tipo2)){
            return (double)(Double.parseDouble(val1+"")- Integer.parseInt(val2+""));
            
        }else if(esDecimal(tipo1)&& esDecimal(tipo2)){
            return (double)(Double.parseDouble(val1+"")- Double.parseDouble(val2+""));
            
        }else{
            String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una resta.";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            l_errores.insertar(nuevo); 
          return "nulo";  
        }
        
        
    }
    
    
}
