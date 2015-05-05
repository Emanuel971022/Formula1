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
        cmdCargarPilotosEliminar = new javax.swing.JButton();
        cmbPilotosEliminar = new javax.swing.JComboBox();
        cmdEliminarPilotos = new javax.swing.JButton();

        jLabel1.setText("Escuderias: ");

        jLabel2.setText("Pilotos: ");

        cmdCargarPilotosEliminar.setText("Cargar");
        cmdCargarPilotosEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCargarPilotosEliminarActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmdCargarPilotosEliminar)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbEscuderiaEliminarPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmdEliminarPilotos)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbPilotosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbEscuderiaEliminarPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdCargarPilotosEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPilotosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdEliminarPilotos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCargarPilotosEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCargarPilotosEliminarActionPerformed
        String nombre = this.cmbEscuderiaEliminarPiloto.getSelectedItem().toString();
        ActualizarComboPiloto(nombre);
    }//GEN-LAST:event_cmdCargarPilotosEliminarActionPerformed

    private void cmdEliminarPilotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarPilotosActionPerformed
        String nombreEscuderia = this.cmbEscuderiaEliminarPiloto.getSelectedItem().toString();
        String nombrePiloto = this.cmbPilotosEliminar.getSelectedItem().toString();
        
        String mensaje = this.form1.eliminarPiloto(nombreEscuderia, nombrePiloto);
        Ventana.imp(mensaje, "Sistema");
        
        this.ActualizarComboEscuderia();
        this.ActualizarComboPiloto(nombreEscuderia);
    }//GEN-LAST:event_cmdEliminarPilotosActionPerformed
    
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
    private javax.swing.JButton cmdCargarPilotosEliminar;
    private javax.swing.JButton cmdEliminarPilotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
