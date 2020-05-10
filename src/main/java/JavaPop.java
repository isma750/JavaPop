import java.time.LocalDateTime;
import java.util.ArrayList;
import java.io.*;

public class JavaPop {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Venta> ventas;
    private ArrayList<Producto> productos;


    /**
     * Operacion de compra de un producto, crea un fichero txt con la factura en la ruta especificada y lo elimina de los productos.
     * @param comprador Cliente comprador del producto
     * @param vendedor Cliente vendedor del producto
     * @param producto Producto que se va a comprar
     */
    public void comprarProducto(Cliente comprador,Cliente vendedor,Producto producto){
        if (producto.isMarcadoParaVenta()){

            try {
                String ruta = "C:\\Users\\ismae\\OneDrive\\Escritorio\\texto\\factura.txt"; // Sustituir por ruta en la que queremos que se genere el fichero
                String contenido = "FACTURA DE COMPRA\n" +
                                   "\n" +
                                   "Datos del producto: " + "\n" +
                                   "Titulo: " + producto.getTitulo() + "\n" +
                                   "Descripcion: " + producto.getDescripcion() + "\n" +
                                   "Categoria: " + producto.getCategoria() + "\n" +
                                   "Precio: " + producto.getPrecio() + "\n " + 
                                   "Ubicacion: " + producto.getUbicacion() + "\n" + 
                                   
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
            if (this.ventas == null){
                this.ventas = new ArrayList<>();
            }
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

    /**
     * Establece los productos de la aplicacion con todos los productos de todos los clientes
     */
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

    /**
     *
     * @param usuario
     * @throws UsuarioExiste
     */
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

    /**
     *
     * @param usuario
     * @throws UsuarioNoExiste
     */
    public void eliminarUsuario(Usuario usuario) throws UsuarioNoExiste {
        if (usuarios.contains(usuario)){
            usuarios.remove(usuario);
        }
        else{
            throw new UsuarioNoExiste();
        }

    }

    /**
     *
     * @param producto
     * @throws ProductoExiste
     */
    public void anadirProducto(Producto producto) throws ProductoExiste {
        if (productos.contains(producto)){
            throw new ProductoExiste();
        }
        else{
            productos.add(producto);
        }
    }

    /**
     *
     * @param producto
     * @throws ProductoNoExiste
     */
    public void eliminarProducto(Producto producto) throws ProductoNoExiste {
        if (productos.contains(producto)){
            productos.remove(producto);
        }
        else{
            throw new ProductoNoExiste();
        }
    }

    /**
     *
     */
    class UsuarioExiste extends Exception{
        public UsuarioExiste(){
            super ("ERROR:El usuario ya existe.");
        }
    }

    /**
     *
     */
    class UsuarioNoExiste extends Exception{
        public UsuarioNoExiste(){
            super ("ERROR:El usuario especificado no existe.");
        }
    }

    /**
     *
     */
    class ProductoExiste extends Exception{
        public ProductoExiste(){
            super ("ERROR:El producto ya existe.");
        }
    }

    /**
     *
     */
    class ProductoNoExiste extends Exception{
        public ProductoNoExiste(){
            super ("ERROR:El producto especificado no existe.");
        }
    }
}
