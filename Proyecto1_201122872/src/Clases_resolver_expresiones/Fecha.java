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
 * @author alina
 */
public class Fecha {
    
    public int dia;
    public int mes;
    public int anio;
    public String valorFecha;
    
    public Fecha(Object dia, Object mes, Object anio){
        this.dia = Integer.parseInt(dia+"");
        this.mes= Integer.parseInt(mes+"");
        this.anio= Integer.parseInt(anio+"");
            this.valorFecha= this.dia+"-"+this.mes+"-"+ this.anio;
      
    }
    
    
    public boolean validar_Fecha(){
    
        if(this.anio>1000){
         
            switch(this.mes){
                case 1:
                {
                    if(this.dia>0 && this.dia<=31)
                        return true; 
                    else{
                        //error
                         String descripcion = "El valor de "+ this.dia+" no es valido para enero.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                case 2:
                {
                    if(this.dia>0 && this.dia<=28)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para febrero.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                    
                }
                
                case 3:
                {
                    if(this.dia>0 && this.dia<=31)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para marzo.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 4:
                {
                    if(this.dia>0 && this.dia<=30)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para abril.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 5:
                {
                    if(this.dia>0 && this.dia<=31)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para mayo.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 6:
                {
                    if(this.dia>0 && this.dia<=30)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para junio.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 7:
                {
                    if(this.dia>0 && this.dia<=31)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para julio.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 8:
                {
                    if(this.dia>0 && this.dia<=31)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para agosto.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 9:
                {
                    if(this.dia>0 && this.dia<=30)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para septiembre.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 10:
                {
                    if(this.dia>0 && this.dia<=31)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para octubre.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 11:
                {
                    if(this.dia>0 && this.dia<=30)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para noviembre.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                
                case 12:
                {
                    if(this.dia>0 && this.dia<=31)
                        return true; 
                    else{
                         String descripcion = "El valor de "+ this.dia+" no es valido para diciembre.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                        return false;
                    }
                }
                default:{
                     String descripcion = "El valor de "+ this.dia+" no es un mes valido.";
                         ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
                         l_errores.insertar(nuevo);
                    return false;
                }
                
            }
            
        }
        return false;
    }
    
    
}
