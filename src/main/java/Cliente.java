
import java.util.ArrayList;
import java.util.Scanner;


public class Cliente extends Usuario{

    private String nombre;
    private String dni;
    private String ubicacion;
    private int tarjeta;
    private ArrayList<Producto> Productos;
    private ArrayList<Producto> ProductosComprados;
    private ArrayList<Producto> ProductosVendidos;
    
    public Cliente(String nombre, String dni, String correo, String clave, String ubicacion, int tarjeta) {
                super(correo,clave);
                
		this.nombre = nombre;
		this.dni = dni;
                this.ubicacion = ubicacion;
                this.tarjeta = tarjeta;
               
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

    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        Productos = productos;
    }

    @Override
    public String toString() {
            return "\n\tCliente{" + "nombre=" + nombre + ", dni=" + dni + ", ubicación=" + ubicacion + ", tarjeta=" + tarjeta + "}";
    }
    
    public void RegristarUsuario (String correoPedido, String clavePedida, Usuario usuario){
       if (correoPedido == usuario.getCorreo()){
           System.out.println("Usuario correcto");
       } else {
           System.out.println("Usiario incorrecto");
       }
         
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
    
    public void ProductosComprados (Producto productoComprado) {
        if (this.ProductosComprados == null){
            this.ProductosComprados = new ArrayList<Producto>();
        }
        if (!(this.ProductosComprados).contains(productoComprado)) {
            this.ProductosComprados.add(productoComprado);
            System.out.println("Su producto comprado ha quedado registrado");
        }
    }
    
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
