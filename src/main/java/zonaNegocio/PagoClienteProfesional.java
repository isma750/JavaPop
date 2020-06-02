
package zonaNegocio;

import java.time.LocalDateTime;


public class PagoClienteProfesional {
    private ClienteProfesional clienteP;
    private LocalDateTime fecha;
    private double importe;

    public PagoClienteProfesional(ClienteProfesional clienteP, LocalDateTime fecha, double importe) {
        this.clienteP = clienteP;
        this.fecha = fecha;
        this.importe = importe;
    }

    public ClienteProfesional getClienteP() {
        return clienteP;
    }

    public void setClienteP(ClienteProfesional clienteP) {
        this.clienteP = clienteP;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    @Override
    public String toString(){
        return "\n\tPago Cliente Profesional{" + "Cliente Profesional=" + clienteP + ", fecha pago=" + fecha + ",importe =" + importe + "}";
        
    }

   
    
}
