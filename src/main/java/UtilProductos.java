

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UtilProductos {
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static Producto productoejemplo;

    public static ArrayList<Producto> getProductos() {  // Devuelve los productos ordenados por distancia teniendo preferencia por los urgentes
        //Establecemos el comparador
        Comparator CompUbicacion = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Producto p1 = (Producto) o1;
                Producto p2 = (Producto) o2;
                // Comparamos las dos ubicaciones
                int CompararUbicacion = p1.getUbicacion().compareTo(p2.getUbicacion());

                // Si las ubicaciones son iguales vemos cual es urgente
                if (CompararUbicacion == 0) {
                    if (p1.isUrgente() && !p2.isUrgente()){
                        return -1; // si p1 es urgente y p2 no, p1 debe ir primero por lo que devolvemos -1
                    }
                    else if (!p1.isUrgente() && p2.isUrgente()){
                        return 1; // si p2 es urgente y p1 no, p2 debe ir primero por lo que devolvemos 1
                    }
                    else {
                        return CompararUbicacion; // si ambos son urgentes o no lo son devolvemos 0 ya que es indiferente
                    }
                } else {
                    return CompararUbicacion;
                }

            }

        };

        Collections.sort(productos, CompUbicacion); // Ordenamos los productos
        return productos;
    }

    public static void setProductos(ArrayList<Producto> p) {
        productos = p;
    }

    public static ArrayList<Producto> BuscarProductosTitulo(String titulo){ //Devuelve un arraylist con productos cuyo titulo contenga las palabras clave especificadas en el string
        //Establecemos el comparador
        ArrayList<Producto> productosCoinciden = new ArrayList<>();
        String[] palabrasClave = titulo.split(" "); //Sacamos las palabras clave del titulo

        for(int i=0;i<productos.size();i++){ //por cada producto en productos
            for(int j=0;j<palabrasClave.length;j++){ // por cada palabra clave en el titulo
                if (productos.get(i).getTitulo().contains(palabrasClave[j])){ // si el titulo contiene la palabra
                    if(!productosCoinciden.contains(productos.get(i))) { // si no esta en el arraylist de productos que buscamos
                        productosCoinciden.add(productos.get(i)); // añadimos el producto al arraylist de productos que buscamos
                    }
                }

            }
        }

        return productosCoinciden;
    }
    public static ArrayList<Producto> BuscarProductosCategoria(String categoria){ //Busca productos por categoria
        ArrayList<Producto> productosCoinciden = new ArrayList<>();
        for(int i=0; i<productos.size();i++){
            if(productos.get(i).getCategoria().equals(categoria)){
                productosCoinciden.add(productos.get(i));
            }
        }
        return productosCoinciden;
    }





}
