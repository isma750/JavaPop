import java.awt.image.BufferedImage;
import java.time.LocalDateTime;


public class Producto implements Comparable<Producto> {
    private String titulo;
    private String descripcion;
    private String categoria;
    private String estado;
    private double precio;
    private LocalDateTime fecha;
    private BufferedImage fotografia;
    private String ubicacion;
    private boolean urgente;

    public Producto(String titulo, String categoria, String ubicacion, boolean urgente) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.urgente = urgente;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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
    


