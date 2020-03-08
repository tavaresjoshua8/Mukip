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
public class ImagePath extends Path<ImagePath> {
    // Variables modificable
    private static final String DEFAULT_EXTENSION = "png";
    private static final String DEFAULT_FOLDER = "images";
    
    public ImagePath(String name) {
        super(DEFAULT_FOLDER);
        super.setExtension(DEFAULT_EXTENSION);
        
        super.name = name;
    }
}
