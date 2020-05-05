
import java.util.ArrayList;


public class Cliente extends Usuario{

    private String nombre;
    private String dni;
    private String ubicacion;
    private int tarjeta;
    private ArrayList<Producto> Productos;
    
    public Cliente(String nombre, String dni, String correo, String clave, String ubicacion, int tarjeta) {
                super(correo,clave);
                
		this.nombre = nombre;
		this.dni = dni;
                this.ubicacion = ubicacion;
                this.tarjeta = tarjeta;
                this.Productos = null;
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
    
    public void añadirProducto (Producto producto) {
        if (this.Productos == null) {
            this.Productos = new ArrayList<Producto>();
        }
        if (!(this.Productos.contains(producto))){
            this.Productos.add(producto);
            System.out.println("Se ha añadido el producto correctamente");
            
        } 
    }
    
    public void quitarProducto (Producto producto) {
        if (this.Productos != null){
            if (this.Productos.contains(producto)) {
                this.Productos.remove(producto);
                System.out.println(" Se ha eliminado el producto correctamente");
            }
        }
    }
    
    
    
}
