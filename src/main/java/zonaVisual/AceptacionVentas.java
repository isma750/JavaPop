/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;

import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import zonaNegocio.Cliente;
import zonaNegocio.Compra;
import zonaNegocio.Producto;
import zonaNegocio.Venta;

/**
 * JFrame
 * Ventana que muestra al vendedor si algun producto suyo está ofertado
 */
public class AceptacionVentas extends javax.swing.JFrame {

    /**
     * Creates new form AceptacionVentas
     */
    private JFrame ventanaprincipal;
    private Compra compra;
    
    public JFrame getVentanaprincipal() {
        return ventanaprincipal;
    }

    public void setVentanaprincipal(JFrame ventanaprincipal) {
        this.ventanaprincipal = ventanaprincipal;
    }
    
    
    public AceptacionVentas() {
        initComponents();
        this.setTitle("JAVAPOP");
    }

    /**
     * Rellena la ventana con los datos de la compra que queramos mostrar al usuario
     * @param compra La compra que se quiere mostrar
     */
    public void rellenarDatos(Compra compra){
         this.compra = compra;
         campoTitulo.setText(compra.getProducto().getTitulo());
         campoDescripcion.setText(compra.getProducto().getDescripcion());
         campoCategoria.setText(compra.getProducto().getCategoria().toString());
         campoEstado.setText(compra.getProducto().getEstado().toString());
         campoPrecio.setText(String.valueOf((compra.getProducto().getPrecio())));
         campoComprador.setText(compra.getComprador().getNombre());
         campoUbicacion.setText(compra.getComprador().getCodigoPostal() + " " + compra.getComprador().getCiudad());
         campoFecha.setText(compra.getFechaSolicitudComprador().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
         ImageIcon imgRedimensionada = new ImageIcon(((ImageIcon)compra.getProducto().getFotografia()).getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), 1));
         Imagen.setIcon(imgRedimensionada);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        campoDescripcion = new javax.swing.JTextField();
        campoPrecio = new javax.swing.JTextField();
        campoCategoria = new javax.swing.JTextField();
        campoEstado = new javax.swing.JTextField();
        Imagen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoComprador = new javax.swing.JTextField();
        campoUbicacion = new javax.swing.JTextField();
        campoFecha = new javax.swing.JTextField();
        DenegarVenta = new javax.swing.JButton();
        AceptarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tienes ventas pendientes de aceptar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Producto en venta"));

        jLabel2.setText("Titulo:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Categoría:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Precio:");

        campoTitulo.setEditable(false);
        campoTitulo.setBackground(new java.awt.Color(238, 238, 238));
        campoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTituloActionPerformed(evt);
            }
        });

        campoDescripcion.setEditable(false);
        campoDescripcion.setBackground(new java.awt.Color(238, 238, 238));
        campoDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescripcionActionPerformed(evt);
            }
        });

        campoPrecio.setEditable(false);
        campoPrecio.setBackground(new java.awt.Color(238, 238, 238));

        campoCategoria.setEditable(false);
        campoCategoria.setBackground(new java.awt.Color(238, 238, 238));

        campoEstado.setEditable(false);
        campoEstado.setBackground(new java.awt.Color(238, 238, 238));

        Imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoTitulo)
                                .addComponent(campoCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                            .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(103, 103, 103)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la oferta"));

        jLabel7.setText("Ubicacion:");

        jLabel8.setText("Comprador:");

        jLabel9.setText("Fecha:");

        campoComprador.setEditable(false);
        campoComprador.setBackground(new java.awt.Color(238, 238, 238));
        campoComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCompradorActionPerformed(evt);
            }
        });

        campoUbicacion.setEditable(false);
        campoUbicacion.setBackground(new java.awt.Color(238, 238, 238));
        campoUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUbicacionActionPerformed(evt);
            }
        });

        campoFecha.setEditable(false);
        campoFecha.setBackground(new java.awt.Color(238, 238, 238));
        campoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        DenegarVenta.setText("Denegar Venta");
        DenegarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenegarVentaActionPerformed(evt);
            }
        });

        AceptarVenta.setText("Aceptar venta");
        AceptarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(AceptarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(DenegarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DenegarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(580, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public Image getIconImage() {
        try{
            Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("contents/logojavapop.png"));
            return retValue;
        }
        catch (Exception e){
           return (null); 
        }
    }
    private void campoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTituloActionPerformed

    private void campoDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescripcionActionPerformed

    private void campoCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCompradorActionPerformed

    private void campoUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUbicacionActionPerformed

    private void campoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaActionPerformed

    private void DenegarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenegarVentaActionPerformed

        compra.setInformado(true); // La posible venta se ha informado al vendedor
        compra.getProducto().setSituacion(Producto.situacion.PUBLICADO); //Volvemos a poner el producto como publicado para que aparezca en busquedas
        JOptionPane.showMessageDialog(this,"Se ha rechazado la venta", "ATENCION",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_DenegarVentaActionPerformed

    private void AceptarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarVentaActionPerformed
        
        compra.setInformado(true); //La posible venta se ha informado al vendedor
        compra.getProducto().setSituacion(Producto.situacion.ACEPTADOVENTA); // Establecemos la situación del producto como aceptado para venderse
        ((VentanaPrincipal) getVentanaprincipal()).getJavapop().comprarProducto(compra.getComprador(), compra.getVendedor(), compra.getProducto()); //Generamos una venta nueva y creamos el archivo de texto con los datos de la compra
        JOptionPane.showMessageDialog(this,"Se ha vendido el producto correctamente", "ATENCION",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_AceptarVentaActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AceptacionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AceptacionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AceptacionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AceptacionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AceptacionVentas().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarVenta;
    private javax.swing.JButton DenegarVenta;
    private javax.swing.JLabel Imagen;
    private javax.swing.JTextField campoCategoria;
    private javax.swing.JTextField campoComprador;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JTextField campoUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables


}

