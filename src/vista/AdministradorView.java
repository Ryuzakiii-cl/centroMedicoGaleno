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

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(0, 0, 0));
        logo.setText("Centro Médico Galenos");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 407, 82));

        banner.setBackground(new java.awt.Color(0, 153, 255));
        banner.setOpaque(true);
        jPanel1.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1505, 60));

        jLabel_name.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_name.setText("Nombre:");
        jPanel1.add(jLabel_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 286, 53, -1));

        jLabel_lname.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_lname.setText("Apellido:");
        jPanel1.add(jLabel_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 326, 53, -1));

        jLabel_rutt.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_rutt.setText("Rut:");
        jPanel1.add(jLabel_rutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 366, 53, -1));

        jLabel_adress.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_adress.setText("Dirección:");
        jPanel1.add(jLabel_adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 406, -1, -1));

        jLabel_fono.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_fono.setText("Telefono:");
        jPanel1.add(jLabel_fono, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 446, 53, -1));

        jLabel_correo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_correo.setText("Correo:");
        jPanel1.add(jLabel_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 486, 51, -1));

        txt_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 283, 220, -1));

        txt_lname.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 323, 220, -1));

        txt_rutt.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_rutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 363, 220, -1));

        txt_adress.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 403, 220, -1));

        txt_fono.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_fono, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 443, 220, -1));

        txt_correo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 483, 220, -1));

        registro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        registro.setForeground(new java.awt.Color(0, 0, 0));
        registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registro.setText("Registro De Usuario");
        registro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        registro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 440, 442));

        btn_registro.setBackground(new java.awt.Color(255, 255, 255));
        btn_registro.setForeground(new java.awt.Color(0, 0, 0));
        btn_registro.setText("Registrar");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 690, 120, -1));

        btn_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 690, 120, -1));

        lbl_rol.setForeground(new java.awt.Color(0, 0, 0));
        lbl_rol.setText("Rol:");
        jPanel1.add(lbl_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 534, -1, -1));

        lbl_especialidad.setForeground(new java.awt.Color(0, 0, 0));
        lbl_especialidad.setText("Especialiad");
        jPanel1.add(lbl_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 578, -1, -1));

        cbox_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione rol...", "Medico", "Secretaria", "paciente", "administrador" }));
        jPanel1.add(cbox_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 531, 220, -1));

        cbox_especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione especialidad...", "Kinesiologo", "Traumatologo", "General", "paciente", "Secretaria" }));
        jPanel1.add(cbox_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 575, 220, -1));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 40, 480, 59));

        btn_cerrar.setText("Cerrar Sesion");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 60, 121, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );

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
