package peajeabstracta;

public class PruebaCabinaPeajeA {

    public static void main(String args[]) {
        //Crea el agente
        Agente agente1 = new Agente("12345678Z", "Juan García");
        Agente agente2 = new Agente("23456789D", "María Perez");
        //Crea las cabinas
        CabinaPeajeA cabina1 = new CabinaPeajeA("C1", agente1);               
        CabinaPeajeA cabina2 = new CabinaPeajeA("C2", agente2);
        //Crea distintos vehículos
        VehiculoA v1 = new CamionA("1234-BCD", 10000, 3);
        VehiculoA v2 = new CamionA("2345-CDF", 15500, 4);
        VehiculoA v3 = new AutobusA("5678-CFG", 7000, 35);
        VehiculoA v4 = new AutobusA("6789-DTD", 8000, 50);

        //Cobra peajes
        cabina1.calculaPeaje(v1);
        cabina1.calculaPeaje(v3);
        cabina1.muestraDatos();
        cabina2.calculaPeaje(v2);
        cabina2.calculaPeaje(v4);
        cabina2.muestraDatos();
        //Recauda
        cabina1.recaudar();
        cabina1.muestraDatos();
        cabina2.recaudar();
        cabina2.muestraDatos();
        System.out.println("Total vehículos de todas las cabinas: " + VehiculoA.getCantidad());
        VehiculoA.borraCantidad();
    }
}
