/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condiciones;

import Analizador.SimpleNode;
import Clases_resolver_expresiones.Fecha;
import Clases_resolver_expresiones.FechaTime;
import Clases_resolver_expresiones.resolver_expresiones;
import Errores.ErrorE;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Resolutor_Condicion  extends resolver_expresiones{
    
    
    public Resolutor_Condicion(){
        
    }
    
    
    
     public int Resolver(SimpleNode nodo){
         Resolutor_Expresiones expresiones = new Resolutor_Expresiones();
         Object val1= expresiones.Resolver((SimpleNode)nodo.jjtGetChild(0));
         String simb= nodo.jjtGetChild(1).toString();
         Object val2= expresiones.Resolver((SimpleNode)nodo.jjtGetChild(2));
         
        switch (simb) {
            case "<": {
                return OperarMenor(val1, val2);
            }
            case ">": {
                return OperarMayor(val1, val2);
            }
            case "<=": {
                return OperarMenorIgual(val1, val2);
            }
            case ">=": {
                return OperarMayorIgual(val1, val2);
            }
            case "!=": {
                return OperarDistintoA(val1, val2);
            }
            case "==": {
                return OperarIgualIgual(val1, val2);
            }

        }
        return 0;
    }
    
     /*------------ validacines ----------------- */
     
     
      
     
     public int OperarMenor(Object val1, Object val2){
         String tipo1= comprobar_tipo(val1);
         String tipo2= comprobar_tipo(val2);
         double dou1, dou2;
         if((esDecimal(tipo1)|| esEntero(tipo1)) &&
                 (esDecimal(tipo2)||esEntero(tipo2))){
             dou1= Double.parseDouble(val1.toString());
             dou2= Double.parseDouble(val2.toString());
             
             if(dou1<dou2)
                 return 1;
             else 
                 return 0; 
         }else{
             
             String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una condicion \"<\".";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo); 
             return 0;
         }
         
         
      
     }
    
     
      public int OperarMayor(Object val1, Object val2){
         
        String tipo1= comprobar_tipo(val1);
         String tipo2= comprobar_tipo(val2);
         double dou1, dou2;
         if((esDecimal(tipo1)|| esEntero(tipo1)) &&
                 (esDecimal(tipo2)||esEntero(tipo2))){
             dou1= Double.parseDouble(val1.toString());
             dou2= Double.parseDouble(val2.toString());
             
             if(dou1>dou2)
                 return 1;
             else 
                 return 0; 
         }else{
             
             String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una condicion \">\".";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo); 
             return 0;
         }
     }
      
      
       public int OperarMayorIgual(Object val1, Object val2){
         
         
         String tipo1= comprobar_tipo(val1);
         String tipo2= comprobar_tipo(val2);
         double dou1, dou2;
         if((esDecimal(tipo1)|| esEntero(tipo1)) &&
                 (esDecimal(tipo2)||esEntero(tipo2))){
             dou1= Double.parseDouble(val1.toString());
             dou2= Double.parseDouble(val2.toString());
             
             if(dou1>=dou2)
                 return 1;
             else 
                 return 0; 
         }else{
             
             String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una condicion \">=\".";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo); 
             return 0;
         }
     }
       
        public int OperarMenorIgual(Object val1, Object val2){
         
         
         String tipo1= comprobar_tipo(val1);
         String tipo2= comprobar_tipo(val2);
         double dou1, dou2;
         if((esDecimal(tipo1)|| esEntero(tipo1)) &&
                 (esDecimal(tipo2)||esEntero(tipo2))){
             dou1= Double.parseDouble(val1.toString());
             dou2= Double.parseDouble(val2.toString());
             
             if(dou1<=dou2)
                 return 1;
             else 
                 return 0; 
         }else{
             
             String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una condicion \"<=\".";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo); 
             return 0;
         }
     }
        
         public int OperarIgualIgual(Object val1, Object val2){
         String tipo1= comprobar_tipo(val1);
         String tipo2= comprobar_tipo(val2);
         
         double dou1, dou2;
         if((esDecimal(tipo1)|| esEntero(tipo1)) &&
                 (esDecimal(tipo2)||esEntero(tipo2))){
             dou1= Double.parseDouble(val1.toString());
             dou2= Double.parseDouble(val2.toString());
             
             if(dou1==dou2)
                 return 1;
             else 
                 return 0; 
         }else if(esCadena(tipo1) && esCadena(tipo2)){
             
             if(getCadena(val1).equals(getCadena(val2))){
                 return 1;
             }else{
                 return 0;
             }
         }else if(esFecha(tipo1)&& esFecha(tipo1)){
             Fecha f1= (Fecha)val1;
             Fecha f2= (Fecha)val2;
             if(f1.valorFecha.equals(f2.valorFecha))
                 return 1;
             else 
                 return 0;

         }else if(esFechaTime(tipo1) && esFechaTime(tipo2)){
             FechaTime f1= (FechaTime)val1;
             FechaTime f2= (FechaTime)val2;
             if(f1.valor_fecha.equals(f2.valor_fecha))
                 return 1;
             else 
                 return 0;

         }else{
              String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una condicion \"==\".";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo);
              return 0;
         }
         
        
     }
         
          public int OperarDistintoA(Object val1, Object val2){
         
           String tipo1= comprobar_tipo(val1);
         String tipo2= comprobar_tipo(val2);
         
         double dou1, dou2;
         if((esDecimal(tipo1)|| esEntero(tipo1)) &&
                 (esDecimal(tipo2)||esEntero(tipo2))){
             dou1= Double.parseDouble(val1.toString());
             dou2= Double.parseDouble(val2.toString());
             
             if(dou1==dou2)
                 return 0;
             else 
                 return 1; 
         }else if(esCadena(tipo1) && esCadena(tipo2)){
             
             if(getCadena(val1).equals(getCadena(val2))){
                 return 0;
             }else{
                 return 1;
             }
         }else if(esFecha(tipo1)&& esFecha(tipo1)){
             Fecha f1= (Fecha)val1;
             Fecha f2= (Fecha)val2;
             if(f1.valorFecha.equals(f2.valorFecha))
                 return 0;
             else 
                 return 1;

         }else if(esFechaTime(tipo1) && esFechaTime(tipo2)){
             FechaTime f1= (FechaTime)val1;
             FechaTime f2= (FechaTime)val2;
             if(f1.valor_fecha.equals(f2.valor_fecha))
                 return 0;
             else 
                 return 1;

         }else{
             
               String descripcion = "Los tipos, " + tipo1 + " y " + tipo2 + ", no son validos para realizar una condicion \"!=\".";
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo);
            return 0;
         }
     }
}
