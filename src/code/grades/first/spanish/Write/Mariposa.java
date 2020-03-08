/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.grades.first.spanish.Write;

import code.menu.Home;
import code.util.controllers.HistorialController;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/**
 *
 * @author admin
 */
public class Mariposa extends javax.swing.JFrame {

    /**
     * Creates new form Mariposa
     */
    boolean back=false;
    public Mariposa() {
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

        inslabel = new javax.swing.JLabel();
        instr = new javax.swing.JLabel();
        maripsa = new javax.swing.JLabel();
        expresion = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        o = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        M = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        i = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuPrincipal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inslabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inslabel.setForeground(new java.awt.Color(0, 0, 102));
        inslabel.setText("Instrucciones:");
        getContentPane().add(inslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 140, -1));

        instr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instr.setForeground(new java.awt.Color(0, 102, 102));
        instr.setText("Completa la palabra.");
        getContentPane().add(instr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, -1));

        maripsa.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        maripsa.setForeground(new java.awt.Color(0, 204, 204));
        maripsa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(maripsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 840, 60));

        expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/expresion1.PNG"))); // NOI18N
        getContentPane().add(expresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        siguiente.setBackground(new java.awt.Color(255, 255, 255));
        siguiente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        siguiente.setForeground(new java.awt.Color(0, 102, 102));
        siguiente.setText(">");
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 170, 40));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("a");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 60, 40));

        o.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        o.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        o.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                oKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                oKeyReleased(evt);
            }
        });
        getContentPane().add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 60, 40));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("a");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 60, 40));

        M.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        M.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        M.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                MCaretUpdate(evt);
            }
        });
        M.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                MInputMethodTextChanged(evt);
            }
        });
        M.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MKeyReleased(evt);
            }
        });
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 60, 40));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("r");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 60, 40));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("p");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 60, 40));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("s");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 60, 40));

        i.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iKeyReleased(evt);
            }
        });
        getContentPane().add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 60, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/grades/first/spanish/Mariposa pintada jajaja.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 290, 250));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 310, 270));

        title.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        title.setForeground(new java.awt.Color(0, 204, 204));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Escribamos!");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 840, 60));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void volver() {
        HistorialController.back();
    }
    
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        HistorialController.next( new Galleta() );
    }//GEN-LAST:event_siguienteActionPerformed
    Icon icono;
    public void verificar() throws InterruptedException{
        javax.swing.JTextField[] campos = {M, i, o};
        String[] respuestas = {"M", "I", "O"};
        String icon = "correcto";
        
        for(int i=0; i<campos.length; i++){
            Color color = Color.GREEN;
            if( !( campos[i].getText().equalsIgnoreCase(respuestas[i]) ) ) {
                color = Color.RED;
                icon = "triste";
            }
            campos[i].setForeground(color);
        }
        
        expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/expressions/" + icon + ".gif")));
    }
    
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
    
    public void reiniciar(){
        M.setForeground(Color.BLACK);
        i.setForeground(Color.BLACK);
        o.setForeground(Color.BLACK);
        if( !(M.getText().equals("")) && !(i.getText().equals("")) && !(o.getText().equals(""))  ){
            try{verificar();}catch(Exception e){}
        }
    }
    
    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        // TODO add your handling code here:
        HistorialController.nextMain();
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        HistorialController.back();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_MCaretUpdate
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MCaretUpdate

    private void MInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_MInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_MInputMethodTextChanged

    private void MKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MKeyPressed
        // TODO add your handling code here:
        if( !( ( "M".equalsIgnoreCase(M.getText()) ) && evt.getKeyChar()=='i' ) ){
            M.setText("");
        } else {
            back=true;
        }
    }//GEN-LAST:event_MKeyPressed

    private void iKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iKeyPressed
        // TODO add your handling code here:
        if( !( ( "i".equalsIgnoreCase(i.getText()) ) && evt.getKeyChar()=='o' ) ){
            i.setText("");
        } else {
            back=true;
        }
        maripsa.setText("");
        inslabel.setText("Instrucciones:");
        instr.setText("Completa la palabra.");
    }//GEN-LAST:event_iKeyPressed

    private void MKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MKeyReleased
        // TODO add your handling code here:
        if( evt.getKeyChar() == 'M' || evt.getKeyChar()=='m') {
            i.requestFocus();
        }
        if( back ){
            M.setText("M");
            i.setText("i");
            o.requestFocus();
            back=false;
        }
        reiniciar();
    }//GEN-LAST:event_MKeyReleased

    private void iKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iKeyReleased
        // TODO add your handling code here:
        if( evt.getKeyChar() == 'i') {
            o.requestFocus();
        }
        if( evt.getKeyChar()==8 ){
            M.requestFocus();
        }
        if( back ){
            i.setText("i");
            o.setText("o");
            o.requestFocus();
            back=false;
        }
        reiniciar();
    }//GEN-LAST:event_iKeyReleased

    private void oKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oKeyPressed
        // TODO add your handling code here:
        o.setText("");
    }//GEN-LAST:event_oKeyPressed

    private void oKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oKeyReleased
        // TODO add your handling code here:
        if( evt.getKeyChar()==8 ){
            i.requestFocus();
        }
        reiniciar();
    }//GEN-LAST:event_oKeyReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        inslabel.setText("");
        instr.setText("");
        maripsa.setForeground(Color.GREEN);
        maripsa.setText("Mariposa");
        playSound("mariposa","wav");
        
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Mariposa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mariposa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mariposa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mariposa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mariposa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField M;
    private javax.swing.JMenuItem MenuPrincipal;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel background;
    private javax.swing.JLabel expresion;
    private javax.swing.JTextField i;
    private javax.swing.JLabel inslabel;
    private javax.swing.JLabel instr;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel maripsa;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextField o;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private JLabel ImageIcon(URL resource) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
