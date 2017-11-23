/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.persistence.EntityManager;

public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
 
    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        EntityManager em = getEntityManager();
        try {
            if (em != null && entity != null) {
                em.persist(entity);
            }else{
            System.out.println("algo es nulo");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
    
     public void edit(T entity) {
        EntityManager em = getEntityManager();
        try {
            if (em != null && entity != null) {
                em.merge(entity);
            }else{
            System.out.println("algo es nulo");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
 
    public void remove(T entity) {
        EntityManager em = getEntityManager();
        try {
            if (em != null && entity != null) {
                em.remove(getEntityManager().merge(entity));
            }else{
            System.out.println("algo es nulo");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }


    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

   
    public List<T> findRange(int desde, int hasta) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(hasta);
        q.setFirstResult(desde);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }


    
}
