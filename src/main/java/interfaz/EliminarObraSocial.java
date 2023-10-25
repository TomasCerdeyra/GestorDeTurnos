package interfaz;


import logica.obraSocial;
import logica.obraSocial.ObraSocial;
import static logica.obraSocial.listaObraSocial;

public class EliminarObraSocial extends javax.swing.JFrame {

    public EliminarObraSocial() {
        initComponents();

        for (obraSocial.ObraSocial obra : obraSocial.listaObraSocial) {
            cmbObrasSociales.addItem(obra.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnVolverMenuForm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbObrasSociales = new javax.swing.JComboBox<>();
        btnConfirmarEliminarOS = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnVolverMenuForm3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setForeground(new java.awt.Color(0, 153, 204));

        btnVolverMenuForm.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverMenuForm.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverMenuForm.setText("volver");
        btnVolverMenuForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuFormActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Obra Social");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverMenuForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverMenuForm)
                .addContainerGap(77, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar Obra Social");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de la Obra Social:");

        cmbObrasSociales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbObrasSociales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbObrasSocialesActionPerformed(evt);
            }
        });

        btnConfirmarEliminarOS.setText("Confirmar");
        btnConfirmarEliminarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarEliminarOSActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setForeground(new java.awt.Color(0, 153, 204));

        btnVolverMenuForm3.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverMenuForm3.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverMenuForm3.setText("volver");
        btnVolverMenuForm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuForm3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eliminar Obra Social");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverMenuForm3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(65, 65, 65))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverMenuForm3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbObrasSociales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmarEliminarOS)
                .addGap(25, 25, 25))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbObrasSociales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnConfirmarEliminarOS)
                .addGap(25, 25, 25))
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

    private void btnVolverMenuFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuFormActionPerformed
        ObrasSociales volverMenuForm = new ObrasSociales();
        volverMenuForm.setVisible(true);
        volverMenuForm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverMenuFormActionPerformed

    private void btnConfirmarEliminarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarEliminarOSActionPerformed
        String nombreELiminar = cmbObrasSociales.getSelectedItem().toString();
        
        for (ObraSocial obraSocial : listaObraSocial) {
            if (obraSocial.getNombre().equals(nombreELiminar)) {
                listaObraSocial.remove(obraSocial);
                break;
            }
        }
      
        ObrasSociales volverMenuForm = new ObrasSociales();
        volverMenuForm.setVisible(true);
        volverMenuForm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnConfirmarEliminarOSActionPerformed

    private void btnVolverMenuForm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuForm3ActionPerformed
        ObrasSociales volverMenuForm = new ObrasSociales();
        volverMenuForm.setVisible(true);
        volverMenuForm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverMenuForm3ActionPerformed

    private void cmbObrasSocialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbObrasSocialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbObrasSocialesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarEliminarOS;
    private javax.swing.JButton btnVolverMenuForm;
    private javax.swing.JButton btnVolverMenuForm3;
    private javax.swing.JComboBox<String> cmbObrasSociales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
