package peajeabstracta;

public class CamionA extends VehiculoA {
    
    //Atributos
    private int ejes;

    //Métodos
    public CamionA(String matricula, int pesoTotal, int ejes) {
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

    @Override
    public int peaje() {
        return 5 * this.ejes + 2 * (super.getPesoTotal() / 1000);
    }
}
