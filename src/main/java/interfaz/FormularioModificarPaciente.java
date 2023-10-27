package interfaz;

import javax.swing.JOptionPane;
import logica.obraSocial;
import logica.paciente;

public class FormularioModificarPaciente extends javax.swing.JFrame {

    public FormularioModificarPaciente() {
        initComponents();

        for (obraSocial.ObraSocial obra : obraSocial.listaObraSocial) {
            cmbObraSocialPass.addItem(obra.getNombre());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTelefonoPas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombrePas = new javax.swing.JTextField();
        cmbObraSocialPass = new javax.swing.JComboBox<>();
        btnGuardarTurno = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxSexoPas5 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnVolverMenuForm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDniPass = new javax.swing.JTextField();
        txtEdadPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidopas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel9.setText("Numero de telefono :");

        txtNombrePas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePasActionPerformed(evt);
            }
        });

        cmbObraSocialPass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ninguna" }));
        cmbObraSocialPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbObraSocialPassActionPerformed(evt);
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

        jLabel4.setText("Obra Social del paciente:");

        cbxSexoPas5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxSexoPas5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        cbxSexoPas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoPas5ActionPerformed(evt);
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
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverMenuForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtEdadPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadPassActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre del paciente :");

        jLabel6.setText("Apellido del paciente :");

        jLabel2.setText("Sexo del paciente :");

        jLabel7.setText("DNI del paciente :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Datos del Paciente");

        jLabel8.setText("Edad del paciente :");

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
                            .addComponent(cbxSexoPas5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombrePas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDniPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdadPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidopas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoPas)
                            .addComponent(cmbObraSocialPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(btnGuardarTurno)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(cbxSexoPas5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbObraSocialPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefonoPas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnGuardarTurno)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePasActionPerformed

    private void cmbObraSocialPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbObraSocialPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbObraSocialPassActionPerformed

    private void btnGuardarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTurnoActionPerformed
        if (txtNombrePas.getText().isEmpty() || txtApellidopas.getText().isEmpty() || txtTelefonoPas.getText().isEmpty() || txtDniPass.getText().isEmpty() || txtEdadPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Asegúrese de completar todos los datos del paciente.");
        } else {
        paciente.Pacientes nuevoPaciente = new paciente.Pacientes(txtNombrePas.getText(), txtApellidopas.getText(),
                txtTelefonoPas.getText(), txtDniPass.getText(), cmbObraSocialPass.getSelectedItem().toString(), txtEdadPass.getText(), cbxSexoPas5.getSelectedItem().toString());

        paciente.listaPacientes.add(nuevoPaciente);

        // Después de agregar el paciente, muestro la pantalla
        GestionarPacientes volvermenu2 = new GestionarPacientes();
        volvermenu2.setVisible(true);
        volvermenu2.setLocationRelativeTo(null);
        this.setVisible(false);

        for (paciente.Pacientes p : paciente.listaPacientes) {
            System.out.println(p.toString());
        }
        }

    }//GEN-LAST:event_btnGuardarTurnoActionPerformed

    private void cbxSexoPas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoPas5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexoPas5ActionPerformed

    private void btnVolverMenuFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuFormActionPerformed
        Pacientes volverMenuForm = new Pacientes();
        volverMenuForm.setVisible(true);
        volverMenuForm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverMenuFormActionPerformed

    private void txtEdadPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarTurno;
    private javax.swing.JButton btnVolverMenuForm;
    public javax.swing.JComboBox<String> cbxSexoPas5;
    public javax.swing.JComboBox<String> cmbObraSocialPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtApellidopas;
    public javax.swing.JTextField txtDniPass;
    public javax.swing.JTextField txtEdadPass;
    public javax.swing.JTextField txtNombrePas;
    public javax.swing.JTextField txtTelefonoPas;
    // End of variables declaration//GEN-END:variables
}
