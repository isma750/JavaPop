package zonaNegocio;



import java.util.ArrayList;

/**
 * 
 * Clase con las propiedades para registrarse el administrador de Javapop
 * Hereda de Usuario
 */
public class Administrador extends Usuario  {

    
    
    /**
     * Constructor
     * @param correo  para registrarse el administrador
     * @param clave para registrarse el administrador
     */
    public Administrador (){
       super("admin@javapop.com","admin");
       
           
    }
    
}
