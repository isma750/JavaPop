package peajeherencia;

public class VehiculoH {
    
    //Atributos
    private String matricula;
    private int pesoTotal;
    //Cantidad de vehículos que han pasado por el peaje
    private static int cantidad = 0;

    //Métodos
    public VehiculoH(String matricula, int pesoTotal) {
        this.matricula = matricula;
        this.pesoTotal = pesoTotal;
        VehiculoH.incrementaCantidad();
    }

    private static void incrementaCantidad() {
        VehiculoH.cantidad++;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public int getPesoTotal() {
        return this.pesoTotal;
    }

    public static int getCantidad() {
        return VehiculoH.cantidad;
    }

    public static void borraCantidad() {
        VehiculoH.cantidad = 0;
    }

    @Override
    public String toString() {
        return "Vehículo con matrícula: " + this.matricula + " Peso total: " + this.pesoTotal;
    }
}

