
public class ClienteProfesional extends Cliente {

   private String descripcion;
   private String horario;
   private String telefono;
   private String web;

    public ClienteProfesional(String nombre, String dni, String correo, String clave, String ubicacion, int tarjeta, String descripcion, String horario, String telefono, String web) {
        super (nombre, dni, correo, clave, ubicacion, tarjeta);
        this.descripcion = descripcion;
        this.horario = horario;
        this.telefono = telefono;
        this.web = web;
    }

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
