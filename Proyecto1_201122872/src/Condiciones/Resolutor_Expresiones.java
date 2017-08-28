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
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Resolutor_Expresiones {

    public Resolutor_Expresiones() {
    }
    
    
    
    public Object Resolver(SimpleNode nodo) {
        //System.out.println("Hijos de Expresion "+nodo.children.length+ nodo.toString());

        switch (nodo.toString()) {
            case "Expresion": {
                return Resolver((SimpleNode) nodo.jjtGetChild(0));
            }

            case "Fecha": {
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
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i));
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
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i));
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
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i));
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
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i));
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
                    aux_S[i] = Resolver((SimpleNode) nodo.jjtGetChild(i));
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

        }//fin del switch

        return null;
    }
    
}
