package sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import sun.tools.jar.Main;


import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
public class sound extends JFrame{
	
	public sound() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("Test Sound Clip");
	    this.setSize(300, 200);
	    this.setVisible(true);

	      try {
	         URL url = this.getClass().getClassLoader().getResource("untitled.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	         System.out.println("1");
	      } catch (IOException e) {
	         e.printStackTrace();
	         System.out.println("2");
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	         System.out.println("3");
	      }
	   }
	
	public static void main(String[] args){
		 new sound();
	}

}
