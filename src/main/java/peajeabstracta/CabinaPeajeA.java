package peajeabstracta;

public class CabinaPeajeA {

    //Atributos
    private String id; //identificador de la cabina
    private int total; //total recaudado en la cabina        
    private int vehiculos; //cantidad de vehículos que han pasado por esa cabina
    private Agente agente; //el agente que trabaja en la cabina

    //Métodos
    public CabinaPeajeA(String id, Agente agente) {
        this.id = id;
        this.agente = agente;
        this.total = 0;
        this.vehiculos = 0;
    }

    public void muestraDatos() {
        System.out.println("Cabina con id: " + this.id + " # " + agente.toString());
        System.out.println("Totales desde la última recogida - Peaje: " + this.total + "€ - Vehículos: " + this.vehiculos);
    }

    public void recaudar() {
        System.out.println("**** Ejecutando recaudación ****");
        muestraDatos();
        this.total = 0;
        this.vehiculos = 0;
    }

    public void calculaPeaje(VehiculoA va) {
        int peaje = va.peaje();
        System.out.println(va.toString() + " - Peaje: " + peaje + "€");
        this.vehiculos++;
        this.total += peaje;
    }
}

