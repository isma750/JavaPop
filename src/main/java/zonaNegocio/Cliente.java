package zonaNegocio;



import java.util.ArrayList;

/**
 * 
 * Clase general de las propiedades de los clientes de Javapop
 * Hereda de Usuario
 */
public class Cliente extends Usuario {

    private String nombre;
    private String dni;
    private int codigoPostal;
    private String ciudad;
    private String tarjeta;
    private double saldoTarjeta;
    private ArrayList<Producto> Productos;
  
    private ArrayList<Compra> Compras;
    private ArrayList<Venta> Ventas;
    
    private Estado estado;

   
    public enum Estado {
        ACTIVO,
        BAJA;
        
        @Override
        public String toString() {
            switch(this){
                case ACTIVO:
                    return "Activo";
                case BAJA:
                    return "Baja";
            }
            return null;
                
        }
    }


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
                this.estado = Estado.ACTIVO;
               
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
        if (this.Compras == null) {
            this.Compras = new ArrayList<Compra>();
        }
        return Compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        Compras = compras;
    }

    public ArrayList<Venta> getVentas() {
        if (this.Ventas == null){
                this.Ventas = new ArrayList<>();
            }
        return Ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        Ventas = ventas;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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
    
   

    
    
    
}
