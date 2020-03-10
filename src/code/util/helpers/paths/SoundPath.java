/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util.helpers.paths;

import code.util.helpers.Path;

/**
 *
 * @author tavar
 */
public class SoundPath extends Path<SoundPath> {
    // Variables modificable
    private static final String DEFAULT_EXTENSION = "wav";
    private static final String DEFAULT_FOLDER = "sounds";
    
    public SoundPath(String name) {
        super(DEFAULT_FOLDER);
        super.setExtension(DEFAULT_EXTENSION);
        
        super.name = name;
    }
    
    @Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof SoundPath)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        SoundPath s = (SoundPath) o; 
          
        // Compare the data members and return accordingly  
        return this.getFullPath().equals(s.getFullPath());
    } 
}
