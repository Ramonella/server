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
 * @author alina
 */
public class FechaTime {

    public Fecha fecha;
    public int horas;
    public int minutos;
    public int segundos;
    public String valor_fecha;

    public FechaTime(Fecha fecha, Object horas, Object minutos, Object segundos) {
        this.fecha = fecha;
        this.horas = Integer.parseInt(horas + "");
        this.minutos = Integer.parseInt(minutos + "");
        this.segundos = Integer.parseInt(segundos + "");
        this.valor_fecha = fecha.valorFecha + " " + this.horas + ":" + this.minutos + ":" + this.segundos;

    }

    public boolean validarFecha() {
        if (fecha.validar_Fecha()) {
            if (horas >= 0 && horas <= 23) {
                if (minutos >= 1 && minutos <= 59) {
                    if (segundos >= 1 && segundos <= 59) {
                        return true;
                    } else {
                        String descripcion = "El valor de los " + this.segundos + " no es valido.";
                        ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                        l_errores.insertar(nuevo);
                        return false;
                    }
                } else {
                    String descripcion = "El valor de los " + this.minutos + " no es valido.";
                    ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                    l_errores.insertar(nuevo);
                    return false;
                }

            } else {
                String descripcion = "El valor de los " + this.horas + " no es valido.";
                ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                l_errores.insertar(nuevo);
                return false;
            }

        } else {
            String descripcion = "La fecha " + fecha.valorFecha + " posee un error.";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            l_errores.insertar(nuevo);
            return false;
        }

    }

}
