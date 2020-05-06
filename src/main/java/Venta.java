import java.time.LocalDateTime;

public class Venta {
    private LocalDateTime fechaVenta;
    private Producto producto;
    private String nombreVendedor;
    private String nombreComprador;

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

    public Venta(LocalDateTime fechaVenta, Producto producto, String nombreVendedor, String nombreComprador) {
        this.fechaVenta = fechaVenta;
        this.producto = producto;
        this.nombreVendedor = nombreVendedor;
        this.nombreComprador = nombreComprador;
    }
}
