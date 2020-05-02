
import java.util.ArrayList;


public class Cliente extends Usuario{

    private String nombre;
    private String dni;
    private String ubicacion;
    private int tarjeta;
    private ArrayList<Producto> productos;
    
    public Cliente(String nombre, String dni, String correo, String clave, String ubicacion, int tarjeta) {
                super(correo,clave);
                
		this.nombre = nombre;
		this.dni = dni;
                this.ubicacion = ubicacion;
                this.tarjeta = tarjeta;
                this.productos = null;
	}
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
            return "\n\tCliente{" + "nombre=" + nombre + ", dni=" + dni + ", ubicación=" + ubicacion + ", tarjeta=" + tarjeta + "}";
    }
    
    public void añadirProducto (Producto productos) {
        if (this.productos == null) {
            this.productos = new ArrayList<Producto>();
        }
        this.productos.add(new Producto(this));  
    }
    
    public void quitarProducto (UtilProductos producto) {
        if (this.productos != null){
            if(this.productos.contains(producto)) {
                this.productos.remove(producto);
            }
        }
    }
    
    
}
