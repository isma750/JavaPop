package zonaNegocio;
import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * Clase que representa la venta de un producto
 * 
 */
public class Venta implements Serializable{
    private LocalDateTime fechaVenta;
    private Producto producto;
    private Cliente Vendedor;
    private Cliente Comprador;

    //Realizamos los getter y setter
    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getVendedor() {
        return Vendedor;
    }

    public void setVendedor(Cliente Vendedor) {
        this.Vendedor = Vendedor;
    }

    public Cliente getComprador() {
        return Comprador;
    }

    public void setComprador(Cliente Comprador) {
        this.Comprador = Comprador;
    }
    /**
     * Constructor
     * @param fechaVenta
     * @param producto
     * @param Vendedor
     * @param Comprador 
     */
    public Venta(LocalDateTime fechaVenta, Producto producto, Cliente Vendedor, Cliente Comprador) {
        this.fechaVenta = fechaVenta;
        this.producto = producto;
        this.Vendedor = Vendedor;
        this.Comprador = Comprador;
    }
}
