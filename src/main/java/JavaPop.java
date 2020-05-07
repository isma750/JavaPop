import java.time.LocalDateTime;
import java.util.ArrayList;
import java.io.*;

public class JavaPop {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos; //He pensado que igual en JavaPop habria que almacenar los productos, ya que es la aplicacion.
    private ArrayList<Venta> ventas;
    private ArrayList<Cliente> Cliente;

    public void comprarProducto(Cliente comprador,Cliente vendedor,Producto producto){
        if (producto.isMarcadoParaVenta()){
            // Aquí va lo de generar el fichero //
            try {
                String ruta = "/ruta/factura.txt";
                String contenido = "FACTURA DE COMPRA\n" + 
                                   "Datos del producto: " + producto.toString() + "\n" +
                                   "Fecha de venta: " + LocalDateTime.now() + "\n" +
                                   "\n" +
                                   "DNI vendedor: " +  vendedor.getDni() + "\n" +
                                   "Nombre vendedor: " + vendedor.getNombre() + "\n" +
                                   "\n" +
                                   "DNI comprador: " + comprador.getDni() + "\n" +
                                   "Nombre comprador: " + comprador.getNombre() + "\n";
                          
                File file = new File(ruta);
                //Si el archivo no existe es creado
                if (!file.exists()){
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(contenido);
                bw.close();
            } catch (Exception e){
                e.printStackTrace();
            }
            Venta venta = new Venta(LocalDateTime.now(),producto,vendedor.getNombre(),comprador.getNombre());
            ventas.add(venta); // registramos la venta
            productos.remove(producto);

        }

    }

    public void anadirUsuario(Usuario usuario)throws UsuarioExiste{
        if (usuarios.contains(usuario)){
            throw new UsuarioExiste();
        }
        else{
            usuarios.add(usuario);
        }

    }
    public void eliminarUsuario(Usuario usuario) throws UsuarioNoExiste {
        if (usuarios.contains(usuario)){
            usuarios.remove(usuario);
        }
        else{
            throw new UsuarioNoExiste();
        }

    }
    public void anadirProducto(Producto producto) throws ProductoExiste {
        if (productos.contains(producto)){
            throw new ProductoExiste();
        }
        else{
            productos.add(producto);
        }
    }

    public void eliminarProducto(Producto producto) throws ProductoNoExiste {
        if (productos.contains(producto)){
            productos.remove(producto);
        }
        else{
            throw new ProductoNoExiste();
        }
    }
    class UsuarioExiste extends Exception{
        public UsuarioExiste(){
            super ("ERROR:El usuario ya existe.");
        }
    }
    class UsuarioNoExiste extends Exception{
        public UsuarioNoExiste(){
            super ("ERROR:El usuario especificado no existe.");
        }
    }
    class ProductoExiste extends Exception{
        public ProductoExiste(){
            super ("ERROR:El producto ya existe.");
        }
    }
    class ProductoNoExiste extends Exception{
        public ProductoNoExiste(){
            super ("ERROR:El producto especificado no existe.");
        }
    }
}
