/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author tavar
 */
public abstract class Sound {
    
    private static Clip sound;
    
    public static void playSound(SoundPath path) {
        // If other clip are reproducing
        stop();
        
        try {
            sound = AudioSystem.getClip();
            // read audio data from whatever source (file/classloader/etc.)
            InputStream audioSrc = Sound.class.getResourceAsStream(path.getFullPath());
            // add buffer for mark/reset support
            InputStream bufferedIn = new BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
            
            sound.open(audioStream);
            sound.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void stop(){
        try {
            sound.stop();
        } catch(Exception e) {}
    }
    
    public static void main(String[] args) throws InterruptedException {
        new HistorialController();
    }
}
