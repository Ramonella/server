/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrucciones;

import Analizador.SimpleNode;
import Tabla_Simbolos.tabla_simbolos;

/**
 *
 * @author alina
 */
public class Cuerpo extends instruccion_generica {
    
    private SimpleNode instrucciones;
    
    public Cuerpo(SimpleNode inst){
        this.instrucciones = inst;
    }
    
    
    @Override
    public resultado Ejecutar(tabla_simbolos vars){
        //System.out.println(instrucciones.jjtGetNumChildren());
        resultado t = new resultado();
        t.setTabla(vars);
        for (int i = 0; i < instrucciones.jjtGetNumChildren(); i++) {
           // System.out.println("ejecutando las instruccion no. "+ i+" del cuerpo");
            if(t.continua){
              instruccion_generica ret = getInstruccion((SimpleNode)instrucciones.jjtGetChild(i));
              t=ret.Ejecutar(t.tabla);
               // System.out.println(t.tabla.l_simbolos.size());
            }
        }
       
        t.tabla.imprimir();
        return t;
    }
    
   
    private instruccion_generica getInstruccion(SimpleNode nodo){
        /*IF()
|PARA()
|MIENTRAS()
|DETENER()
|IMPRIMIR()
|LLAMADA()
|DECLARAR()
|ASIGNACION()
|INSERTAR()
|BORRAR()
|ACTUALIZAR()
|SELECCIONAR()
 //ddl
|CREAR()
|ELIMINAR()
|ALTERAR()
|USAR() 
  //dml
|OTORGAR()
|DENEGAR()*/
        
        
        switch(nodo.toString()){
            case "DECLARAR":{ 
               Lista_Declas ret = new Lista_Declas(nodo);
               return ret;
            }
            case "ASIGNAR":{
                Asignacion ret = new Asignacion(nodo);
                return ret;
            }
            
            case "ASIGNACION":{
                Asignacion ret = new Asignacion(nodo);
                return ret;
            }
            
            case "CREAR":{
                getInstruccion((SimpleNode)nodo.jjtGetChild(0));
                break;
            }
            /*void P_CREAR()#void:{}{
   BASE()
  |TABLA()
  |OBJETO()
  |PROCEDIMIENTO()
  |FUNCION()
  |USUARIO()
}*/
            case "BASE":{
                
            }
            
        }
        
        return null;
    }
    
    
    
}
