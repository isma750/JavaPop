
import java.util.ArrayList;


public class Administrador extends Usuario {

    
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    
    public Administrador (String correo, String clave){
       super(correo,clave);
           
    }
    
    public void muestraClientes (Cliente cliente) {
    
        for ( var cadacliente : clientes ) {
            System.out.println (clientes);
            
        }
    }
    public void muestraProductos (Producto producto) {
        
        for (var cadaproducto : productos ){
            System.out.println (productos);
        }
    }
    
}
