package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Categoria;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Cometario;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Meta;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.PostPaso;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.PostSeccion;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPost;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-11-23T06:31:42")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, String> descripcion;
    public static volatile SingularAttribute<Post, Date> fecha;
    public static volatile ListAttribute<Post, Meta> metaList;
    public static volatile ListAttribute<Post, PostPaso> postPasoList;
    public static volatile SingularAttribute<Post, TipoPost> idTipoPost;
    public static volatile ListAttribute<Post, Cometario> cometarioList;
    public static volatile SingularAttribute<Post, String> titulo;
    public static volatile SingularAttribute<Post, Boolean> aprobacionComentarios;
    public static volatile SingularAttribute<Post, Categoria> idCategoria;
    public static volatile ListAttribute<Post, PostSeccion> postSeccionList;
    public static volatile SingularAttribute<Post, Integer> idPost;

}