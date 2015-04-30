package ufps.poo.formulauno.gui;

import ufps.poo.formulauno.negocio.Formula1;

public class ConsultarPilotoPanel extends javax.swing.JPanel {

    private Formula1 form1;
    
    public ConsultarPilotoPanel(Formula1 form1) {
        initComponents();
        this.form1 = form1;
        
        String nombre[] = this.form1.concatenarNombresPiloto().split("-");
        this.cmbNombrePiloto.removeAllItems();
        
        for(String x:nombre)
            this.cmbNombrePiloto.addItem(x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombrePiloto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaConsultaPiloto = new javax.swing.JTextArea();
        cmdConsultarPiloto = new javax.swing.JButton();
        cmbNombrePiloto = new javax.swing.JComboBox();
        cmdConsultarPilotoxCombo = new javax.swing.JButton();

        setBackground(new java.awt.Color(189, 203, 228));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Consultar pilotos");

        jLabel2.setText("Ingrese el nombre de un piloto");

        jLabel3.setText("Nombre del piloto: ");

        txtAreaConsultaPiloto.setColumns(20);
        txtAreaConsultaPiloto.setRows(5);
        jScrollPane1.setViewportView(txtAreaConsultaPiloto);

        cmdConsultarPiloto.setText("Consultar");
        cmdConsultarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConsultarPilotoActionPerformed(evt);
            }
        });

        cmdConsultarPilotoxCombo.setText("Consultar");
        cmdConsultarPilotoxCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConsultarPilotoxComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombrePiloto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbNombrePiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdConsultarPilotoxCombo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdConsultarPiloto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrePiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdConsultarPiloto)
                    .addComponent(cmbNombrePiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdConsultarPilotoxCombo))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdConsultarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConsultarPilotoActionPerformed
        String nombre = this.txtNombrePiloto.getText();
        this.txtNombrePiloto.setText("");

        if(nombre.isEmpty()){
            Ventana.imp("Debe ingresar un nombre", "Sistema");
            return;
        }

        String mensaje =this.form1.consultarPiloto(nombre);
        this.txtAreaConsultaPiloto.setText("Piloto\n\n"+mensaje);
    }//GEN-LAST:event_cmdConsultarPilotoActionPerformed

    private void cmdConsultarPilotoxComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConsultarPilotoxComboActionPerformed
        String nombre = this.cmbNombrePiloto.getSelectedItem().toString();
        
        String mensaje = this.form1.consultarPiloto(nombre);
        this.txtAreaConsultaPiloto.setText("Piloto\n\n"+mensaje);
    }//GEN-LAST:event_cmdConsultarPilotoxComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbNombrePiloto;
    private javax.swing.JButton cmdConsultarPiloto;
    private javax.swing.JButton cmdConsultarPilotoxCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaConsultaPiloto;
    private javax.swing.JTextField txtNombrePiloto;
    // End of variables declaration//GEN-END:variables
}
