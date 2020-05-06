import java.awt.image.BufferedImage;
import java.time.LocalDateTime;


public class Producto implements Comparable<Producto> {
    private String titulo;
    private String descripcion;
    public enum categoria{
        MODAYACCESORIOS,
        TVAUDIOYFOTO,
        MOVILESYTELFONIA,
        INFORMATICAYELECTRONICA,
        CONSOLASYVIDEOJUEGOS,
        DEPORTEYOCIO
    }
    private categoria categoria;

    public enum estado{
        NUEVO,
        COMONUEVO,
        BUENO,
        ACEPTABLE,
        REGULAR
    }
    private estado estado;
    private double precio;
    private LocalDateTime fecha;
    private BufferedImage fotografia;
    private String ubicacion;
    private boolean urgente;
    private String correoClienteAsociado;
    private boolean marcadoParaVenta;

    public Producto(String titulo,categoria categoria, String ubicacion, boolean urgente, String CorreoClienteAsociado) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.urgente = urgente;
        this.correoClienteAsociado = CorreoClienteAsociado;
    }

    public Producto(String titulo, String descripcion, Producto.categoria categoria, Producto.estado estado, double precio, LocalDateTime fecha, String ubicacion, boolean urgente, String correoClienteAsociado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.urgente = urgente;
        this.correoClienteAsociado = correoClienteAsociado;
    }




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto.categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Producto.categoria categoria) {
        this.categoria = categoria;
    }

    public Producto.estado getEstado() {
        return estado;
    }

    public void setEstado(Producto.estado estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BufferedImage getFotografia() {
        return fotografia;
    }

    public void setFotografia(BufferedImage fotografia) {
        this.fotografia = fotografia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public String getCorreoClienteAsociado() {
        return correoClienteAsociado;
    }

    public void setCorreoClienteAsociado(String correoClienteAsociado) {
        this.correoClienteAsociado = correoClienteAsociado;
    }

    public boolean isMarcadoParaVenta() {
        return marcadoParaVenta;
    }

    public void setMarcadoParaVenta(boolean marcadoParaVenta) {
        this.marcadoParaVenta = marcadoParaVenta;
    }

    public String calcularProximidad(Cliente cliente){ // Calcula la proximidad entre el cliente y el producto especificado
        if (this.ubicacion.substring(0, 2).equals(cliente.getUbicacion().substring(0, 2))){
            if (this.ubicacion.charAt(2)==cliente.getUbicacion().charAt(2)){
                return "Muy próximo";
            }
            return "Próximo";
        }
        else{
            return "Remoto";
        }
    }



    @Override
    public String toString() {
        return "Producto{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", estado='" + estado + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha +
                ", fotografia=" + fotografia +
                ", ubicacion='" + ubicacion + '\'' +
                ", urgente=" + urgente +
                '}';
    }

    @Override
    public int compareTo(Producto o) {

        return this.titulo.compareTo(o.getTitulo());
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if ((this.titulo == null) ? (other.titulo != null) : !this.titulo.equals(other.titulo)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.titulo != null ? this.titulo.hashCode() : 0);
        return hash;
    }
}
    


