package peajeoriginal;

public class Agente {
    
    private String Matricula;

    /**
     * Get the value of Matricula
     *
     * @return the value of Matricula
     */
    public String getMatricula() {
        return Matricula;
    }

    /**
     * Set the value of Matricula
     *
     * @param Matricula new value of Matricula
     */
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

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

