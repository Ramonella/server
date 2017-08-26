/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_resolver_expresiones;

/**
 *
 * @author Alina
 */
public class expresiones_aritmeticas extends resolver_expresiones {

    Suma sumas;
    Resta restas;
    Multiplicacion multiplicaciones;
    Division divisiones;
    Potencia potencias;
    public expresiones_aritmeticas() {

        sumas = new Suma();
        restas = new Resta();
        multiplicaciones= new Multiplicacion();
        divisiones = new Division();
        potencias = new Potencia();
    }

    @Override
    public Object Resolver(Object operando1, Object operando2, String signo) {

        Object resultado;
        switch (signo) {
            case "+": {
                resultado=sumas.Resolver(operando1, operando2); 
                System.out.println(operando1+" + "+operando2+" = " + resultado);
                return resultado;
            }
            case "*": {
                resultado=multiplicaciones.Resolver(operando1, operando2); 
                System.out.println(operando1+" * "+operando2+" = " + resultado);
                return resultado;
            }
            case "/": {
                resultado=divisiones.Resolver(operando1, operando2); 
                System.out.println(operando1+" / "+operando2+" = " + resultado);
                return resultado;
            }
            case "-": {
                resultado=restas.Resolver(operando1, operando2); 
                System.out.println(operando1+" - "+operando2+" = " + resultado);
                return resultado;
            }
            case "^": {
               resultado=potencias.Resolver(operando1, operando2); 
                System.out.println(operando1+" ^ "+operando2+" = " + resultado);
                return resultado;
            }
        }
        return "nulo";
    }

   

    public Object Resolver_Resta(Object val1, Object val2) {
        String tipo1 = comprobar_tipo(val1);
        String tipo2 = comprobar_tipo(val2);

        return "nulo";
    }

    public Object Resolver_Multiplicacion(Object val1, Object val2) {
        String tipo1 = comprobar_tipo(val1);
        String tipo2 = comprobar_tipo(val2);

        return "nulo";
    }

    public Object Resolver_Division(Object val1, Object val2) {
        String tipo1 = comprobar_tipo(val1);
        String tipo2 = comprobar_tipo(val2);

        return "nulo";
    }

    public Object Resolver_Potencia(Object val1, Object val2) {
        String tipo1 = comprobar_tipo(val1);
        String tipo2 = comprobar_tipo(val2);

        return "nulo";
    }

}
