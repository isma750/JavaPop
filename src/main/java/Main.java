import jdk.jshell.execution.Util;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws JavaPop.UsuarioExiste {
        //Declaramos productos
        JavaPop javaPop = new JavaPop();
        ArrayList<Producto> productoscliente1 = new ArrayList<>();
        ArrayList<Producto> productoscliente2 = new ArrayList<>();
        ArrayList<Producto> productoscliente3 = new ArrayList<>();
        Cliente cliente1 = new Cliente("Antonio","91799023C","antonio01@yahoo.com","contraseñasegura1234","19004,Guadalajara",53671973);
        javaPop.anadirUsuario(cliente1);
        Cliente cliente2 = new Cliente("Fernando","24020971R","fernando20@yahoo.com","fernandoguay888","19003,Guadalajara",394030493);
        javaPop.anadirUsuario(cliente2);
        ClienteProfesional cliente3 = new ClienteProfesional ("Andrea","75612062Z","andrea_21@hotmail.com","225547","19200,Azuqueca de Henares",83425014,"Venta de moviles","9:00-20:00","626789432","movilesAzuqeca.com");
        javaPop.anadirUsuario(cliente3);
        Administrador admin = new Administrador("admin@javapop.com", "admin");
        javaPop.anadirUsuario(admin);
        Producto producto1 = new Producto("Camiseta blanca", Producto.categoria.MODAYACCESORIOS,"19003,Guadalajara",true,cliente1);
        Producto producto2 = new Producto("Camiseta negra", Producto.categoria.MODAYACCESORIOS,"19203,Guadalajara",false,cliente1);
        Producto producto3 = new Producto("Raqueta de tenis", Producto.categoria.DEPORTEYOCIO,"19004,Guadalajara",true,cliente2);
        Producto producto4 = new Producto("Playstation 5", Producto.categoria.CONSOLASYVIDEOJUEGOS,"19004,Guadalajara",true,cliente2);
        Producto producto5 = new Producto("Television 49 pulgadas Sony", Producto.categoria.TVAUDIOYFOTO,"19004, Guadalajara",false,cliente2);
        Producto producto6 = new Producto("Iphone X 64 gb", Producto.categoria.MOVILESYTELFONIA,"19200, Azuqueca de Henares",true,cliente3);
        productoscliente1.add(producto1);
        productoscliente1.add(producto2);
        productoscliente2.add(producto3);
        productoscliente2.add(producto4);
        productoscliente2.add(producto5);
        productoscliente3.add(producto6);
        cliente1.setProductos(productoscliente1);
        cliente2.setProductos(productoscliente2);
        cliente3.setProductos(productoscliente3);
        javaPop.setProductos();

        ArrayList<Producto> productos = javaPop.getProductos();
        for (int i=0;i<productos.size();i++){
            System.out.println(productos.get(i).toString());
        }

        //Ejemplo: el cliente2 quiere comprar una "camiseta".
        UtilProductos.setProductos(productos);
        UtilProductos.BuscarProductosCategoria(Producto.categoria.MODAYACCESORIOS);
        UtilProductos.BuscarProductosTitulo("camiseta");
        UtilProductos.OrdenarPorProximidad(cliente2);
        UtilProductos.imprimirResultados(cliente2);
        //Decide comprar la camiseta blanca
        cliente2.confirmarCompra(producto1);
        //El otro cliente confirma la venta
        cliente1.confirmarVenta(producto1);
        javaPop.comprarProducto(cliente2,cliente1,producto1);
        productos = javaPop.getProductos();
        System.out.println("Comprobacion para ver que se han eliminado el producto vendido");
        for (int i=0;i<productos.size();i++){
            System.out.println(productos.get(i).toString());
        }






        }

       
    }

