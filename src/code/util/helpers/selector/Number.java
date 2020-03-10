/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.helpers.selector;

import code.util.helpers.paths.ImagePath;
import java.awt.Color;

/**
 *
 * @author tavar
 */
public class Number {
    private final String STORIES_PATH = "grades/first/numbers";
    
    public String name;
    protected ImagePath image;
    public Color color;
    
    public Number(String name, char file, Color color){
        this.name = name;
        this.color = color;
        String fil = String.valueOf(file);
        this.image = new ImagePath( fil ).inFolder(STORIES_PATH);
    }
    
    public String getImagePath(){
        return this.image.getFullPath();
    }
}
