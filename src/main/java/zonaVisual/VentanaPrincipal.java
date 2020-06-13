/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;

import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import zonaNegocio.*;

/**
 *
 * @author ismae
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    
    private JFrame registro;

    public JFrame getRegistro() {
        return registro;
    }

    public void setRegistro(JFrame registro) {
        this.registro = registro;
    }
    
    
    
    
    
    private Administrador admin = null;
    private Usuario usuarioConectado;
    private JavaPop javapop;
    private Producto producto;
    
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("JAVAPOP");
        this.javapop = new JavaPop(); 
        
        // Traer informacion disco duro (Serializacion)
        if (javapop.getUsuarios().isEmpty()){
           this.admin = new Administrador();
           this.javapop.getUsuarios().add(admin);
           ArrayList<Producto> productoscliente1 = new ArrayList<>();
           
            Cliente cliente1 = new Cliente("Juan","03228447B",12345,"Guadlajara","juan@hotmail.com","juan","1234567899876541");
            Cliente cliente2 = new Cliente("Martin","03234567N",19003,"Guadalajara","martin@hotmail.com","hola","1234123412341234");
           Producto producto1 = new Producto("Camiseta blanca","Buen estado", Producto.categoria.MODAYACCESORIOS,19003,"Guadalajara",true,cliente1,Producto.estado.BUENO, 15.00,LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto2 = new Producto("Camiseta negra","Muy nueva", Producto.categoria.MODAYACCESORIOS,19203,"Guadalajara",false,cliente1,Producto.estado.ACEPTABLE, 20.00,LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto3 = new Producto("Raqueta de tenis","Muy poco uso", Producto.categoria.DEPORTEYOCIO,19004,"Guadalajara",true,cliente1, Producto.estado.COMONUEVO, 10.00, LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto4 = new Producto("Playstation 5","Poco uso", Producto.categoria.CONSOLASYVIDEOJUEGOS,19004,"Guadalajara",true,cliente1, Producto.estado.BUENO, 150.00, LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto5 = new Producto("Television 49 pulgadas Sony","Tiene un pequeño arañazo", Producto.categoria.TVAUDIOYFOTO,19004, "Guadalajara",false,cliente1, Producto.estado.ACEPTABLE, 250.00, LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto6 = new Producto("Iphone X 64 gb","Tiene la pantalla rota", Producto.categoria.MOVILESYTELFONIA,19200,"Azuqueca de Henares",true,cliente1, Producto.estado.REGULAR, 400.00,LocalDateTime.now(),Producto.situacion.PUBLICADO);
            productoscliente1.add(producto1);
             productoscliente1.add(producto2);
            productoscliente1.add(producto3);
            productoscliente1.add(producto4);
            productoscliente1.add(producto5);
            productoscliente1.add(producto6);
            cliente1.setProductos(productoscliente1);
           this.javapop.getUsuarios().add(cliente1);
           this.javapop.getUsuarios().add(cliente2);
           this.javapop.setProductos();
           System.out.println(this.javapop.getProductos());
            
        }
        
        JFrame login = new Login(this);
        
        
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    

    public JavaPop getJavapop() {
        return javapop;
    }

    public void setJavapop(JavaPop javapop) {
        this.javapop = javapop;
    }
    
    
    public Usuario getUsuarioConectado() {
        return usuarioConectado;
    }

    public void setUsuarioConectado(Usuario usuarioConectado) {
        this.usuarioConectado = usuarioConectado;
    }

    public JLabel getUsuario() {
        return usuario;
    }

    public void setUsuario(JLabel usuario) {
        this.usuario = usuario;
    }
    
   
    public void añadirUsuario(Usuario usuario){
        javapop.getUsuarios().add(usuario);
    }

    
    
    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
    public void actualizarMenus(){
    if (!getUsuarioConectado().equals(admin)){
            MenuAdministrador.setVisible(false);
            MenuCliente.setVisible(true);
        } else {
            MenuCliente.setVisible(false);
            MenuAdministrador.setVisible(true);
        }
        /*if (!getUsuarioConectado().getClass().getSimpleName().equals("ClienteProfesional")){
            MiCuenta.setVisible(false);
        } else {
            MiCuenta.setVisible(true);
        }*/
    }
   
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAdministrador = new javax.swing.JMenu();
        MostrarProductos = new javax.swing.JMenuItem();
        MostrarUsuarios = new javax.swing.JMenuItem();
        MostrarVentas = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenu();
        MisProductos = new javax.swing.JMenu();
        Vender = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Comprar = new javax.swing.JMenuItem();
        MiCuenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        MenuAdministrador.setText("Administrador");

        MostrarProductos.setText("Mostrar productos");
        MostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarProductosActionPerformed(evt);
            }
        });
        MenuAdministrador.add(MostrarProductos);

        MostrarUsuarios.setText("Mostrar usuarios");
        MostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUsuariosActionPerformed(evt);
            }
        });
        MenuAdministrador.add(MostrarUsuarios);

        MostrarVentas.setText("Mostrar ventas ");
        MostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarVentasActionPerformed(evt);
            }
        });
        MenuAdministrador.add(MostrarVentas);

        jMenuBar1.add(MenuAdministrador);

        MenuCliente.setText("Cliente");

        MisProductos.setText("Mis Productos");

        Vender.setText("Vender Producto");
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        MisProductos.add(Vender);

        jMenuItem1.setText("Consultar Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MisProductos.add(jMenuItem1);

        MenuCliente.add(MisProductos);

        Comprar.setText("Buscar Productos");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        MenuCliente.add(Comprar);

        MiCuenta.setText("Mi cuenta");
        MiCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiCuentaActionPerformed(evt);
            }
        });
        MenuCliente.add(MiCuenta);

        jMenuBar1.add(MenuCliente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(613, Short.MAX_VALUE)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(783, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    @Override
    public Image getIconImage() {
        try{
            Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("contents/java.jpg"));
            return retValue;
        }
        catch (Exception e){
           return (null); 
        }
    }
    
    private void MostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUsuariosActionPerformed
        MostrarUsuarios mu= new MostrarUsuarios();
        mu.setVentanaprincipal(this);
        mu.generarTabla();
        jPanel1.removeAll();
        jPanel1.add(mu);
        jPanel1.updateUI();
    }//GEN-LAST:event_MostrarUsuariosActionPerformed

    private void MostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarVentasActionPerformed
        jPanel1.removeAll();
        jPanel1.add(new Mostrarventas());
        jPanel1.updateUI();
    }//GEN-LAST:event_MostrarVentasActionPerformed

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
         DetalleProducto vender = new DetalleProducto();
         vender.setVentanaprincipal(this);
         vender.setVisible(true);
         vender.setModoNuevoProducto();
    }//GEN-LAST:event_VenderActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        BusquedaProducto busqueda= new BusquedaProducto();
        busqueda.setVentanaprincipal(this);
        jPanel1.removeAll();
        jPanel1.add(busqueda);
        jPanel1.updateUI();
        
    }//GEN-LAST:event_ComprarActionPerformed

    private void MiCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCuentaActionPerformed
        registro rgf = new registro();
        rgf.setVentanaprincipal(this);
        rgf.setVisible(true);
        rgf.mostrarDatosCliente((Cliente)(this.getUsuarioConectado()));
        this.dispose();  
        
        
    }//GEN-LAST:event_MiCuentaActionPerformed

    private void MostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarProductosActionPerformed
        MostrarProductos mp = new MostrarProductos();
        mp.setVentanaprincipal(this);
        mp.generarTabla();
        jPanel1.removeAll();
        jPanel1.add(mp);
        jPanel1.updateUI();
    }//GEN-LAST:event_MostrarProductosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                new VentanaPrincipal();
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Comprar;
    private javax.swing.JMenu MenuAdministrador;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenuItem MiCuenta;
    private javax.swing.JMenu MisProductos;
    private javax.swing.JMenuItem MostrarProductos;
    private javax.swing.JMenuItem MostrarUsuarios;
    private javax.swing.JMenuItem MostrarVentas;
    private javax.swing.JMenuItem Vender;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    
}
