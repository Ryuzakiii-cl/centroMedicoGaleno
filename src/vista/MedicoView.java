/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.BD;

/**
 *
 * @author Criiiis
 */
public class MedicoView extends javax.swing.JFrame {
    private static MedicoView instanciaActual;

    /**
     * Creates new form MedicoView
     */
    public MedicoView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        instanciaActual = this;
        
        MedicoView pac = MedicoView.getInstanciaActual();
        String rutUsuario = pac.getRutUsuario();
        
        
    }

         private int filaSeleccionada = -1;
    
        private String nombreUsuario;
        private String rutUsuario;
        private String apellidoUsuario;

        public static MedicoView getInstanciaActual() {
        return instanciaActual;
    }
        
    public void setNombreUsuario(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
            jlabel_usuario.setText("Bienvenido/a " + nombreUsuario);

    }
    public void setRutUsuario(String rutUsuario) {
            this.rutUsuario = rutUsuario;
    }
    public void setApellidoUsuario(String apellidoUsuario) {
            this.apellidoUsuario = apellidoUsuario;
    }

    public String getApellidoUsuario() {
            return this.apellidoUsuario;
    }


    public String getNombreUsuario() {
            return this.nombreUsuario;
    }

    public String getRutUsuario() {
            return rutUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jlabel_usuario = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        btn_pagos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo2 = new javax.swing.JTable();
        btn_finalizar = new javax.swing.JButton();
        btn_citas = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Centro Médico Galenos");

        jlabel_usuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabel_usuario.setForeground(new java.awt.Color(0, 0, 0));

        jLayeredPane1.setBackground(new java.awt.Color(0, 105, 255));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Atencion");
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 188, 50));

        btn_pagos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pagos.setForeground(new java.awt.Color(0, 0, 0));
        btn_pagos.setText("Pagos");
        btn_pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btn_pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 190, 50));

        modelo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        modelo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo2MouseClicked(evt);
            }
        });
        modelo2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                modelo2ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(modelo2);

        btn_finalizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_finalizar.setForeground(new java.awt.Color(0, 0, 0));
        btn_finalizar.setText("Finalizar Atencion");
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        btn_citas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_citas.setForeground(new java.awt.Color(0, 0, 0));
        btn_citas.setText("ATENCION");
        btn_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citasActionPerformed(evt);
            }
        });

        btn_cerrar.setText("Cerrar Sesion");
        btn_cerrar.setToolTipText("");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(424, 424, 424)
                .addComponent(jlabel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addComponent(jLayeredPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(582, 582, 582))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(632, 632, 632))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btn_cerrar)))
                .addGap(42, 42, 42)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed

                BD con = new BD();
        try {

            con.informeFiltradoMedico(modelo2); // 
        } catch (SQLException ex) {
            Logger.getLogger(MedicoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_citasActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        if (filaSeleccionada >= 0) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Finalizar Atención?", "Confirmar", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    String nombre = modelo2.getValueAt(filaSeleccionada, 0).toString();
                    String apellido = modelo2.getValueAt(filaSeleccionada, 1).toString(); 
                    BD bd = new BD();

                    try {
                        bd.editarCitaMedico(nombre, apellido);
                        bd.informeFiltradoMedico(modelo2);
                        JOptionPane.showMessageDialog(null, "Cita cancelada correctamente");
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al cancelar la cita");
                    }

                    // Restablecer la variable de fila seleccionada después de la cancelación
                    filaSeleccionada = -1;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una cita para cancelar");
            }
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void modelo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelo2MouseClicked
            filaSeleccionada = modelo2.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_modelo2MouseClicked

    private void modelo2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_modelo2ComponentShown
            BD con = new BD();
            try {
                con.actualizarCitas(modelo2);
            } catch (SQLException ex) {
                Logger.getLogger(AgendaHoraSec.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_modelo2ComponentShown

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        Principal p = new Principal();
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagosActionPerformed
        InformeMec mec = new InformeMec();
        this.setVisible(false);
        mec.setVisible(true);
    }//GEN-LAST:event_btn_pagosActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_citas;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_pagos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel_usuario;
    private javax.swing.JTable modelo2;
    // End of variables declaration//GEN-END:variables
}
