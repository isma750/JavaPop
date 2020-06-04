/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import zonaNegocio.*;
/**
 *
 * @author Carlos
 */
public class registro extends javax.swing.JFrame {

     private JFrame ventanaprincipal;

    

    public  JFrame getVentanaprincipal() {
        
        return ventanaprincipal;
    }

    
    public void setVentanaprincipal(JFrame ventanaprincipal) {
        this.ventanaprincipal = ventanaprincipal;
    }
    
    public registro() {
        initComponents();
        this.setTitle("JAVAPOP");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoDNI = new javax.swing.JTextField();
        campoPostal = new javax.swing.JTextField();
        campoTarjeta = new javax.swing.JTextField();
        checkTienda = new javax.swing.JCheckBox();
        campoClave = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoHorario = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoWeb = new javax.swing.JTextField();
        botonRegistro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoRepiteContraseña = new javax.swing.JPasswordField();
        campoCiudad = new javax.swing.JTextField();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana Pro Cond Black", 0, 14)); // NOI18N
        jLabel1.setText("REGISTRO DE USUARIO");

        jLabel2.setText("Por favor rellene los siguientes campos:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("DNI:");

        jLabel5.setText("Ubicación (Código postal,Ciudad):");

        jLabel6.setText("Tarjeta de Credito:");

        jLabel7.setText("Contraseña:");

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTarjetaActionPerformed(evt);
            }
        });

        checkTienda.setText("¿Posee usted una tienda?");
        checkTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTiendaActionPerformed(evt);
            }
        });

        campoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClaveActionPerformed(evt);
            }
        });

        jLabel9.setText("Descripción");

        campoDescripcion.setEnabled(false);

        jLabel10.setText("Horario");

        jLabel11.setText("Web");

        jLabel12.setText("Telefono");

        campoHorario.setEnabled(false);
        campoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHorarioActionPerformed(evt);
            }
        });

        campoTelefono.setEnabled(false);
        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        campoWeb.setEnabled(false);

        botonRegistro.setText("REGISTRARSE");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        jLabel8.setText("Correo:");

        jLabel13.setText("Repite la contraseña");

        campoCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoRepiteContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(campoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoCiudad))
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkTienda)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(28, 28, 28)
                                .addComponent(campoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkTienda)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(campoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(campoWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoRepiteContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTiendaActionPerformed
        if (checkTienda.isSelected()){
            campoDescripcion.setEnabled(true);
            campoHorario.setEnabled(true);
            campoTelefono.setEnabled(true);
            campoWeb.setEnabled(true);
        } else {
            campoDescripcion.setEnabled(false);
            campoDescripcion.setText("");
            campoHorario.setEnabled(false);
            campoHorario.setText("");
            campoTelefono.setEnabled(false);
            campoTelefono.setText("");
            campoWeb.setEnabled(false);
            campoWeb.setText("");
        }
    }//GEN-LAST:event_checkTiendaActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTarjetaActionPerformed

    private void campoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHorarioActionPerformed

    private void campoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoClaveActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed

            try{ 
                Cliente cliente = null;
                camposRellenados();
                verificarPostal(campoPostal.getText());
                verificarTarjeta(campoTarjeta.getText());
                verificarCorreo();
                verificarContraseñas();
                verificarUsuario(campoCorreo.getText());
               
                if (this.checkTienda.isSelected()){
                    verificarTelefono();
                    
                }
               /* Login lgf = new Login();
                lgf.setVentanaprincipal(ventanaprincipal);
                lgf.setVisible(true);
                lgf.setLocationRelativeTo(null);
                this.dispose();*/
               if (this.checkTienda.isSelected()){
                  ClienteProfesional clienteProfesional = new ClienteProfesional(campoNombre.getText(),
                                                                                 campoDNI.getText(),
                                                                                 campoCorreo.getText(),
                                                                                 String.copyValueOf(campoClave.getPassword()),
                                                                                 Integer.parseInt(campoPostal.getText()),
                                                                                 campoCiudad.getText(),
                                                                                 campoTarjeta.getText(),
                                                                                 campoDescripcion.getText(),
                                                                                 campoHorario.getText(),
                                                                                 campoTelefono.getText(),
                                                                                 campoWeb.getText());
                 ((VentanaPrincipal) getVentanaprincipal()).añadirUsuario(clienteProfesional); 
                }
                else{
                   cliente = new Cliente(campoNombre.getText(),
                                          campoDNI.getText(),
                                          Integer.parseInt(campoPostal.getText()),
                                          campoCiudad.getText(),
                                          campoCorreo.getText(),
                                          String.copyValueOf(campoClave.getPassword()),
                                          campoTarjeta.getText());
                    
                 ((VentanaPrincipal) getVentanaprincipal()).añadirUsuario(cliente);
                }
               ((VentanaPrincipal) getVentanaprincipal()).setUsuarioConectado(cliente);
               ((VentanaPrincipal) getVentanaprincipal()).getUsuario().setText(campoCorreo.getText());
               ((VentanaPrincipal) getVentanaprincipal()).getUsuario().updateUI();

            
               getVentanaprincipal().setVisible(true);
               this.dispose();
            }
            catch(camposNoRellenados | TarjetaIncorrecta | ubicacionIncorrecta | contraseñasNoCoinciden | correoIncorrecto | telefonoIncorrecto | usuarioExiste e){
                JOptionPane.showMessageDialog(this, "Error: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
                
                
            }
            
            
            
            /*if (!(String.valueOf(this.campoClave.getPassword()).equals(String.valueOf(this.campoRepiteContraseña.getPassword())))){
             JOptionPane.showMessageDialog(this,"La contraseña y la repeticion de la contraseña deben coincidir","Error de validacion", JOptionPane.ERROR_MESSAGE);
             this.campoClave.requestFocus();
             return;
            }*/
            
    
            
        
            
       
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void campoErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoErrorActionPerformed

    private void campoCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCiudadActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistro;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JPasswordField campoClave;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoHorario;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPostal;
    private javax.swing.JPasswordField campoRepiteContraseña;
    private javax.swing.JTextField campoTarjeta;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoWeb;
    private javax.swing.JCheckBox checkTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
    public void verificarTarjeta(String tarjeta)throws TarjetaIncorrecta{
        if (tarjeta.trim().length()!=16){
            this.campoTarjeta.requestFocus();
            throw new TarjetaIncorrecta();
        }
    }
     public void verificarPostal(String postal)throws ubicacionIncorrecta{ 
        try{
            Integer.parseInt(postal);
            if (postal.length()!=5){
                throw new ubicacionIncorrecta();
            }
        } catch (NumberFormatException e){
            this.campoPostal.requestFocus();
            throw new ubicacionIncorrecta();
        }
    }
    public void verificarTelefono() throws telefonoIncorrecto{
        try{
            Long.parseLong(campoTelefono.getText());
            if (campoTelefono.getText().length()!=9){
                throw new telefonoIncorrecto();
            }
        } catch (NumberFormatException e){
            this.campoTelefono.requestFocus();
            throw new telefonoIncorrecto();
        }
    }
    public void verificarCorreo() throws correoIncorrecto{
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (!campoCorreo.getText().matches(regex)){
            this.campoCorreo.requestFocus();
            throw new correoIncorrecto();
        }
    
    }
     public void verificarURL() throws URLIncorrecta{
        try{
            URL url = new URL(campoWeb.getText());
        } catch (MalformedURLException e) {
             throw new URLIncorrecta();
         }
     }
          
    public void verificarContraseñas() throws contraseñasNoCoinciden{
        if (!(String.valueOf(this.campoClave.getPassword()).equals(String.valueOf(this.campoRepiteContraseña.getPassword())))){
             this.campoClave.requestFocus();
             throw new contraseñasNoCoinciden();       
            }
    }
     public void verificarUsuario(String correo) throws usuarioExiste{ 
        ArrayList<Usuario> usuarios = ((VentanaPrincipal) getVentanaprincipal()).getUsuarios();
        //ordenar usuarios por la razon del algoritmo
        for (int i=0; i<usuarios.size();i++){ //Sustituir por codigo del algoritmo
            String correoUsuario = usuarios.get(i).getCorreo();
            if (correo.equals(correoUsuario)){
                throw new usuarioExiste();
            }  
        }
     }
    public void camposRellenados() throws camposNoRellenados{ 
        if (campoClave.getPassword().length==0){throw new camposNoRellenados();}
        if (campoDNI.getText().length()==0){throw new camposNoRellenados();}
        if (campoCorreo.getText().length()==0){throw new camposNoRellenados();}
        if (campoNombre.getText().length()==0){throw new camposNoRellenados();}
        if (campoTarjeta.getText().length()==0){throw new camposNoRellenados();}
        if (campoPostal.getText().length()==0){throw new camposNoRellenados();}
        if (campoCiudad.getText().length()==0){throw new camposNoRellenados();}    
        if (checkTienda.isSelected()){ 
            if (campoDescripcion.getText().length()==0){throw new camposNoRellenados();}
            if (campoHorario.getText().length()==0){throw new camposNoRellenados();}
            if (campoTelefono.getText().length()==0){throw new camposNoRellenados();} 
            if (campoWeb.getText().length()==0){throw new camposNoRellenados();}   
        } 
    
    }
}
class TarjetaIncorrecta extends Exception{
    public TarjetaIncorrecta(){
        super("ERROR: La tarjeta debe componerse por 16 números");
    }
}
class ubicacionIncorrecta extends Exception{
    public ubicacionIncorrecta(){
        super("ERROR: La ubicación debe tener el formato Codigo Postal,Municipio");
    }
}
class dniIncorrecto extends Exception{
    public dniIncorrecto(){
        super("ERROR: El DNI no es válido");
    }
}
class correoIncorrecto extends Exception {
    public correoIncorrecto(){
        super("ERROR: El correo no es valido");
    }
}
class contraseñasNoCoinciden extends Exception{
    public contraseñasNoCoinciden(){
        super("ERROR: Las contraseñas deben de coincidir");
    }
}
class camposNoRellenados extends Exception{
    public camposNoRellenados(){
        super("ERROR: Se deben de rellenar todos los campos");
    }
}
class usuarioExiste extends Exception{
    public usuarioExiste(){
        super("ERROR: Ya existe un usuario con el correo especificado ");
    }
}
class telefonoIncorrecto extends Exception{
    public telefonoIncorrecto(){
        super("ERROR: El telefono debe de componerse de nueve digitos");
    }
}
class URLIncorrecta extends Exception{
    public URLIncorrecta(){
        super("ERROR: La URL de la web de la tienda no es válida");
    }
}