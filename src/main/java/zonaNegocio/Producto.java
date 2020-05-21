package zonaNegocio;

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
    private int codigoPostal;
    private String ciudad;
    private boolean urgente;
    private Cliente clienteAsociado; 
    private boolean marcadoParaVenta;
    private boolean marcadoParaCompra;

    public Producto(String titulo, String descripcion, categoria categoria, int codigoPostal, String ciudad, boolean urgente, Cliente clienteAsociado, estado estado, double precio, LocalDateTime fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.urgente = urgente;
        this.clienteAsociado = clienteAsociado;
        this.estado = estado;
        this.precio = precio;
        this.fecha = fecha;
    }

    public Producto(String titulo, String descripcion, Producto.categoria categoria, Producto.estado estado, double precio, LocalDateTime fecha, int codigoPostal, String ciudad, boolean urgente, Cliente clienteAsociado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
        this.fecha = fecha;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.urgente = urgente;
        this.clienteAsociado = clienteAsociado;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public boolean isMarcadoParaVenta() {
        return marcadoParaVenta;
    }

    public void setMarcadoParaVenta(boolean marcadoParaVenta) {
        this.marcadoParaVenta = marcadoParaVenta;
    }

    public boolean isMarcadoParaCompra() {
        return marcadoParaCompra;
    }

    public void setMarcadoParaCompra(boolean marcadoParaCompra) {
        this.marcadoParaCompra = marcadoParaCompra;
    }

    /**
     * Calcula la proximidad de un producto al cliente parametro, basandose en el codigo postal de la ciudad
     * @param cliente El cliente al que queremos calcular su proximidad al producto
     * @return La distancia al cliente (Muy proximo,proximo o remoto)
     */
    public String calcularProximidad(Cliente cliente){
        if ((Integer.toString(this.codigoPostal)).substring(0,2).equals(Integer.toString(cliente.getCodigoPostal()).substring(0,2))){
            if ((Integer.toString(this.codigoPostal).charAt(2))==(Integer.toString(cliente.getCodigoPostal()).charAt(2))){
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
                ", ciudad='" + ciudad + '\'' +
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
    


