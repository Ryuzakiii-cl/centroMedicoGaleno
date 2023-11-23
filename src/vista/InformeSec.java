package vista;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.BD;
import javax.swing.JTable;



public class InformeSec extends javax.swing.JFrame {

    public InformeSec() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        
        SecretariaView sec = SecretariaView.getInstanciaActual();
        String nombreUsuario = sec.getNombreUsuario();
        lbl_usuario.setText("Bienvenido/a " + nombreUsuario);
    }
    private int obtenerTotalRecaudado() {
        String totalTexto = lbl_total.getText().replace("$", "");
        return Integer.parseInt(totalTexto);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo2 = new javax.swing.JTable();
        btn_recaudacion = new javax.swing.JButton();
        cbox_medico = new javax.swing.JComboBox<>();
        btn_filtrar = new javax.swing.JButton();
        cbox_especialidad = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jfecha_end = new com.toedter.calendar.JDateChooser();
        jfecha_start = new com.toedter.calendar.JDateChooser();
        lbl_total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_gi = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        modelo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(modelo2);

        btn_recaudacion.setText("Recaudacion");
        btn_recaudacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recaudacionActionPerformed(evt);
            }
        });

        btn_filtrar.setText("Filtrar");
        btn_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarActionPerformed(evt);
            }
        });

        cbox_especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especialidad", "Kinesiologo", "Traumatologo", "General" }));
        cbox_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_especialidadActionPerformed(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(0, 125, 255));
        jLayeredPane1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORME RECAUDACION");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbl_total.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(0, 0, 0));
        lbl_total.setText("$0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("TOTAL:");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_gi.setText("Generar Informe");
        btn_gi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Centro Médico Galenos");

        jButton1.setText("Cerrar Sesion");

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(924, 924, 924)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jfecha_start, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(jfecha_end, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbox_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_gi, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbox_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39)
                                            .addComponent(btn_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_recaudacion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(185, 185, 185))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btn_recaudacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbox_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbox_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jfecha_end, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jfecha_start, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
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

    private void btn_recaudacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recaudacionActionPerformed
        BD con = new BD();
        try {
            con.informe(modelo2);
            int numrow = modelo2.getRowCount();
            int total = 0;
            for (int i = 0; i < numrow; i++) {
                int val = Integer.parseInt(modelo2.getValueAt(i, 2).toString());
                total += +val;
            }
            lbl_total.setText("$"+Integer.toString(total));
        } 
        catch (SQLException ex) {
            Logger.getLogger(InformeSec.class.getName()).log(Level.SEVERE, null, ex);
        }//fin catch
        
    }//GEN-LAST:event_btn_recaudacionActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        SecretariaView s = SecretariaView.getInstanciaActual();
        this.setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void cbox_especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_especialidadActionPerformed
        String especialidadSeleccionada = (String) cbox_especialidad.getSelectedItem();
        //cree la conexion
        BD bd = new BD();
        try {
            // Conectar a la base de datos
            bd.agendaMedica();

            // Obtener los nombres de los médicos para la especialidad seleccionada
            List<String> nombresCompletosMedicos = bd.obtenerMedicos(especialidadSeleccionada);

            // Limpiar el combo box de médicos antes de cargar nuevos datos
            cbox_medico.removeAllItems();

            // Agregar los nombres de los médicos al combo box
            for (String nombreCompletoMedico : nombresCompletosMedicos) {
                cbox_medico.addItem(nombreCompletoMedico);
            }
        } catch (Exception ex) {
            ex.printStackTrace();  // Imprime la excepción, puedes manejarla de otra manera si lo prefieres
        }
    }//GEN-LAST:event_cbox_especialidadActionPerformed

    private void btn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarActionPerformed
        BD con = new BD();

        String especialidad = cbox_especialidad.getSelectedItem() != null ? cbox_especialidad.getSelectedItem().toString() : "";
        String nombreMed = cbox_medico.getSelectedItem() != null ? cbox_medico.getSelectedItem().toString() : "";
        Date fechaDesdeDate = jfecha_start.getDate();
        String fechaDesdeString = null;

        if (fechaDesdeDate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            fechaDesdeString = sdf.format(fechaDesdeDate);
        }
        Date fechaHastaDate = jfecha_end.getDate();
        String fechaHastaString = null;

        if (fechaHastaDate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            fechaHastaString = sdf.format(fechaHastaDate);
        }

        try {
            con.informeFiltrado(modelo2, especialidad, nombreMed, fechaDesdeString, fechaHastaString);
            int numrow = modelo2.getRowCount();
            int total = 0;
            for (int i = 0; i < numrow; i++) {
                int val = Integer.parseInt(modelo2.getValueAt(i, 2).toString());
                total += val;
            }
            lbl_total.setText("$" + Integer.toString(total));
        } catch (SQLException ex) {
            Logger.getLogger(InformeSec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_filtrarActionPerformed

    private void btn_giActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giActionPerformed
        BD con = new BD();
        int totalRecaudado = obtenerTotalRecaudado();
        con.generarInformePDF(modelo2, totalRecaudado);
    }//GEN-LAST:event_btn_giActionPerformed

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
            java.util.logging.Logger.getLogger(InformeSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformeSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformeSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformeSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformeSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_filtrar;
    private javax.swing.JButton btn_gi;
    private javax.swing.JButton btn_recaudacion;
    private javax.swing.JComboBox<String> cbox_especialidad;
    private javax.swing.JComboBox<String> cbox_medico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jfecha_end;
    private com.toedter.calendar.JDateChooser jfecha_start;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTable modelo2;
    // End of variables declaration//GEN-END:variables
}
