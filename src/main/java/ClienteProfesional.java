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
    
    /**
     * Constructor
     * @param nombre del cliente profesional
     * @param dni del cliente profesional
     * @param correo para registrarse el cliente profesional
     * @param clave  para registrarse el cliente profesional
     * @param ubicacion del cliente profesional
     * @param tarjeta de credito del cliente profesional vinculada a Javapop
     * @param descripcion de la tienda
     * @param horario de la tienda
     * @param telefono de la tienda
     * @param web de la tienda
     */
    public ClienteProfesional(String nombre, String dni, String correo, String clave, String ubicacion, int tarjeta, String descripcion, String horario, String telefono, String web) {
        super (nombre, dni, correo, clave, ubicacion, tarjeta);
        this.descripcion = descripcion;
        this.horario = horario;
        this.telefono = telefono;
        this.web = web;
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
   
   @Override
   public String toString() {
       return "\n\tCliente Profesional{" + "descripcion=" + descripcion + ", horario" + horario + ", teléfono=" + telefono + ", web=" + web + "}";
   }
    
}
