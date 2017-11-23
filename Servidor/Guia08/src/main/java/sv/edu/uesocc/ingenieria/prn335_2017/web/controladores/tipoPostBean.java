/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.event.SelectEvent;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPost;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.TipoPostFacadeLocal;

@Named(value = "tpBean")
@ViewScoped
public class tipoPostBean extends GenericManagedBean<TipoPost> implements Serializable {  
    
    public tipoPostBean() {
    }
    
    @EJB
    TipoPostFacadeLocal facade;
    TipoPost tipoPostEntity;
    boolean btnVisible=false;


    public TipoPostFacadeLocal getFacade() {
        return facade;
    }

    public boolean isBtnVisible() {
        return btnVisible;
    }

    public void setBtnVisible(boolean btnVisible) {
        this.btnVisible = btnVisible;
    }
    
    public void setFacade(TipoPostFacadeLocal facade) {
        this.facade = facade;
    }

    public TipoPost getTipoPostEntity() {
        return tipoPostEntity;
    }

    public void setTipoPostEntity(TipoPost tipoPostEntity) {
        this.tipoPostEntity = tipoPostEntity;
    }

    public List<TipoPost> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<TipoPost> listaDatos) {
        this.listaDatos = listaDatos;
    }
  
    @Override
    public TipoPost getEntity() {
        return tipoPostEntity;
    }

     @Override
    protected GenericFacadeLocal<TipoPost> getFacadeLocal() {
        return facade;
    }


    @Override
    public void editar() {
        super.editar(); 
        reiniciarValores();
    }

    @Override
    public void eliminar() {
        super.eliminar(); 
        reiniciarValores();
    }

    @Override
    public void crear() {
        super.crear(); 
        reiniciarValores();
    }
    // </editor-fold>
    
    @PostConstruct
    public void init(){
     btnCancelar();
     llenarLista();
    }
    
    
    public void onRowSelect(SelectEvent event) {
        btnVisible = true;
    }
    /*
    Maneja el boton cancelar
    */
    public void btnCancelar() {
        tipoPostEntity = new TipoPost();
        btnVisible = false;
    }
    
    /*
    Reinicia los botones a su estado inicial
    */
    public void reiniciarValores(){
        btnCancelar();
        tipoPostEntity.setActivo(false);
        tipoPostEntity.setDescripcion(null);
        tipoPostEntity.setNombre(null);
      
    }
}

