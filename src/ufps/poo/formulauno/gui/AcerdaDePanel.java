package ufps.poo.formulauno.gui;

import java.awt.Desktop;
import java.net.URI;
import ufps.poo.formulauno.negocio.Formula1;

public class AcerdaDePanel extends javax.swing.JPanel {

    private Formula1 form1;
    
    public AcerdaDePanel(Formula1 form1){
        initComponents();
        lblGitHub.setText("<html><a href='https://www.github.com/Emanuel971022/'>Pérfil en GitHub</a></html>");
        lblBitbucket.setText("<html><a href='https://bitbucket.org/emanuel971022'>Pérfil en Bitbucket</a></html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblGitHub = new javax.swing.JLabel();
        lblBitbucket = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formula 1 App");

        lblGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufps/poo/formulauno/util/GitHub.png"))); // NOI18N
        lblGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGitHubMouseClicked(evt);
            }
        });

        lblBitbucket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufps/poo/formulauno/util/bitbucket.png"))); // NOI18N
        lblBitbucket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBitbucketMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBitbucket)
                    .addComponent(lblGitHub)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGitHub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBitbucket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitHubMouseClicked
        abrirEnlace("https://www.github.com/Emanuel971022/");
    }//GEN-LAST:event_lblGitHubMouseClicked

    private void lblBitbucketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBitbucketMouseClicked
        abrirEnlace("https://bitbucket.org/emanuel971022");
    }//GEN-LAST:event_lblBitbucketMouseClicked

    private void abrirEnlace(String enlace){
        try{
            if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) 
                    desktop.browse(new URI(enlace));
            }
        }catch(Exception e){
                e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBitbucket;
    private javax.swing.JLabel lblGitHub;
    // End of variables declaration//GEN-END:variables
}
