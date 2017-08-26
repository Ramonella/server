/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Analizador.SimpleNode;
import static proyecto1_201122872.Proyecto1_201122872.l_errores;

/**
 *
 * @author alina
 */
public class Campo {

    public String tipo;
    public String nombre;
    public boolean nulo;
    public boolean no_nulo;
    public boolean autoincrementable;
    public boolean llave_primaria;
    public llave_foranea foranea;
    public boolean unico;

    public Campo() {
        nulo=true;
        no_nulo=false;
        autoincrementable=false;
        llave_primaria=false;
        unico=false;
        foranea= new llave_foranea();

    }

     public String getCadena(){
        String ret="<campo>\n";
        ret+="<nombre> "+ nombre+" </nombre>\n";
        ret+="<nulo> "+ nulo+" </nulo>\n";
        ret+="<no_nulo> "+ no_nulo+" </no_nulo>\n";
        ret+="<autoincrementable> "+ autoincrementable+" </autoincrementable>\n";
        ret+="<llave_primaria> "+ llave_primaria+" </llave_primaria>\n";
        ret+="<unico> "+ unico+" </unico>\n";
        ret+="<foranea>\n";
        ret+="<llave_foranea> "+ foranea.bandera+" </llave_foranea>\n";
        ret+="<tabla_foranea> "+ foranea.nombre+" </tabla_foranea>\n";
        ret+="</foranea>\n";
        ret+="</campo>\n";
        return ret;
               
    }
    
    
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
        
        
    }
  
   
    
    public void asignar_complemento(SimpleNode complementos) {
        SimpleNode aux;
        for (int i = 0; i < complementos.jjtGetNumChildren(); i++) {
           aux= (SimpleNode)complementos.jjtGetChild(i);
            aplicar_complemento(aux);
        }

    }

    public void asignar_campo(SimpleNode n_campo) {
        try {
            this.nombre = n_campo.jjtGetChild(1).toString();
            this.tipo = n_campo.jjtGetChild(0).toString();
        } catch (Exception e) {
            l_errores.agregar_error("ha ocurrido un error, no se pudo crear el campo "+ n_campo.jjtGetChild(1).toString());

        }

    }

}
