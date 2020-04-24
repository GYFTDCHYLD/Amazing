package WheelOfFortune;

public class Card {
	private String Type;
	private float values;
	
	
	
	public Card() {
		super();
	}


	public Card(String type, float values) {
		super();
		Type = type;
		this.values = values;
	}

	public Card(Card copy) {
		super();
		Type = copy.Type;
		this.values = copy.values;
	}

	

	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public float getValues() {
		return values;
	}


	public void setValues(float values) {
		this.values = values;
	}


	@Override
	public String toString() {
		return "[Type : " + Type + "( values = $" + values + " )]";
	}



	public void display() {
		System.out.print(toString());
	}
}
