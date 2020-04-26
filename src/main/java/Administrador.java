
public class Administrador {

    private String correo;
    private String clave;
    
    public Administrador (String correo, String clave){
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
    public String toString(){
        return "\n\tAdministrador{" + "correo=" + correo + ", clave=" + clave + "}";
    }
    
}
