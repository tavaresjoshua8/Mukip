/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.grades.first.math;

import code.grades.first.math.WheatExample.Wheat;
import code.grades.first.math.appleExample.Apple;
import code.grades.first.math.leafExample.Leaf;
import code.grades.first.math.milkExample.Milk;
import code.grades.first.math.sugarExamples.Sugar;
import code.util.controllers.HistorialController;

/**
 *
 * @author hp
 */
public class MathGameSelector extends javax.swing.JFrame {

    /**
     * Creates new form MathGameSelector
     */
    public MathGameSelector() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wheat = new javax.swing.JLabel();
        leaf = new javax.swing.JLabel();
        milk = new javax.swing.JLabel();
        apple = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        sugar = new javax.swing.JLabel();
        volver = new javax.swing.JLabel();
        activityPanel = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wheat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wheat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wheatMouseClicked(evt);
            }
        });
        getContentPane().add(wheat, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 110, 100));

        leaf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leafMouseClicked(evt);
            }
        });
        getContentPane().add(leaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 120, 120));

        milk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        milk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milkMouseClicked(evt);
            }
        });
        getContentPane().add(milk, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 120, 120));

        apple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appleMouseClicked(evt);
            }
        });
        getContentPane().add(apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 120, 120));

        title.setFont(new java.awt.Font("Myriad Hebrew", 1, 80)); // NOI18N
        title.setForeground(new java.awt.Color(255, 102, 102));
        title.setText("Actividades con:");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 640, 90));

        sugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sugarMouseClicked(evt);
            }
        });
        getContentPane().add(sugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 110, 110));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/home.png"))); // NOI18N
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        activityPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/math/mathSelector.png"))); // NOI18N
        getContentPane().add(activityPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 700, 490));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/math/bg.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1000, 830));

        setSize(new java.awt.Dimension(950, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sugarMouseClicked
        // TODO add your handling code here:
        HistorialController.next( new Sugar() );
    }//GEN-LAST:event_sugarMouseClicked

    private void appleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appleMouseClicked
        // TODO add your handling code here:
        HistorialController.next(new Apple() );
    }//GEN-LAST:event_appleMouseClicked

    private void milkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milkMouseClicked
        // TODO add your handling code here:
        HistorialController.next(new Milk() );
    }//GEN-LAST:event_milkMouseClicked

    private void leafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leafMouseClicked
        // TODO add your handling code here:
        HistorialController.next(new Leaf() );
    }//GEN-LAST:event_leafMouseClicked

    private void wheatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wheatMouseClicked
        // TODO add your handling code here:
        HistorialController.next(new Wheat() );
    }//GEN-LAST:event_wheatMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        // TODO add your handling code here:
        HistorialController.back();
    }//GEN-LAST:event_volverMouseClicked

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
            java.util.logging.Logger.getLogger(MathGameSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathGameSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathGameSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathGameSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathGameSelector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityPanel;
    private javax.swing.JLabel apple;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel leaf;
    private javax.swing.JLabel milk;
    private javax.swing.JLabel sugar;
    private javax.swing.JLabel title;
    private javax.swing.JLabel volver;
    private javax.swing.JLabel wheat;
    // End of variables declaration//GEN-END:variables
}
