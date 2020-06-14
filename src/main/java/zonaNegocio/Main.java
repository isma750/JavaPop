

package zonaNegocio;

 
import java.io.Serializable;
import zonaNegocio.JavaPop;
import zonaNegocio.ClienteProfesional;
import zonaNegocio.Cliente;
import zonaNegocio.Administrador;
import jdk.jshell.execution.Util;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main implements Serializable{
    public static void main(String[] args) throws JavaPop.UsuarioExiste {
        //Creamos nuestra aplicacion
        JavaPop javaPop = new JavaPop();
        //Creamos unos usuarios con unos productos
        ArrayList<Producto> productoscliente1 = new ArrayList<>();
        ArrayList<Producto> productoscliente2 = new ArrayList<>();
        ArrayList<Producto> productoscliente3 = new ArrayList<>();
        Cliente cliente1 = new Cliente("Antonio","91799023C",19004,"Guadalajara","antonio01@yahoo.com","contraseñasegura1234","5486533259584474");
        javaPop.anadirUsuario(cliente1);
        Cliente cliente2 = new Cliente("Fernando","24020971R",19003,"Guadalajara","fernando20@yahoo.com","fernandoguay888","5181430738982130");
        javaPop.anadirUsuario(cliente2);
        ClienteProfesional cliente3 = new ClienteProfesional ("Andrea","75612062Z","andrea_21@hotmail.com","225547",19200,"Azuqueca de Henares","4626392065351394","Venta de moviles","9:00-20:00","626789432","movilesAzuqeca.com");
        javaPop.anadirUsuario(cliente3);
        Administrador admin = new Administrador();
        javaPop.anadirUsuario(admin);
        Producto producto1 = new Producto("Camiseta blanca","Buen estado", Producto.categoria.MODAYACCESORIOS,19003,"Guadalajara",true,cliente1,Producto.estado.BUENO, 15.00,LocalDateTime.now(),Producto.situacion.PUBLICADO);
        Producto producto2 = new Producto("Camiseta negra","Muy nueva", Producto.categoria.MODAYACCESORIOS,19203,"Guadalajara",false,cliente1,Producto.estado.ACEPTABLE, 20.00,LocalDateTime.now(),Producto.situacion.PUBLICADO);
        Producto producto3 = new Producto("Raqueta de tenis","Muy poco uso", Producto.categoria.DEPORTEYOCIO,19004,"Guadalajara",true,cliente2, Producto.estado.COMONUEVO, 10.00, LocalDateTime.now(),Producto.situacion.PUBLICADO);
        Producto producto4 = new Producto("Playstation 5","Poco uso", Producto.categoria.CONSOLASYVIDEOJUEGOS,19004,"Guadalajara",true,cliente2, Producto.estado.BUENO, 150.00, LocalDateTime.now(),Producto.situacion.PUBLICADO);
        Producto producto5 = new Producto("Television 49 pulgadas Sony","Tiene un pequeño arañazo", Producto.categoria.TVAUDIOYFOTO,19004, "Guadalajara",false,cliente2, Producto.estado.ACEPTABLE, 250.00, LocalDateTime.now(),Producto.situacion.PUBLICADO);
        Producto producto6 = new Producto("Iphone X 64 gb","Tiene la pantalla rota", Producto.categoria.MOVILESYTELFONIA,19200,"Azuqueca de Henares",true,cliente3, Producto.estado.REGULAR, 400.00,LocalDateTime.now(),Producto.situacion.PUBLICADO);
        productoscliente1.add(producto1);
        productoscliente1.add(producto2);
        productoscliente2.add(producto3);
        productoscliente2.add(producto4);
        productoscliente2.add(producto5);
        productoscliente3.add(producto6);
        // Establecemos los productos de la aplicacion y los clientes
        cliente1.setProductos(productoscliente1);
        cliente2.setProductos(productoscliente2);
        cliente3.setProductos(productoscliente3);
        javaPop.setProductos();

        //Mostramos todos los productos que hay ordenados por proximidad al cliente2

        System.out.println("Mostramos todos los productos: ");
        System.out.println("************************");
        ArrayList<Producto> productos = javaPop.getProductos();
        UtilProductos.setProductos(productos);
        UtilProductos.OrdenarPorProximidad(cliente2);
        UtilProductos.imprimirResultados(cliente2);

        //Ejemplo: el cliente2 quiere comprar una "camiseta".
        
        UtilProductos.setProductos(productos);
        //UtilProductos.BuscarProductosCategoria(Producto.categoria.MODAYACCESORIOS); // Selecciona la categoria moda y accesorios
        //UtilProductos.BuscarProductosTitulo("camiseta"); // Busca por camiseta
        UtilProductos.OrdenarPorProximidad(cliente2); // ordenamos los productos resultado por proximidad
        
        System.out.println("\n");
        System.out.println("Mostramos el resultado de la búsqueda");
        System.out.println("****************************");
        UtilProductos.imprimirResultados(cliente2);

        //Decide comprar la camiseta blanca

        cliente2.solicitarCompra(producto1);

        //El otro cliente confirma la venta

        cliente1.confirmarVenta(producto1);

        //Se realiza la compra

        javaPop.comprarProducto(cliente2,cliente1,producto1);

        //Comprobamos que se ha eliminado el producto
        productos = javaPop.getProductos();
        System.out.println("\n");
        System.out.println(" Realizamos la compra y comprobamos que se ha eliminado el producto vendido");
        System.out.println("****************************");
        for (int i=0;i<productos.size();i++){
            System.out.println(productos.get(i).toString());
        }






        }

       
    }

