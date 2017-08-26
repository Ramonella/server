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
public class resolver_expresiones {
    

    
    
    public Object Resolver(Object valor1, Object valor2){
        
        
        
        return null;
    }
    
     public Object Resolver(Object valor1, Object valor2, String tipo){
        
        
        
        return null;
    }
    
     
     public  String comprobar_tipo(Object val) {
        
        if (val instanceof Double) {
            return "decimal";
        }
        if (val instanceof Integer) {
            return "entero";
        }
  
        if (val instanceof String) {
            if(val.toString().equalsIgnoreCase("nulo"))
                return "nulo";
            else
                return "cadena"; 
        }
        
        if(val instanceof Fecha){
            return "fecha";
        }
        
        if(val instanceof FechaTime){
            return "fechatime";
        }
        
        return "nulo";
    }
     
     
      public boolean esFecha(String tipo) {
        return tipo.equalsIgnoreCase("fecha");
    }
      
       public boolean esFechaTime(String tipo) {
        return tipo.equalsIgnoreCase("fechatime");
    }
     public int getBool(Object val){
        if(val.toString().equalsIgnoreCase("1"))
            return 1;
        else
            return 0;
    }
    public double getDecimal(Object val){
        return Double.parseDouble(val+"");
    }
    
    public int getEntero(Object val){
        return Integer.parseInt(val+"");
    }
    
    public int getCaracter_entero(Object val){
        int ch = val.toString().codePointAt(0);
        return ch;
    }
    
    public char getCaracter_char(Object val){
        char ch = val.toString().charAt(0);
        return ch;
    }
    
    public String getCadena(Object val){
        return val.toString();
    }
    
    public boolean esCero(double valor){
        return(valor==0);
    }
    
    public boolean esEntero(String tipo) {
        return tipo.equalsIgnoreCase("entero");
    }

    public boolean esUno(int v){
        return v==1;
    }
    
    public boolean esBool2(Object tipo) {
        return (tipo.toString().equalsIgnoreCase("1")||tipo.toString().equalsIgnoreCase("0"));
    }
    
    public boolean esCaracter(String tipo) {
        return tipo.equalsIgnoreCase("caracter");
    }
    
    public boolean esDecimal(String tipo) {
        return tipo.equalsIgnoreCase("decimal");
    }
    
    public boolean esCadena(String tipo) {
        return tipo.equalsIgnoreCase("cadena");
    }
    
    
}
