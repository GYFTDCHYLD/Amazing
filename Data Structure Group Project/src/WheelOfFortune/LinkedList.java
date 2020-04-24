package WheelOfFortune;

public class LinkedList {
	private Node head;
	private Node tail;

	public LinkedList(){
		head = null;
		tail = null;
	}
	
	public boolean Empty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}	
	}
	
	
	@SuppressWarnings("unused")
	public boolean Full() {
		Node temp = new Node();
		if(temp == null) {
			return true;
		}else {
			temp = null;
			return false;
		}	
	}

	
	
	public boolean circulyList(Card cardObject, Contestant player, Puzzle puzzle) { /** create a linked list for both Player and Card **/
		if(Full()) {
			System.out.println("List is full");
			return false;	
		}else {
			Node nextValue = new  Node();
			if(cardObject != null)
				nextValue.setCardData(cardObject);
			else if (player != null)
				nextValue.setPlayerData(player);
			else
				nextValue.setPuzzleData(puzzle);
			if(Empty()){
				head = nextValue;
				tail = nextValue;
			}else {
				tail.setNext(nextValue);
				nextValue.setPrev(tail);
				tail = nextValue;
			}
			tail.setNext(head);
			head.setPrev(tail);
			return true;
		}
	}
	
	
	public Node selectRandomPuzzle(int selectedIndex, int TotalPuzzles) {/** select a puzzle at random and remove the selected puzzle from the linked list **/
		System.out.println(" Total amount of puzzle            : " + TotalPuzzles + "\n Puzzle Number selected at Random  : " + (selectedIndex+1));
		int index = 0, middleIndex = (TotalPuzzles/2); /** divide the amount of puzzle by two for searching efficiency  **/
		boolean greater = false;
		Node current = head;
		if (selectedIndex > middleIndex) {
			greater = true;
			current = tail;
			selectedIndex = TotalPuzzles-(selectedIndex+2);/** Initialize the selected index, to the value of(total puzzle minus the index of the selected puzzle)   **/
		}System.out.println(" Middle index     (" + TotalPuzzles +"/ 2)          : " + middleIndex);
		if(head == tail) {
			head = null;
			tail = null;
		}else {int iteration = 0;
			while(index <= selectedIndex ) {
				if(!greater) {
					if(index > 0) {
						current = current.getNext();
						iteration ++;
					}
				}else { 
					iteration ++;
					current = current.getPrev();
				}
			index++;
			}System.out.println(" Iteration(s) needed to find Puzzle: " + (iteration));
			Node temp = current;
			temp.getNext().setPrev(temp.getPrev());
			temp.getPrev().setNext(temp.getNext());
			current = null;
			return temp;
		}
		return current;
	}
	

	
	public Node SelectNextNode(){/** used for player, puzzle and card selection **/
		Node current = head;
		Node Data = new  Node();
		if(!Empty()) {
			Data = current;
			head = head.getNext();
			tail = current;
		}
		return Data;
	}
	
	public Node BackTrack(){/** used for player, puzzle and card selection **/
		Node current = head;
		Node Data = new  Node();
		if(!Empty()) {
			Data = current;
			head = head.getPrev();
			tail = current;
		}
		return Data;
	}
			

	
	
	public void resetRoundTotals(int numOfPlater){
		if(Empty())
			return;
		else{
			Node current = head;
			for(int i = 0; i < numOfPlater; i++) {
				if(current.getPlayerData().getRoundTotal() > 0) {
					current.getPlayerData().setRoundTotal(0);
				}
			current = current.getNext();
			}
		}
	}
	
	

	public void deleteFromHead(){
		if(Empty())
			return;
		else {
			head.setPrev(null);
			tail.setNext(null);
			if(head == tail) {
				head = null;
				tail = null;
			}else {
				Node delete = head;
				head = delete.getNext();
				delete = null;
			}
		}
	}
	
	
	public void destroy() {
		while(!Empty()) {
			deleteFromHead();
		}
	}
	
	
}