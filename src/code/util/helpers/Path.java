/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.helpers;

/**
 *
 * @author tavar
 * @param <T> Subclass
 */
public abstract class Path<T> {
    // Constants
    private final String BASE_PATH = "/resources/";
    
    // Variables
    protected String name; 
    protected String path;
    protected String ext;
    
    /**
     *
     * @param defaultPath /resources/sounds/
     */
    public Path(String defaultPath){
        this.path = BASE_PATH + defaultPath + "/";
    }
    
    /**
     *
     * @param folder Not include "/" final or starter
     * Example: inFolder("grades/first/spanish")
     * Example2: inFolder("grades").inFolder("first").inFolder("spanish")
     */
    public T inFolder(String folder){
        this.path += folder + "/";
        return (T)this;
    }
    
    /**
     *
     * @param ext Use only name, without "."
     * Example: setExtension("wav")
     */
    public T setExtension(String ext){
        this.ext = "." + ext;
        return (T)this;
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
