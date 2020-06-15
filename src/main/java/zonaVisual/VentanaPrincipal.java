/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import zonaNegocio.*;

/**
 * JFrame
 * Ventana principal donde se desarrolla la funcionalidad de Javapop
 * 
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    
    private JFrame registro;
    private Administrador admin = null;
    private Usuario usuarioConectado;
    private Cliente clienteConectado;
    private JavaPop javapop;
    private Producto producto;
    
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("JAVAPOP. La nueva forma de comprar y vender");
        this.javapop = new JavaPop(); 
        this.javapop.cargarDatos();
        // Traer informacion disco duro (Serializacion)
        if (javapop.getUsuarios().isEmpty()){
           this.admin = new Administrador();
           this.javapop.getUsuarios().add(admin);
           ArrayList<Producto> productoscliente1 = new ArrayList<>();
            
            //Se crean los clientes y los productos
            Cliente cliente1 = new Cliente("Juan","03228447B",19001,"Guadalajara","juan@hotmail.com","juan","1234567899876541");
            Cliente cliente2 = new Cliente("Martin","03234567N",19003,"Guadalajara","martin@hotmail.com","hola","1234123412341234");
            Cliente cliente3 = new Cliente("Andrea","05789447Z",28801,"Alcalá","andrea@hotmail.com","andrea","9876543210321654");
            Cliente cliente4 = new Cliente("Pedro","06879412N",28001,"Madrid","pedro@hotmail.com","pedro","1234567899876542");
            ClienteProfesional cliente5 = new ClienteProfesional("Miguel", "03214554X", "miguel@gmail.com", "miguelon", 19004, "Guadalajara", "1234123412341234", "tienda chula", "10:00-14:00", "949220412", "latiendademiguel.com", LocalDateTime.of(2019, Month.MARCH, 1, 0, 0));
            Producto producto1 = new Producto("Camiseta blanca","Buen estado", Producto.categoria.MODAYACCESORIOS,19003,"Guadalajara",true,cliente1,Producto.estado.BUENO, 15.00,LocalDateTime.now(),LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto2 = new Producto("Camiseta negra","Muy nueva", Producto.categoria.MODAYACCESORIOS,19203,"Guadalajara",false,cliente1,Producto.estado.ACEPTABLE, 20.00,LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto3 = new Producto("Raqueta de tenis","Muy poco uso", Producto.categoria.DEPORTEYOCIO,19004,"Guadalajara",true,cliente1, Producto.estado.COMONUEVO, 10.00, LocalDateTime.now(),LocalDateTime.of(2019, Month.MARCH, 1, 0, 0),Producto.situacion.PUBLICADO);
            Producto producto4 = new Producto("Playstation 5","Poco uso", Producto.categoria.CONSOLASYVIDEOJUEGOS,19004,"Guadalajara",true,cliente1, Producto.estado.BUENO, 150.00, LocalDateTime.now(),LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto5 = new Producto("Television 49 pulgadas Sony","Tiene un pequeño arañazo", Producto.categoria.TVAUDIOYFOTO,19004, "Guadalajara",false,cliente1, Producto.estado.ACEPTABLE, 250.00, LocalDateTime.now(),Producto.situacion.PUBLICADO);
            Producto producto6 = new Producto("Iphone X 64 gb","Tiene la pantalla rota", Producto.categoria.MOVILESYTELFONIA,19200,"Azuqueca de Henares",true,cliente1, Producto.estado.REGULAR, 400.00,LocalDateTime.now(),LocalDateTime.now(),Producto.situacion.PUBLICADO);
            ImageIcon iconoproducto1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("contents/camisetablanca.jpg")));
            producto1.setFotografia(iconoproducto1);
            productoscliente1.add(producto1);
            productoscliente1.add(producto2);
            productoscliente1.add(producto3);
            productoscliente1.add(producto4);
            productoscliente1.add(producto5);
            productoscliente1.add(producto6);
            cliente1.setProductos(productoscliente1);
           this.javapop.getUsuarios().add(cliente1);
           this.javapop.getUsuarios().add(cliente2);
           this.javapop.getUsuarios().add(cliente5);
           this.javapop.setProductos();
           System.out.println(this.javapop.getProductos());
            
        }
        
        JFrame login = new Login(this);    
        
    }
    //Se realizan los getter y setter
    
    public JFrame getRegistro() {
        return registro;
    }

    public void setRegistro(JFrame registro) {
        this.registro = registro;
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

    public Cliente getClienteConectado() {
        return clienteConectado;
    }

    public void setClienteConectado(Cliente clienteConectado) {
        this.clienteConectado = clienteConectado;
    }
    
    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    /**
     * Establece los menus de la aplicación segun si el usuario conectado es un administrador o otro usuario
     */
    public void actualizarMenus(){
    if (!getUsuarioConectado().getClass().getSimpleName().equals("Administrador")){
            MenuAdministrador.setVisible(false);
            MenuCliente.setVisible(true);
        } else {
            MenuCliente.setVisible(false);
            MenuAdministrador.setVisible(true);
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Desconectar = new javax.swing.JButton();
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

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        Desconectar.setText("Cerrar Sesión");
        Desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesconectarActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 466, Short.MAX_VALUE)
                        .addComponent(Desconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Desconectar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(783, 506));
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
    
    private void MostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUsuariosActionPerformed
        MostrarUsuarios mu= new MostrarUsuarios();
        mu.setVentanaprincipal(this);
        mu.generarTabla();
        jPanel1.removeAll();
        jPanel1.add(mu);
        jPanel1.updateUI();
    }//GEN-LAST:event_MostrarUsuariosActionPerformed

    private void MostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarVentasActionPerformed
        Mostrarventas mv= new Mostrarventas();
        mv.setVentanaprincipal(this);
        mv.dibujarTabla();
        jPanel1.removeAll();
        jPanel1.add(mv);
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
        mp.generarTabla(usuarioConectado);
        jPanel1.removeAll();
        jPanel1.add(mp);
        jPanel1.updateUI();
    }//GEN-LAST:event_MostrarProductosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MostrarProductos mp = new MostrarProductos();
        mp.setVentanaprincipal(this);
        mp.generarTabla(usuarioConectado);
        jPanel1.removeAll();
        jPanel1.add(mp);
        jPanel1.updateUI();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void DesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesconectarActionPerformed
        this.setVisible(false);
        jPanel1.removeAll();
        jPanel1.updateUI();
        JFrame login = new Login(this);
    }//GEN-LAST:event_DesconectarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.getJavapop().guardarDatos();
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JButton Desconectar;
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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    
}
