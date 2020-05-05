import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Declaramos productos
        Cliente cliente1 = new Cliente("Antonio","91799023C","antonio01@yahoo.com","contraseñasegura1234","19004,Guadalajara",53671973);
        Cliente cliente2 = new Cliente("Fernando","24020971R","fernando20@yahoo.com","fernandoguay888","19003,Guadalajara",394030493);
        Producto producto1 = new Producto("Camiseta blanca", Producto.categoria.MODAYACCESORIOS,"19003,Guadalajara",true,"antonio01@yahoo.com");
        Producto producto2 = new Producto("Camiseta negra", Producto.categoria.MODAYACCESORIOS,"19003,Guadalajara",false,"antonio01@yahoo.com");
        Producto producto3 = new Producto("Raqueta de tenis", Producto.categoria.DEPORTEYOCIO,"19004,Guadalajara",true,"fernando20@yahoo.com");
        Producto producto4 = new Producto("Playstation 5", Producto.categoria.CONSOLASYVIDEOJUEGOS,"19004,Guadalajara",true,"fernando20@yahoo.com");
        //Creamos nuestra base de datos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        //Utilizamos UtilProductos para realizar la busqueda
        UtilProductos.setProductos(productos);
        ArrayList<Producto> productosCoinciden = UtilProductos.BuscarProductosUsuario("fernando20@yahoo.com");

        for (int i=0;i<productosCoinciden.size();i++){
            System.out.println(productosCoinciden.get(i).toString());
        }


        }

       
    }

