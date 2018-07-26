/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import Auxiliar.*;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author kalex
 */
public class frmMemory extends javax.swing.JFrame {

    //private Logica logi=new Logica();
    private Logica logi;
    private boolean caraUP=false;
    private boolean primero=false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn=new JButton[2];
    private int puntaje=0;
    
    
    private ArrayList<JButton> cartas=new ArrayList<JButton>();
    private Images images=new Images();
    
    
    Sound beat=new Sound("mario");
    
    /**
     * Creates new form Memoria
     */
    public frmMemory() {
        initComponents();
        
        //CENTRAR EL FORMULARIO
        this.setLocationRelativeTo(null);
        
        //DAR IMAGENES A LOS BOTONES
        initializeComponents();
        
        //INSTANCIAR BTNS Y DAR LAS IMAGENES
        initilizeBtns();
        initializeImageBackward();
        setCards();
        
        beat.play();
    }
    
    public void initializeComponents(){
        Images img=new Images();
        img.setLbl(lblFondoMemory,"fondomemory2");
        
        showBtns(btnHelp,"help");
        showBtns(btnHome,"home");
        showBtns(btnRestart,"restart");
        
    }
    
    public void showBtns(JButton btn,String name){
        Images img=new Images();
        img.setBtn(btn, name); //para transparencia btns=Opaque=ContentAreaFilled=(false)
    }
    
    private void initilizeBtns(){
        cartas.add(btnC1);
        cartas.add(btnC2);
        cartas.add(btnC3);
        cartas.add(btnC4);
        cartas.add(btnC5);
        cartas.add(btnC6);
        cartas.add(btnC7);
        cartas.add(btnC8);
    }
    
    //INICIALIZAR OBJETOS CARTAS
    private void initializeImageBackward(){
        for(int i=0;i<cartas.size();i++){
            images.setCardsBackward(cartas.get(i));
            cartas.get(i).setContentAreaFilled(false);
        }
    }
    
    //INSTANCIAR LAS IMAGENES DE LAS CARTAS
    private void setCards(){
        logi=new Logica();
        int[] numbers = logi.getCardNumbers();
        
        for(int i=0;i<cartas.size();i++)
            images.setCards(cartas.get(i),numbers,i);
    }
   
    private void btnEnabled(JButton btn){
        if(!caraUP){
            btn.setEnabled(false);
            im1=(ImageIcon) btn.getDisabledIcon();
            pbtn[0]=btn;
            caraUP=true;
            primero=false;
        }
        else{
            btn.setEnabled(false);
            im2=(ImageIcon) btn.getDisabledIcon();
            pbtn[1]=btn;
            primero=true;
            puntaje +=20;
            questWin();
        }
    }
    
    private void compare(){
        if(caraUP && primero){
            if(im1.getDescription().compareTo(im2.getDescription()) != 0){
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 10)
                    puntaje -=10;
            }
            caraUP=false;
        }
    }
    
    //REINICIAR EL JUEGO
    private void restart(){
        
        for(int i=0;i<cartas.size();i++)
            cartas.get(i).setEnabled(true);
        
        primero=false;
        caraUP=false;
        puntaje=0;
        setCards();
    }
    
    //MENSAJE DE HABER GANADO EL JUEGO
    private void questWin(){
        if(!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() &&
          !btnC6.isEnabled() && !btnC7.isEnabled() && !btnC8.isEnabled())
            JOptionPane.showMessageDialog(this,"FELICIDADES USTED HA GANADO \n Su Puntaje es:"+puntaje,"WIN !!",JOptionPane.INFORMATION_MESSAGE);
        
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
        btnC8 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblFondoMemory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setToolTipText("");
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnC8.setBorderPainted(false);
        btnC8.setOpaque(false);
        btnC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC8MouseExited(evt);
            }
        });
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 120, 160));
        btnC8.getAccessibleContext().setAccessibleDescription("");

        btnC3.setBorderPainted(false);
        btnC3.setOpaque(false);
        btnC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC3MouseExited(evt);
            }
        });
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 120, 160));

        btnC4.setBorderPainted(false);
        btnC4.setOpaque(false);
        btnC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC4MouseExited(evt);
            }
        });
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 120, 160));

        btnC7.setBorderPainted(false);
        btnC7.setOpaque(false);
        btnC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC7MouseExited(evt);
            }
        });
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 120, 160));

        btnC1.setBorderPainted(false);
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 160));

        btnC2.setBorderPainted(false);
        btnC2.setOpaque(false);
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, 160));

        btnC5.setBorderPainted(false);
        btnC5.setOpaque(false);
        btnC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC5MouseExited(evt);
            }
        });
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 160));

        btnC6.setBorderPainted(false);
        btnC6.setOpaque(false);
        btnC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC6MouseExited(evt);
            }
        });
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 120, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 810, 380));

        btnRestart.setBorderPainted(false);
        btnRestart.setContentAreaFilled(false);
        btnRestart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestart.setOpaque(false);
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 90, 90));

        btnHelp.setBorderPainted(false);
        btnHelp.setContentAreaFilled(false);
        btnHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHelp.setOpaque(false);
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 80, 80));

        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setOpaque(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        lblFondoMemory.setText("jLabel2");
        getContentPane().add(lblFondoMemory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        btnEnabled(btnC1);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        btnEnabled(btnC2);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        btnEnabled(btnC3);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        btnEnabled(btnC4);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        btnEnabled(btnC5);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        btnEnabled(btnC6);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        btnEnabled(btnC7);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        btnEnabled(btnC8);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        compare();
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        compare();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        compare();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        compare();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        compare();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        compare();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        compare();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        compare();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        restart();
        
        beat.stop();
        beat.play();
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        beat.stop();
        frmMenu frm=new frmMenu();
        this.dispose();
        frm.show();
        
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(frmMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMemory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRestart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondoMemory;
    // End of variables declaration//GEN-END:variables
}