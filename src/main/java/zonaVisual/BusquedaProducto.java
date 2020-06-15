/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zonaNegocio.*;


/**
 * JPanel
 * Permite buscar productos en Javapop 
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
        String listaProductos[][] = new String[UtilProductos.getProductos().size()][this.tabla.getColumnCount()];
        Integer numeroFilas[] = new Integer[UtilProductos.getProductos().size()];
        String nombreColumnas[] = {"Titulo","Descripcion","Categoria","Estado","Precio","Localizacion"};
        for (j = 0; j < UtilProductos.getProductos().size(); j++){
            listaProductos[j][0] = UtilProductos.getProductos().get(j).getTitulo();
            listaProductos[j][1] = UtilProductos.getProductos().get(j).getDescripcion();
            listaProductos[j][2] = UtilProductos.getProductos().get(j).getCategoria().toString();
            listaProductos[j][3] = UtilProductos.getProductos().get(j).getEstado().toString();
            listaProductos[j][4] = Double.toString(UtilProductos.getProductos().get(j).getPrecio());
            listaProductos[j][5] = UtilProductos.getProductos().get(j).calcularProximidad((Cliente)((VentanaPrincipal) getVentanaprincipal()).getUsuarioConectado());
            
        }
        DefaultTableModel model = new DefaultTableModel(listaProductos, nombreColumnas);
        tabla.setModel(model);
        if (UtilProductos.getProductos().size()==0){
            JOptionPane.showMessageDialog(this, "No se ha encontrado ningún producto con los filtros seleccionados", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    private void limpiarFiltros() {
        this.seleccionCategoria.setSelectedIndex(0);
        this.seleccionEstado.setSelectedIndex(0);      
        this.palabrasClave.setText("");
        
    }
    
    public void buscarProductos(){
    UtilProductos UtilProductos = new UtilProductos();
    Cliente clienteBuscador = (Cliente)((VentanaPrincipal) getVentanaprincipal()).getUsuarioConectado();
    (((VentanaPrincipal) getVentanaprincipal()).getJavapop()).setProductos();
    UtilProductos.setProductos((((VentanaPrincipal) getVentanaprincipal()).getJavapop()).getProductos());
    
    UtilProductos.BuscarProductosSituacion(Producto.situacion.PUBLICADO,clienteBuscador);
    if (seleccionCategoria.getSelectedIndex() > 0){
        UtilProductos.BuscarProductosCategoria(convertirCategoria((String) seleccionCategoria.getSelectedItem()),clienteBuscador);
        
    }
    if (seleccionEstado.getSelectedIndex() > 0){
        UtilProductos.BuscarProductosEstado(convertirEstado((String) seleccionEstado.getSelectedItem()),clienteBuscador);
    }
    if (palabrasClave.getText()!=""){
        UtilProductos.BuscarProductosTitulo(palabrasClave.getText(),clienteBuscador);
    }
    UtilProductos.OrdenarPorProximidad((Cliente)((VentanaPrincipal) getVentanaprincipal()).getUsuarioConectado());
    
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        seleccionEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        palabrasClave = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        verProducto = new javax.swing.JButton();

        jLabel2.setText("Categoria:");

        seleccionCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Moda y Accesorios", "TV, audio y foto", "Móviles y telefonía", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));
        seleccionCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionCategoriaActionPerformed(evt);
            }
        });

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
        seleccionEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionEstadoActionPerformed(evt);
            }
        });

        jLabel5.setText("Palabras clave:");

        palabrasClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabrasClaveActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar filtros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        verProducto.setText("Ver producto seleccionado");
        verProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(palabrasClave, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(verProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seleccionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(seleccionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(palabrasClave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarProductos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void palabrasClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabrasClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabrasClaveActionPerformed

    private void seleccionCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionCategoriaActionPerformed

    private void seleccionEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionEstadoActionPerformed

    private void verProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProductoActionPerformed
        if (tabla.getSelectedRowCount()!=0){
        DetalleProducto verProducto = new DetalleProducto();
        verProducto.setVentanaprincipal(getVentanaprincipal());
        verProducto.setVisible(true);
        verProducto.setModoComprador();
        verProducto.MostrarProducto(UtilProductos.getProductos().get(tabla.getSelectedRow()));
        }
        new AceptacionVentas();
        
    }//GEN-LAST:event_verProductoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiarFiltros();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField palabrasClave;
    private javax.swing.JComboBox<String> seleccionCategoria;
    private javax.swing.JComboBox<String> seleccionEstado;
    private javax.swing.JTable tabla;
    private javax.swing.JButton verProducto;
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
        return null;
         
     } 
}

