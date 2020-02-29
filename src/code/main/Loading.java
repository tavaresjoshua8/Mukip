/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.main;

import code.main.Home;

/**
 *
 * @author hp
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    public Loading() {
        initComponents();
        preparePhrases();
    }
    
   private void preparePhrases(){
       String[] phrases = {
           "Consejo de Prueba 1",
           "Consejo de Prueba 2",
           "Consejo de Prueba 3",
           "Consejo de Prueba 4",
           "Consejo de Prueba 5",
           "Consejo de Prueba 6",
           "Consejo de Prueba 7",
           "Consejo de Prueba 8",
           "Consejo de Prueba 9",
           "Consejo de Prueba 10"
       };
       
       int selectedPhrase = (int) Math.round( Math.random() * (phrases.length + 1) ) - 1;
       
       this.phrase.setText( phrases[selectedPhrase] );
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
        progressBar = new javax.swing.JProgressBar();
        phrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setForeground(new java.awt.Color(0, 153, 204));
        progressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 270, 20));

        phrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phrase.setText("phrase");
        jPanel1.add(phrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main/backgrounds/loading.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 300, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(294, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        /* Set the Nimbus look and feel */
        Loading load = new Loading();
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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                load.setVisible(true);
            }
        });
        
        try{
            for(int i = 0; i <=100; i++){
                Thread.sleep(80);
                load.progressBar.setValue(i);
            }
        }catch(Exception E){}
        Thread.sleep(300);
        load.dispose();
        new Home().setVisible(true);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel phrase;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
