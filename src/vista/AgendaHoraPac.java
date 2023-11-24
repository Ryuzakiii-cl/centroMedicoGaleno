package vista;

import controlador.Agenda;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.BD;

public class AgendaHoraPac extends javax.swing.JFrame {

    public AgendaHoraPac() {
        initComponents();
        this.setLocationRelativeTo(null);  
        this.setResizable(false);

        
        PacienteView pac = PacienteView.getInstanciaActual();
        String rutUsuario = pac.getRutUsuario();
        txt_rutPaciente.setText(rutUsuario);
        String nombreUsuario = pac.getNombreUsuario();
        lbl_usuario.setText("Bienvenido/a " + nombreUsuario);
                
    }
    
    private int filaSeleccionada = -1;
private BD bd = new BD();  // Crear una única instancia de BD
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new javax.swing.JTable();
        btn_citas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_rutPaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbox_especialidad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbox_medico = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_fechaAgenda = new javax.swing.JTextField();
        btn_agendar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        lbl_usuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 758));
        jPanel1.setRequestFocusEnabled(false);

        jLayeredPane1.setBackground(new java.awt.Color(0, 105, 255));
        jLayeredPane1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGENDA MEDICA");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        modelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeloMouseClicked(evt);
            }
        });
        modelo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                modeloComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(modelo);

        btn_citas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_citas.setText("Citas");
        btn_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Rut Paciente:");

        txt_rutPaciente.setEditable(false);
        txt_rutPaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Especialidad:");

        cbox_especialidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una especialidad", "Kinesiologo", "Traumatologo", "General" }));
        cbox_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_especialidadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Medico:");

        cbox_medico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_medicoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Fecha:");

        txt_fechaAgenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_agendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_agendar.setText("Agendar");
        btn_agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agendarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_back.setText("Atras");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_rutPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fechaAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_rutPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbox_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbox_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_fechaAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btn_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_especialidadActionPerformed
        // TODO add your handling code here:

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

    private void cbox_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_medicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_medicoActionPerformed

    private void btn_agendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendarActionPerformed

        Agenda a = new Agenda();

        
        String rut = txt_rutPaciente.getText();
        String nombreMed = cbox_medico.getSelectedItem().toString();
        String rutMed = null;
        try {
            rutMed = bd.obtenerRutMedico(nombreMed);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaHoraPac.class.getName()).log(Level.SEVERE, null, ex);
        }
        String especialidad = cbox_especialidad.getSelectedItem().toString();
        Date fechaSeleccionada = jCalendar1.getCalendar().getTime();
        SimpleDateFormat formatoDeseado = new SimpleDateFormat("yyyy-MM-dd");
        String fechaAgenda = formatoDeseado.format(fechaSeleccionada);

        String status = "agendado";
        int numeroAleatorio = new Random().nextInt(8001) + 3000;
        int valorConsulta = (int) (Math.round(numeroAleatorio / 10.0) * 10);

        try {
            a.setRutPaciente(rut);
            a.setNombreMed(nombreMed);
            a.setRutMed(rutMed);
            a.setEspecialidad(especialidad);
            a.setFecha(fechaAgenda);
            a.setStatus(status);
            a.setValorConsulta(valorConsulta);
            bd.agendaMedica();
            bd.agendarCita(a);
            bd.actualizarCitasPaciente(modelo,rut);
            bd.desconectar();
            cbox_especialidad.setSelectedIndex(-1);
            cbox_medico.setSelectedIndex(-1);
            txt_fechaAgenda.setText("");

            JOptionPane.showMessageDialog(null, "Cita médica reservada exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo agendar cita");
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_agendarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar esta cita?", "Confirmar Cancelación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                String fecha = modelo.getValueAt(filaSeleccionada, 3).toString();
                String rutPaciente = modelo.getValueAt(filaSeleccionada, 0).toString();
                BD bd = new BD();

                try {
                    bd.cancelarCita(rutPaciente, fecha);
                    bd.actualizarCitasPaciente(modelo,rutPaciente);
                    cbox_especialidad.setSelectedIndex(-1);
                    cbox_medico.setSelectedIndex(-1);
                    txt_fechaAgenda.setText("");
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
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
            
        
            if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Confirma modificacion de la cita?", "Confirmar Modificación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    String fecha = txt_fechaAgenda.getText();
                    SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat formatoSalida = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaParseada = formatoEntrada.parse(fecha);
                    String fechaSalida = formatoSalida.format(fechaParseada);
                    String rut = modelo.getValueAt(filaSeleccionada, 0).toString();
                    String nombreMed = modelo.getValueAt(filaSeleccionada, 1).toString();
                    String especialidad = modelo.getValueAt(filaSeleccionada, 2).toString();
                    String fecha2 = modelo.getValueAt(filaSeleccionada, 3).toString();
                    
                    BD bd = new BD();
                    String rutMed = null;
                    try {
                        rutMed = bd.obtenerRutMedico(nombreMed);
                    } catch (SQLException ex) {
                        Logger.getLogger(AgendaHoraPac.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        bd.editarCita(nombreMed, rutMed,especialidad, fechaSalida, rut, fecha2);
                        bd.actualizarCitasPaciente(modelo,rut);
                        cbox_especialidad.setSelectedIndex(-1);
                        cbox_medico.setSelectedIndex(-1);
                        txt_fechaAgenda.setText("");
                        JOptionPane.showMessageDialog(null, "Cita modificada correctamente");
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al cancelar la cita");
                    }
                    
                    // Restablecer la variable de fila seleccionada después de la cancelación
                    filaSeleccionada = -1;
                } catch (ParseException ex) {
                    Logger.getLogger(AgendaHoraPac.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una cita para cancelar");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        PacienteView p = PacienteView.getInstanciaActual();
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed
            BD con = new BD();
            try {
                String rutPaciente = txt_rutPaciente.getText();
                con.actualizarCitasPaciente(modelo, rutPaciente);
            } 
            catch (SQLException ex) {
                Logger.getLogger(AgendaHoraSec.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btn_citasActionPerformed

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
            if (evt.getOldValue() != null) {
                SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
                txt_fechaAgenda.setText(ff.format(jCalendar1.getCalendar().getTime()));
            }
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void modeloComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_modeloComponentShown
        BD con = new BD();
        try {
            con.actualizarCitas(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaHoraSec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modeloComponentShown

    private void modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloMouseClicked
        filaSeleccionada = modelo.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_modeloMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal pri = new Principal();
        this.setVisible(false);
        pri.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaHoraPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaHoraPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaHoraPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaHoraPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaHoraPac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agendar;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_citas;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> cbox_especialidad;
    private javax.swing.JComboBox<String> cbox_medico;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTable modelo;
    private javax.swing.JTextField txt_fechaAgenda;
    private javax.swing.JTextField txt_rutPaciente;
    // End of variables declaration//GEN-END:variables
}
