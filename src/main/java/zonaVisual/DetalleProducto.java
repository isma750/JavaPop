/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;



import java.time.LocalDateTime;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;
import zonaNegocio.*;

/**
 *
 * @author ismae
 */
public class DetalleProducto extends javax.swing.JFrame {

    /**
     * Creates new form AñadirProducto
     */
     private JFrame ventanaprincipal;
     private Producto productoMostrado;

    public  JFrame getVentanaprincipal() {
        
        return ventanaprincipal;
    }

    
    public void setVentanaprincipal(JFrame ventanaprincipal) {
        this.ventanaprincipal = ventanaprincipal;
    }

    public Producto getProductoMostrado() {
        return productoMostrado;
    }

    public void setProductoMostrado(Producto productoMostrado) {
        this.productoMostrado = productoMostrado;
    }
    
    public DetalleProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        campoDescripcion = new javax.swing.JTextField();
        comboCategoria = new javax.swing.JComboBox<>();
        campoPostal = new javax.swing.JTextField();
        campoCiudad = new javax.swing.JTextField();
        checkUrgente = new javax.swing.JCheckBox();
        comboEstado = new javax.swing.JComboBox<>();
        campoPrecio = new javax.swing.JTextField();
        botonAñadir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buscarImagen = new javax.swing.JButton();
        panelImagen = new javax.swing.JPanel();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Titulo");

        jLabel2.setText("Descripcion ");

        jLabel3.setText("Categoria");

        jLabel4.setText("Código Postal");

        jLabel5.setText("Ciudad");

        jLabel6.setText("Urgente");

        jLabel7.setText("Estado");

        jLabel8.setText("Precio");

        campoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTituloActionPerformed(evt);
            }
        });

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moda y Accesorios", "TV, audio y foto", "Móviles y telefonía", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        campoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPostalActionPerformed(evt);
            }
        });

        checkUrgente.setText("Urgente");
        checkUrgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUrgenteActionPerformed(evt);
            }
        });

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Como nuevo", "Bueno", "Aceptable", "Regular" }));

        botonAñadir.setText("Añadir Producto");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Rellene con la informacion del producto");

        jLabel10.setText("Añadir Imagen");

        buscarImagen.setText("Buscar");
        buscarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        botonModificar.setText("Modificar Producto");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar Producto");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonAnterior.setText("Anterior");

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar Cambios");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(botonModificar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoPostal)
                                    .addComponent(comboCategoria, 0, 1, Short.MAX_VALUE)
                                    .addComponent(campoCiudad)
                                    .addComponent(campoDescripcion)
                                    .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoPrecio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(checkUrgente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(botonAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(205, 205, 205)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkUrgente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(buscarImagen))
                        .addGap(18, 18, 18)
                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGuardar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(783, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTituloActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void campoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPostalActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
         try {
             verificarCampos();
             verificarPostal();
             verificarPrecio();
             Cliente cliente = (Cliente)((VentanaPrincipal) getVentanaprincipal()).getUsuarioConectado();
             if (checkUrgente.isSelected()){                
                 Producto producto = new Producto(campoTitulo.getText(),campoDescripcion.getText(),convertirCategoria(comboCategoria.getSelectedItem().toString()),Integer.parseInt(campoPostal.getText()),campoCiudad.getText(),true,cliente,convertirEstado(comboEstado.getSelectedItem().toString()),Double.parseDouble(campoPrecio.getText()),LocalDateTime.now(),Producto.situacion.PUBLICADO);
                 ((VentanaPrincipal) getVentanaprincipal()).getJavapop().anadirProducto(producto);
             }else{
                 Producto producto = new Producto(campoTitulo.getText(),campoDescripcion.getText(),convertirCategoria(comboCategoria.getSelectedItem().toString()),Integer.parseInt(campoPostal.getText()),campoCiudad.getText(),false,cliente,convertirEstado(comboEstado.getSelectedItem().toString()),Double.parseDouble(campoPrecio.getText()),LocalDateTime.now(),Producto.situacion.PUBLICADO);

                 ((VentanaPrincipal) getVentanaprincipal()).getJavapop().anadirProducto(producto);
             }
             JOptionPane.showMessageDialog(this,"Se ha publicado el producto correctamente", "ATENCION",JOptionPane.INFORMATION_MESSAGE);
             this.dispose();
             
         } catch (camposNoRellenados | ubicacionIncorrecta | precioIncorrecto | JavaPop.ProductoExiste e) {
             JOptionPane.showMessageDialog(this, "Error: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void checkUrgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUrgenteActionPerformed
        if (checkUrgente.isSelected()){
            JOptionPane.showMessageDialog(this,"Ha marcado el producto como urgente, se le cobrará 5€ al publicar el producto y destacará sobre el resto durante 7 días.", "ATENCION",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_checkUrgenteActionPerformed

    private void buscarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarImagenActionPerformed
        //INCOMPLETO
        
        JFileChooser fc = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
        "Imagenes JPG y PNG", "jpg", "png");
        fc.setFileFilter(filtro);        
        
        fc.setMultiSelectionEnabled(true);
        int pp = fc.showOpenDialog(this);    
        
        if(pp==JFileChooser.APPROVE_OPTION){
            pp++;
            ImageIcon imagen = new ImageIcon(fc.getSelectedFile().getAbsolutePath());
            panelImagen.add(new JLabel(imagen));
        }
        else {
        
        }
        ImageIcon imagen = new ImageIcon(fc.getSelectedFile().getAbsolutePath());
            panelImagen.add(new JLabel(imagen));
    }//GEN-LAST:event_buscarImagenActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        //mostrar el producto siguiente MostrarProducto(productosiguiente)
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        //poner todos los campos como editables
        //hacer visible el boton de guardar
        //hacer sets a todos los atributos del producto que estamos modificando
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        ((Cliente)((VentanaPrincipal) getVentanaprincipal()).getUsuarioConectado()).quitarProducto(productoMostrado);
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleProducto();
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton buscarImagen;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoPostal;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JCheckBox checkUrgente;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelImagen;
    // End of variables declaration//GEN-END:variables
    public void verificarCampos() throws camposNoRellenados{
        if (campoCiudad.getText().length()==0){throw new camposNoRellenados();}
        if (campoDescripcion.getText().length()==0){throw new camposNoRellenados();}
        if (campoPostal.getText().length()==0){throw new camposNoRellenados();}
        if (campoPrecio.getText().length()==0){throw new camposNoRellenados();} 
        if (campoTitulo.getText().length()==0){throw new camposNoRellenados();} 
    }
    public void verificarPostal()throws ubicacionIncorrecta{ 
        try{
            Integer.parseInt(campoPostal.getText());
            if (campoPostal.getText().length()!=5){
                throw new ubicacionIncorrecta();
            }
        } catch (NumberFormatException e){
            this.campoPostal.requestFocus();
            throw new ubicacionIncorrecta();
        }
    }
     public void verificarPrecio()throws precioIncorrecto{ 
        try{
            Double.parseDouble(campoPrecio.getText());
        } catch (NumberFormatException e){
            this.campoPostal.requestFocus();
            throw new precioIncorrecto();
        }
    }
     public void setModoNuevoProducto(){ 
        this.remove(botonAnterior);
        this.remove(botonSiguiente);
        this.remove(botonModificar);
        this.remove(botonEliminar);        
    }
     public void setModoComprador(){ 
        this.remove(botonModificar);
        this.remove(botonEliminar);
        this.remove(botonAñadir);
        //TODO poner todos los campos como no editables
    }
     public void setModoVendedor(){ 
        this.remove(botonAñadir);
        //TODO poner los campos como no editables
    }
     public void MostrarProducto(Producto producto){
         setProductoMostrado(producto);
         campoTitulo.setText(producto.getTitulo());
         campoCiudad.setText(producto.getCiudad());
         campoDescripcion.setText(producto.getDescripcion());
         campoPostal.setText(Integer.toString(producto.getCodigoPostal()));
         campoPrecio.setText(Double.toString(producto.getPrecio()));
         comboCategoria.setSelectedItem(indiceCategoria(producto.getCategoria()));
         comboEstado.setSelectedIndex(indiceEstado(producto.getEstado()));
         checkUrgente.setSelected(producto.isUrgente());
     
     }
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
    public int indiceCategoria(Producto.categoria Categoria){ 
         switch (Categoria){
             case MODAYACCESORIOS:
                 return 0;   
             case TVAUDIOYFOTO:
                 return 1;
             case MOVILESYTELFONIA:
                 return 2;
             case INFORMATICAYELECTRONICA:
                 return 3;
             case CONSOLASYVIDEOJUEGOS:
                 return 4;
             case DEPORTEYOCIO:    
                 return 5;
         }
         return 5; //...
      }
     public int indiceEstado(Producto.estado Estado){ 
         switch (Estado){
             case NUEVO:
                 return 0;   
             case COMONUEVO:
                 return 1;
             case BUENO:
                 return 2;
             case ACEPTABLE:
                 return 3;
             case REGULAR:
                 return 4;
         }
         return 4; //...
      } 




}
class precioIncorrecto extends Exception{
    public precioIncorrecto(){
        super("ERROR: El precio del producto no es válido");
    }
}
