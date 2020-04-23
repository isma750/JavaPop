package peajeherencia;

public class Agente {
    
    //Atributos
    private String dni;
    private String nombre;

    //Métodos    
    public Agente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Agente{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
}
