package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPostSeccion;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoSeccion;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-11-23T06:31:42")
@StaticMetamodel(Seccion.class)
public class Seccion_ { 

    public static volatile SingularAttribute<Seccion, String> descripcion;
    public static volatile ListAttribute<Seccion, TipoPostSeccion> tipoPostSeccionList;
    public static volatile SingularAttribute<Seccion, TipoSeccion> idTipoSeccion;
    public static volatile SingularAttribute<Seccion, Integer> idSeccion;
    public static volatile SingularAttribute<Seccion, String> nombre;
    public static volatile SingularAttribute<Seccion, Boolean> activo;

}