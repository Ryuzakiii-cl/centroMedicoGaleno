package vista;

import controlador.Usuarios;
import javax.swing.JOptionPane;
import modelo.BD;

public class AdministradorView extends javax.swing.JFrame {
    private static AdministradorView instanciaActual;
    public AdministradorView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        instanciaActual = this;
                this.setExtendedState(MAXIMIZED_BOTH);
        
        AdministradorView adm = AdministradorView.getInstanciaActual();
        String nombreUsuario = adm.getNombreusuario();
        
    }
        private String nombreUsuario;
        
        public static AdministradorView getInstanciaActual(){
            return instanciaActual;
        }
        
        public void setNombreUsuario(String nombreUsuario){
            this.nombreUsuario = nombreUsuario;
            lbl_usuario.setText("Bienvenido " + nombreUsuario + " Maestro de los Maestros");
        }
        
        public String getNombreusuario(){
            return this.nombreUsuario;
        }
    


        
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        jLabel_name = new javax.swing.JLabel();
        jLabel_lname = new javax.swing.JLabel();
        jLabel_rutt = new javax.swing.JLabel();
        jLabel_adress = new javax.swing.JLabel();
        jLabel_fono = new javax.swing.JLabel();
        jLabel_correo = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_rutt = new javax.swing.JTextField();
        txt_adress = new javax.swing.JTextField();
        txt_fono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        registro = new javax.swing.JLabel();
        btn_registro = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        lbl_rol = new javax.swing.JLabel();
        lbl_especialidad = new javax.swing.JLabel();
        cbox_rol = new javax.swing.JComboBox<>();
        cbox_especialidad = new javax.swing.JComboBox<>();
        lbl_usuario = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        logo.setText("Centro Médico Galenos");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 407, 82));

        banner.setBackground(new java.awt.Color(0, 153, 255));
        banner.setOpaque(true);
        jPanel1.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1505, 60));

        jLabel_name.setText("Nombre:");
        jPanel1.add(jLabel_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 53, -1));

        jLabel_lname.setText("Apellido:");
        jPanel1.add(jLabel_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 53, -1));

        jLabel_rutt.setText("Rut:");
        jPanel1.add(jLabel_rutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 53, -1));

        jLabel_adress.setText("Dirección:");
        jPanel1.add(jLabel_adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        jLabel_fono.setText("Telefono:");
        jPanel1.add(jLabel_fono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 53, -1));

        jLabel_correo.setText("Correo:");
        jPanel1.add(jLabel_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 51, -1));

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 220, -1));
        jPanel1.add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 220, -1));
        jPanel1.add(txt_rutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 220, -1));
        jPanel1.add(txt_adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 220, -1));
        jPanel1.add(txt_fono, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 220, -1));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 220, -1));

        registro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registro.setText("Registro De Usuario");
        registro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        registro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 440, 442));

        btn_registro.setText("Registrar");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 690, 120, -1));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 690, 120, -1));

        lbl_rol.setText("Rol:");
        jPanel1.add(lbl_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, -1, -1));

        lbl_especialidad.setText("Especialiad");
        jPanel1.add(lbl_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, -1));

        cbox_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione rol...", "Medico", "Secretaria", "paciente", "administrador" }));
        jPanel1.add(cbox_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 220, -1));

        cbox_especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione especialidad...", "Kinesiologo", "Traumatologo", "General", "paciente", "Secretaria" }));
        jPanel1.add(cbox_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 220, -1));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 480, 59));

        btn_cerrar.setText("Cerrar Sesion");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, 121, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        // TODO add your handling code here:
        BD bd = new BD();
        Usuarios u = new Usuarios();

        String nombre = txt_name.getText();
        String apellido = txt_lname.getText();
        String rut = txt_rutt.getText();
        String direccion = txt_adress.getText();
        String telefono = txt_fono.getText();
        String correo = txt_correo.getText();
        String rol = cbox_rol.getSelectedItem().toString();
        String especialidad = cbox_especialidad.getSelectedItem().toString();

        //validacion
        if (nombre.isEmpty() ||
            apellido.isEmpty() ||
            rut.isEmpty() ||
            direccion.isEmpty() ||
            telefono.isEmpty() ||
            correo.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            try {
                u.setNombre(nombre);
                u.setApellido(apellido);
                u.setRut(rut);
                u.setDireccion(direccion);
                u.setTelefono(telefono);
                u.setCorreo(correo);
                u.setRol(rol);
                u.setEspecialidad(especialidad);
                bd.agendaMedica();
                bd.registrar(u);

                txt_name.setText("");
                txt_lname.setText("");
                txt_rutt.setText("");
                txt_adress.setText("");
                txt_fono.setText("");
                txt_correo.setText("");
                cbox_rol.setSelectedIndex(0);
                cbox_especialidad.setSelectedIndex(0);

                JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo crear usuario"+ e);
            }
        }
    }//GEN-LAST:event_btn_registroActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        txt_name.setText("");
        txt_lname.setText("");
        txt_rutt.setText("");
        txt_adress.setText("");
        txt_fono.setText("");
        txt_correo.setText("");
        cbox_especialidad.setSelectedIndex(0);
        cbox_rol.setSelectedIndex(0);

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        Principal pri = new Principal();
        this.setVisible(false);
        pri.setVisible(true);
    }//GEN-LAST:event_btn_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registro;
    private javax.swing.JComboBox<String> cbox_especialidad;
    private javax.swing.JComboBox<String> cbox_rol;
    private javax.swing.JLabel jLabel_adress;
    private javax.swing.JLabel jLabel_correo;
    private javax.swing.JLabel jLabel_fono;
    private javax.swing.JLabel jLabel_lname;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_rutt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_especialidad;
    private javax.swing.JLabel lbl_rol;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel registro;
    private javax.swing.JTextField txt_adress;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_fono;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_rutt;
    // End of variables declaration//GEN-END:variables
}
