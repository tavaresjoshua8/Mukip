/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.helpers.selector;

import code.util.helpers.paths.ImagePath;
import code.util.helpers.paths.SoundPath;

/**
 *
 * @author tavar
 */
public class Story {
    private static final String BASE_PATH = "grades/first/stories/storySelector";
    
    public String name;
    public ImagePath image;
    public SoundPath sound;
    public javax.swing.JFrame frame;
    
    public Story(String name, String file, javax.swing.JFrame frame){
        this.name = name;
        this.frame = frame;
        
        setImageAndSound(file);
    }
        
    public Story(String name, javax.swing.JFrame frame){
        this.name = name;
        this.frame = frame;
        
        setImageAndSound( name.toLowerCase() );
    }
    
    private void setImageAndSound(String name){
        this.image = new ImagePath( name ).inFolder(BASE_PATH);
        this.sound = new SoundPath( name ).inFolder(BASE_PATH);
    }
}
