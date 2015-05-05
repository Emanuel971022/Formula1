package ufps.poo.formulauno.gui;

import ufps.poo.formulauno.negocio.Formula1;

public class EliminarEscuderiaPanel extends javax.swing.JPanel {

    private Formula1 form1;
    
    public EliminarEscuderiaPanel(Formula1 form1){
        initComponents();
        this.form1 = form1;
        
        actualizarCombo();
        
        Ventana.imp("¡Recuerde!\n"
                + " Si elimina una escudería se perderán los pilotos registrados"
                + "\ndentro de esa escudería, recomiendo editar la información"
                + "\nde cada piloto y cambiarlos de escudería.", "Sistema");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbNombreEscuderiaEliminar = new javax.swing.JComboBox();
        cmdEliminarEscuderia = new javax.swing.JButton();

        jLabel1.setText("Escudería: ");

        cmdEliminarEscuderia.setText("Eliminar");
        cmdEliminarEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarEscuderiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdEliminarEscuderia)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNombreEscuderiaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbNombreEscuderiaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdEliminarEscuderia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEliminarEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarEscuderiaActionPerformed
        String nombre = cmbNombreEscuderiaEliminar.getSelectedItem().toString();
                
        String mensaje = form1.eliminarEscuderia(nombre);
        Ventana.imp(mensaje, "Sistema");
        actualizarCombo();
    }//GEN-LAST:event_cmdEliminarEscuderiaActionPerformed

    private void actualizarCombo(){
        String nombre[] = form1.concatenarNombreEscuderia().split("-");
        cmbNombreEscuderiaEliminar.removeAllItems();
        for(String n: nombre)
            cmbNombreEscuderiaEliminar.addItem(n);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbNombreEscuderiaEliminar;
    private javax.swing.JButton cmdEliminarEscuderia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
