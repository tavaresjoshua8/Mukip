/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.controllers;

import code.menu.Home;
import code.menu.Loading;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author tavar
 */
public class HistorialController {
    // Variables Declaration
    private static Stack historial;
    private static JFrame actualFrame;
    
    public HistorialController() throws InterruptedException{
        historial = new Stack();
        Loading load = new Loading();
        actualFrame = load;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                load.setVisible(true);
            }
        });
        
        for(int i = 0; i <=100; i++){
            Thread.sleep(50);
            load.progressBar.setValue(i);
        }
        
        Thread.sleep(300);
        next( new Home() );
    }
    
    // Go to the back frame
    public static void back(){
        // Close and delete actual frame
        historial.pop();
        actualFrame.dispose();
        
        try{
            // Exist latest frame?
            actualFrame = (JFrame) historial.lastElement();
            actualFrame.setVisible(true);
        } catch(Exception e){
            // Else start in main
            next(new Home());
        }
    }
    
    // Request new Frame
    public static void next(JFrame frame){
        try{ // Close actual frame
            actualFrame.dispose();
        } catch(Exception e){
            System.out.println(e);
        }
        
        actualFrame = frame;
        historial.push(actualFrame);
        actualFrame.setVisible(true);
    }
    
    public static void nextMain(){
        historial.clear();
        next( new Home() );
    }
    
    public static void main(String[] args) throws InterruptedException {
        new HistorialController();
    }
}
