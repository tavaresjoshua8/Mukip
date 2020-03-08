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
}
