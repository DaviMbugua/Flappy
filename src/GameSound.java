//Authors are David Mbugua and Irene Mutamuliza
import java.io.File;
import javax.sound.sampled.*;

public class GameSound {

	private File sound;

	public GameSound(String audioFilePath){
		this.sound = new File(audioFilePath);
	}

	//Plays the audio file as received as parameters
	public boolean playAudioFeedback(){
		try{
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			return true;
		}
		catch(Exception e) {
			throw new RuntimeException("Sound file loading error!");
		}
	}

}
