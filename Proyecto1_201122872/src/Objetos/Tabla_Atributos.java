/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Analizador.SimpleNode;
import Errores.ErrorE;
import java.util.LinkedList;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Tabla_Atributos {
    
   public LinkedList<atributo_objeto> l_atributos;
   public String nombre_objeto;
    
    public Tabla_Atributos(String nombre){
        this.l_atributos= new LinkedList();
        this.nombre_objeto= nombre;
    }
    
    public Tabla_Atributos(){
        this.l_atributos= new LinkedList();
        this.nombre_objeto="";
    }
    
    
    
    public Object getAtributo(String nombre){
        for (atributo_objeto atri: l_atributos) {
            if(atri.getNombre().equalsIgnoreCase(nombre))
                return atri;
        }
        return "nulo";
        
    }
    
    public Tabla_Atributos clonar(){
        
        Tabla_Atributos atribitos = new Tabla_Atributos();
        atribitos.nombre_objeto= this.nombre_objeto;
        atributo_objeto nuevo;
        for(atributo_objeto atr : l_atributos){
            nuevo = atr.clonar();
            atribitos.insert(nuevo);
        }
        
        return atribitos;
    }
    
    private boolean exist(String name){
        for (atributo_objeto atri: l_atributos) {
            if(atri.getNombre().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }
    
    public boolean insert(atributo_objeto atri){
        
        if(exist(atri.getNombre())){
            String descripcion= "En el objeto "+ this.nombre_objeto+" ya existe un atributo con el nombre de "+atri.getNombre();
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo); 
            return false;
        }else{
           
            this.l_atributos.add(atri);
            return true;
            //se ha crado un nuevo objeto
        }
    }
    
    public boolean eliminar(String nombre){
        if(exist(nombre)){
            for (int i = 0; i < this.l_atributos.size(); i++) {
                if(this.l_atributos.get(i).getNombre().equalsIgnoreCase(nombre)){
                    this.l_atributos.remove(i);
                    return true;
                }
            }
        }else{
            String descripcion= "En el objeto "+ this.nombre_objeto+" no existe el atributo "+nombre;
            ErrorE nuevo = new ErrorE(descripcion, "", "", "Semantico", "USQL");
            glob.l_errores.insertar(nuevo); 
            return false;
        }
        
        return false;
    }
    
    
    public void guardar_atributos(SimpleNode atributos){
        atributo_objeto nuevo;
        for (int i = 0; i < atributos.jjtGetNumChildren(); i++) {
            nuevo = new atributo_objeto((SimpleNode)atributos.jjtGetChild(i));
            insert(nuevo);
        }
    }
    
    public String getCadena_atributos()
    {
       String ret="<attr>\n";
        for (atributo_objeto atr: l_atributos) {
            ret+=atr.getCadena_atributo();
        }
        ret+="</attr>\n";
        
        return ret; 
    }
    
}
