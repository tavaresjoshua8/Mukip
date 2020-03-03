/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util;

import java.awt.Color;
import java.util.Locale;

/**
 *
 * @author tavar
 */
public class Letter {
    
    public char name;
    private String reference;
    public Color color;
    
    public Letter(char name, String reference, Color color){
        this.name = name; // a
        this.reference = reference; // Abeja
        this.color = color; // Green
    }
    
    public String getReference(){
        // A de Abeja
        return this.getNameUpperCase() + " de " + this.reference;
    }
    
    public String getStringName(){
        return String.valueOf(this.name);
    }
    
    private String getNameUpperCase(){
        return String.valueOf(this.name).toUpperCase();
    }
}
