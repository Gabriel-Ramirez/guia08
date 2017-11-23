package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Post;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-11-23T06:31:42")
@StaticMetamodel(Cometario.class)
public class Cometario_ { 

    public static volatile SingularAttribute<Cometario, Date> fecha;
    public static volatile SingularAttribute<Cometario, Integer> idUsuario;
    public static volatile SingularAttribute<Cometario, Boolean> aprobado;
    public static volatile SingularAttribute<Cometario, String> comentario;
    public static volatile SingularAttribute<Cometario, Integer> idComentario;
    public static volatile SingularAttribute<Cometario, Post> idPost;

}