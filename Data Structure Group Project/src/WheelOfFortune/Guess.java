package WheelOfFortune;

public class Guess {
	private String guessed;
	
	
	
	public Guess() {
		super();
	}
	

	public Guess(String guessed) {
		super();
		this.guessed = guessed;
	}
	
	


	public String getGuessed() {
		return guessed;
	}


	public void setGuessed(String guessed) {
		this.guessed = guessed;
	}


	public void display() {
		System.out.print(guessed);
	}

}
