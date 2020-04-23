package peajeoriginal;

public class PruebaCabinaPeaje {

    public static void main(String args[]) {
        //Crea el agente
        Agente agente1 = new Agente("12345678Z", "Juan García");
        //Crea la cabina
        CabinaPeaje cabina = new CabinaPeaje("C1", agente1);
        //Crea camiones
        Camion camion1 = new Camion(3, 10000);
        Camion camion2 = new Camion(4, 12500);
        //Cobra peajes
        cabina.calculaPeaje(camion1);        
        cabina.calculaPeaje(camion2);
        cabina.muestraDatos();
        //Recauda
        cabina.recaudar();
        cabina.muestraDatos();
    }
}
