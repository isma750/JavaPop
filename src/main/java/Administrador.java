
import java.util.ArrayList;

/**
 * 
 * Clase con las propiedades para registrarse el administrador de Javapop
 * Hereda de Usuario
 */
public class Administrador extends Usuario {

    
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    
    /**
     * Constructor
     * @param correo  para registrarse el administrador
     * @param clave para registrarse el administrador
     */
    public Administrador (String correo, String clave){
       super(correo,clave);
       this.correo = "admin@javapop.com";
       this.clave = "admin";
           
    }
    
}
