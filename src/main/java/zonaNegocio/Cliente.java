package zonaNegocio;


import java.util.ArrayList;

/**
 * 
 * Clase general de las propiedades de los clientes de Javapop
 * Hereda de Usuario
 */
public class Cliente extends Usuario{

    private String nombre;
    private String dni;
    private int codigoPostal;
    private String ciudad;
    private String tarjeta;
    private double saldoTarjeta;
    private ArrayList<Producto> Productos;
    private ArrayList<Producto> ProductosVendidos; //Esto igual habria q quitarlo, lo veo redundante ya q los productos vendidos se quedan en el array de productos con el estado vendido
    private ArrayList<Producto> ProductosComprados;
    private ArrayList<Compra> Compras;
    private ArrayList<Venta> Ventas;


    /**
     * Constructor
     * @param nombre del cliente
     * @param dni del cliente
     * @param correo para registrarse el cliente
     * @param clave para registrarse el cliente
     * @param codigoPostal del cliente
     * @param ciudad del cliente
     * @param tarjeta de credito del cliente vinculada en Javapop
     */
    public Cliente(String nombre, String dni,int codigoPostal, String ciudad, String correo, String clave, String tarjeta) {
                super(correo,clave);
                
		this.nombre = nombre;
		this.dni = dni;
                this.codigoPostal = codigoPostal;
                this.ciudad = ciudad;
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

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
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

    public double getSaldoTarjeta() {
        return saldoTarjeta;
    }

    public void setSaldoTarjeta(int saldoTarjeta) {
        this.saldoTarjeta = saldoTarjeta;
    }

    public ArrayList<Compra> getCompras() {
        return Compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        Compras = compras;
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        Ventas = ventas;
    }

    @Override
    public String toString() {
            return "\n\tCliente{" + "nombre=" + nombre + ", dni=" + dni + ", codigo postal=" + codigoPostal +", ciudad= "+ ciudad +", tarjeta=" + tarjeta + "}";
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
    public void solicitarCompra(Producto producto){
        producto.setSituacion(Producto.situacion.SOLICITADO);
    }
    public void confirmarVenta (Producto producto){
        producto.setSituacion(Producto.situacion.ACEPTADOVENTA);
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
