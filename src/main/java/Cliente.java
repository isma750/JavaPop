
public class Cliente {

    private String nombre;
    private String dni;
    private String correo;
    private String clave;
    private String ubicacion;
    private int tarjeta;
    
    public Cliente(String nombre, String dni, String correo, String clave, String ubicacion, int tarjeta) {
		this.nombre = nombre;
		this.dni = dni;
		this.correo = correo;
		this.clave = clave;
                this.ubicacion = ubicacion;
                this.tarjeta = tarjeta;
	}
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    @Override
    public String toString() {
            return "\n\tCliente{" + "nombre=" + nombre + ", dni=" + dni + ", correo=" + correo + ", clave=" + ", ubicación=" + ubicacion + ", tarjeta=" + tarjeta + "}";
    }
    
    
}
