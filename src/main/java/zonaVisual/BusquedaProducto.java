/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import zonaNegocio.*;


/**
 *
 * @author ismae
 */
public class BusquedaProducto extends javax.swing.JPanel {
    private JFrame ventanaprincipal;

    public  JFrame getVentanaprincipal() {
        
        return ventanaprincipal;
    }

    
    public void setVentanaprincipal(JFrame ventanaprincipal) {
        this.ventanaprincipal = ventanaprincipal;
    }

    /**
     * Creates new form BusquedaProducto
     */
   

    public BusquedaProducto() {
        initComponents();
    }
    public void generarTabla() {
        int j = 0;
        String listaProductos[][] = new String[((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().size()][this.tabla.getColumnCount()];
        Integer numeroFilas[] = new Integer[((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().size()];
        
        for (j = 0; j < ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().size(); j++){
            listaProductos[j][0] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getTitulo();
            listaProductos[j][1] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getDescripcion();
            listaProductos[j][2] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getCategoria().toString();
            listaProductos[j][3] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getEstado().toString();
           // listaProductos[j][4] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).String.valueOf(getPrecio());
            listaProductos[j][4] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getCodigoPostal() + " " + ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getCiudad();
            
        }
        /*setFilasProducto(numeroFilas);
        this.tabla.setModel(new MiModeloTabla(
        listaProductos ,
        new String[] {
            "Titulo","Descripcion","Categoria","Estado","Precio","Localizacion"
        }
        ));*/
    }
    
    private void limpiarFiltros() {
        this.seleccionCategoria.setSelectedIndex(0);
        this.seleccionEstado.setSelectedIndex(0);
        this.precioDesde.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        this.precioHasta.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        this.palabraNueva.setText("");
        this.modeloLista.setText("");
        
    }
    public void buscarProductos(){
        Cliente cliente = null;
        boolean clienteValido = false;
        boolean productoValido = false;
        String palabra = "";
        ArrayList<Producto> productosEncontrados = new ArrayList<Producto>();
        ArrayList<Producto> productosOrdenados = new ArrayList<Producto>();
        
        for (Usuario cadaUsuario: ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getUsuarios()){
            if (cadaUsuario instanceof Cliente){
                cliente = (Cliente) cadaUsuario;
                clienteValido = true;
                //Validar que si el tipo de transaccion es una venta y el correo del usuarioConectado es distinto al correo del propiertario el clienteValido = false
                //Si es una compra y coincide los correo clientevalido = false, porque un cliente no se puede comprar asi mismo
                if(clienteValido){
                    if(cliente.getProductos().size()>0){
                        for (Producto cadaProducto : cliente.getProductos()){
                            productoValido = true;
                            //si el tipo de transaccion es una compra
                            if(!(cadaProducto.getSituacion().equals(Producto.situacion.PUBLICADO))){
                                productoValido = false;
                            }
                            if (productoValido){
                                if (seleccionCategoria.getSelectedIndex() > 0){
                                    if (!(cadaProducto.getCategoria().equals(seleccionCategoria.getSelectedIndex()- 1))){
                                        productoValido = false;
                                    }  
                                }
                                if (seleccionEstado.getSelectedIndex() > 0){
                                    if (!(cadaProducto.getEstado().equals(seleccionEstado.getSelectedIndex()- 1))){
                                        productoValido = false;
                                    }
                                }
                                //Mirar (da error)
                               /* if(modeloLista.getSize() > 0){
                                    for (int i=0 ; i< modeloLista.getSize()); i++){
                                        palabra = modeloLista.getName(i).toString();
                                        if (cadaProducto.getDescripcion().toLowerCase().contains(palabra.toString().toLowerCase())){
                                            productoValido = true;
                                            break;
                                        }*/
                                    
                                }
                                }
                            }
                            if (productoValido){
                                productosEncontrados.add(cadaProducto);
                            }
                        }
                    }
                }
            }
        }
        //Si la transaccion es una compra hayq ue usar el comparador de productos por Urgencia/distancia
        generarTabla();
        
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        seleccionCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        palabraNueva = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        seleccionEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        precioDesde = new javax.swing.JSpinner();
        precioHasta = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        modeloLista = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel2.setText("Categoria:");

        seleccionCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Moda y accesorios", "TV, audio, foto", "Móviles y telefonía", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));

        jLabel3.setText("Agragar palabra clave:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Descripción", "categoría", "Estado", "Precio", "Localización"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Estado:");

        seleccionEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Nuevo", "Como nuevo", "Bueno", "Aceptable", "Regular" }));

        jLabel4.setText("Precio (Desde/Hasta):");

        jLabel5.setText("Palabras clave:");

        modeloLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloListaActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar filtros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(palabraNueva)
                                    .addComponent(modeloLista, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seleccionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(seleccionEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seleccionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seleccionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(palabraNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modeloLista, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modeloListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modeloLista;
    private javax.swing.JTextField palabraNueva;
    private javax.swing.JSpinner precioDesde;
    private javax.swing.JSpinner precioHasta;
    private javax.swing.JComboBox<String> seleccionCategoria;
    private javax.swing.JComboBox<String> seleccionEstado;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public Producto.categoria convertirCategoria(String categoriaString){ 
         switch (categoriaString){
             case "Moda y Accesorios":
                 return Producto.categoria.MODAYACCESORIOS;   
             case "TV, audio y foto":
                 return Producto.categoria.TVAUDIOYFOTO;
             case "Móviles y telefonía":
                 return Producto.categoria.MOVILESYTELFONIA;
             case "Informática y electrónica":
                 return Producto.categoria.INFORMATICAYELECTRONICA;
             case "Consolas y videojuegos":
                 return Producto.categoria.CONSOLASYVIDEOJUEGOS;
             case "Deporte y ocio":    
                 return Producto.categoria.DEPORTEYOCIO;
         }
         return Producto.categoria.DEPORTEYOCIO; //...
    }
    
     public Producto.estado convertirEstado(String categoriaEstado){ 
         switch (categoriaEstado){
             case "Nuevo":
                 return Producto.estado.NUEVO;   
             case "Como nuevo":
                 return Producto.estado.COMONUEVO;
             case "Bueno":
                 return Producto.estado.BUENO;
             case "Aceptable":
                 return Producto.estado.ACEPTABLE;
             case "Regular":
                 return Producto.estado.REGULAR;
         }
         return Producto.estado.REGULAR; //...
      }
     public Producto.situacion situacion(String situacionProducto){
         switch (situacionProducto){
             case "Publicado":
                 return Producto.situacion.PUBLICADO;
             case "RetiradoVendedor":
                 return Producto.situacion.RETIRADOVENTA;
             case "RetiradoAdministrador":
                 return Producto.situacion.RETIRADOADMINISTRADOR;
             case "Vendido":
                 return Producto.situacion.VENDIDO;
             case "Solicitado":
                 return Producto.situacion.SOLICITADO;
             case "AceptadoVenta":
                 return Producto.situacion.ACEPTADOVENTA;
         }
         public static categoria dameCategoriaProducto(int ordinal){
             
         }
     } 
}

