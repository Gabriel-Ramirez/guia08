/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoSeccion;


@Stateless
public class TipoSeccionFacade extends AbstractFacade<TipoSeccion> implements TipoSeccionFacadeLocal {

    @PersistenceContext(unitName = "uesocc.edu.sv.ingenieria.prn335_webproject3_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoSeccionFacade() {
        super(TipoSeccion.class);
    }

    @Override
    public List<TipoSeccion> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
