package peajeoriginal;

public class CabinaPeaje {

    //Atributos
    private String id; //identificador de la cabina
    private int total; //total recaudado en la cabina
    private int camiones; //cantidad de camiones que pagan peaje en la cabina
    private Agente agente; //el agente que trabaja en la cabina

    //Métodos
    public CabinaPeaje(String id, Agente agente) {
        this.id = id;
        this.agente = agente;
        this.total = 0;
        this.camiones = 0;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public void muestraDatos() {
        System.out.println("Cabina con id: " + this.id + " # " + agente.toString());
        System.out.println("Totales desde la última recogida - Peaje: " + this.total + "€ - Camiones: " + this.camiones);
    }

    public void recaudar() {
        System.out.println("**** Ejecutando recaudación ****");
        muestraDatos();
        this.total = 0;
        this.camiones = 0;
    }

    public void calculaPeaje(Camion camion) {
        int ejes = camion.getEjes();
        int pesoTotal = camion.getPesoTotal();
        int peaje = 5 * ejes + 2 * (pesoTotal / 1000);
        System.out.println(camion.toString() + " - Peaje: " + peaje + "€");
        this.camiones++;
        this.total += peaje;
    }
}


