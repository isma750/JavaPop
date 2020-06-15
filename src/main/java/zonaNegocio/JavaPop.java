package zonaNegocio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public class JavaPop  {

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

        if (producto.getSituacion().equals(Producto.situacion.ACEPTADOVENTA)){

            try {
                String ruta = "C:\\Users\\ismae\\OneDrive\\Escritorio\\texto\\factura.txt"; // Sustituir por ruta en la que queremos que se genere el fichero
                String contenido = "FACTURA DE COMPRA\n" +
                                   "\n" +
                                   "Datos del producto: " + "\n" +
                                   "Titulo: " + producto.getTitulo() + "\n" +
                                   "Descripcion: " + producto.getDescripcion() + "\n" +
                                   "Categoria: " + producto.getCategoria() + "\n" +
                                   "Precio: " + producto.getPrecio() + "\n " + 
                                   "Ubicacion: " + producto.getCodigoPostal() + "," + producto.getCiudad() + "\n" +
                                   
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
            Venta venta = new Venta(LocalDateTime.now(),producto,vendedor,comprador);
            
            vendedor.getVentas().add(venta); // registramos la venta
            producto.setSituacion(Producto.situacion.VENDIDO);

        }

    }

    public ArrayList<Usuario> getUsuarios() {      
         if (this.usuarios == null){
            this.usuarios = new ArrayList<>();
        }
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
    /**
     * Encuentra un usuario de la aplicacion por su correo
     * @param correo Correo del usuario que queremos obtener
     * @return Devuelve el usuario que buscamos o null si no hay ningun usuario en la aplicacion con el correo que buscamos
     */
    public Usuario getUsuario(String correo){
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(correo)){
                return usuarios.get(i);
            }
            
        }
        return null;
    }

    public ArrayList<Venta> getVentas() {
        if (this.ventas== null){
            this.ventas = new ArrayList<>();
        }
        return ventas;
    }

    public void setVentas() {
        this.ventas = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getClass().getSimpleName().equals("Cliente") || usuarios.get(i).getClass().getSimpleName().equals("ClienteProfesional") ) {
                Cliente cliente = (Cliente) usuarios.get(i);
                ArrayList<Venta> ventasCliente = (cliente.getVentas());
                for (int j = 0; j < ventasCliente.size(); j++) {
                    this.ventas.add(ventasCliente.get(j));
                }

            }
        }

    }

    /**
     * Añade un usuario a la aplicacion
     * @param usuario El usuario que deseamos añadir
     * @throws UsuarioExiste El usuario que intentamos añadir ya existe
     */
    public void anadirUsuario(Usuario usuario)throws UsuarioExiste{
        if (this.usuarios == null){
            this.usuarios = new ArrayList<>();
        }
        if (usuarios.contains(usuario)){
            throw new UsuarioExiste();
        }
        else{
            usuarios.add(usuario);
        }

    }

    /**
     * Elimina un usuario de la aplicacion
     * @param usuario El usuario que queremos eliminar
     * @throws UsuarioNoExiste El usuario que intentamos eliminar no existe
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
     * Añade un producto a la aplicacion
     * @param producto El producto que deseamos añadir
     * @throws ProductoExiste El producto que intentamos añadir ya existe
     */
    public void anadirProducto(Producto producto) throws ProductoExiste {
        if (this.productos == null){
            this.productos = new ArrayList<>();
        }
        if (productos.contains(producto)){
            throw new ProductoExiste();
        }
        else{
            productos.add(producto);
        }
    }

    /**
     * Elimina un producto de la apliacion
     * @param producto El producto que deseamos eliminar
     * @throws ProductoNoExiste El producto que queremos eliminar no existe
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
     * Carga los datos guardados de la aplicación
     */
    public void cargarDatos() {
        try {
            
            FileInputStream istreamUsuarios = new FileInputStream("copiasegUsuarios.dat");
            ObjectInputStream oisUsuarios = new ObjectInputStream(istreamUsuarios);
            usuarios = (ArrayList) oisUsuarios.readObject();
            istreamUsuarios.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Guarda los datos de la aplicación
     */
    public void guardarDatos() {
        try {
            
            if (!usuarios.isEmpty()) {
                
                //Serialización de las personas
                FileOutputStream ostreamUsuarios = new FileOutputStream("copiasegUsuarios.dat");
                ObjectOutputStream oosUsuarios = new ObjectOutputStream(ostreamUsuarios);
                //guardamos el array de usuarios
                oosUsuarios.writeObject(usuarios);
                ostreamUsuarios.close();
            } else {
                System.out.println("Error: No hay datos");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    /**
     * El usuario ya existe
     */
    public class UsuarioExiste extends Exception{
        public UsuarioExiste(){
            super ("ERROR:El usuario ya existe.");
        }
    }

    /**
     * El usuario no existe
     */
    public class UsuarioNoExiste extends Exception{
        public UsuarioNoExiste(){
            super ("ERROR:El usuario especificado no existe.");
        }
    }

    /**
     * El producto ya existe
     */
    public class ProductoExiste extends Exception{
        public ProductoExiste(){
            super ("ERROR:El producto ya existe.");
        }
    }

    /**
     * El producto no existe
     */
    public class ProductoNoExiste extends Exception{
        public ProductoNoExiste(){
            super ("ERROR:El producto especificado no existe.");
        }
    }
    public static void guardarCadaDato(String Javapop, Usuario usuario){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        
        try{
            fileOutputStream = new FileOutputStream(Javapop);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(usuario);
            fileOutputStream.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static Object leerCadaDato(String Javapop){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Object objeto = null;
        
        try {
            fileInputStream = new FileInputStream(Javapop);
            objectInputStream = new ObjectInputStream(fileInputStream);
            objeto =objectInputStream.readObject();
            fileInputStream.close();
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return Javapop;
    }
}
