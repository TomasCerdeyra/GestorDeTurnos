package interfaz;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import logica.paciente;

public class GestionarPacientes extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();

    public GestionarPacientes() {
        initComponents();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Dni");
        model.addColumn("Edad");
        model.addColumn("Obra Social");
        model.addColumn("Sexo");
        model.addColumn("Tel");

        RegistrarTabla();

    }

    private void RegistrarTabla() {
        for (paciente.Pacientes p : paciente.listaPacientes) {
            Object a[] = new Object[7];
            a[0] = p.getNombre();
            a[1] = p.getApellido();
            a[2] = p.getDni();
            a[3] = p.getEdad();
            a[4] = p.getObraSocial();
            a[5] = p.getSexo();
            a[6] = p.getTelefono();
            model.addRow(a);
        }
        tblListPacientes.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        ModificarPaciente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblListPacientes = new javax.swing.JTable();

        jScrollPane2.setViewportView(jEditorPane1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ModificarPaciente.setText("Modificar Paciente");
        ModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPacienteActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Paciente");

        jButton3.setText("volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblListPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", ""},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Edad", "Obra social", "Sexo", "Tel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListPacientes.setToolTipText("");
        tblListPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListPacientesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblListPacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(154, 154, 154)
                .addComponent(ModificarPaciente)
                .addGap(151, 151, 151)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(ModificarPaciente))))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Pacientes volvermenu2 = new Pacientes();
        volvermenu2.setVisible(true);
        volvermenu2.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed


    private void ModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPacienteActionPerformed

        if (tblListPacientes.getSelectedRow() == -1) {
            return;
        }

        FormularioModificarPaciente x = new FormularioModificarPaciente();

        Vector registro;

        registro = (Vector) model.getDataVector().elementAt(tblListPacientes.getSelectedRow());
        //-------------------------------------Busqueda de Selector ComboBox--------------------------------------------------------
        // Obtengo el ell sexo seleccionado en la tabla
        String sexoSeleccionado = registro.elementAt(5).toString().trim();

        // Agarro el indice que es igual al sexoSleccionado
        int indexSexo = -1;
        for (int i = 0; i < x.cbxSexoPas5.getItemCount(); i++) {
            if (x.cbxSexoPas5.getItemAt(i).equals(sexoSeleccionado)) {
                indexSexo = i;
                break;
            }
        }

        // Obtengo La obra Social seleccionado en la tabla
        String obraSocialSeleccionado = registro.elementAt(4).toString().trim();
        
        
        // Agarro el indice que es igual al sexoSleccionado
        int indexObraSocial = -1;
        for (int i = 0; i < x.cmbObraSocialPass.getItemCount(); i++) {
            if (x.cmbObraSocialPass.getItemAt(i).trim().equals(obraSocialSeleccionado)) {
                indexObraSocial = i;
                break;
            }
        }
        //-------------------------------------Fin Busqueda de Selector ComboBox--------------------------------------------------------
        //Elimino el paciente viejo
        String DNI = registro.elementAt(2).toString();
        paciente.listaPacientes.remove(paciente.buscarPorDni(DNI));
        
        x.txtNombrePas.setText(registro.elementAt(0).toString());
        x.txtApellidopas.setText(registro.elementAt(1).toString());
        x.txtDniPass.setText(registro.elementAt(2).toString());
        x.txtEdadPass.setText(registro.elementAt(3).toString());
        x.cbxSexoPas5.setSelectedIndex(indexSexo); // Para asegurarte de que es un String
        x.cmbObraSocialPass.setSelectedIndex(indexObraSocial);
        x.txtTelefonoPas.setText(registro.elementAt(6).toString());

        x.setVisible(true);
        this.setVisible(false);
        if (x.getRootPane() != null) {

            Vector v = new Vector();
            v.addElement(x.txtNombrePas.getText());
            v.addElement(x.txtApellidopas.getText());
            v.addElement(x.txtDniPass.getText());
            v.addElement(x.txtEdadPass.getText());
            v.addElement(x.cbxSexoPas5.getSelectedItem().toString());
            v.addElement(x.cmbObraSocialPass.getSelectedItem().toString());
            v.addElement(x.txtTelefonoPas.getText());

            model.getDataVector().set(tblListPacientes.getSelectedRow(), v);
            tblListPacientes.updateUI();
        }


    }//GEN-LAST:event_ModificarPacienteActionPerformed

    private void tblListPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListPacientesMouseClicked


    }//GEN-LAST:event_tblListPacientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModificarPaciente;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tblListPacientes;
    // End of variables declaration//GEN-END:variables
}
