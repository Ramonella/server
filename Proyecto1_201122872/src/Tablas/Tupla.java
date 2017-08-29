package Tablas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author empalacios
 */
public class Tupla {
    private Map<String, Object> campos = new HashMap<>();
    
    public void agregarValor(String campo, Object valor) throws Exception {
        if (campos.containsKey(campo)) {
            throw new Exception("El campo ya existe");
        }
        campos.put(campo, valor);
    }
    
    public Object obtenerValor(String campo) {
        return campos.get(campo);
    }
}
