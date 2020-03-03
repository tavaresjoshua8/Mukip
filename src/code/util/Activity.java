/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util;

/**
 *
 * @author tavar
 */
public class Activity {
    public String name;
    public String image;
    public javax.swing.JFrame frame;
       
    public Activity(String name, String image, javax.swing.JFrame frame){
        this.name = name;
        this.image = image;
        this.frame = frame;
    }
        
    public Activity(String name, javax.swing.JFrame frame){
        this.name = name;
        this.image = name.toLowerCase();
        this.frame = frame;
    }
}