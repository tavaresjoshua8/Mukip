/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.grades.first.spanish.DragAndDrop;

import code.grades.first.spanish.FullWrite.Gato;
import code.grades.first.spanish.Options.Conejo;
import code.main.Home;
import code.util.HistorialController;
import java.awt.Color;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/**
 *
 * @author admin
 */
public class NameToImage extends javax.swing.JFrame {

    /**
     * Creates new form Escribir5
     */
    public NameToImage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        verificar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        guitarra = new javax.swing.JTextField();
        dulces = new javax.swing.JTextField();
        casa = new javax.swing.JTextField();
        tortuga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        title = new javax.swing.JLabel();
        expresion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuPrincipal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setBackground(new java.awt.Color(255, 255, 255));
        volver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(0, 102, 102));
        volver.setText("<");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 110, 40));

        verificar.setBackground(new java.awt.Color(255, 255, 255));
        verificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        verificar.setForeground(new java.awt.Color(0, 102, 102));
        verificar.setText("Verificar");
        verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarActionPerformed(evt);
            }
        });
        getContentPane().add(verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 100, 40));

        reiniciar.setBackground(new java.awt.Color(255, 255, 255));
        reiniciar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reiniciar.setForeground(new java.awt.Color(0, 102, 102));
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 110, 40));

        siguiente.setBackground(new java.awt.Color(255, 255, 255));
        siguiente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        siguiente.setForeground(new java.awt.Color(0, 102, 102));
        siguiente.setText(">");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 110, 40));

        guitarra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(guitarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 80, 30));

        dulces.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(dulces, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 80, 30));

        casa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        casa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casaActionPerformed(evt);
            }
        });
        getContentPane().add(casa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 80, 30));

        tortuga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tortuga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(tortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 80, 30));

        list.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tortuga", "Casa", "Dulces", "Guitarra" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        list.setDragEnabled(true);
        jScrollPane1.setViewportView(list);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 80, 120));

        title.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        title.setForeground(new java.awt.Color(0, 204, 204));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Escribamos!");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 840, 60));

        expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/expresion1.PNG"))); // NOI18N
        getContentPane().add(expresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Instrucciones:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Une las palabras con su imagen.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 270, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/spanish/Casita.jpg"))); // NOI18N
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 200, 200));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 220, 220));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/spanish/Tortugus.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 200));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/spanish/Guitarra.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 200));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 220));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/spanish/Dulces.jpg"))); // NOI18N
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 190, 200));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 210, 220));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/spanish/backgrounds/paisaje4.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 650));

        jMenu1.setText("Menu");

        MenuPrincipal.setText("Menu Principal");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(MenuPrincipal);

        jMenuItem1.setText("Volver");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        menu.add(jMenu1);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        HistorialController.back();
    }//GEN-LAST:event_volverActionPerformed

    private void verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarActionPerformed
        javax.swing.JTextField[] texts = {tortuga,casa,dulces,guitarra};
        String[] respuestas = {"Tortuga","Casa","Dulces","Guitarra"};
        for(int i = 0; i<texts.length;i++){
            if(texts[i].getText().equalsIgnoreCase(respuestas[i])){
                texts[i].setForeground(Color.GREEN);
                expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/correcto.gif")));
            } else {
                texts[i].setForeground(Color.RED);
                expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/triste.gif")));
            }
        }
    }//GEN-LAST:event_verificarActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        HistorialController.next(new Gato());
    }//GEN-LAST:event_siguienteActionPerformed

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        // TODO add your handling code here:
        HistorialController.nextMain();
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void casaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        HistorialController.back();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        // TODO add your handling code here:
        tortuga.setText("");
        casa.setText("");
        dulces.setText("");
        guitarra.setText("");
        tortuga.setForeground(Color.BLACK);
        casa.setForeground(Color.BLACK);
        dulces.setForeground(Color.BLACK);
        guitarra.setForeground(Color.BLACK);
        expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/expresion1.PNG")));
    }//GEN-LAST:event_reiniciarActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        playSound("ahh","wav");
    }//GEN-LAST:event_jLabel9MouseClicked

    public void playSound(String soundName, String soundExt){
        try {
            Clip sound = AudioSystem.getClip();
            sound.open(
                    AudioSystem.getAudioInputStream(getClass().getResourceAsStream(
                            String.format("/resources/sounds/main/%s.%s", soundName, soundExt)
                    ))
            );
            sound.start();
            Thread.sleep(100);
        } catch( IOException | InterruptedException | LineUnavailableException | UnsupportedAudioFileException e ) {
            System.out.println(e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(NameToImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NameToImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NameToImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NameToImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NameToImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuPrincipal;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel background;
    private javax.swing.JTextField casa;
    private javax.swing.JTextField dulces;
    private javax.swing.JLabel expresion;
    private javax.swing.JTextField guitarra;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList<String> list;
    private javax.swing.JMenuBar menu;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel title;
    private javax.swing.JTextField tortuga;
    private javax.swing.JButton verificar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
