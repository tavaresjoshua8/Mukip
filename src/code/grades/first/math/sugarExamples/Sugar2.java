/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.grades.first.math.sugarExamples;

import code.util.controllers.HistorialController;
import java.awt.Color;

/**
 *
 * @author hp
 */
public class Sugar2 extends javax.swing.JFrame {

    /**
     * Creates new form sugar
     */
    public Sugar2() {
        initComponents();
        txt.requestFocus();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        expresion = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Myriad Hebrew", 1, 36)); // NOI18N
        label.setForeground(new java.awt.Color(51, 0, 0));
        label.setText("¿Cuántos cubos de azúcar ves aquí?:");
        jPanel4.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 40));

        txt.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyTyped(evt);
            }
        });
        jPanel4.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -10, 110, 100));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 930, 80));

        title.setFont(new java.awt.Font("Myriad Hebrew", 1, 56)); // NOI18N
        title.setForeground(new java.awt.Color(51, 0, 0));
        title.setText("¡Contemos cubos de azúcar!");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 770, 90));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/math/examples/sugar/sugar2.jpg"))); // NOI18N
        jPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 540, 380));

        expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/expresion1.PNG"))); // NOI18N
        getContentPane().add(expresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/miniLeft.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/miniRight.png"))); // NOI18N
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/math/cocina.jpg"))); // NOI18N
        bg.setAlignmentX(0.5F);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        setSize(new java.awt.Dimension(957, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyTyped

    }//GEN-LAST:event_txtKeyTyped

    private void txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyReleased
        // TODO add your handling code here:
        if(txt.getText().equals("2")){
            expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/correcto.gif")));
            txt.setForeground(Color.GREEN);  
        }else{
            expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/triste.gif")));
            txt.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtKeyReleased

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        // TODO add your handling code here:
        HistorialController.next( new Sugar3() );
    }//GEN-LAST:event_nextMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        HistorialController.back();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(Sugar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sugar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sugar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sugar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sugar2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel expresion;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label;
    private javax.swing.JLabel next;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
