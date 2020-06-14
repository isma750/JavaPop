
package zonaNegocio;

import java.io.Serializable;
import java.time.LocalDateTime;


public class PagoClienteProfesional implements Serializable {
    private Usuario usuario;
    private LocalDateTime fechaPago;
    private double importePago;
    private ConceptoPago conceptoPago;
    
    public enum ConceptoPago {
       Cuota_Mensual ,
       Producto_Destacado
    }

    public PagoClienteProfesional(ClienteProfesional clienteP, LocalDateTime fecha, double importe, ConceptoPago conceptoPago) {
        this.usuario = usuario;
        this.fechaPago = fechaPago;
        this.importePago = importePago;
        this.conceptoPago = conceptoPago;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getImportePago() {
        return importePago;
    }

    public void setImportePago(double importePago) {
        this.importePago = importePago;
    }

    public ConceptoPago getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(ConceptoPago conceptoPago) {
        this.conceptoPago = conceptoPago;
    }
    
    
   
    
    @Override
    public String toString(){
        return "\n\tPago Cliente Profesional{" + "Cliente Profesional=" + usuario + ", fecha pago=" + fechaPago + ",importe =" + importePago +", concepto= " + conceptoPago + "}";
        
    }

   
    
}
