package ufps.poo.formulauno.gui;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import ufps.poo.formulauno.negocio.Formula1;

public class ActualizarPilotoPanel extends javax.swing.JPanel {

    private Formula1 form1;
    
    public ActualizarPilotoPanel(Formula1 form1) {
        initComponents();
        this.form1 = form1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPeriodoContrato = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombrePiloto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbPaisOrigen = new javax.swing.JComboBox();
        txtAñoNacimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbPeriodoContrato1_3 = new javax.swing.JRadioButton();
        rbPeriodoContrato4_6 = new javax.swing.JRadioButton();
        rbPeriodoContrato7_10 = new javax.swing.JRadioButton();
        cmbEscuderiaPerteneciente = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAñoIngreso = new javax.swing.JTextField();
        chkbAñoCampeon_2011 = new javax.swing.JCheckBox();
        chkbAñoCampeon_2012 = new javax.swing.JCheckBox();
        chkbAñoCampeon_2014 = new javax.swing.JCheckBox();
        chkbAñoCampeon_2013 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Escudería: ");

        jLabel2.setText("Piloto: ");

        jLabel3.setText("Nombre: ");

        jLabel6.setText("País de origen: ");

        cmbPaisOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Colombia", "Argentina", "Ecuador" }));

        jLabel7.setText("Año de nacimiento: ");

        jLabel8.setText("Periodo de contrato: ");

        bgPeriodoContrato.add(rbPeriodoContrato1_3);
        rbPeriodoContrato1_3.setText("1-3");

        bgPeriodoContrato.add(rbPeriodoContrato4_6);
        rbPeriodoContrato4_6.setText("4-6");

        bgPeriodoContrato.add(rbPeriodoContrato7_10);
        rbPeriodoContrato7_10.setText("7-10");

        jLabel9.setText("Escudería: ");

        jLabel4.setText("Año de ingreso: ");

        chkbAñoCampeon_2011.setText("2011");

        chkbAñoCampeon_2012.setText("2012");

        chkbAñoCampeon_2014.setText("2014");

        chkbAñoCampeon_2013.setText("2013");

        jLabel5.setText("Años campeón: ");

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbPeriodoContrato1_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPeriodoContrato4_6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPeriodoContrato7_10))
                            .addComponent(txtAñoNacimiento)
                            .addComponent(txtNombrePiloto)
                            .addComponent(cmbEscuderiaPerteneciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkbAñoCampeon_2011)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkbAñoCampeon_2012))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkbAñoCampeon_2013)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkbAñoCampeon_2014))
                            .addComponent(txtAñoIngreso)
                            .addComponent(cmbPaisOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrePiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPaisOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rbPeriodoContrato1_3)
                    .addComponent(rbPeriodoContrato4_6)
                    .addComponent(rbPeriodoContrato7_10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbEscuderiaPerteneciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAñoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chkbAñoCampeon_2011)
                    .addComponent(chkbAñoCampeon_2012))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbAñoCampeon_2013)
                    .addComponent(chkbAñoCampeon_2014))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // Se hace captura de los datos
        // Se hacen validaciones de contenido
        // Se invoca el metodo del negocio
        //boolean exito = form1.agregarPiloto(Atributos...);

        String nombre = this.txtNombrePiloto.getText();
        String pais = this.cmbPaisOrigen.getSelectedItem().toString();
        String añoNacimiento = this.txtAñoNacimiento.getText();
        String periodoContrato = this.obtenerTexto(bgPeriodoContrato);
        String escuderia = this.cmbEscuderiaPerteneciente.getSelectedItem().toString();
        String añoIngreso = this.txtAñoIngreso.getText();
        String[] añoCampeon = this.obtenerCheck().split("-");

        if (nombre.isEmpty() || añoNacimiento.isEmpty() || añoIngreso.isEmpty()) {
            Ventana.imp("Debe ingresar todos los datos", "Sistema");
            return;
        }

        if (!isNumeric(añoNacimiento) || !isNumeric(añoIngreso)) {
            Ventana.imp("Ingrese valores numericos a los campos correspondientes", "Sistema");
        }

        String mensaje = this.form1.agregarPiloto(nombre, pais, Integer.parseInt(añoNacimiento), periodoContrato, añoCampeon, Integer.parseInt(añoIngreso), escuderia);
        Ventana.imp(mensaje, "Sistema");

        this.limpiarCampos();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private String obtenerTexto(ButtonGroup bg) {
        String valor = "";

        Enumeration<AbstractButton> radios = bg.getElements();
        while (radios.hasMoreElements()) {
            JRadioButton temp = (JRadioButton) radios.nextElement();
            if (temp.isSelected()) {
                valor = temp.getText();
            }
        }

        return valor;
    }
    
    private void limpiarCampos(){
        this.txtNombrePiloto.setText("");
        this.txtAñoNacimiento.setText("");
        this.txtAñoIngreso.setText("");
        this.cmbPaisOrigen.setSelectedIndex(0);
        this.cmbEscuderiaPerteneciente.setSelectedIndex(0);
        this.bgPeriodoContrato.clearSelection();
        this.chkbAñoCampeon_2011.setSelected(false);
        this.chkbAñoCampeon_2012.setSelected(false);
        this.chkbAñoCampeon_2013.setSelected(false);
        this.chkbAñoCampeon_2014.setSelected(false);
    }

    private String obtenerCheck() {
        String valor = "";

        if (this.chkbAñoCampeon_2011.isSelected()) {
            valor += this.chkbAñoCampeon_2011.getText() + "-";
        }

        if (this.chkbAñoCampeon_2012.isSelected()) {
            valor += this.chkbAñoCampeon_2012.getText() + "-";
        }

        if (this.chkbAñoCampeon_2013.isSelected()) {
            valor += this.chkbAñoCampeon_2013.getText() + "-";
        }

        if (this.chkbAñoCampeon_2014.isSelected()) {
            valor += this.chkbAñoCampeon_2014.getText() + "-";
        }

        return valor;
    }

    private static boolean isNumeric(String num) {
        try {
            int d = Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            System.out.println(""+nfe);
            return false;
        }

        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPeriodoContrato;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chkbAñoCampeon_2011;
    private javax.swing.JCheckBox chkbAñoCampeon_2012;
    private javax.swing.JCheckBox chkbAñoCampeon_2013;
    private javax.swing.JCheckBox chkbAñoCampeon_2014;
    private javax.swing.JComboBox cmbEscuderiaPerteneciente;
    private javax.swing.JComboBox cmbPaisOrigen;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbPeriodoContrato1_3;
    private javax.swing.JRadioButton rbPeriodoContrato4_6;
    private javax.swing.JRadioButton rbPeriodoContrato7_10;
    private javax.swing.JTextField txtAñoIngreso;
    private javax.swing.JTextField txtAñoNacimiento;
    private javax.swing.JTextField txtNombrePiloto;
    // End of variables declaration//GEN-END:variables
}
