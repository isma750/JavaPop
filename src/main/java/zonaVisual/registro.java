/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaVisual;
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
        campoUbicacion = new javax.swing.JTextField();
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
        campoError = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        campoError.setEditable(false);
        campoError.setForeground(new java.awt.Color(255, 0, 51));
        campoError.setBorder(null);
        campoError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoErrorActionPerformed(evt);
            }
        });

        jLabel8.setText("Correo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(campoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkTienda)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(campoWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoTelefono))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoError, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkTienda)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(campoWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(campoError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTiendaActionPerformed
        if (checkTienda.isSelected()){
            campoDescripcion.setEnabled(true);
            campoHorario.setEnabled(true);
            campoTelefono.setEnabled(true);
            campoWeb.setEnabled(true);
        } else {
            campoDescripcion.setEnabled(false);
            campoHorario.setEnabled(false);
            campoTelefono.setEnabled(false);
            campoWeb.setEnabled(false);
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
                camposRellenados();
                verificarTarjeta(campoTarjeta.getText());
                verificarUbicacion(campoUbicacion.getText());
                if (checkTienda.isSelected()){
                //invocar al constructor de cliente profesional cada parametro con el campo.getText correspondiente de momento pongo el campo error a "MUY BIEN, TE HAS REGISTRADO COMO CLIENTE PROF."
                campoError.setText("MUY BIEN, TE HAS REGISTRADO COMO CLIENTE PROFESIONAL");
                } else {
                Cliente cliente = new Cliente(campoNombre.getText(),campoDNI.getText(),campoCorreo.getText(),String.copyValueOf(campoClave.getPassword()),campoUbicacion.getText(),campoTarjeta.getText());   
                ((VentanaPrincipal) getVentanaprincipal()).añadirUsuario(cliente);
              
                }
                Login lgf = new Login();
                lgf.setVentanaprincipal(ventanaprincipal);
                lgf.setVisible(true);
                lgf.setLocationRelativeTo(null);
                this.dispose();
            }
            catch(camposNoRellenados | TarjetaIncorrecta | ubicacionIncorrecta e){
                JOptionPane.showMessageDialog(this, "Error: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
            

            
        
            
       
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void campoErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoErrorActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistro;
    private javax.swing.JPasswordField campoClave;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoError;
    private javax.swing.JTextField campoHorario;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTarjeta;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoUbicacion;
    private javax.swing.JTextField campoWeb;
    private javax.swing.JCheckBox checkTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
        if (tarjeta.length()!=16){
            throw new TarjetaIncorrecta();
        }
    }
     public void verificarUbicacion(String ubicacion)throws ubicacionIncorrecta{ 
        // POR DESGRACIA ESTO NO ES LO SUFICIENTEMENTE ESTRICTO Y ADMITE COMO CORRECTO SI PONES LA COMA EN CUALQUIER SITIO, INCLUSO AL PRINCIPIO, LO CAMBIARE CUANDO TENGA MAS TIEMPO LA SEMANA QUE VIENE    
        if (ubicacion.split(",").length != 2){
            throw new ubicacionIncorrecta();
        }
    }
    public void camposRellenados() throws camposNoRellenados{ // ESTO TIENE QUE HABER ALGUNA FORMA DE EVITAR TODOS ESTOS IF 
        if (checkTienda.isSelected()){ 
            if (campoClave.getPassword().length==0){throw new camposNoRellenados();}
            if (campoDNI.getText().length()==0){throw new camposNoRellenados();}
            if (campoDescripcion.getText().length()==0){throw new camposNoRellenados();}
            if (campoCorreo.getText().length()==0){throw new camposNoRellenados();}
            if (campoHorario.getText().length()==0){throw new camposNoRellenados();}
            if (campoNombre.getText().length()==0){throw new camposNoRellenados();}
            if (campoTarjeta.getText().length()==0){throw new camposNoRellenados();}
            if (campoTelefono.getText().length()==0){throw new camposNoRellenados();}
            if (campoUbicacion.getText().length()==0){throw new camposNoRellenados();}    
            if (campoWeb.getText().length()==0){throw new camposNoRellenados();}   
        } else {
            if (campoClave.getPassword().length==0){throw new camposNoRellenados();}
            if (campoDNI.getText().length()==0){throw new camposNoRellenados();}
            if (campoCorreo.getText().length()==0){throw new camposNoRellenados();}
            if (campoNombre.getText().length()==0){throw new camposNoRellenados();}
            if (campoTarjeta.getText().length()==0){throw new camposNoRellenados();}
            if (campoUbicacion.getText().length()==0){throw new camposNoRellenados();}               
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

class camposNoRellenados extends Exception{
    public camposNoRellenados(){
        super("ERROR: Se deben de rellenar todos los campos");
    }
}