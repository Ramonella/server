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
public class Multiplicacion extends resolver_expresiones {

    public Multiplicacion() {

    }

    @Override
    public Object Resolver(Object val1, Object val2) {
        String tipo1 = comprobar_tipo(val1);
        String tipo2 = comprobar_tipo(val2);

        String cad1, cad2;
        int num1, num2;
        double dou1, dou2;

        if (esBool2(val1) && esBool2(val2)) {
            if(getBool(val1)==1 && getBool(val2)==1){
                return 1;
            }else{
                return 0;
            }

        } else if (esEntero(tipo1) && esEntero(tipo2)) {
            return (int)(Integer.parseInt(val1.toString())*Integer.parseInt(val2.toString()));

        } else if (esEntero(tipo1) && esDecimal(tipo2)) {
            return (double)(Integer.parseInt(val1.toString())*Double.parseDouble(val2.toString()));
            
        } else if (esDecimal(tipo1) && esDecimal(tipo2)) {
            return (double)(Double.parseDouble(val1.toString())*Double.parseDouble(val2.toString()));

        } else if (esDecimal(tipo1) && esEntero(tipo2)) {
            return (double)(Double.parseDouble(val1.toString())*Integer.parseInt(val2.toString()));

        } else if (esFecha(tipo1)  && esCadena(tipo2)) {
            Fecha v = (Fecha)val1;
            return v.valorFecha+val2;
            
        }else if(esFechaTime(tipo1) && esCadena(tipo2)){
            FechaTime v = (FechaTime)val1;
            return v.valor_fecha+val2;

        } else {

            String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una multiplicacion.";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            l_errores.insertar(nuevo);
            return "nulo";
        }

        

    }

    

}
