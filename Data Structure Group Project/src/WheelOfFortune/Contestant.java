package WheelOfFortune;

public class Contestant {
	private String name;
	private int playerNumber;
	private float roundTotal;
	private float grandTotal;
	int wins = 0;
	

	public Contestant() {
		this.name = "";
		this.playerNumber = 0;
		this.roundTotal = (float) 0.00;
		this.grandTotal = (float) 0.00;
	}
	
	public Contestant(String name, int playerNumber, float roundTotal, float grandTotal) {
		super();
		this.name = name;
		this.playerNumber = playerNumber;
		this.roundTotal = roundTotal;
		this.grandTotal = grandTotal;
	}
	

	public Contestant(Contestant copy) {
		super();
		this.name = copy.name;
		this.roundTotal = copy.roundTotal;
		this.grandTotal = copy.grandTotal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getRoundTotal() {
		return roundTotal;
	}
	public void setRoundTotal(float roundTotal) {
		this.roundTotal = roundTotal;
	}
	
	public float getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	public int getWin() {
		return wins;
	}

	public void setWin(int win) {
		this.wins = win;
	}
	
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	@Override
	public String toString() {
		return "\n\t\t\tPlayers "+ playerNumber + " [ Name: " + name + ", roundTotal: $" + roundTotal + ", grandTotal: $" + grandTotal + "] \t";
	}
	
	public void display() {
		System.out.print("\n \t\t\t"+toString());
	}

}
