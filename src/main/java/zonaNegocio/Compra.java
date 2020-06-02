
package zonaNegocio;

import java.time.LocalDateTime;
public class Compra {
    private LocalDateTime fechaCompra;
    private Producto producto;
    private String nombreVendedor;
    private String nombreComprador;
    
    public Compra(LocalDateTime fechaCompra, Producto producto, String nombreVendedor, String nombreComprador) {
        this.fechaCompra = fechaCompra;
        this.producto = producto;
        this.nombreVendedor = nombreVendedor;
        this.nombreComprador = nombreComprador;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }
    

    @Override
    public String toString(){
        return "\n\tCompra{" + "nombre vendedor=" + nombreVendedor + ", nombre comprador=" + nombreComprador + ", producto =" + producto + ", fecha compra=" + fechaCompra + "}";
        
    }
}
    
