package zonaNegocio;


import zonaNegocio.Producto;
import zonaNegocio.Cliente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase utilizada para realizar búsquedas y otras operaciones con los productos de la aplicacion
 */
public class UtilProductos {
    private static ArrayList<Producto> productos = new ArrayList<>();

    public static ArrayList<Producto> getProductos() { return productos; }

    public static void setProductos(ArrayList<Producto> p) {
        productos = p;
    }


    /**
     * Busca y establece los productos de utilProductos con productos cuyo titulo contenga una de las palabras clave del string
     * @param palabras Las palabras que se desean buscar separadas por espacios
     */
    public static void BuscarProductosTitulo(String palabras) { //Devuelve un arraylist
        //Establecemos el comparador
        ArrayList<Producto> productosCoinciden = new ArrayList<>();
        String[] palabrasClave = palabras.split(" "); //Sacamos las palabras clave del titulo

        for (int i = 0; i < productos.size(); i++) { //por cada producto en productos
            for (int j = 0; j < palabrasClave.length; j++) { // por cada palabra clave en el titulo
                if (productos.get(i).getTitulo().toLowerCase().contains(palabrasClave[j].toLowerCase())) { // si el titulo contiene la palabra
                    if (!productosCoinciden.contains(productos.get(i))) { // si no esta en el arraylist de productos que buscamos
                        productosCoinciden.add(productos.get(i)); // añadimos el producto al arraylist de productos que buscamos
                    }
                }

            }
        }

        productos = productosCoinciden;
    }

    /**
     * Busca y establece los productos de utilProductos con productos cuya categoría sea la especificada
     * @param categoria La categoria de los productos que queremos buscar
     */
    public static void BuscarProductosCategoria(Producto.categoria categoria) {
        ArrayList<Producto> productosCoinciden = new ArrayList<>();
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCategoria().equals(categoria)) {
                productosCoinciden.add(productos.get(i));
            }
        }
        productos = productosCoinciden;
    }

    /**
     * Busca y establece los productos de utilProductos con productos que haya publicado un cierto cliente
     * @param cliente el cliente cuyos productos deseamos obtener
     */
    public static void BuscarProductosUsuario(Cliente cliente) { //Busca los productos de un cliente
        productos = cliente.getProductos();
    }

    /**
     * Ordena los productos del arraylist de utilproductos por la proximidad al cliente especificado
     * @param cliente el cliente por el que deseamos ordenar los productos
     */
    public static void OrdenarPorProximidad (Cliente cliente){ //Ordena los productos que hay en el utilproductos por la proximidad a un cliente
        Comparator CompProximidad = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Producto p1 = (Producto) o1;
                Producto p2 = (Producto) o2;
                // Comparamos la proximidad de los dos productos al cliente
                int CompararProximidad = p1.calcularProximidad(cliente).compareTo(p2.calcularProximidad(cliente));

                // Si las ubicaciones son iguales vemos cual es urgente
                if (CompararProximidad == 0) {
                    if (p1.isUrgente() && !p2.isUrgente()) {
                        return -1; // si p1 es urgente y p2 no, p1 debe ir primero por lo que devolvemos -1
                    } else if (!p1.isUrgente() && p2.isUrgente()) {
                        return 1; // si p2 es urgente y p1 no, p2 debe ir primero por lo que devolvemos 1
                    } else {
                        return CompararProximidad; // si ambos son urgentes o no lo son devolvemos 0 ya que es indiferente
                    }
                } else {
                    return CompararProximidad;
                }

            }
        };
        Collections.sort(productos, CompProximidad);
    }


    /**
     * Imprime los productos del arraylist buscados seguidos de la proximidad al cliente especificado
     * @param cliente el cliente que realiza la busqueda
     */
    public static void imprimirResultados(Cliente cliente){
        System.out.println("Resultados de la búsqueda");
        for (int i=0;i<productos.size();i++){
            System.out.println(productos.get(i).toString() + productos.get(i).calcularProximidad(cliente));
        }
    }


}


