package peajeabstracta;

public abstract class VehiculoA {

    //Atributos
    private String matricula;
    private int pesoTotal;
    //Cantidad de vehículos que han pasado por el peaje
    private static int cantidad = 0;

    //Métodos
    public VehiculoA(String matricula, int pesoTotal) {
        this.matricula = matricula;
        this.pesoTotal = pesoTotal;
        VehiculoA.incrementaCantidad();
    }

    private static void incrementaCantidad() {
        VehiculoA.cantidad++;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public int getPesoTotal() {
        return this.pesoTotal;
    }

    public static int getCantidad() {
        return VehiculoA.cantidad;
    }

    public static void borraCantidad() {
        VehiculoA.cantidad = 0;
    }

    @Override
    public String toString() {
        return "Vehículo con matrícula: " + this.matricula + " Peso total: " + this.pesoTotal;
    }

    public abstract int peaje();
}

