package Tablas;

import java.util.HashMap;
import java.util.Map;
import static proyecto1_201122872.Proyecto1_201122872.glob;

/**
 *
 * @author alina
 */
public class Tupla {
    private Map<String, Object> campos = new HashMap<>();
    
    public void agregarValor(String campo, Object valor) {
        if (campos.containsKey(campo)) {
            glob.l_errores.agregar_error("Campo ya existe");
           
        }
        campos.put(campo, valor);
    }
    
    public Object obtenerValor(String campo) {
        return campos.get(campo);
    }
    
    public String getXML(){
        String[] claves = campos.keySet().toArray(new String[0]);
        String cadena="";
        for (int i = 0; i < claves.length; i++) {
            cadena +="<"+claves[i]+">"+ obtenerValor(claves[i])+"</"+claves[i]+">\n";
        }
        return cadena;
    }
}
