/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.helpers;

import code.util.helpers.paths.ImagePath;
import code.util.helpers.paths.SoundPath;

/**
 *
 * @author tavar
 */
public abstract class Story {
    private final String STORIES_PATH = "grades/first/stories/";
    
    public String name;
    protected ImagePath image;
    protected SoundPath sound;
    
    public Story(String name, String folder){
        this.name = name;
        this.image = new ImagePath( this.name ).inFolder(this.STORIES_PATH + folder);
        this.sound = new SoundPath( this.name ).inFolder(this.STORIES_PATH + folder);
    }
    
    public String getImagePath(){
        return this.image.getFullPath();
    }
    
    public SoundPath getSound(){
        return this.sound;
    }
}
