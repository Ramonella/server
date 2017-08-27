/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_resolver_expresiones;

import Errores.ErrorE;
import static proyecto1_201122872.Valores_Globales.l_errores;

/**
 *
 * @author Alina
 */
public class Suma extends resolver_expresiones {

    public Suma() {

    }

    
    @Override
    public Object Resolver(Object val1, Object val2){
        String tipo1= comprobar_tipo(val1);
        String tipo2= comprobar_tipo(val2);
        
        String cad1, cad2;
        int num1, num2;
        double dou1, dou2;
        
        if(esBool2(val1) && esBool2(val2)){
            num1= getBool(val1);
            num2= getBool(val2);
            if(num1==1 || num2==1)
                return 1;
            else
                return 0;
        }
        else if(esEntero(tipo1) && esEntero(tipo2)){
            num1= getEntero(val1);
            num2= getEntero(val2);
            return (int) num1+num2;
        }
        
        else if(esEntero(tipo1)&& esDecimal(tipo2)){
            num1= getEntero(val1);
            dou2=getDecimal(val2);
            return (double)num1+dou2;
        }
        
       else if(esDecimal(tipo1)&& esEntero(tipo2)){
            dou1= getDecimal(val1);
            num2= getEntero(val2);
            return (double)dou1+num2;
        }
        
       else if(esDecimal(tipo1) && esDecimal(tipo2)){
            dou1=getDecimal(val1);
            dou2=getDecimal(val2);
            return (double)dou1+dou2;
        }
       else if(esDecimal(tipo1) && esCadena(tipo2)){
           return val1+""+val2+"";
       }
       else if(esEntero(tipo1) && esCadena(tipo2)){
           return val1+""+val2+"";
       }
       else if (esCadena(tipo1)&& esCadena(tipo2)){
           return val1+""+val2+"";
       }
       else if(esFecha(tipo1) && esCadena(tipo2)){
           Fecha val = (Fecha)val1;
           return val.valorFecha+val2+"";
       }
       else if(esFechaTime(tipo1) && esCadena(tipo2)){
           FechaTime val = (FechaTime)val1;
           return val.valor_fecha+val2+"";
       }
       else if(esCadena(tipo1)&& esEntero(tipo2)){
           return val1+""+val2+"";
       }
       else if(esCadena(tipo1)&& esDecimal(tipo2)){
           return val1+""+val2+"";
       }
       else if(esCadena(tipo1)&& esFecha(tipo2)){
           Fecha g= (Fecha)val2;
           return val1+""+g.valorFecha+"";
       }
       else if(esCadena(tipo1)&& esFechaTime(tipo2)){
           FechaTime f= (FechaTime)val2;
           return val1+""+f.valor_fecha+"";
       }
       else{
           
            String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una suma.";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            l_errores.insertar(nuevo); 
           return "nulo";
       }
        
        
        
        
        

    }
    
    

}
