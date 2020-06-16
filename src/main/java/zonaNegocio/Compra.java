
package zonaNegocio;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * Clase que registra las compras que se producen en Javapop
 * 
 */
public class Compra implements  Serializable{
    private LocalDateTime fechaSolicitudComprador;
    private LocalDateTime fechaDecisionVendedor;
    private Producto producto;
    private Cliente Vendedor;
    private Cliente Comprador;
    public enum estado{
        SOLICITUD,
        ACEPTADOVENTA,
        ANULADAADMINISTRACION,
        ANULADAVENTA,
    }
    private boolean informado;
    /**
     * Constructor
     * @param fechaSolicitudComprador
     * @param producto
     * @param Vendedor
     * @param Comprador
     * @param informado 
     */
    public Compra(LocalDateTime fechaSolicitudComprador, Producto producto, Cliente Vendedor, Cliente Comprador, boolean informado) {
        this.fechaSolicitudComprador = fechaSolicitudComprador;
        
        this.producto = producto;
        this.Vendedor = Vendedor;
        this.Comprador = Comprador;
        this.informado = informado;
    }
    //Realizamos los getter y setter
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
    

    @Override
    public String toString(){
        return "\n\tCompra{" + "nombre vendedor=" + Vendedor + ", nombre comprador=" + Comprador + ", producto =" + producto + ", fecha solicitud compra=" + fechaSolicitudComprador + ", fecha decision vendedor= " + fechaDecisionVendedor + ", informado = " + informado +"}";
        
    }
}
    
