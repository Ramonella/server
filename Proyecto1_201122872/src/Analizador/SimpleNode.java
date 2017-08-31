/* Generated By:JJTree: Do not edit this line. SimpleNode.java Version 4.3 */
 /* JavaCCOptions:MULTI=false,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Analizador;


import Base_Datos.base_datos;
import Base_Datos.objeto_base;
import Condiciones.Resolutor_Condicion;
import Condiciones.Resolutor_Logica;
import Ejecucion.Global;
import Instrucciones.Declaracion;
import Objetos.Objeto;
import Tabla_Simbolos.Simbolo;
import Tabla_Simbolos.tabla_simbolos;
import Tablas.Tabla;
import static proyecto1_201122872.Proyecto1_201122872.glob;


public class SimpleNode implements Node {

    protected Node parent;
    protected Node[] children;
    protected int id;
    protected Object value;
    protected analizador parser;

    protected String name;

    public SimpleNode(int i) {
        id = i;
    }

    public SimpleNode(analizador p, int i) {
        this(i);
        parser = p;
    }

    public void jjtOpen() {
    }

    public void jjtClose() {
    }

    public void jjtSetParent(Node n) {
        parent = n;
    }

    public Node jjtGetParent() {
        return parent;
    }

    public void jjtAddChild(Node n, int i) {
        if (children == null) {
            children = new Node[i + 1];
        } else if (i >= children.length) {
            Node c[] = new Node[i + 1];
            System.arraycopy(children, 0, c, 0, children.length);
            children = c;
        }
        children[i] = n;
    }

    public Node jjtGetChild(int i) {
        return children[i];
    }

    public int jjtGetNumChildren() {
        return (children == null) ? 0 : children.length;
    }

    public void jjtSetValue(Object value) {
        this.value = value;
    }

    public Object jjtGetValue() {
        return value;
    }

    /* You can override these two methods in subclasses of SimpleNode to
     customize the way the node appears when the tree is dumped.  If
     your output uses more than one line you should override
     toString(String), otherwise overriding toString() is probably all
     you need to do. */
    //public String toString() { return analizadorTreeConstants.jjtNodeName[id]; }
    public String toString(String prefix) {
        return prefix + toString();
    }

    /* Override this method if you want to customize how the node dumps
     out its children. */
    public void dump(String prefix) throws Exception {
        System.out.println(toString(prefix));
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                SimpleNode n = (SimpleNode) children[i];
              
                if (n != null) {
                    if (n.toString().equals("archivo")) {
                        
                        ejecutar((SimpleNode)n);
                        //System.out.println("REsultado:\n " +crear_objetos_usql((SimpleNode)n.jjtGetChild(0)).getXML());
                        //System.out.println("no.. " + tabla.l_simbolos.size());
                        //tabla.imprimir();
                    }
                   n.dump(prefix + " ");
                  
                }
            }
            
        }
    }//*/

    
    public void ejecutar(SimpleNode nodo){
        for (int i = 0; i < nodo.jjtGetNumChildren(); i++) {
            Ejecutar_Instruccion_Global((SimpleNode)nodo.jjtGetChild(i));
            
        }
    }
    
    
    public void Ejecutar_Instruccion_Global(SimpleNode nodo){
        
        
        
        
        /*
        void inst_archivo()#void:{}{
 //dml
  INSERTAR()
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
  |DENEGAR()
  //ssl
  

}
        
        */
        
        switch(nodo.toString()){
            
            case "INSERTAR":{
                
               String nombre= nodo.jjtGetChild(0).toString();
              boolean v = glob.base_actual.insertarTabla(nombre,(SimpleNode) nodo.jjtGetChild(1));
               System.out.println("la insercion de valores fue "+ v);
               break;
               
            }
            
            case "CREAR":{
                Global creador= new Global();
                objeto_base nuevo = creador.crear_objetos_usql((SimpleNode)nodo.jjtGetChild(0));
                glob.add_elemento_base_actual(nuevo);
                break;
                
                
            }
            case "USAR":{
              boolean band =  glob.usar_base(nodo.jjtGetChild(0).toString());
              if(band){
                  glob.agregarConsola("El usuario, utilizara la base de datos "+ nodo.jjtGetChild(0).toString());
              }
              break;
            }
            
        }
        
    }
    
    
    
    /*   Funciones Extras  */
 /* 
   public void dump(String prefix) {
        System.out.println(toString(prefix)+ "popooo");
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                System.out.println("numero de hijos "+ children.length);
                SimpleNode n = (SimpleNode) children[i];
                  System.out.println("nn   "
                  + n.name);
                if (n.toString().equals("Expresion")) {
                    System.out.println("Entro a Expresion");
                   // Declaracion((SimpleNode) n.children[0]);
                    //Gramatica((SimpleNode) n.children[1]);
                    //Codigo((SimpleNode) n.children[2]);
                }
//                if (n != null) {
//                    n.dump(prefix + " ");
//                }
            }
        }
    }
     */
     tabla_simbolos tabla= new tabla_simbolos();
    public void ejecutar_sentencia(SimpleNode nodo){
       
        switch(nodo.toString()){
            case "VARIABLE":{
                
                int no_hijos = nodo.jjtGetNumChildren();
                String tipo= nodo.jjtGetChild(1).toString();
                Declaracion decla; 
                if(no_hijos==2){
                    //no posee expresion
                    for (int i = 0; i < nodo.jjtGetChild(0).jjtGetNumChildren(); i++) {
                        decla= new Declaracion(tipo,nodo.jjtGetChild(0).jjtGetChild(i).toString());
                        decla.Ejecutar(tabla);
                    }
                    
                }else if(no_hijos==3){
                    //posee expresion
                }
                
                break;
            }
            case "INSTANCIA":{
                break;
            }
            
            case "DECLARAR":{
                ejecutar_sentencia((SimpleNode)nodo.jjtGetChild(0));
            }
        }
        
    }
    
 
     public int Evaluar_Condicion(SimpleNode nodo_aux){
        Resolutor_Condicion condiciones= new Resolutor_Condicion();
        Resolutor_Logica logicas= new Resolutor_Logica();
         switch (nodo_aux.toString()){
             case "Condicion":{
                 return Evaluar_Condicion((SimpleNode)nodo_aux.jjtGetChild(0));
             }
             
             case "Nuva_Condicion":{
                 tabla_simbolos n = new tabla_simbolos();
                 int numero_hijos = nodo_aux.jjtGetNumChildren();
                 if(numero_hijos==3){
                     return condiciones.Resolver(nodo_aux,n); 
                 }else{
                     return Evaluar_Condicion((SimpleNode)nodo_aux.jjtGetChild(0));
                     
                 }
            }
             
             
             
           case "Nuva_CondicionNOT":
                if(condiciones.esUno(Evaluar_Condicion((SimpleNode)nodo_aux.jjtGetChild(0)))){
                    return 0;
                }else{
                    return 1;
                }
            case "And": {
                 Object[] aux_M = new Object[nodo_aux.jjtGetNumChildren()];
                for (int i = 0; i < nodo_aux.jjtGetNumChildren(); i++) {
                    aux_M[i] = Evaluar_Condicion((SimpleNode) nodo_aux.jjtGetChild(i));
                }
                
                Object mul = aux_M[0];
                int bandera = 0;
                for (int i = 1; i < aux_M.length; i++) {
                    if (aux_M[i] != null) {
                        bandera= logicas.OperarAnd(mul, aux_M[i]);
                    } 
                }
               return bandera; 
                
            }               
               

                
            case "Or":                
                {
                 Object[] aux_M = new Object[nodo_aux.jjtGetNumChildren()];
                for (int i = 0; i < nodo_aux.jjtGetNumChildren(); i++) {
                    aux_M[i] = Evaluar_Condicion((SimpleNode) nodo_aux.jjtGetChild(i));
                }
                
                Object mul = aux_M[0];
                int bandera = 0;
                for (int i = 1; i < aux_M.length; i++) {
                    if (aux_M[i] != null) {
                        bandera= logicas.OperarOr(mul, aux_M[i]);
                    } 
                }
               return bandera; 
                
            }
               
        }
        
      return 0;
    }
    
    

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        if (name != null) {
            return name;
        } else {
            return analizadorTreeConstants.jjtNodeName[id];
        }
    }
}

/* JavaCC - OriginalChecksum=1535a81683f96de0cb5df11a33d9398f (do not edit this line) */
