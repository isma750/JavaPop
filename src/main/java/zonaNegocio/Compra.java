
package zonaNegocio;

import java.time.LocalDateTime;
public class Compra {
    private LocalDateTime fechaSolicitudComprador;
    private LocalDateTime fechaDecisionVendedor;
    private Producto producto;
    private String nombreVendedor;
    private String nombreComprador;
    public enum estado{
        SOLICITUD,
        ACEPTADOVENTA,
        ANULADAADMINISTRACION,
        ANULADAVENTA,
    }
    private boolean informado;
    
    public Compra(LocalDateTime fechaSolicitudComprador, LocalDateTime fechaDecisionVendedor, Producto producto, String nombreVendedor, String nombreComprador, boolean informado) {
        this.fechaSolicitudComprador = fechaSolicitudComprador;
        this.fechaDecisionVendedor = fechaDecisionVendedor;
        this.producto = producto;
        this.nombreVendedor = nombreVendedor;
        this.nombreComprador = nombreComprador;
        this.informado = informado;
    }

    public LocalDateTime getFechaSolicitudComprador() {
        return fechaSolicitudComprador;
    }

    public void setFechaSolicitudComprador(LocalDateTime fechaSolicitudComprador) {
        this.fechaSolicitudComprador = fechaSolicitudComprador;
    }

    public LocalDateTime getFechaDecisionVendedor() {
        return fechaDecisionVendedor;
    }

    public void setFechaDecisionVendedor(LocalDateTime fechaDecisionVendedor) {
        this.fechaDecisionVendedor = fechaDecisionVendedor;
    }

    public boolean isInformado() {
        return informado;
    }

    public void setInformado(boolean informado) {
        this.informado = informado;
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
        return "\n\tCompra{" + "nombre vendedor=" + nombreVendedor + ", nombre comprador=" + nombreComprador + ", producto =" + producto + ", fecha solicitud compra=" + fechaSolicitudComprador + ", fecha decision vendedor= " + fechaDecisionVendedor + ", informado = " + informado +"}";
        
    }
}
    
