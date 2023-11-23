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


public class AgendaHoraSec extends javax.swing.JFrame {

    public AgendaHoraSec() {
        initComponents();
        this.setLocationRelativeTo(null);  
        this.setResizable(false);
        
        SecretariaView sec = SecretariaView.getInstanciaActual();
        String nombreUsuario = sec.getNombreUsuario();
        lbl_usuario.setText("Bienvenido/a " +nombreUsuario);
    }
    
        private String nombreUsuario;
        private String rutUsuario;
    

    
    public void setRutUsuario(String rutUsuario){
        this.rutUsuario = rutUsuario;
    }
        private int filaSeleccionada = -1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbox_especialidad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbox_medico = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_fechaAgenda = new javax.swing.JTextField();
        btn_agendar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        txt_rutPaciente = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        btn_cerrar_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1424, 787));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Especialidad:");

        cbox_especialidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una especialidad", "Kinesiologo", "Traumatologo", "General" }));
        cbox_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_especialidadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Medico:");

        cbox_medico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_medicoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Rut Paciente:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha:");

        txt_fechaAgenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_agendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_agendar.setText("Agendar");
        btn_agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agendarActionPerformed(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(0, 105, 255));
        jLayeredPane1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Centro Médico Galenos");

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

        btn_actualizar.setText("CITAS");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(0, 0, 0));

        btn_cerrar_sesion.setText("Cerrar Sesion");
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(btn_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel5)))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rutPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbox_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbox_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fechaAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(103, 103, 103)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_cerrar_sesion)
                                .addGap(7, 7, 7)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_rutPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbox_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cbox_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fechaAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1437, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        SecretariaView s = SecretariaView.getInstanciaActual();
        this.setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_agendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendarActionPerformed
        BD bd = new BD();
        Agenda a = new Agenda();
        
        String rutPaciente = txt_rutPaciente.getText();
        String nombreMed = cbox_medico.getSelectedItem().toString();
        String especialidad = cbox_especialidad.getSelectedItem().toString();
        String fecha = txt_fechaAgenda.getText();
        String status = "agendado";
        int numeroAleatorio = new Random().nextInt(8001) + 3000;
        int valorConsulta = (int) (Math.round(numeroAleatorio / 10.0) * 10);
        
        try {
            a.setRutPaciente(rutPaciente);
            a.setNombreMed(nombreMed);
            a.setEspecialidad(especialidad);
            a.setFecha(fecha);
            a.setStatus(status);
            a.setValorConsulta(valorConsulta);
            bd.agendaMedica();
            bd.agendarCita(a);
            bd.actualizarCitas(modelo);
            
            txt_rutPaciente.setText("");
            cbox_especialidad.setSelectedIndex(-1);
            cbox_medico.setSelectedIndex(-1);
            txt_fechaAgenda.setText("");

            JOptionPane.showMessageDialog(null, "Agenda Reservada exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo crear usuario");
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_agendarActionPerformed

    private void cbox_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_medicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_medicoActionPerformed

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

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange

        if (evt.getOldValue() != null) {
            SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
            txt_fechaAgenda.setText(ff.format(jCalendar1.getCalendar().getTime()));
            
        }
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
    
        if (filaSeleccionada >= 0) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar esta cita?", "Confirmar Cancelación", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    String fecha = modelo.getValueAt(filaSeleccionada, 3).toString();
                    String rutPaciente = modelo.getValueAt(filaSeleccionada, 0).toString(); 
                    BD bd = new BD();

                    try {
                        bd.cancelarCita(rutPaciente, fecha);
                        bd.actualizarCitas(modelo);
                        txt_rutPaciente.setText("");
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

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        BD con = new BD();
        try {
            String rut = txt_rutPaciente.getText();
            con.actualizarCitas2(modelo,rut);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaHoraSec.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
                        bd.editarCita(nombreMed,rutMed, especialidad, fechaSalida,rut, fecha2);
                        bd.actualizarCitas2(modelo,rut);
                        txt_rutPaciente.setText("");
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
                    Logger.getLogger(AgendaHoraSec.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una cita para cancelar");
    }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloMouseClicked
    
        filaSeleccionada = modelo.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_modeloMouseClicked

    private void modeloComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_modeloComponentShown
        BD con = new BD();
        try {
            con.actualizarCitas(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaHoraSec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modeloComponentShown

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        Principal pr = new Principal();
        this.setVisible(false);
        pr.setVisible(true);
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaHoraSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaHoraSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaHoraSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaHoraSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaHoraSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agendar;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> cbox_especialidad;
    private javax.swing.JComboBox<String> cbox_medico;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTable modelo;
    private javax.swing.JTextField txt_fechaAgenda;
    private javax.swing.JTextField txt_rutPaciente;
    // End of variables declaration//GEN-END:variables
}
