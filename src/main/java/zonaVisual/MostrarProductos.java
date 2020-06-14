/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zonaNegocio.Cliente;
import zonaNegocio.Usuario;
import zonaNegocio.UtilProductos;

/**
 *
 * @author ismae
 */
public class MostrarProductos extends javax.swing.JPanel {

    /**
     * Creates new form MostrarProductos
     */
     private JFrame ventanaprincipal;
     private Usuario usuario;
     
    public  JFrame getVentanaprincipal() {
        
        return ventanaprincipal;
    }

    
    public void setVentanaprincipal(JFrame ventanaprincipal) {
        this.ventanaprincipal = ventanaprincipal;
    }
    
    public MostrarProductos() {
        initComponents();
    }
    public void generarTabla(Usuario usuario){
      this.usuario = usuario;  
      if (usuario.getClass().getSimpleName().equals("Administrador")){       
        int j = 0;
        String listaProductos[][] = new String[((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().size()][this.tabla.getColumnCount()];       
        String nombreColumnas[] = {"Titulo","Descripcion","Categoria","Precio","Situacion"};
        for (j = 0; j < ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().size(); j++){
            listaProductos[j][0] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getTitulo();
            listaProductos[j][1] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getDescripcion();
            listaProductos[j][2] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getCategoria().toString();
            listaProductos[j][3] = Double.toString(((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getPrecio());
            listaProductos[j][4] = ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(j).getSituacion().toString();
           
            
            
        }
        DefaultTableModel model = new DefaultTableModel(listaProductos, nombreColumnas);
        tabla.setModel(model);
         if (((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().size()==0){
            JOptionPane.showMessageDialog(this, "No se ha encontrado ningún producto", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }  
    }else{
      int j = 0;
        ((VentanaPrincipal) getVentanaprincipal()).getJavapop().setProductos();
        UtilProductos.setProductos(((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos());
        UtilProductos.BuscarProductosUsuario((Cliente) usuario);
        String listaProductos[][] = new String[UtilProductos.getProductos().size()][this.tabla.getColumnCount()];       
        String nombreColumnas[] = {"Titulo","Descripcion","Categoria","Precio","Situacion"};
        for (j = 0; j < UtilProductos.getProductos().size(); j++){
            listaProductos[j][0] = UtilProductos.getProductos().get(j).getTitulo();
            listaProductos[j][1] = UtilProductos.getProductos().get(j).getDescripcion();
            listaProductos[j][2] = UtilProductos.getProductos().get(j).getCategoria().toString();
            listaProductos[j][3] = Double.toString(UtilProductos.getProductos().get(j).getPrecio());
            listaProductos[j][4] = UtilProductos.getProductos().get(j).getSituacion().toString();
                  
            
            
        }
        DefaultTableModel model = new DefaultTableModel(listaProductos, nombreColumnas);
        tabla.setModel(model);
         if (UtilProductos.getProductos().size()==0){
            JOptionPane.showMessageDialog(this, "No has registrado ningún producto en la aplicación, ¿Por qué no pruebas a registrar uno antes?, es muy sencillo :)", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        } 
      }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        consultarProducto = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Productos Javapop");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Descripción", "Categoria", "Precio", "Situacion"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        consultarProducto.setText("Consultar Producto");
        consultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarProductoActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar Productos");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(consultarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void consultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarProductoActionPerformed
        if (tabla.getSelectedRowCount()!=0){
        DetalleProducto verProducto = new DetalleProducto();
        verProducto.setVentanaprincipal(getVentanaprincipal());
        verProducto.setVisible(true);
        if (usuario.getClass().getSimpleName().equals("Administrador")){   
        verProducto.setModoAdministrador();
        verProducto.MostrarProducto(((VentanaPrincipal) getVentanaprincipal()).getJavapop().getProductos().get(tabla.getSelectedRow()));
        }else{
            verProducto.setModoVendedor();
            verProducto.MostrarProducto(UtilProductos.getProductos().get(tabla.getSelectedRow()));
        }
        
        }
    }//GEN-LAST:event_consultarProductoActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
       this.generarTabla(usuario);
    }//GEN-LAST:event_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton consultarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
