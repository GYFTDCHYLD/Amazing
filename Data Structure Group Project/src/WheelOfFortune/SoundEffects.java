package WheelOfFortune;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundEffects {
	private File sound;
	
	public void setSound(String option){
		switch (option){
		case "welcome": sound = new File("soundEffects/welcome.wav");
			break;
		case "wheel": sound = new File("soundEffects/wheel.wav");
			break;
		case "buzz": sound = new File("soundEffects/buzz.wav");
			break;
		case "ding": sound = new File("soundEffects/ding.wav");
			break;
		case "round ended": sound = new File("soundEffects/round ended.wav");
			break;
		case "credits": sound = new File("soundEffects/credits.wav");
			break;
		case "the category is": sound = new File("soundEffects/the category is.wav");
			break;
		case "people": sound = new File("soundEffects/Category/people.wav");
			break;
		case "place": sound = new File("soundEffects/Category/place.wav");
			break;
		case "animal": sound = new File("soundEffects/Category/animal.wav");
			break;
		case "thing": sound = new File("soundEffects/Category/thing.wav");
			break;
		case "applause": sound = new File("soundEffects/applause.wav");
			break;
		case "500": sound = new File("soundEffects/Value/500.wav");
			break;
		case "550": sound = new File("soundEffects/Value/550.wav");
			break;
		case "600": sound = new File("soundEffects/Value/600.wav");
			break;
		case "650": sound = new File("soundEffects/Value/650.wav");
			break;
		case "700": sound = new File("soundEffects/Value/700.wav");
			break;
		case "800": sound = new File("soundEffects/Value/800.wav");
			break;
		case "850": sound = new File("soundEffects/Value/850.wav");
			break;
		case "900": sound = new File("soundEffects/Value/900.wav");
			break;
		case "1500": sound = new File("soundEffects/Value/1500.wav");
			break;
		case "2000": sound = new File("soundEffects/Value/2000.wav");
			break;
		case "2500": sound = new File("soundEffects/Value/2500.wav");
			break;
		case "1": sound = new File("soundEffects/number/1.wav");
			break;
		case "2": sound = new File("soundEffects/number/2.wav");
			break;
		case "3": sound = new File("soundEffects/number/3.wav");
			break;
		case "4": sound = new File("soundEffects/number/4.wav");
			break;
		case "5": sound = new File("soundEffects/number/5.wav");
			break;
		case "6": sound = new File("soundEffects/number/6.wav");
			break;
		case "a": sound = new File("soundEffects/alphabet/a.wav");
			break;
		case "b": sound = new File("soundEffects/alphabet/b.wav");
			break;
		case "c": sound = new File("soundEffects/alphabet/c.wav");
			break;
		case "d": sound = new File("soundEffects/alphabet/d.wav");
			break;
		case "e": sound = new File("soundEffects/alphabet/e.wav");
			break;
		case "f": sound = new File("soundEffects/alphabet/f.wav");
			break;
		case "g": sound = new File("soundEffects/alphabet/g.wav");
			break;
		case "h": sound = new File("soundEffects/alphabet/h.wav");
			break;
		case "i": sound = new File("soundEffects/alphabet/i.wav");
			break;
		case "j": sound = new File("soundEffects/alphabet/j.wav");
			break;
		case "k": sound = new File("soundEffects/alphabet/k.wav");
			break;
		case "l": sound = new File("soundEffects/alphabet/l.wav");
			break;
		case "m": sound = new File("soundEffects/alphabet/m.wav");
			break;
		case "n": sound = new File("soundEffects/alphabet/n.wav");
			break;
		case "o": sound = new File("soundEffects/alphabet/o.wav");
			break;
		case "p": sound = new File("soundEffects/alphabet/p.wav");
			break;
		case "q": sound = new File("soundEffects/alphabet/q.wav");
			break;
		case "r": sound = new File("soundEffects/alphabet/r.wav");
			break;
		case "s": sound = new File("soundEffects/alphabet/s.wav");
			break;
		case "t": sound = new File("soundEffects/alphabet/t.wav");
			break;
		case "u": sound = new File("soundEffects/alphabet/u.wav");
			break;
		case "v": sound = new File("soundEffects/alphabet/v.wav");
			break;
		case "w": sound = new File("soundEffects/alphabet/w.wav");
			break;
		case "x": sound = new File("soundEffects/alphabet/x.wav");
			break;
		case "y": sound = new File("soundEffects/alphabet/y.wav");
			break;
		case "z": sound = new File("soundEffects/alphabet/z.wav");
			break;
		default: 
				sound = new File("soundEffects/bankrupt.wav");
		}
	}


	public void PlaySound(File sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
		}catch(Exception e) {
			
		}
	}


	public File getSound() {
		return sound;
	}

}
