/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import zonaNegocio.Cliente;
import zonaNegocio.Compra;
import zonaNegocio.Producto;
import zonaNegocio.Usuario;


public class Login extends javax.swing.JFrame {
    private JFrame ventanaprincipal;

    public  JFrame getVentanaprincipal() {
        
        return ventanaprincipal;
    }

    
    public void setVentanaprincipal(JFrame ventanaprincipal) {
        this.ventanaprincipal = ventanaprincipal;
    }
          
    public Login() {
        initComponents();
        this.setTitle("JAVAPOP");
    }
     public  Login(JFrame ventanaprincipal) {
        
        initComponents();  
        this.ventanaprincipal = ventanaprincipal;
        this.ventanaprincipal.setVisible(false);
        this.setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Clave = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        crearUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana Pro Cond Black", 2, 18)); // NOI18N
        jLabel1.setText("Bienvenido a JavaPop");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Por favor, regístrese para entrar en la aplicación");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Correo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Clave:");

        Login.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Login.setText("Log in");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        crearUsuario.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        crearUsuario.setText("Crear Usuario");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
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
    
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Usuario usuarioconectado = null;
        boolean valido = false;
        for(Usuario cadausuario : ((VentanaPrincipal) getVentanaprincipal()).getJavapop().getUsuarios()){        
            if((cadausuario.getCorreo().equals(Correo.getText())) && (cadausuario.getClave().equals(String.valueOf(Clave.getPassword())))){
                valido = true;
                usuarioconectado = cadausuario;
                break;               
            }
            
        }
        if (valido){
            if (usuarioconectado.getClass().getSimpleName().equals("Administrador")||((Cliente)usuarioconectado).getEstado().equals(Cliente.Estado.ACTIVO)){
                
                ((VentanaPrincipal) getVentanaprincipal()).setUsuarioConectado(usuarioconectado);
                ((VentanaPrincipal) getVentanaprincipal()).getUsuario().setText(Correo.getText());
                ((VentanaPrincipal) getVentanaprincipal()).getUsuario().updateUI();
                ((VentanaPrincipal) getVentanaprincipal()).actualizarMenus();
                if (!usuarioconectado.getClass().getSimpleName().equals("Administrador")){
                    for(int i = 0; i<((Cliente)usuarioconectado).getProductos().size(); i++){
                if(((Cliente)usuarioconectado).getProductos().get(i).getSituacion().equals(Producto.situacion.SOLICITADO)){
                     for (int j=0; j<((Cliente)usuarioconectado).getCompras().size(); j++){
                         Compra compraActual = ((Cliente)usuarioconectado).getCompras().get(j);
                     if (!compraActual.isInformado()){
                        AceptacionVentas vender = new AceptacionVentas();
                        vender.setVentanaprincipal(this);
                        vender.setVisible(true);
                        vender.rellenarDatos(compraActual);
                     }
                     }
                     
                }
            }
                }
                getVentanaprincipal().setVisible(true);
                this.dispose();
            }else{
       
                JOptionPane.showMessageDialog(this,"Su usuario ha sido dado de baja, pongase en contacto con el administrador de la aplicación", "Error de identificacion",JOptionPane.ERROR_MESSAGE);

            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Usuario no identificado", "Error de identificacion",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_LoginActionPerformed

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        registro rgf = new registro();
        rgf.setVentanaprincipal(getVentanaprincipal());
        rgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crearUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Clave;
    private javax.swing.JTextField Correo;
    private javax.swing.JButton Login;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

