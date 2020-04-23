package peajeherencia;

public class PruebaCabinaPeajeH {

    public static void main(String args[]) {
        //Crea el agente
        Agente agente1 = new Agente("12345678Z", "Juan García");
        Agente agente2 = new Agente("23456789D", "María Perez");
        //Crea las cabinas
        CabinaPeajeH cabina1 = new CabinaPeajeH("C1", agente1);               
        CabinaPeajeH cabina2 = new CabinaPeajeH("C2", agente2);
        //Crea camiones
        CamionH camion1 = new CamionH("1234-BCD", 10000, 3);
        CamionH camion2 = new CamionH("2345-CDF", 15500, 4);
        //Crea autobuses
        AutobusH bus1 = new AutobusH("5678-CFG", 7000, 35);
        AutobusH bus2 = new AutobusH("6789-DTD", 8000, 50);

        //Cobra peajes
        cabina1.calculaPeaje(camion1);
        cabina1.calculaPeaje(bus1);
        cabina1.muestraDatos();
        cabina2.calculaPeaje(camion2);
        cabina2.calculaPeaje(bus2);
        cabina2.muestraDatos();
        //Recauda
        cabina1.recaudar();
        cabina1.muestraDatos();
        cabina2.recaudar();
        cabina2.muestraDatos();
        System.out.println("Total vehículos de todas las cabinas: " + VehiculoH.getCantidad());
        VehiculoH.borraCantidad();
    }
}
