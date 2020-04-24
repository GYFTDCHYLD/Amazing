package WheelOfFortune;

public class Puzzle {
	private String Category;
	private String Word;
	
	
	public Puzzle() {
		super();
	}
	
	public Puzzle(String category, String word) {
		Category = category;
		Word = word;
	}
	
	public Puzzle(Puzzle copy) {
		Category = copy.Category;
		Word = copy.Word;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getWord() {
		return Word;
	}

	public void setWord(String word) {
		Word = word;
	}

	@Override
	public String toString() {
		return "Puzzle [Category = " + Category + ", Word = " + Word + "]";
	}
	
	
	public void display() {
		System.out.println(toString());
	}

}
