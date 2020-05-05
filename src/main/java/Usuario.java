public class Usuario{
    public String correo;
    public String clave;

    public Usuario(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
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
    
    @Override
    public String toString() {
        return "\n\t Usuario{" + "correo=" + correo + ", clave=" + clave + "}";
    }
    
    
    
    public enum TipoUsuario {
    Administrador,
    Cliente,
    ClienteProfesional;
    
    @Override
    public String toString() {
        
        String resultado="";
        
        switch (this) {
            case Administrador:
                resultado = "Administrador";
                break;
            case Cliente:
                resultado = "Cliente";
                break;
            case ClienteProfesional:
                resultado = "Cliente profesional";
                break;
            default:
                resultado = "Usuario desconocido";
                break;
        }
        return resultado;
    }
   
 }
}
