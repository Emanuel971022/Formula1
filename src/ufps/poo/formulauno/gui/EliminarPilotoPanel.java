package ufps.poo.formulauno.gui;

import ufps.poo.formulauno.negocio.Formula1;

public class EliminarPilotoPanel extends javax.swing.JPanel {

    private Formula1 form1;
    
    public EliminarPilotoPanel(Formula1 form1) {
        initComponents();
        this.form1 = form1;
        this.ActualizarComboEscuderia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbEscuderiaEliminarPiloto = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbPilotosEliminar = new javax.swing.JComboBox();
        cmdEliminarPilotos = new javax.swing.JButton();

        setBackground(new java.awt.Color(171, 255, 227));

        cmbEscuderiaEliminarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEscuderiaEliminarPilotoActionPerformed(evt);
            }
        });

        jLabel1.setText("Escuderias: ");

        jLabel2.setText("Pilotos: ");

        cmdEliminarPilotos.setText("Eliminar");
        cmdEliminarPilotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarPilotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdEliminarPilotos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPilotosEliminar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEscuderiaEliminarPiloto, 0, 168, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbEscuderiaEliminarPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPilotosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdEliminarPilotos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEliminarPilotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarPilotosActionPerformed
        String nombreEscuderia = this.cmbEscuderiaEliminarPiloto.getSelectedItem().toString();
        String nombrePiloto = this.cmbPilotosEliminar.getSelectedItem().toString();
        
        String mensaje = this.form1.eliminarPiloto(nombreEscuderia, nombrePiloto);
        Ventana.imp(mensaje, "Sistema");
        
        this.ActualizarComboEscuderia();
        this.ActualizarComboPiloto(nombreEscuderia);
    }//GEN-LAST:event_cmdEliminarPilotosActionPerformed

    private void cmbEscuderiaEliminarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEscuderiaEliminarPilotoActionPerformed
        String nombre = this.cmbEscuderiaEliminarPiloto.getSelectedItem().toString();
        ActualizarComboPiloto(nombre);
    }//GEN-LAST:event_cmbEscuderiaEliminarPilotoActionPerformed
    
    private void ActualizarComboEscuderia(){
        String nombre[] = this.form1.concatenarNombreEscuderia().split("-");
        this.cmbEscuderiaEliminarPiloto.removeAllItems();
        
        for(String x: nombre)
            this.cmbEscuderiaEliminarPiloto.addItem(x);
    }
    
    private void ActualizarComboPiloto(String nombre){
        String name[] = this.form1.concatenarNombresEscuderiaAEliminar(nombre).split("-");
        this.cmbPilotosEliminar.removeAllItems();
        for(String x: name)
            this.cmbPilotosEliminar.addItem(x);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbEscuderiaEliminarPiloto;
    private javax.swing.JComboBox cmbPilotosEliminar;
    private javax.swing.JButton cmdEliminarPilotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
