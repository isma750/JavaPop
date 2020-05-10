
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Clase general de las propiedades de los clientes de Javapop
 * Hereda de Usuario
 */
public class Cliente extends Usuario{

    private String nombre;
    private String dni;
    private String ubicacion;
    private int tarjeta;
    private ArrayList<Producto> Productos;
    private ArrayList<Producto> ProductosComprados;
    private ArrayList<Producto> ProductosVendidos;
    
    /**
     * Constructor
     * @param nombre del cliente
     * @param dni del cliente
     * @param correo para registrarse el cliente
     * @param clave para registrarse el cliente
     * @param ubicacion del cliente
     * @param tarjeta de credito del cliente vinculada en Javapop
     */
    public Cliente(String nombre, String dni, String correo, String clave, String ubicacion, int tarjeta) {
                super(correo,clave);
                
		this.nombre = nombre;
		this.dni = dni;
                this.ubicacion = ubicacion;
                this.tarjeta = tarjeta;
               
	}
    // Realizamos los getter y setter
    
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

    public ArrayList<Producto> getProductos() {
        if (this.Productos == null) {
            this.Productos = new ArrayList<Producto>();
        }
        return Productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        Productos = productos;
    }

    @Override
    public String toString() {
            return "\n\tCliente{" + "nombre=" + nombre + ", dni=" + dni + ", ubicación=" + ubicacion + ", tarjeta=" + tarjeta + "}";
    }
    
    // Añade un producto a los productos de Javapop
    public void añadirProducto (Producto producto) {
        if (this.Productos == null) {
            this.Productos = new ArrayList<Producto>();
        }
        if (!(this.Productos.contains(producto))){
            this.Productos.add(producto);
            System.out.println("Se ha añadido el producto correctamente");
            
        } 
    }
    
    // Quita un producto entre los productos de Javapop
    public void quitarProducto (Producto producto) {
        if (this.Productos != null){
            if (this.Productos.contains(producto)) {
                this.Productos.remove(producto);
                System.out.println(" Se ha eliminado el producto correctamente");
            }
        }
    }
    public void confirmarCompra(Producto producto){
        producto.setMarcadoParaCompra(true);
    }
    public void confirmarVenta (Producto producto){
        producto.setMarcadoParaVenta(true);
    }
    
    // Historial de los productos comprados por el cliente
    public void ProductosComprados (Producto productoComprado) {
        if (this.ProductosComprados == null){
            this.ProductosComprados = new ArrayList<Producto>();
        }
        if (!(this.ProductosComprados).contains(productoComprado)) {
            this.ProductosComprados.add(productoComprado);
            System.out.println("Su producto comprado ha quedado registrado");
        }
    }
    
    // Historial de los productos vendidos por el cliente
    public void ProductosVendidos (Producto productosVendidos) {
        if (this.ProductosVendidos == null){
            this.ProductosVendidos = new ArrayList<Producto>();
        }
        if (!(this.ProductosVendidos).contains(productosVendidos)){
            this.ProductosVendidos.add(productosVendidos);
            System.out.println("Su producto vendido ha quedado registrado");
        }
    }

    
    
    
}
