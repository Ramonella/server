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
public class Potencia extends resolver_expresiones{
  
    public Potencia(){
        
    }
    
     @Override
    public Object Resolver(Object val1, Object val2) {
        String tipo1 = comprobar_tipo(val1);
        String tipo2 = comprobar_tipo(val2);
        int num1, num2;
        double dou1, dou2;
        
        if(esBool2(val1) && esBool2(val2)){
            String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una potencia.";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            l_errores.insertar(nuevo);
            return "nulo";
        } else if((esEntero(tipo1)||esDecimal(tipo1)) &&
                 (esEntero(tipo2)|| esDecimal(tipo2))){
            dou1= Double.parseDouble(val1.toString());
            dou2= Double.parseDouble(val2.toString());
            
                return (double)Math.pow(dou1, dou2);
            
        }else if (esFecha(tipo1)  && esCadena(tipo2)) {
            Fecha v = (Fecha)val1;
            return v.valorFecha+val2;
            
        }else if(esFechaTime(tipo1) && esCadena(tipo2)){
            FechaTime v = (FechaTime)val1;
            return v.valor_fecha+val2;

        } else {

            String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una potencia.";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            l_errores.insertar(nuevo);
            return "nulo";
        }
        
    }
    
}
