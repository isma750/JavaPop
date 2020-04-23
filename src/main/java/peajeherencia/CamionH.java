package peajeherencia;

public class CamionH extends VehiculoH {

    //Atributos
    private int ejes;

    //Métodos
    public CamionH(String matricula, int pesoTotal, int ejes) {
        super(matricula, pesoTotal);
        this.ejes = ejes;
    }

   

    public int getEjes() {
        return this.ejes;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " # Camión - Ejes: " + this.ejes;
    }
}
