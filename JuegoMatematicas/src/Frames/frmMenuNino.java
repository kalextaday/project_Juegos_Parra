/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Auxiliar.Images;
import Frames.Activitie1.frmStore;
import Frames.Activitie2.frmIntroAct2;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author tady
 */
public class frmMenuNino extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuNino
     */
    public frmMenuNino() {
        initComponents();
        
        //CENTRAR EL FORMULARIO
        this.setLocationRelativeTo(null);
        
        //DAR IMAGENES A LOS BOTONES
        initializeComponents();
        
        
    }
    
    public void initializeComponents(){
        Images img=new Images();
        //img.setLbl(lblFondoMemory,"fondomemory2");
        
        showBtns(btnReturn,"return");
        showBtns(btnActivities,"activities");
        showBtns(btnGames,"games");
        showBtns(btnMovies,"movies");
    }
    
    public void showBtns(JButton btn,String name){
        Images img=new Images();
        img.setBtn(btn, name); //para transparencia btns=Opaque=ContentAreaFilled=(false)
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        btnMovies = new javax.swing.JButton();
        btnActivities = new javax.swing.JButton();
        btnGames = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(197, 239, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReturn.setBorder(null);
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        btnMovies.setText("movies");
        btnMovies.setBorder(null);
        btnMovies.setContentAreaFilled(false);
        btnMovies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoviesActionPerformed(evt);
            }
        });
        jPanel1.add(btnMovies, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 250, 90));

        btnActivities.setText("activities");
        btnActivities.setBorder(null);
        btnActivities.setContentAreaFilled(false);
        btnActivities.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivitiesActionPerformed(evt);
            }
        });
        jPanel1.add(btnActivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 250, 90));

        btnGames.setText("games");
        btnGames.setBorder(null);
        btnGames.setContentAreaFilled(false);
        btnGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGamesActionPerformed(evt);
            }
        });
        jPanel1.add(btnGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 250, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivitiesActionPerformed
        frmIntroAct2 objfrm=new frmIntroAct2();
        this.dispose();
        objfrm.show();
        
        /*
        frmStore objfrm=new frmStore();
        this.dispose();
        objfrm.show();*/
        
    }//GEN-LAST:event_btnActivitiesActionPerformed

    private void btnGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGamesActionPerformed
        frmMenuGames objfrm=new frmMenuGames();
        this.dispose();
        objfrm.show();
    }//GEN-LAST:event_btnGamesActionPerformed

    private void btnMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoviesActionPerformed
        frmMenuMovies objfrm=new frmMenuMovies();
        this.dispose();
        objfrm.show();
    }//GEN-LAST:event_btnMoviesActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que desea Salir?");
        if (JOptionPane.OK_OPTION == resp){
            frmMenu objfrm=new frmMenu();
            this.dispose();
            objfrm.show();
        }
        
    }//GEN-LAST:event_btnReturnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenuNino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuNino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuNino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuNino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuNino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivities;
    private javax.swing.JButton btnGames;
    private javax.swing.JButton btnMovies;
    private javax.swing.JButton btnReturn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
