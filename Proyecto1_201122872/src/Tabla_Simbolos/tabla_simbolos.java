/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla_Simbolos;

import Base_Datos.objeto_base;
import Clases_resolver_expresiones.Suma;
import Objetos.atributo_objeto;
import java.util.LinkedList;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class tabla_simbolos {
    
    public LinkedList<Simbolo> l_simbolos;
    
   
    
    
    public tabla_simbolos(){
        this.l_simbolos= new LinkedList();
    }
    
    
    
    public Object getVal_Objeto(String nombre){
        Simbolo nuevo= getElemento(nombre);
        if(nuevo!=null){
            if(nuevo instanceof objeto_instancia){
                objeto_instancia temp= (objeto_instancia)nuevo;
                return ((objeto_instancia) nuevo);
            }else{
                glob.l_errores.agregar_error("No existe el objeto "+ nombre+" a la cual quiere hacer referencia");
                return "nulo";
            }
        }else{
            glob.l_errores.agregar_error("No existe el objeto "+ nombre+" a la cual quiere hacer referencia");
           return "nulo";
        }
    } 
    
    
    
    
    public Object getVal_Variable(String nombre){
        Simbolo nuevo= getElemento(nombre);
        if(nuevo!=null){
            if(nuevo instanceof variable){
                variable temp= (variable)nuevo;
                return ((variable) nuevo).valor;
            }else{
                glob.l_errores.agregar_error("No existe la variable "+ nombre+" a la cual quiere hacer referencia");
                return "nulo";
            }
        }else{
            glob.l_errores.agregar_error("No existe la variable "+ nombre+" a la cual quiere hacer referencia");
           return "nulo";
        }
    } 
    
    
    public boolean insertar(Simbolo nuevo){
       
        if(!existe(nuevo.nombre)){
            l_simbolos.add(nuevo);
            return true;
        }else{
            glob.l_errores.agregar_error("No se ha podido crear el elemento "+ nuevo.nombre+", ya existe en el contexto actual.");
            return false;
        }
        
    }
    
    public boolean existe(String nombre){
     
        for(Simbolo sim: l_simbolos){
           if(sim.nombre.equalsIgnoreCase(nombre)){
               return true;
           }
        }
        return false;
    }
    
    public Simbolo getElemento(String nombre){
        for(Simbolo sim: l_simbolos){
           if(sim.nombre.equalsIgnoreCase(nombre)){
               return sim;
           }
        }
        return null;
    }
    
    public void imprimir(){
        for(Simbolo sim: l_simbolos){
            System.out.println(sim.getCad());
        }
    }
    
    
    
    public boolean asignar(String nombre_var,Object valor ){
        Suma s = new Suma();
        String tipo_valor = s.comprobar_tipo(valor);
        Simbolo temp;
        for (int i = 0; i < this.l_simbolos.size(); i++) {
            temp= l_simbolos.get(i);
            if(temp.nombre.equalsIgnoreCase(nombre_var) && temp instanceof variable){
                variable var = (variable)temp;
                if(var.tipo.equalsIgnoreCase(tipo_valor)){
                    var.valor= valor;
                    l_simbolos.set(i, var);
                    return true;
                }else{
                   glob.l_errores.agregar_error("Error, no se pudo asignar a la variable "+ nombre_var+", tipos no coinciden, "+ temp.tipo+ " "+tipo_valor);
                   return false;
                }
            }
            
        }

        glob.l_errores.agregar_error("No existe la variable "+ nombre_var); 
        return false;
    }
    
    public boolean asignar(String nombre_ob, String nombre_atri, Object valor){
       Suma s = new Suma();
        String tipo_valor = s.comprobar_tipo(valor);
        Simbolo temp;
        for (int i = 0; i < this.l_simbolos.size(); i++) {
            temp= l_simbolos.get(i);
            if(temp.nombre.equalsIgnoreCase(nombre_ob) && temp instanceof objeto_instancia){
                objeto_instancia obj = (objeto_instancia) temp;
                for (int j = 0; j < obj.atributos.l_atributos.size(); j++) {
                    atributo_objeto atri= obj.atributos.l_atributos.get(j);
                    if(atri.nombre.equalsIgnoreCase(nombre_atri)){
                        if(atri.tipo.equalsIgnoreCase(tipo_valor)){
                            atri.valor= valor;
                            obj.atributos.l_atributos.set(j, atri);
                            l_simbolos.set(i, obj);
                            return true;
                        }else{
                            //existe pero no son el mismo tipo
                            glob.l_errores.agregar_error("Error, no se puede asignar el atributo "+ nombre_atri+" del objeto "+ nombre_ob+", ya que los tipos no coinciden "+ obj.tipo+" "+ tipo_valor);
                            return false;
                        }
                    }
                    
                    
                }
                
               
            }
            
        }

        glob.l_errores.agregar_error("No existe el objeto "+ nombre_ob); 
        return false;
        
    }
    
}
