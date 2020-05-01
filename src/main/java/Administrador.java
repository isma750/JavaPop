
import java.util.ArrayList;


public class Administrador {

    private String correo;
    private String clave;
    private ArrayList<Cliente> clientes;
    private ArrayList<UtilProductos> productos;
    
    public Administrador (String correo, String clave){
        this.correo = correo;
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public String toString(){
        return "\n\tAdministrador{" + "correo=" + correo + ", clave=" + clave + "}";
    }
    
    public void muestraClientes (Cliente cliente) {
    
        for ( var cadacliente : clientes ) {
            System.out.println (clientes);
            
        }
    }
    public void muestraProductos (UtilProductos producto) {
        
        for (var cadaproducto : productos ){
            System.out.println (productos);
        }
    }
    
}
