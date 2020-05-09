import java.time.LocalDateTime;
import java.util.ArrayList;
import java.io.*;

public class JavaPop {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Venta> ventas;
    private ArrayList<Producto> productos;

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
            comprador.quitarProducto(producto);

        }

    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public ArrayList<Producto> getProductos(){
        return productos;
    }


    /* BUSCA LOS PRODUCTOS DE TODOS LOS CLIENTES Y ESTABLECE LOS PRODUCTOS DE LA APLICACION*/
    public void setProductos() {
        this.productos = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getClass().getSimpleName().equals("Cliente") || usuarios.get(i).getClass().getSimpleName().equals("ClienteProfesional") ) {
                Cliente cliente = (Cliente) usuarios.get(i);
                ArrayList<Producto> productosCliente = (cliente.getProductos());
                for (int j = 0; j < productosCliente.size(); j++) {
                    this.productos.add(productosCliente.get(j));
                }

            }
        }
    }


    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }


    public void anadirUsuario(Usuario usuario)throws UsuarioExiste{
        if (this.usuarios == null){
            this.usuarios = new ArrayList<Usuario>();
        }
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
