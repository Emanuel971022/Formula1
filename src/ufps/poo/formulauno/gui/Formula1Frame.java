package ufps.poo.formulauno.gui;

import javax.swing.JPanel;
import ufps.poo.formulauno.negocio.Formula1;
import ufps.poo.formulauno.gui.Ventana;

public class Formula1Frame extends javax.swing.JFrame {

    private Formula1 form1;
    private JPanel bienvenidaPanel, escuderiaPanel, pilotoPanel,
            consultarEscuderiaPanel, consultarPilotoPanel, eliminarPilotoPanel,
            eliminarEscuderiaPanel;
    
    public Formula1Frame() {
        initComponents();
        miBienvenidaActionPerformed(null);
        form1 = new Formula1();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        miBienvenida = new javax.swing.JMenuItem();
        menuRegistrar = new javax.swing.JMenu();
        miEscuderia = new javax.swing.JMenuItem();
        miPiloto = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenu();
        jmConsultarEscuderia = new javax.swing.JMenuItem();
        jmConsultarPiloto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formula 1");

        menuInicio.setText("Inicio");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });

        miBienvenida.setText("Bienvenida");
        miBienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBienvenidaActionPerformed(evt);
            }
        });
        menuInicio.add(miBienvenida);

        jMenuBar1.add(menuInicio);

        menuRegistrar.setText("Registrar");

        miEscuderia.setText("Escuderia");
        miEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEscuderiaActionPerformed(evt);
            }
        });
        menuRegistrar.add(miEscuderia);

        miPiloto.setText("Piloto");
        miPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPilotoActionPerformed(evt);
            }
        });
        menuRegistrar.add(miPiloto);

        jMenuBar1.add(menuRegistrar);

        menuActualizar.setText("Consultar");

        jmConsultarEscuderia.setText("Conusltar escuderia");
        jmConsultarEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultarEscuderiaActionPerformed(evt);
            }
        });
        menuActualizar.add(jmConsultarEscuderia);

        jmConsultarPiloto.setText("Consultar piloto");
        jmConsultarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultarPilotoActionPerformed(evt);
            }
        });
        menuActualizar.add(jmConsultarPiloto);

        jMenuBar1.add(menuActualizar);

        jMenu1.setText("Eliminar");

        jMenuItem1.setText("Eliminar escuderia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Eliminar piloto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEscuderiaActionPerformed
        remover();
        escuderiaPanel = new EscuderiaPanel(form1);        

        getContentPane().add(escuderiaPanel); 
        pack();
    }//GEN-LAST:event_miEscuderiaActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        
    }//GEN-LAST:event_menuInicioActionPerformed

    private void miBienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBienvenidaActionPerformed
        remover();
        bienvenidaPanel = new BienvenidaPanel();        

        getContentPane().add(bienvenidaPanel); 
        pack();
    }//GEN-LAST:event_miBienvenidaActionPerformed

    private void miPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPilotoActionPerformed
        remover();
        pilotoPanel = new PilotoPanel(form1);        

        getContentPane().add(pilotoPanel); 
        pack();
    }//GEN-LAST:event_miPilotoActionPerformed

    private void jmConsultarEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultarEscuderiaActionPerformed
        remover();
        consultarEscuderiaPanel = new ConsultarEscuderiaPanel(form1);
        
        getContentPane().add(consultarEscuderiaPanel);
        pack();
    }//GEN-LAST:event_jmConsultarEscuderiaActionPerformed

    private void jmConsultarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultarPilotoActionPerformed
        remover();
        consultarPilotoPanel = new ConsultarPilotoPanel(form1);
        
        getContentPane().add(consultarPilotoPanel);
        pack();
    }//GEN-LAST:event_jmConsultarPilotoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        remover();
        eliminarPilotoPanel = new EliminarPilotoPanel(form1);
        
        getContentPane().add(eliminarPilotoPanel);
        pack();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        remover();
        eliminarEscuderiaPanel = new EliminarEscuderiaPanel(form1);
        
        getContentPane().add(eliminarEscuderiaPanel);
        pack();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void remover(){
        if(escuderiaPanel!=null)
            remove(escuderiaPanel);
        if(bienvenidaPanel!=null)
            remove(bienvenidaPanel); 
        if(pilotoPanel!=null)
            remove(pilotoPanel);
        if(consultarEscuderiaPanel!=null)
            remove(consultarEscuderiaPanel);
        if(consultarPilotoPanel!=null)
            remove(consultarPilotoPanel);
        if(eliminarPilotoPanel!=null)
            remove(eliminarPilotoPanel);
        if(eliminarEscuderiaPanel!=null)
            remove(eliminarEscuderiaPanel);
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formula1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formula1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formula1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formula1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formula1Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jmConsultarEscuderia;
    private javax.swing.JMenuItem jmConsultarPiloto;
    private javax.swing.JMenu menuActualizar;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuRegistrar;
    private javax.swing.JMenuItem miBienvenida;
    private javax.swing.JMenuItem miEscuderia;
    private javax.swing.JMenuItem miPiloto;
    // End of variables declaration//GEN-END:variables
}
