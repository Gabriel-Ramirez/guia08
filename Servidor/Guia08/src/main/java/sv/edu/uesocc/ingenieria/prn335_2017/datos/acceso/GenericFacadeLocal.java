
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;

/**
 *
 * @author gabriel
 * @param <T>
 */
public interface GenericFacadeLocal<T> {
    
    void create(T e);

    void edit(T e);

    void remove(T e);

    T find(Object id);

    List<T> findAll();

    /**
     *
     * @param desde
     * @param hasta
     * @return
     */
    List<T> findRange(int desde, int hasta);

    int count();
    
}
