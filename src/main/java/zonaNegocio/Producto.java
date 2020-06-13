package zonaNegocio;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import javax.swing.Icon;


public class Producto implements Comparable<Producto> {
    private String titulo;
    private String descripcion;
    private situacion situacion;
    public enum categoria{
        MODAYACCESORIOS,
        TVAUDIOYFOTO,
        MOVILESYTELFONIA,
        INFORMATICAYELECTRONICA,
        CONSOLASYVIDEOJUEGOS,
        DEPORTEYOCIO;
        
        @Override
        public String toString() {
            switch(this){
                case MODAYACCESORIOS:
                    return "Moda y Accesorios";
                case TVAUDIOYFOTO:
                    return "TV, audio y foto";
                case MOVILESYTELFONIA:
                    return "Móviles y telefonía";
                case INFORMATICAYELECTRONICA:
                    return "Informática y electrónica";
                case CONSOLASYVIDEOJUEGOS:
                    return "Consolas y videojuegos";
                case DEPORTEYOCIO:
                    return "Deporte y ocio";
            }
            return null;
        }
    }
    private categoria categoria;

    public enum estado{
        NUEVO,
        COMONUEVO,
        BUENO,
        ACEPTABLE,
        REGULAR;
        @Override
        public String toString() {
            switch(this){
                case NUEVO:
                    return "Nuevo";
                case COMONUEVO:
                    return "Como nuevo";
                case BUENO:
                    return "Bueno";
                case ACEPTABLE:
                    return "Aceptable";
                case REGULAR:
                    return "Regular";
                
            }
            return null;
        }
    }
    public enum situacion {
        PUBLICADO,
        SOLICITADO,
        ACEPTADOVENTA,
        VENDIDO,
        RETIRADOVENTA,
        RETIRADOADMINISTRADOR;
        @Override
        public String toString() {
            switch(this){
                case PUBLICADO:
                    return "Publicado";
                case SOLICITADO:
                    return "Solicitado";
                case ACEPTADOVENTA:
                    return "Venta aceptada";
                case VENDIDO:
                    return "Vendido";
                case RETIRADOVENTA:
                    return "Retirado de venta";
                case RETIRADOADMINISTRADOR:
                    return "Retirado por administrador";
            }
            return null;
        }
    }
    private estado estado;
    private double precio;
    private LocalDateTime fechaPublicacion;
    private LocalDateTime fechaDestacado;
    private Icon fotografia;
    private int codigoPostal;
    private String ciudad;
    private boolean urgente;
    private Cliente clienteAsociado; 


    public Producto(String titulo, String descripcion, categoria categoria, int codigoPostal, String ciudad, boolean urgente, Cliente clienteAsociado, estado estado, double precio, LocalDateTime fechaPublicacion,LocalDateTime fechaDestacado, situacion situacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.urgente = urgente;
        this.clienteAsociado = clienteAsociado;
        this.estado = estado;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaDestacado = fechaDestacado;
        this.situacion = situacion;
        
    }

    public Producto(String titulo, String descripcion, Producto.categoria categoria, int codigoPostal,String ciudad, boolean urgente,Cliente clienteAsociado, Producto.estado estado, double precio, LocalDateTime fechaPublicacion,situacion situacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.urgente = urgente;
        this.clienteAsociado = clienteAsociado;
        this.situacion = situacion;
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

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fecha) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Icon getFotografia() {
        return fotografia;
    }

    public void setFotografia(Icon fotografia) {
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

    public Producto.situacion getSituacion() {
        return situacion;
    }

    public void setSituacion(Producto.situacion situacion) {
        this.situacion = situacion;
    }

    public LocalDateTime getFechaDestacado() {
        return fechaDestacado;
    }

    public void setFechaDestacado(LocalDateTime fechaDestacado) {
        this.fechaDestacado = fechaDestacado;
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
                ", fecha=" + fechaPublicacion +
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
    


