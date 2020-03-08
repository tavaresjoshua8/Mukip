/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.helpers.selector;

import code.util.helpers.paths.ImagePath;

/**
 *
 * @author tavar
 */
public class Activity {
    private static final String BASE_PATH = "GameSelector";
    
    public String name;
    public ImagePath image;
    public javax.swing.JFrame frame;
       
    public Activity(String name, String image, javax.swing.JFrame frame){
        this.name = name;
        this.frame = frame;
        
        setImage(image);
    }
        
    public Activity(String name, javax.swing.JFrame frame){
        this.name = name;
        this.frame = frame;
        
        setImage( name.toLowerCase() );
    }
    
    private void setImage(String name){
        this.image = new ImagePath( name ).inFolder(BASE_PATH);
    }
}