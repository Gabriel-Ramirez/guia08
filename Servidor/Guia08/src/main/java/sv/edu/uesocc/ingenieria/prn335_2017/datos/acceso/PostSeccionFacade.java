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
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.PostSeccion;


@Stateless
public class PostSeccionFacade extends AbstractFacade<PostSeccion> implements PostSeccionFacadeLocal {

    @PersistenceContext(unitName = "uesocc.edu.sv.ingenieria.prn335_webproject3_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PostSeccionFacade() {
        super(PostSeccion.class);
    }

    @Override
    public List<PostSeccion> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
