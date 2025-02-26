package practica01Grupo02.service;

import practica01Grupo02.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    // Listado de árboles, filtrando si están activos

    public List<Arbol> getArboles(boolean activo);

        // Obtiene un árbol a partir de su ID
    public Arbol getArbol(Long id);
    
        // Inserta un árbol nuevo o actualiza si ya existe
    public void save(Arbol arbol);
    
        // Elimina un árbol a partir de su ID
    public void delete(Long id);
}
