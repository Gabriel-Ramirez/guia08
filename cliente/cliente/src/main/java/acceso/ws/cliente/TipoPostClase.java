/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso.ws.cliente;

import java.util.ArrayList;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Jersey REST client generated for REST resource:TipoPostFacadeREST
 * [tipopost]<br>
 * USAGE:
 * <pre>
 *        TipoPostClase client = new TipoPostClase();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author gabriel
 */
public class TipoPostClase {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/cliente-1.0-SNAPSHOT/guia06/ws";

    public TipoPostClase() {
        try {
       client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("tipopost");  
        } catch (Exception e) {
        }
       
    }

    public <T> T findById(Class<T> responseType, String findById) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{findById}));
        return resource.request(MediaType.APPLICATION_JSON).get(responseType);
    }

    /*
 Este metodo pide al servidor JSON datos mediante rangos    
    */
     public <T> T findByRange(Class<T> responseType, String pagesize, String first) throws ClientErrorException {
        try {
                   
        WebTarget resource = webTarget;
        if (pagesize != null) {
            resource = resource.queryParam("pagesize", pagesize);
        }
        if (first != null) {
            resource = resource.queryParam("first", first);
        }
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
        } catch (Exception e) {
        }
        return (T) new ArrayList();
    }

     /*
     Este metodo pide al servidor de JSON el numero de datos que se poseen dentro de una determinada entity
     */
    public <T> T count(Class<T> responseType) throws ClientErrorException {
        try {
        WebTarget resource = webTarget;
        resource = resource.path("count");
        return resource.request(MediaType.TEXT_PLAIN).get(responseType); 
        } catch (Exception e) {
            
        }
        return (T) new ArrayList();

    }

    /*
    Pide al servidor que le devuelva todos los registros con los que se cuentan
    */
    public <T> T findAll(Class<T> responseType) throws ClientErrorException {
        try {
        WebTarget resource = webTarget;
        resource = resource.path("todo");
        return resource.request(MediaType.APPLICATION_JSON).get(responseType);
        } catch (Exception e) {
        }
      return (T) new ArrayList();
    }

    public void close() {
        client.close();
    }
    
}
