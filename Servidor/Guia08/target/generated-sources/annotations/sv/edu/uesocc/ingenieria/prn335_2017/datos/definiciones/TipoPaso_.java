package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Paso;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-11-23T06:31:42")
@StaticMetamodel(TipoPaso.class)
public class TipoPaso_ { 

    public static volatile SingularAttribute<TipoPaso, Integer> idTipoPaso;
    public static volatile SingularAttribute<TipoPaso, String> descripcion;
    public static volatile ListAttribute<TipoPaso, Paso> pasoList;
    public static volatile SingularAttribute<TipoPaso, String> nombre;
    public static volatile SingularAttribute<TipoPaso, Boolean> activo;

}