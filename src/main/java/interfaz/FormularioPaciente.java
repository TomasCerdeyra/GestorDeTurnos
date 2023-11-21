package interfaz;

import javax.swing.JOptionPane;
import logica.obraSocial;
import logica.paciente;

public class FormularioPaciente extends javax.swing.JFrame {

    public FormularioPaciente() {
        initComponents();
        for (obraSocial.ObraSocial obra : obraSocial.listaObraSocial) {
            cmbObraSocialPass.addItem(obra.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        txtDniPass = new javax.swing.JTextField();
        txtEdadPass = new javax.swing.JTextField();
        txtApellidopas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefonoPas = new javax.swing.JTextField();
        txtNombrePas = new javax.swing.JTextField();
        btnGuardarTurno = new javax.swing.JButton();
        cbxSexoPas = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnVolverMenuForm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbObraSocialPass = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        txtEdadPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadPassActionPerformed(evt);
            }
        });

        jLabel2.setText("Sexo del paciente :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Datos del Paciente");

        txtNombrePas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePasActionPerformed(evt);
            }
        });

        btnGuardarTurno.setBackground(new java.awt.Color(0, 153, 204));
        btnGuardarTurno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarTurno.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarTurno.setText("Guardar paciente");
        btnGuardarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTurnoActionPerformed(evt);
            }
        });

        cbxSexoPas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxSexoPas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        cbxSexoPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoPasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));

        btnVolverMenuForm.setText("volver");
        btnVolverMenuForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuFormActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverMenuForm)
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverMenuForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Nombre del paciente :");

        jLabel6.setText("Apellido del paciente :");

        jLabel7.setText("DNI del paciente :");

        jLabel8.setText("Edad del paciente :");

        jLabel9.setText("Numero de telefono :");

        cmbObraSocialPass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ninguna" }));
        cmbObraSocialPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbObraSocialPassActionPerformed(evt);
            }
        });

        jLabel4.setText("Obra Social del paciente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxSexoPas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombrePas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDniPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdadPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidopas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoPas)
                            .addComponent(cmbObraSocialPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(btnGuardarTurno)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidopas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDniPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEdadPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbxSexoPas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbObraSocialPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefonoPas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnGuardarTurno)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePasActionPerformed

    private void btnGuardarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTurnoActionPerformed

        String nombre = txtNombrePas.getText();
        String apellido = txtApellidopas.getText();
        String telefono = txtTelefonoPas.getText();
        String dni = txtDniPass.getText();
        String edad = txtEdadPass.getText();
        String obraSocial = cmbObraSocialPass.getSelectedItem().toString();
        String sexo = cbxSexoPas.getSelectedItem().toString();
        
        paciente.Pacientes verificarPaciente = paciente.buscarPorDni(dni);

        if (txtNombrePas.getText().isEmpty() || txtApellidopas.getText().isEmpty() || txtTelefonoPas.getText().isEmpty() || txtDniPass.getText().isEmpty() || txtEdadPass.getText().isEmpty() || obraSocial.equals("Seleccionar") || sexo.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(this, "Asegúrese de completar todos los datos del paciente.");
        } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras.");
        } else if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            JOptionPane.showMessageDialog(this, "El apellido solo puede contener letras.");
        } else if (!telefono.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Número de teléfono inválido. Debe contener 10 dígitos.");
        } else if (Integer.parseInt(edad) > 120 || Integer.parseInt(edad) < 0 ) {
            JOptionPane.showMessageDialog(this, "La edad tiene que ser entre 0 y 120");
        } else if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "Número de DNI inválido. Debe contener 8 dígitos.");
        } else if (verificarPaciente !=  null) {
            JOptionPane.showMessageDialog(this, "El paciente ya existe");
        } else {
            paciente.Pacientes nuevoPaciente = new paciente.Pacientes(nombre, apellido, telefono, dni, obraSocial, edad, sexo);

            paciente.listaPacientes.add(nuevoPaciente);

            Pacientes volvermenu2 = new Pacientes();
            volvermenu2.setVisible(true);
            volvermenu2.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnGuardarTurnoActionPerformed

    private void cbxSexoPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoPasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexoPasActionPerformed

    private void btnVolverMenuFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuFormActionPerformed
        Pacientes volverMenuForm = new Pacientes();
        volverMenuForm.setVisible(true);
        volverMenuForm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverMenuFormActionPerformed

    private void txtEdadPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadPassActionPerformed

    private void cmbObraSocialPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbObraSocialPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbObraSocialPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarTurno;
    private javax.swing.JButton btnVolverMenuForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxSexoPas;
    private javax.swing.JComboBox<String> cmbObraSocialPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidopas;
    private javax.swing.JTextField txtDniPass;
    private javax.swing.JTextField txtEdadPass;
    private javax.swing.JTextField txtNombrePas;
    private javax.swing.JTextField txtTelefonoPas;
    // End of variables declaration//GEN-END:variables
}
