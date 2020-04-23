package peajeherencia;

public class AutobusH extends VehiculoH {
    //Atributos

    private int pasajeros;

    //Métodos
    public AutobusH(String matricula, int pesoTotal, int pasajeros) {
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
}