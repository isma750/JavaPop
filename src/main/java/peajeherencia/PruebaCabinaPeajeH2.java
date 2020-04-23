package peajeherencia;

public class PruebaCabinaPeajeH2 {

    public static void main(String args[]) {
        //Crea el agente
        Agente agente1 = new Agente("12345678Z", "Juan García");
        Agente agente2 = new Agente("23456789D", "María Perez");
        //Crea las cabinas
        CabinaPeajeH cabina1 = new CabinaPeajeH("C1", agente1);               
        CabinaPeajeH cabina2 = new CabinaPeajeH("C2", agente2);
        //Crea distintos vehículos
        VehiculoH vehiculos[] = new VehiculoH[4];
        vehiculos[0] = new CamionH("M-1234-XC", 10000, 3);
        vehiculos[1] = new CamionH("1234 BDF", 12500, 4);
        //Crea autobuses
        vehiculos[2] = new AutobusH("B-5678-VF", 7000, 35);
        vehiculos[3] = new AutobusH("5678 BUS", 11000, 55);

        //Cobra peajes
        cabina1.calculaPeaje((CamionH) vehiculos[0]);
        cabina1.calculaPeaje((AutobusH)vehiculos[2]);
        cabina1.muestraDatos();
        cabina2.calculaPeaje((CamionH)vehiculos[1]);
        cabina2.calculaPeaje((AutobusH)vehiculos[3]);
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
