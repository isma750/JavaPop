
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UtilProductos {
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static Producto productoejemplo;

    public static ArrayList<Producto> getProductos() { return productos; }

    public static void setProductos(ArrayList<Producto> p) {
        productos = p;
    }

    public static ArrayList<Producto> BuscarProductosTitulo(String titulo) { //Devuelve un arraylist con productos cuyo titulo contenga las palabras clave especificadas en el string
        //Establecemos el comparador
        ArrayList<Producto> productosCoinciden = new ArrayList<>();
        String[] palabrasClave = titulo.split(" "); //Sacamos las palabras clave del titulo

        for (int i = 0; i < productos.size(); i++) { //por cada producto en productos
            for (int j = 0; j < palabrasClave.length; j++) { // por cada palabra clave en el titulo
                if (productos.get(i).getTitulo().contains(palabrasClave[j])) { // si el titulo contiene la palabra
                    if (!productosCoinciden.contains(productos.get(i))) { // si no esta en el arraylist de productos que buscamos
                        productosCoinciden.add(productos.get(i)); // añadimos el producto al arraylist de productos que buscamos
                    }
                }

            }
        }

        return productosCoinciden;
    }

    public static ArrayList<Producto> BuscarProductosCategoria(Producto.categoria categoria) { //Busca productos por categoria
        ArrayList<Producto> productosCoinciden = new ArrayList<>();
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCategoria().equals(categoria)) {
                productosCoinciden.add(productos.get(i));
            }
        }
        return productosCoinciden;
    }
    public static ArrayList<Producto> BuscarProductosUsuario(String correo) { //Busca productos por el correo de un usuario
        ArrayList<Producto> productosCoinciden = new ArrayList<>();
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCorreoClienteAsociado().equals(correo)) {
                productosCoinciden.add(productos.get(i));
            }
        }
        return productosCoinciden;
    }

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

    public static String anadirProducto(Producto producto) {
        if (!productos.contains(producto)) {
            productos.add(producto);
            return "Producto añadido correctamente";
        } else {
            return "ERROR:El producto especificado ya existe";
        }
    }

    public static String eliminarProducto(Producto producto) {
        if (productos.contains(producto)) {
            productos.remove(producto);
            return "Producto eliminado correctamente";
        } else {
            return "ERROR:El producto especificado no está en la base de datos";
        }
    }


}



