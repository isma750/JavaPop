
public enum Usuario {
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
