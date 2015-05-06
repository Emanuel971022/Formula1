package ufps.poo.formulauno.gui;

import ufps.poo.formulauno.negocio.Formula1;

public class ActualizarEscuderiasPanel extends javax.swing.JPanel {

    private Formula1 form1;
    
    public ActualizarEscuderiasPanel(Formula1 form1) {
        initComponents();
        this.form1 = form1;
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbEscuderiaActualizar = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEscuderia = new javax.swing.JTextField();
        txtJefeEscuderia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtJefeTecnicoEscuderia = new javax.swing.JTextField();
        txtChasisEscuderia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAñoIngresoEscuderia = new javax.swing.JTextField();
        cmdGuardarCambios = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 180, 145));

        jLabel1.setText("Escudería: ");

        cmbEscuderiaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEscuderiaActualizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Jefe del equipo: ");

        jLabel5.setText("Jefe técnico: ");

        jLabel6.setText("Chasis: ");

        jLabel7.setText("Año de ingreso: ");

        cmdGuardarCambios.setText("Guardar cambios");
        cmdGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarCambiosActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdGuardarCambios))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEscuderiaActualizar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAñoIngresoEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJefeEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJefeTecnicoEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChasisEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbEscuderiaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJefeEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtJefeTecnicoEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtChasisEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAñoIngresoEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdGuardarCambios)
                    .addComponent(cmdLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarCambiosActionPerformed
        String nombre = txtNombreEscuderia.getText();
        String jefeEquipo = txtJefeEscuderia.getText();
        String jefeTecnico = txtJefeTecnicoEscuderia.getText();
        String Chasis = txtChasisEscuderia.getText();
        String anioIngreso = txtAñoIngresoEscuderia.getText();
        
        if(nombre.isEmpty() || jefeEquipo.isEmpty() || jefeTecnico.isEmpty() 
                || Chasis.isEmpty() || anioIngreso.isEmpty()){
            Ventana.imp("No pueden haber espacios vacios", "Sistema");
            return;
        }
        
        String mensaje = form1.actualizarEscuderia(nombre, 
                jefeEquipo, jefeTecnico, Chasis, Integer.parseInt(anioIngreso));
        Ventana.imp(mensaje, "Sistma");
    }//GEN-LAST:event_cmdGuardarCambiosActionPerformed

    private void cmbEscuderiaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEscuderiaActualizarActionPerformed
        String nombre = cmbEscuderiaActualizar.getSelectedItem().toString();
        String info[] = form1.concatenarInfoEscuderias(nombre).split("-");
        txtNombreEscuderia.setText(info[0]);
        txtJefeEscuderia.setText(info[1]);
        txtJefeTecnicoEscuderia.setText(info[2]);
        txtChasisEscuderia.setText(info[3]);
        txtAñoIngresoEscuderia.setText(info[4]);
    }//GEN-LAST:event_cmbEscuderiaActualizarActionPerformed

    private void llenarCombo(){
        String nombre[] = form1.concatenarNombreEscuderia().split("-");
        cmbEscuderiaActualizar.removeAllItems();
        for(String x: nombre)
            cmbEscuderiaActualizar.addItem(x);
    }
    
    private void limpiarCampos(){
        this.txtNombreEscuderia.setText("");
        this.txtJefeEscuderia.setText("");
        this.txtJefeTecnicoEscuderia.setText("");
        this.txtAñoIngresoEscuderia.setText("");
        this.txtChasisEscuderia.setText("");
    }
    
    private static boolean isNumeric(String numero){
        try{
            int num = Integer.parseInt(numero);
        }catch(NumberFormatException nfe){
            return false;
        }
        
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbEscuderiaActualizar;
    private javax.swing.JButton cmdGuardarCambios;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAñoIngresoEscuderia;
    private javax.swing.JTextField txtChasisEscuderia;
    private javax.swing.JTextField txtJefeEscuderia;
    private javax.swing.JTextField txtJefeTecnicoEscuderia;
    private javax.swing.JTextField txtNombreEscuderia;
    // End of variables declaration//GEN-END:variables
}
