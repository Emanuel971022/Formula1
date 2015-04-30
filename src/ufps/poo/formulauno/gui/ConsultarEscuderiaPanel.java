package ufps.poo.formulauno.gui;

import ufps.poo.formulauno.negocio.Formula1;

public class ConsultarEscuderiaPanel extends javax.swing.JPanel {

    private Formula1 form1;
    
    public ConsultarEscuderiaPanel(Formula1 form1) {
        initComponents();
        this.form1 = form1;
        
        String nombre[] = this.form1.concatenarNombreEscuderia().split("-");
        this.cmbNombreEscuderia.removeAllItems();
        
        for(String x:nombre)
            this.cmbNombreEscuderia.addItem(x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEscuderia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaConsultaEscuderia = new javax.swing.JTextArea();
        cmdConsultarEscuderia = new javax.swing.JButton();
        cmbNombreEscuderia = new javax.swing.JComboBox();
        cmdConsultarxEscuderia = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 212, 238));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Consultar escuderia");

        jLabel2.setText("Ingrese el nombre de una escudería");

        jLabel3.setText("Nombre de escudería: ");

        txtAreaConsultaEscuderia.setColumns(20);
        txtAreaConsultaEscuderia.setRows(5);
        jScrollPane1.setViewportView(txtAreaConsultaEscuderia);

        cmdConsultarEscuderia.setText("Consultar");
        cmdConsultarEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConsultarEscuderiaActionPerformed(evt);
            }
        });

        cmdConsultarxEscuderia.setText("Consultar");
        cmdConsultarxEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConsultarxEscuderiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbNombreEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdConsultarxEscuderia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdConsultarEscuderia)))
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
                    .addComponent(txtNombreEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdConsultarEscuderia)
                    .addComponent(cmbNombreEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdConsultarxEscuderia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdConsultarEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConsultarEscuderiaActionPerformed
        String nombre = this.txtNombreEscuderia.getText();
        this.txtNombreEscuderia.setText("");
        
        if(nombre.isEmpty()){
            Ventana.imp("Debe ingresar un nombre", "Sistema");
            return;
        }
        
        String mensaje =this.form1.consultarEscuderia(nombre);
        this.txtAreaConsultaEscuderia.setText("Escudería\n\n"+mensaje);
    }//GEN-LAST:event_cmdConsultarEscuderiaActionPerformed

    private void cmdConsultarxEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConsultarxEscuderiaActionPerformed
        String nombre = this.cmbNombreEscuderia.getSelectedItem().toString();
        
        String mensaje = this.form1.consultarEscuderia(nombre);
        this.txtAreaConsultaEscuderia.setText("Escudería\n\n"+mensaje);
    }//GEN-LAST:event_cmdConsultarxEscuderiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbNombreEscuderia;
    private javax.swing.JButton cmdConsultarEscuderia;
    private javax.swing.JButton cmdConsultarxEscuderia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaConsultaEscuderia;
    private javax.swing.JTextField txtNombreEscuderia;
    // End of variables declaration//GEN-END:variables
}
