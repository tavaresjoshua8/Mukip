/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.grades.first.spanish.Options;

import code.grades.first.spanish.Write.Carro;
import code.menu.Home;
import code.util.controllers.HistorialController;
import java.awt.Color;

/**
 *
 * @author admin
 */
public class Zapato extends javax.swing.JFrame {

    /**
     * Creates new form Zapato
     */
    public Zapato() {
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

        grupoZapatoxD = new javax.swing.ButtonGroup();
        volver = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        n = new javax.swing.JLabel();
        z1 = new javax.swing.JRadioButton();
        z2 = new javax.swing.JRadioButton();
        b = new javax.swing.JLabel();
        z3 = new javax.swing.JRadioButton();
        m = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        expresion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 170, 40));

        siguiente.setBackground(new java.awt.Color(255, 255, 255));
        siguiente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        siguiente.setForeground(new java.awt.Color(0, 102, 102));
        siguiente.setText(">");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 190, 40));

        title.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        title.setForeground(new java.awt.Color(0, 204, 204));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Escribamos!");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 840, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Instrucciones:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Completa la palabra.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n.setText("Pazato");
        jPanel4.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));

        grupoZapatoxD.add(z1);
        z1.setSelected(true);
        z1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z1ActionPerformed(evt);
            }
        });
        jPanel4.add(z1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        grupoZapatoxD.add(z2);
        z2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z2ActionPerformed(evt);
            }
        });
        jPanel4.add(z2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b.setText("Zapato");
        jPanel4.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 40));

        grupoZapatoxD.add(z3);
        z3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z3ActionPerformed(evt);
            }
        });
        jPanel4.add(z3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        m.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m.setText("Topaza");
        jPanel4.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 570, 60));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 590, 80));

        expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/expresion1.PNG"))); // NOI18N
        getContentPane().add(expresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/spanish/Papato.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 290, 250));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 310, 270));

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

    public void volver(){
        HistorialController.back();
    }
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        volver();
    }//GEN-LAST:event_volverActionPerformed

    public void verificar(){
        if(z1.isSelected()){
            n.setForeground(Color.RED);
            b.setForeground(Color.BLACK);
            m.setForeground(Color.BLACK);
            expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/triste.gif")));
        }
        if(z2.isSelected()){
            b.setForeground(Color.GREEN);
            n.setForeground(Color.BLACK);
            m.setForeground(Color.BLACK);
            expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/correcto.gif")));
        }
        if(z3.isSelected()){
            m.setForeground(Color.RED);
            b.setForeground(Color.BLACK);
            n.setForeground(Color.BLACK);
            expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/triste.gif")));
        }
    }
    
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        HistorialController.next( new Conejo() );
    }//GEN-LAST:event_siguienteActionPerformed

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        // TODO add your handling code here:
        HistorialController.nextMain();
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        volver();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z2ActionPerformed
        // TODO add your handling code here:
        verificar();
    }//GEN-LAST:event_z2ActionPerformed

    private void z1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z1ActionPerformed
        // TODO add your handling code here:
        verificar();
    }//GEN-LAST:event_z1ActionPerformed

    private void z3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z3ActionPerformed
        // TODO add your handling code here:
        verificar();
    }//GEN-LAST:event_z3ActionPerformed

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
            java.util.logging.Logger.getLogger(Zapato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zapato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zapato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zapato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zapato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuPrincipal;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel b;
    private javax.swing.JLabel background;
    private javax.swing.JLabel expresion;
    private javax.swing.ButtonGroup grupoZapatoxD;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel m;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel n;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel title;
    private javax.swing.JButton volver;
    private javax.swing.JRadioButton z1;
    private javax.swing.JRadioButton z2;
    private javax.swing.JRadioButton z3;
    // End of variables declaration//GEN-END:variables
}
