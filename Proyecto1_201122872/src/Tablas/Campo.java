/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Analizador.SimpleNode;
import Clases_resolver_expresiones.Fecha;
import Clases_resolver_expresiones.FechaTime;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Campo {

    public String tipo;
    public String nombre;
    public Object[] complementos;
    
   

    public Campo() {
       

    }

    
 private String comprobar_tipo(Object val) {
        
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
    
    
    private boolean validar(String complemento , Object valor){
        String tipo2 = comprobar_tipo(valor);
        
        if(this.tipo.equalsIgnoreCase(tipo2)){
          switch(complemento.toUpperCase()){
            case "NO NULO":{
              return !valor.toString().equalsIgnoreCase("nulo");  
            }
            
            case "NULO":{
                
              return valor.toString().equalsIgnoreCase("nulo");  
            }
            
            
            case "AUTOINCREMENTABLE":{
                
              return false;  
            }
            
            case "LLAVE_PRIMARIA":{
                
              return false;  
            }
            
            
            case "UNICO":{
                
              return false;  
            }
            
            case "LLAVE_FORANEA":{
                
              return false;  
            }
               
        }  
        }else{
            glob.l_errores.agregar_error("El tipo de "+ valor +" es de "+tipo2+", no coincide con e tipo del campo que es "+ tipo+" no se podra realizar el registro");
            return false;
        }  
        
        return false;
    }
    
    
    
    public boolean validar(Object valor){
        
        
        
        
        return false;
    }
    
    private String getComplementos() {
        String cad = "";
        if (complementos != null) {

            for (int i = 0; i < complementos.length; i++) {
                Object v = complementos[i];
                if (v instanceof llave_foranea) {
                    llave_foranea g = (llave_foranea) v;
                    cad += "<llave_foranea>\n";
                    cad += "<tabla> " + g.nombre_tabla + "</tabla>\n"
                            + "<campo>" + g.nombre_campo + "</campo>\n"
                            + "</llave_foranea>\n";
                } else {
                    cad += "<" + v.toString() + ">true</" + v.toString() + ">\n";
                }

            }
            return cad;
        } else {
            return "";
        }

        
        
    }
    
     public String getCadena(){
        String ret="<campo>\n";
        ret+="<nombre> "+ nombre+" </nombre>\n";
        ret+="<tipo>"+ this.tipo+"</tipo>\n";
        ret+=getComplementos();
        ret+="</campo>\n";
        return ret;
               
    }
    
    /*
    private void aplicar_complemento(SimpleNode nodo){
        String comp= nodo.toString();
        switch(comp.toUpperCase()){
            case "NO NULO":
            {
                this.no_nulo=true;
                this.nulo=false;
                break;
            }
            case "NULO":
            {
                this.nulo=true;
                this.no_nulo=false;
                break;
            }
            
            case "AUTOINCREMENTABLE":
            {
                this.autoincrementable=true;
                break;
            }
            
            case "LLAVE_PRIMARIA":
            {
                this.llave_primaria=true;
                this.nulo=false;
                this.no_nulo=true;
                break;
            }
            
            case "LLAVE_FOR":
            {
                this.foranea= new llave_foranea((SimpleNode)nodo);
                break;
            }
            
            case "UNICO":
            {
                this.unico=true;
                break;
            }
            
            
        }
        
        
    }*/
  
   
     
    public void asignar_complemento(SimpleNode complementos) {
        
        this.complementos= new Object[complementos.jjtGetNumChildren()];
        Object[] comple= new String[complementos.jjtGetNumChildren()];
        for (int i = 0; i < complementos.jjtGetNumChildren(); i++) {
           if(complementos.jjtGetChild(i).toString().equalsIgnoreCase("LLAVE_FOR")){
               llave_foranea n = new llave_foranea((SimpleNode)complementos.jjtGetChild(i));
               comple[i]= n;
           }else{
              comple[i]= complementos.jjtGetChild(i).toString(); 
           }  
        }

        this.complementos= comple;
    }

    public void asignar_campo(SimpleNode n_campo) {
        try {
            this.nombre = n_campo.jjtGetChild(1).toString();
            this.tipo = n_campo.jjtGetChild(0).toString();
        } catch (Exception e) {
           glob.l_errores.agregar_error("ha ocurrido un error, no se pudo crear el campo "+ n_campo.jjtGetChild(1).toString());

        }

    }

}
