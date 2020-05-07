import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos clientes y productos
        Cliente cliente1 = new Cliente("Antonio","91799023C","antonio01@yahoo.com","contraseñasegura1234","19004,Guadalajara",53671973);
        Cliente cliente2 = new Cliente("Fernando","24020971R","fernando20@yahoo.com","fernandoguay888","19003,Guadalajara",394030493);
        Cliente cliente3 = new Cliente("Juan","03445771B","juan35@gmail-com","juanito22","19129, Pareja",667892341);
        ClienteProfesional cliente4 = new ClienteProfesional ("Andrea","75612062Z","andrea_21@hotmail.com","225547","19200,Azuqueca de Henares",83425014,"Venta de moviles","9:00-20:00","626789432","movilesAzuqeca.com");
        ClienteProfesional cliente5 = new ClienteProfesional ("Raúl","09346581P","raul.fernandez@hotmail.com","raulitoo","28001, Madrid", 58791674, "Venta de televisiones","10:00-19:00","687945362","televisionesraul.com");
        
        Producto producto1 = new Producto("Camiseta blanca", Producto.categoria.MODAYACCESORIOS,"19004,Guadalajara",true,"antonio01@yahoo.com");
        Producto producto2 = new Producto("Camiseta negra", Producto.categoria.MODAYACCESORIOS,"19004,Guadalajara",false,"antonio01@yahoo.com");
        Producto producto3 = new Producto("Raqueta de tenis", Producto.categoria.DEPORTEYOCIO,"19003,Guadalajara",true,"fernando20@yahoo.com");
        Producto producto4 = new Producto("Playstation 5", Producto.categoria.CONSOLASYVIDEOJUEGOS,"19003,Guadalajara",true,"fernando20@yahoo.com");
        Producto producto5 = new Producto("Televicion 49 pulgadas Sony", Producto.categoria.TVAUDIOYFOTO,"19129, Pareja",false,"juan35@gmail.com");
        Producto producto6 = new Producto("Balon de futbol Real Madrid", Producto.categoria.DEPORTEYOCIO,"19200, Azuqueca de Henares",true,"andrea_21@hotmail.com");
        Producto producto7 = new Producto("Iphone X 64 gb", Producto.categoria.MOVILESYTELFONIA,"19200, Azuqueca de Henares",true,"andrea_21@hotmail.com");
        Producto producto8 = new Producto("Television 32 pulgadas", Producto.categoria.TVAUDIOYFOTO,"28001, Madrid",false,"raul.fernandez@hotmail.com");
        Producto producto9 = new Producto ("Portail hp nuevo", Producto.categoria.INFORMATICAYELECTRONICA,"19129, Pareja",false,"juan35@gmail.com");
        Producto producto10 = new Producto ("Raton optico", Producto.categoria.INFORMATICAYELECTRONICA,"28001, Madrid",false,"raul.fernandez@hotmail.com");
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
        
        //Realizamos el registro del usuario
        Scanner entrada = new Scanner(System.in);
         System.out.println("¿Está usted registrado?");
         System.out.println("Si / No");
         String estaRegistrado = entrada.next();
         
         if ("Si".equalsIgnoreCase(estaRegistrado)){
           System.out.println("Introduce tu correo:");
           String correoPedido = entrada.next();
           System.out.println("Introduce tu contraseña:");
           String clavePedida = entrada.next();
           
           
         }
    }   
}

