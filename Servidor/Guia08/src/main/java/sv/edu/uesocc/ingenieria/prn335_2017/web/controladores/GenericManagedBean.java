package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacadeLocal;

/**
 *
 * @author gabriel
 * @param <T>
 */

public abstract class GenericManagedBean<T> implements Serializable{

     List<T> listaDatos;

    /**
     * Genera un registro
     */
    public void crear() {
        if (getFacadeLocal() != null) {
            try {
                getFacadeLocal().create(getEntity());
                llenarLista();
                enviarMensaje(false,"Registro creado correctamente");
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
                enviarMensaje(true,"Error al crear registro creado correctamente.");
            }
        }
    }

    /**
     * Edita un registro
     */
    public void editar() {
        if (getFacadeLocal() != null) {
            try {
                System.out.println("Llego aqui");
                getFacadeLocal().edit(getEntity());
                llenarLista();
                enviarMensaje(false,"Edicion realizada correctamente.");
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
                enviarMensaje(true,"Error al editar registro.");
            }
        }
    }

    /**
     * Elimina un registro
     */
    public void eliminar() {
        if (getFacadeLocal() != null) {
            try {
                getFacadeLocal().remove(getEntity());
                llenarLista();
                enviarMensaje(false,"Registro eliminado correctamente");
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
                enviarMensaje(true,"Error al eliminar registro");
            }
        }
    }

    /**
     * Este metodo sirve para llenar una lista de datos obtenidos de la base de
     * datos
     */
    public void llenarLista() {
        if (getFacadeLocal().findAll() != null) {
            this.listaDatos = getFacadeLocal().findAll();
        } else {
            this.listaDatos = Collections.EMPTY_LIST;
        }
    }

    /**
     * Este metodo sirve para mostrar un mensaje en el JSF
     *
     * @param error espera un true o false para mostrar un mensaje de error o
     * confirmacion respectivaente
     * @param mensaje espera el mensaje a mostrar
     */
    public void enviarMensaje(boolean error, String mensaje) {
        if (error=false) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", mensaje));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Info", mensaje));
        }
    }

    /**
     * 
     * @return se espera que retorne el una interfaz de algun tipo para trabajar con ell
     */
    protected abstract GenericFacadeLocal<T> getFacadeLocal();

    /**
     *
     * @return Se espera que retorne una entidad
     */
    public abstract T getEntity();
}
