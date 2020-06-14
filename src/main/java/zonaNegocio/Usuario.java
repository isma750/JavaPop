package zonaNegocio;

import java.io.Serializable;

/**
 * 
 * Clase general con las propiedades de los usuarios que se pueden registrar en Javapop
 */
public class Usuario implements Serializable{
    public String correo;
    public String clave;
    
    /**
     * Constructor
     * @param correo del usuario para registrarse
     * @param clave del usuario para registrarse
     */
    public Usuario(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }
    // Realizamos los getter y setter
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
    
    
    // Tipos de usuarios que se pueden registrar en la aplicacion
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
