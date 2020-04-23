package peajeherencia;

public class CabinaPeajeH {

    //Atributos
    private String id; //identificador de la cabina
    private int total; //total recaudado en la cabina        
    private int vehiculos; //cantidad de vehículos que han pasado por esa cabina
    private Agente agente; //el agente que trabaja en la cabina

    //Métodos
    public CabinaPeajeH(String id, Agente agente) {
        this.id = id;
        this.agente = agente;
        this.total = 0;
        this.vehiculos = 0;
    }

    public void muestraDatos() {
        System.out.println("Cabina con id: " + this.id + " # " + agente.toString());
        System.out.println("Totales desde la última recogida - Peaje: " + this.total 
                + "€ - Vehículos: " + this.vehiculos);
    }

    public void recaudar() {
        System.out.println("**** Ejecutando recaudación ****");
        muestraDatos();
        this.total = 0;
        this.vehiculos = 0;
    }

    //sobrecarga de métodos
    public void calculaPeaje(CamionH camion) {
        int ejes = camion.getEjes();
        int pesoTotal = camion.getPesoTotal();
        int peaje = 5 * ejes + 2 * (pesoTotal / 1000);
        System.out.println(camion.toString() + " - Peaje: " + peaje + "€");
        this.vehiculos++;
        this.total += peaje;
    }

    public void calculaPeaje(AutobusH bus) {
        int pasajeros = bus.getPasajeros();
        int pesoTotal = bus.getPesoTotal();
        int peaje = 1 * pasajeros + 5 * (pesoTotal / 1000);
        System.out.println(bus.toString() + " - Peaje: " + peaje + "€");
        this.vehiculos++;
        this.total += peaje;
    }
}

