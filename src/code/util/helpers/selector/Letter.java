/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.helpers.selector;

import code.util.helpers.paths.ImagePath;
import code.util.helpers.paths.SoundPath;
import java.awt.Color;

/**
 *
 * @author tavar
 */
public class Letter {
    
    public char name;
    private String reference;
    public Color color;
    private ImagePath image;
    private SoundPath sound;
    
    public Letter(char name, String reference, Color color){
        this.name = name; // a
        this.reference = reference; // Abeja
        this.color = color; // Green
        
        this.image = new ImagePath( this.getStringName() ).inFolder("grades/first/alphabet");
        this.sound = new SoundPath( this.getStringName() ).inFolder("grades/first/alphabet");
    }
    
    public String getReference(){
        // A de Abeja
        return this.getNameUpperCase() + " de " + this.reference;
    }
    
    public String getImagePath(){
        return this.image.getFullPath();
    }
    
    public SoundPath getSound(){
        return this.sound;
    }
    
    public String getStringName(){
        return String.valueOf(this.name);
    }
    
    private String getNameUpperCase(){
        return this.getStringName().toUpperCase();
    }
}
