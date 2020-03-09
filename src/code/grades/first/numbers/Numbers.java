/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.grades.first.numbers;


import code.util.helpers.selector.Letter;
import code.util.Sound;
import java.awt.Color;
import static java.awt.Color.*;

/**
 *
 * @author hp
 */
public class Numbers extends javax.swing.JFrame {
    
    private int numLetra = 0;
    private Letter[] letters = new Letter[10];

    /**
     * Creates new form ADeAbeja
     */
    public Numbers() {
        String[] references = {
            "UNO (1)","DOS (2)","TRES (3)","CUATRO (4)",
            "CINCO (5)","SEIS (6)","SIETE (7)",
            "OCHO (8)","NUEVE (9)", "DIEZ (10)"
        };
        Color[] colors = {
            RED,GREEN,BLUE,YELLOW,
            CYAN,MAGENTA,GREEN,
            RED,YELLOW,GREEN,
        };
        
        int j = 0;
        for (char i = 'a'; i <= 'j'; i++) {
            letters[j] = new Letter(i, references[j], colors[j]);
            j++;
        }
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        play = new javax.swing.JButton();
        left = new javax.swing.JLabel();
        right = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("UNO (1)");
        jPanel4.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 70));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 790, 90));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/numbers/a.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 150, 540, 370));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 550, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 570, 390));

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/nota.jpg"))); // NOI18N
        play.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 110, 110));

        left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/left.png"))); // NOI18N
        left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMouseClicked(evt);
            }
        });
        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/right.png"))); // NOI18N
        right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMouseClicked(evt);
            }
        });
        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/main/backgrounds/bgNumbers.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        setSize(new java.awt.Dimension(949, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMouseClicked
        // TODO add your handling code here:
        numLetra++;
        if(numLetra > (letters.length - 1) ) numLetra = 0;
        
        updateLetter();
    }//GEN-LAST:event_rightMouseClicked

    private void leftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMouseClicked
        // TODO add your handling code here:
        numLetra--;
        if(numLetra < 0) numLetra = letters.length - 1;
        
        updateLetter();
    }//GEN-LAST:event_leftMouseClicked

    public void updateLetter(){
        Letter letter = letters[numLetra];
        
        title.setText( letter.getReference() );
        title.setForeground( letter.color );
        jPanel1.setBackground( letter.color );
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                letter.getImagePath()
        )));
        
        playSound(letter);
    }
    
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
        playSound(letters[numLetra]);
    }//GEN-LAST:event_playActionPerformed

    public void playSound(Letter letter){
        Sound.play( letter.getSound() );
    }
    
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
            java.util.logging.Logger.getLogger(Numbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numbers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel left;
    private javax.swing.JButton play;
    private javax.swing.JLabel right;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
