/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.helpers.stories;

import code.util.helpers.Story;

/**
 *
 * @author tavar
 */
public class MyLuckyDay extends Story {
    
    private static final String FOLDER = "MyLuckyDay";
    
    public MyLuckyDay(String name) {
        super(name, FOLDER);
    }
    
    public MyLuckyDay(char name){
        super( String.valueOf(name), FOLDER );
    }
    
    public void setImageExt(String ext){
        this.image.setExtension(ext);
    }
    
    public void setSoundExt(String ext){
        this.sound.setExtension(ext);
    }
}