package peajeabstracta;

public class AutobusA extends VehiculoA {
    
    //Atributos
    private int pasajeros;

    //Métodos
    public AutobusA(String matricula, int pesoTotal, int pasajeros) {
        super(matricula, pesoTotal);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return this.pasajeros;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " # Autobús - Pasajeros: " + this.pasajeros;
    }

    @Override
    public int peaje() {
        return 1 * this.pasajeros + 5 * (super.getPesoTotal() / 1000);
    }
}
