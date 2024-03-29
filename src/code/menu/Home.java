/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.menu;

import code.grades.first.GameSelector;
import code.util.controllers.HistorialController;
import code.util.Sound;
import code.util.helpers.paths.SoundPath;

/**
 *
 * @author tavar
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Home() {
        initComponents();
        
        Sound.play(new SoundPath("menuSoundtrack").inFolder("main"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forthGrade = new javax.swing.JButton();
        firstGrade = new javax.swing.JButton();
        thirdGrade = new javax.swing.JButton();
        fifthGrade = new javax.swing.JButton();
        sixthGrade = new javax.swing.JButton();
        secondGrade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tutorial = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forthGrade.setBackground(new java.awt.Color(255, 255, 255));
        forthGrade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        forthGrade.setForeground(new java.awt.Color(51, 51, 51));
        forthGrade.setText("CUARTO GRADO");
        forthGrade.setToolTipText("");
        forthGrade.setActionCommand("SEGUNDO GRADO");
        forthGrade.setBorder(new javax.swing.border.MatteBorder(null));
        forthGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(forthGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 240, 40));

        firstGrade.setBackground(new java.awt.Color(255, 255, 255));
        firstGrade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        firstGrade.setForeground(new java.awt.Color(51, 51, 51));
        firstGrade.setText("PRIMER GRADO");
        firstGrade.setToolTipText("");
        firstGrade.setBorder(new javax.swing.border.MatteBorder(null));
        firstGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        firstGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstGradeActionPerformed(evt);
            }
        });
        getContentPane().add(firstGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 240, 40));

        thirdGrade.setBackground(new java.awt.Color(255, 255, 255));
        thirdGrade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        thirdGrade.setForeground(new java.awt.Color(51, 51, 51));
        thirdGrade.setText("TERCER GRADO");
        thirdGrade.setToolTipText("");
        thirdGrade.setBorder(new javax.swing.border.MatteBorder(null));
        thirdGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(thirdGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 240, 40));

        fifthGrade.setBackground(new java.awt.Color(255, 255, 255));
        fifthGrade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fifthGrade.setForeground(new java.awt.Color(51, 51, 51));
        fifthGrade.setText("QUINTO GRADO");
        fifthGrade.setToolTipText("");
        fifthGrade.setBorder(new javax.swing.border.MatteBorder(null));
        fifthGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(fifthGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 240, 40));

        sixthGrade.setBackground(new java.awt.Color(255, 255, 255));
        sixthGrade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sixthGrade.setForeground(new java.awt.Color(51, 51, 51));
        sixthGrade.setText("SEXTO GRADO");
        sixthGrade.setToolTipText("");
        sixthGrade.setBorder(new javax.swing.border.MatteBorder(null));
        sixthGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(sixthGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 240, 40));

        secondGrade.setBackground(new java.awt.Color(255, 255, 255));
        secondGrade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        secondGrade.setForeground(new java.awt.Color(51, 51, 51));
        secondGrade.setText("SEGUNDO GRADO");
        secondGrade.setToolTipText("");
        secondGrade.setBorder(new javax.swing.border.MatteBorder(null));
        secondGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(secondGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 240, 40));

        jLabel1.setFont(new java.awt.Font("Myriad Hebrew", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aprende con Mukip");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 660, 90));

        text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text.setForeground(new java.awt.Color(204, 255, 255));
        text.setText("Selecciona el grado que cursas:");
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 260, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PROGRAMA EDUCATIVO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/locked.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 50, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/locked.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 50, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/locked.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 50, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/locked.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 50, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/locked.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 50, 40));

        tutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/tutorial.gif"))); // NOI18N
        tutorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutorialMouseClicked(evt);
            }
        });
        getContentPane().add(tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/backgrounds/home.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, 0, 1210, 660));

        setSize(new java.awt.Dimension(930, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tutorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorialMouseClicked
        // TODO add your handling code here:
        Sound.stop();
        HistorialController.next(new Tutorial());
    }//GEN-LAST:event_tutorialMouseClicked

    private void firstGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstGradeActionPerformed
        // TODO add your handling code here:
        HistorialController.next(new GameSelector());
    }//GEN-LAST:event_firstGradeActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fifthGrade;
    private javax.swing.JButton firstGrade;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton forthGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton secondGrade;
    private javax.swing.JButton sixthGrade;
    private javax.swing.JLabel text;
    private javax.swing.JButton thirdGrade;
    private javax.swing.JLabel tutorial;
    // End of variables declaration//GEN-END:variables
}
