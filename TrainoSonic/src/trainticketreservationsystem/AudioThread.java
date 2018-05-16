/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketreservationsystem;

import GUI.AdminJFrame;
import GUI.LoginJFrame;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class AudioThread extends Thread {
    
    public boolean running = true;
    String path;
    public AudioThread(String path){
        this.path=path;
    }
    public void run() {
        while (running) // stop when running is false
        {
            this.audio();	// sleep for a time periold
        }
    }

    private void audio() {
        InputStream in;
        AudioStream as = null;

        try {
            in = new FileInputStream(path);
            as = new AudioStream(in);
        } catch (FileNotFoundException e) {
            System.out.println("Audio file not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Incorrect input.");
            e.printStackTrace();
        }
        AudioPlayer.player.start(as);
    }


}
