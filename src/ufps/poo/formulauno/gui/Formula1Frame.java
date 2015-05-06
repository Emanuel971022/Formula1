package ufps.poo.formulauno.gui;

import javax.swing.JPanel;
import ufps.poo.formulauno.negocio.Formula1;
import ufps.poo.formulauno.gui.Ventana;

public class Formula1Frame extends javax.swing.JFrame {

    private Formula1 form1;
    private JPanel bienvenidaPanel, escuderiaPanel, pilotoPanel,
            actualizarEscuderiaPanel, actualizarPilotoPanel, 
            consultarEscuderiaPanel, consultarPilotoPanel, 
            eliminarPilotoPanel, eliminarEscuderiaPanel;
    
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
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        miBienvenida = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        menuAcciones = new javax.swing.JMenu();
        menuRegistrar = new javax.swing.JMenu();
        miEscuderia = new javax.swing.JMenuItem();
        miPiloto = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenu();
        ActualizarInfoEscuderia = new javax.swing.JMenuItem();
        actualizarInfoPiloto = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenu();
        EliminarEscuderia = new javax.swing.JMenuItem();
        EliminarPiloto = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        ConsultarEscuderia = new javax.swing.JMenuItem();
        ConsultarPiloto = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formula 1");
        setResizable(false);

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

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        menuInicio.add(Salir);

        jMenuBar1.add(menuInicio);

        menuAcciones.setText("Acciones");

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

        menuAcciones.add(menuRegistrar);

        menuActualizar.setText("Actualizar");

        ActualizarInfoEscuderia.setText("Actualizar información de escuderías");
        ActualizarInfoEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarInfoEscuderiaActionPerformed(evt);
            }
        });
        menuActualizar.add(ActualizarInfoEscuderia);

        actualizarInfoPiloto.setText("Actualizar información del piloto");
        actualizarInfoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarInfoPilotoActionPerformed(evt);
            }
        });
        menuActualizar.add(actualizarInfoPiloto);

        menuAcciones.add(menuActualizar);

        menuEliminar.setText("Eliminar");

        EliminarEscuderia.setText("Eliminar escuderia");
        EliminarEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEscuderiaActionPerformed(evt);
            }
        });
        menuEliminar.add(EliminarEscuderia);

        EliminarPiloto.setText("Eliminar piloto");
        EliminarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPilotoActionPerformed(evt);
            }
        });
        menuEliminar.add(EliminarPiloto);

        menuAcciones.add(menuEliminar);

        jMenuBar1.add(menuAcciones);

        menuConsultar.setText("Consultas");

        ConsultarEscuderia.setText("Conusltar escuderia");
        ConsultarEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarEscuderiaActionPerformed(evt);
            }
        });
        menuConsultar.add(ConsultarEscuderia);

        ConsultarPiloto.setText("Consultar piloto");
        ConsultarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPilotoActionPerformed(evt);
            }
        });
        menuConsultar.add(ConsultarPiloto);

        jMenuBar1.add(menuConsultar);

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

    private void ConsultarEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarEscuderiaActionPerformed
        remover();
        consultarEscuderiaPanel = new ConsultarEscuderiaPanel(form1);
        
        getContentPane().add(consultarEscuderiaPanel);
        pack();
    }//GEN-LAST:event_ConsultarEscuderiaActionPerformed

    private void ConsultarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPilotoActionPerformed
        remover();
        consultarPilotoPanel = new ConsultarPilotoPanel(form1);
        
        getContentPane().add(consultarPilotoPanel);
        pack();
    }//GEN-LAST:event_ConsultarPilotoActionPerformed

    private void EliminarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPilotoActionPerformed
        remover();
        eliminarPilotoPanel = new EliminarPilotoPanel(form1);
        
        getContentPane().add(eliminarPilotoPanel);
        pack();
    }//GEN-LAST:event_EliminarPilotoActionPerformed

    private void EliminarEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEscuderiaActionPerformed
        remover();
        eliminarEscuderiaPanel = new EliminarEscuderiaPanel(form1);
        
        getContentPane().add(eliminarEscuderiaPanel);
        pack();
    }//GEN-LAST:event_EliminarEscuderiaActionPerformed

    private void ActualizarInfoEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarInfoEscuderiaActionPerformed
        remover();
        actualizarEscuderiaPanel = new ActualizarEscuderiasPanel(form1);
        
        getContentPane().add(actualizarEscuderiaPanel);
        pack();
    }//GEN-LAST:event_ActualizarInfoEscuderiaActionPerformed

    private void actualizarInfoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarInfoPilotoActionPerformed
        remover();
        actualizarPilotoPanel = new ActualizarPilotoPanel(form1);
        
        getContentPane().add(actualizarPilotoPanel);
        pack();
    }//GEN-LAST:event_actualizarInfoPilotoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void remover(){
        if(escuderiaPanel!=null)
            remove(escuderiaPanel);
        if(bienvenidaPanel!=null)
            remove(bienvenidaPanel); 
        if(pilotoPanel!=null)
            remove(pilotoPanel);
        if(actualizarEscuderiaPanel!=null)
            remove(actualizarEscuderiaPanel);
        if(actualizarPilotoPanel!=null)
            remove(actualizarPilotoPanel);
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
    private javax.swing.JMenuItem ActualizarInfoEscuderia;
    private javax.swing.JMenuItem ConsultarEscuderia;
    private javax.swing.JMenuItem ConsultarPiloto;
    private javax.swing.JMenuItem EliminarEscuderia;
    private javax.swing.JMenuItem EliminarPiloto;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem actualizarInfoPiloto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu menuAcciones;
    private javax.swing.JMenu menuActualizar;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuRegistrar;
    private javax.swing.JMenuItem miBienvenida;
    private javax.swing.JMenuItem miEscuderia;
    private javax.swing.JMenuItem miPiloto;
    // End of variables declaration//GEN-END:variables
}
