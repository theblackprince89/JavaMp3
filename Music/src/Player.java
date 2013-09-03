import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Player {

	
	public void playSound(){
	    try{
	        AudioInputStream audioInputStream = 
	        AudioSystem.getAudioInputStream(new File("E:\\Music\\Yeh Jawaani Hai Deewani (2013)\\test.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	     
	    	
	    }catch(Exception ex){
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	
	public static void main(String args[])
	{
		
		new Player().playSound();
	}
	
}
