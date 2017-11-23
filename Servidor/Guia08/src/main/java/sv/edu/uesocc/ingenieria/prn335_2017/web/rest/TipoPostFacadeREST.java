/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.TipoPostFacadeLocal;

import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPost;

/**
 *
 * @author gabriel
 */

@Path("tipopost")
public class TipoPostFacadeREST implements Serializable {

    @EJB
    private TipoPostFacadeLocal tipoPostFacade;

    @GET
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<TipoPost> findByRange(
            @DefaultValue("0") @QueryParam("first")int first, 
            @DefaultValue("10") @QueryParam("pagesize")int pageSize 
            ) {
        List salida = null;

        try {
            if (tipoPostFacade != null) {
                salida = tipoPostFacade.findRange(first, pageSize);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName());
        } finally {
            if (salida == null) {
                salida = new ArrayList();
            }

        }

        return salida;

    }
    
    @Path("todo")
    @GET
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<TipoPost> findAll(
              ) {
        List salida = null;

        try {
            if (tipoPostFacade != null) {
                salida = tipoPostFacade.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName());
        } finally {
            if (salida == null) {
                salida = new ArrayList();
            }

        }

        return salida;

    }
    
    
    @Path("count")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Integer count(){
        try {
            if(tipoPostFacade != null){
            return tipoPostFacade.count();
            }
        } catch (Exception e) {
        }
    return 0;
    }

    @GET
    @Path("{idTipoPost}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public TipoPost findById(
            @PathParam("idTipoPost") Integer id) {
        try {
            if (tipoPostFacade != null && id != null) {
                return tipoPostFacade.find(id);

            }
        } catch (Exception e) {
        }
        

        return new TipoPost();
    }

}
