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
public class SoundPath {
    // Constants
    private final String SOUND_PATH = "/resources/sounds/";
    
    // Variables
    private String name; 
    private String path = SOUND_PATH;
    private String ext = ".wav";
    
    /**
     *
     * @param name Name of the file
     */
    public SoundPath(String name){
        this.name = name;
    }
    
    /**
     *
     * @param folder Not include "/" final or starter
     * Example: setFolder("grades/first/spanish/spanish")
     */
    public SoundPath setFolder(String folder){
        this.path = SOUND_PATH + folder + "/";
        return this;
    }
    
    /**
     *
     * @param ext Use only name, without "."
     * Example: setExtension("wav")
     */
    public SoundPath setExtension(String ext){
        this.ext = "." + ext;
        return this;
    }
    
    /**
     *
     * @return /resources/sounds/folder/name.extension
     * Example: /resources/sounds/grades/first/spanish/alphabet/a.wav
     */
    public String getFullPath(){
        return this.path + this.name + this.ext;
    }
}
