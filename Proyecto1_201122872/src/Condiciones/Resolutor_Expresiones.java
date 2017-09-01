/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condiciones;

import Analizador.SimpleNode;
import Clases_resolver_expresiones.Division;
import Clases_resolver_expresiones.Fecha;
import Clases_resolver_expresiones.FechaTime;
import Clases_resolver_expresiones.Multiplicacion;
import Clases_resolver_expresiones.Potencia;
import Clases_resolver_expresiones.Resta;
import Clases_resolver_expresiones.Suma;
import Errores.ErrorE;
import Tabla_Simbolos.tabla_simbolos;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Resolutor_Expresiones {

    public Resolutor_Expresiones() {
    }
    
    public Object[] resolver_lista_object(SimpleNode lista){
        tabla_simbolos vars = new tabla_simbolos();
        Object [] retorno = new String[lista.jjtGetNumChildren()];
        for (int i = 0; i < lista.jjtGetNumChildren(); i++) {
            Object res= Resolver((SimpleNode)lista.jjtGetChild(i),vars);
            if(res instanceof Fecha){
                Fecha res2 = (Fecha)res;
                retorno[i]= res2; 
            }else if(res instanceof FechaTime){
                FechaTime res2 = (FechaTime)res;
                retorno[i]= res2;
                
            }else{
                retorno[i]= res;
            }
            
        }
        
        return retorno;
    }
    
    public String[] resolver_lista(SimpleNode lista){
        tabla_simbolos vars = new tabla_simbolos();
        String [] retorno = new String[lista.jjtGetNumChildren()];
        for (int i = 0; i < lista.jjtGetNumChildren(); i++) {
            Object res= Resolver((SimpleNode)lista.jjtGetChild(i),vars);
            if(res instanceof Fecha){
                Fecha res2 = (Fecha)res;
                retorno[i]= res2.valorFecha; 
            }else if(res instanceof FechaTime){
                FechaTime res2 = (FechaTime)res;
                retorno[i]= res2.valor_fecha;
                
            }else{
                retorno[i]= res+"";
            }
            
        }
        
        return retorno;
    }
    
    public Object Resolver(SimpleNode nodo, tabla_simbolos vars) {
        //System.out.println("Hijos de Expresion "+nodo.children.length+ nodo.toString());

        switch (nodo.toString()) {
            case "Expresion": {
                return Resolver((SimpleNode) nodo.jjtGetChild(0),vars);
            }

            case "FECHA": {
                Object[] aux_S = new Object[nodo.jjtGetNumChildren()];
                for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
                    aux_S[i] = (nodo.jjtGetChild(i)).toString();
                }

                if (aux_S.length == 3) {
                    System.out.println("fecha normal");
                    Fecha retorno = new Fecha(aux_S[0], aux_S[1], aux_S[2]);
                    return retorno;

                } else {
                    System.out.println("fecha con hora");
                    Fecha fech = new Fecha(aux_S[0], aux_S[1], aux_S[2]);
                    FechaTime retorno = new FechaTime(fech, aux_S[3], aux_S[4], aux_S[5]);
                    return retorno;
                }

            }
            case "Suma": {
                Suma elemento_suma = new Suma();
                
                Object[] aux_S = new Object[nodo.jjtGetNumChildren()];
                for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i),vars);
                }
                Object suma = aux_S[0];
                for (int i = 1; i < aux_S.length; i++) {
                    if (aux_S[i] != null) {
                        suma = elemento_suma.Resolver(suma, aux_S[i]);
                    } else {
                        String descripcion = "Error con el retorno de la suma.";
                        ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                        glob.l_errores.insertar(nuevo);
                    }
                }
                return suma;

            }
            case "Resta": {
                Resta elemento_suma = new Resta();
                Object[] aux_S = new Object[nodo.jjtGetNumChildren()];
                for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i),vars);
                }
                Object suma = aux_S[0];
                for (int i = 1; i < aux_S.length; i++) {
                    if (aux_S[i] != null) {
                        suma = elemento_suma.Resolver(suma, aux_S[i]);
                    } else {
                        String descripcion = "Error con el retorno de la resta.";
                        ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                        glob.l_errores.insertar(nuevo);
                    }
                }
                return suma;

            }
            
            case "Multiplicacion": {
                Multiplicacion elemento_suma = new Multiplicacion();
                Object[] aux_S = new Object[nodo.jjtGetNumChildren()];
                for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i),vars);
                }
                Object suma = aux_S[0];
                for (int i = 1; i < aux_S.length; i++) {
                    if (aux_S[i] != null) {
                        suma = elemento_suma.Resolver(suma, aux_S[i]);
                    } else {
                        String descripcion = "Error con el retorno de la multiplicacion.";
                        ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                        glob.l_errores.insertar(nuevo);
                    }
                }
                return suma;

            }
            
            case "Division": {
                Division elemento_suma = new Division();
                Object[] aux_S = new Object[nodo.jjtGetNumChildren()];
                for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i),vars);
                }
                Object suma = aux_S[0];
                for (int i = 1; i < aux_S.length; i++) {
                    if (aux_S[i] != null) {
                        suma = elemento_suma.Resolver(suma, aux_S[i]);
                    } else {
                        String descripcion = "Error con el retorno de la division.";
                        ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                        glob.l_errores.insertar(nuevo);
                    }
                }
                return suma;

            }
            
            case "Potencia": {
                Potencia elemento_suma = new Potencia();
                Object[] aux_S = new Object[nodo.jjtGetNumChildren()];
                for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i),vars);
                }
                Object suma = aux_S[0];
                for (int i = 1; i < aux_S.length; i++) {
                    if (aux_S[i] != null) {
                        suma = elemento_suma.Resolver(suma, aux_S[i]);
                    } else {
                        String descripcion = "Error con el retorno de la potencia.";
                        ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                        glob.l_errores.insertar(nuevo);
                    }
                }
                return suma;

            }

            case "Cadena": {
                return nodo.jjtGetChild(0).toString().replace("\"", "");
            }

            case "Numero": {
                return Integer.parseInt(nodo.jjtGetChild(0).toString());
            }

            case "Decimal": {
                return Double.parseDouble(nodo.jjtGetChild(0).toString());
            }
            
            case "VAR":{
                String nombre =nodo.jjtGetChild(0).toString();
                Object resultado = vars.getVal_Variable(nombre);
                return resultado;
                //object val = vars.
                
            }
            
            case "LLAMADA":{
                
            }
            
            case "ATRI_OBJ":{
                
            }

        }//fin del switch

        return null;
    }
    
}
