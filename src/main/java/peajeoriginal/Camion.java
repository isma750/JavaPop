package peajeoriginal;

public class Camion {

    //Atributos
    private int ejes;
    private int pesoTotal;

    //Métodos 
    public Camion(int ejes, int pesoTotal) {
        this.ejes = ejes;
        this.pesoTotal = pesoTotal;
    }

    public int getEjes() {
        return this.ejes;
    }

    public int getPesoTotal() {
        return this.pesoTotal;
    }

    @Override
    public String toString() {
        return "Camion{" + "ejes=" + ejes + ", pesoTotal=" + pesoTotal + '}';
    }    
    
}
