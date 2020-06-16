package zonaNegocio;



import java.time.LocalDateTime;

/**
 * 
 * Clase con las propiedades de los clientes profesionales
 * Hereda de Cliente
 */
public class ClienteProfesional extends Cliente {

   private String descripcion;
   private String horario;
   private String telefono;
   private String web;
   private LocalDateTime fechaProximoPago;
   private LocalDateTime fechaPago;
  
    
    /**
     * Constructor
     * @param nombre del cliente profesional
     * @param dni del cliente profesional
     * @param correo para registrarse el cliente profesional
     * @param clave  para registrarse el cliente profesional
     * @param codigoPostal del cliente profesional
     * @param ciudad del cliente
     * @param tarjeta de credito del cliente profesional vinculada a Javapop
     * @param descripcion de la tienda
     * @param horario de la tienda
     * @param telefono de la tienda
     * @param web de la tienda
     */
    public ClienteProfesional(String nombre, String dni, String correo, String clave,int codigoPostal, String ciudad, String tarjeta, String descripcion, String horario, String telefono, String web,LocalDateTime fechaPago) {
        super (nombre, dni, codigoPostal, ciudad, correo, clave, tarjeta);
        this.descripcion = descripcion;
        this.horario = horario;
        this.telefono = telefono;
        this.web = web;
        this.fechaPago= fechaPago;
    }
    
    // Realizamos los getter y setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
       public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * Devuelve la fecha en la que el cliente profesional tiene que pagar su cuota para seguir siendo cliente profesional
     * @return La fecha en un mes desde que se pagó por última vez
     */

    public LocalDateTime getFechaProximoPago() {
        this.fechaProximoPago = this.getFechaPago().plusMonths(1);
        return fechaProximoPago;
    }

    /**
     * Establece la fecha del proximo pago
     * @param fechaProximoPago
     */
    public void setFechaProximoPago(LocalDateTime fechaProximoPago) {
        this.fechaProximoPago = fechaProximoPago;
    }
   
   @Override
   public String toString() {
       return "\n\tCliente Profesional{" + "descripcion=" + descripcion + ", horario" + horario + ", teléfono=" + telefono + ", web=" + web + "}";
   }
    
}
