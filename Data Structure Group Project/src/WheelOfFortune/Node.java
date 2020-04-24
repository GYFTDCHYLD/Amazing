package WheelOfFortune;

public class Node {
	private Contestant playerData;
	private Card cardData;
	private Puzzle puzzleData;
	private Guess GuessData;
	private Node next;
	private Node prev;
	
	
	public Node() {
		super();
	}	
	
	
	
	public Node(Contestant player) {
		this.playerData = player;
	}
	
	public Node(Card Data) {
		this.cardData = Data;
	}
	
	public Node(Puzzle Word) {
		this.puzzleData = Word;
	}
	
	
	public Node(Card Data, Puzzle Word, Node Next) {
		this.cardData = Data;
		this.puzzleData = Word;
		this.next = Next;
	}
	
	
	
	public Node(Contestant player, Card cardData, Puzzle puzzleData, Node next, Node prev) {
		this.playerData = player;
		this.cardData = cardData;
		this.puzzleData = puzzleData;
		this.next = next;
		this.prev = prev;
	}


	public Node(Node copy) {
		this.playerData = copy.playerData;
		this.cardData = copy.cardData;
		this.puzzleData = copy.puzzleData;
		this.prev = copy.prev;
		this.next = copy.next;
	}


	public Card getCardData() {
		return cardData;
	}


	public void setCardData(Card cardData) {
		this.cardData = cardData;
	}


	public Puzzle getPuzzleData() {
		return puzzleData;
	}


	public void setPuzzleData(Puzzle puzzleData) {
		this.puzzleData = puzzleData;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


	public Node getPrev() {
		return prev;
	}


	public void setPrev(Node prev) {
		this.prev = prev;
	}


	public Contestant getPlayerData() {
		return playerData;
	}


	public void setPlayerData(Contestant player) {
		this.playerData = player;
	}



	public Guess getGuessData() {
		return GuessData;
	}



	public void setGuessData(Guess guessData) {
		GuessData = guessData;
	}

}
