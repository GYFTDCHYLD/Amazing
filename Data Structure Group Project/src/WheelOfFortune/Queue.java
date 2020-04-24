package WheelOfFortune;

public class Queue {
	
	private Node Front;
	private Node Rear;
	
	
	public Queue() { 
		Front = null;
		Rear = null;
	}
	
	public boolean Empty() {
		if(Front == null) {
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

	public boolean EnQueue(Guess guess) { /** Que guessed letters **/
		if(Full()) {
			System.out.println("List is full");
			return false;	
		}else {
			Node nextItem = new  Node();
				nextItem.setGuessData(guess);
			if(Empty()){
				Front = nextItem;
				Rear = nextItem;
			}else {
				nextItem.setPrev(Rear);
				Rear.setNext(nextItem);
				Rear = nextItem;
			}
			
			return true;
		}
	}

	public Guess DeQueue() { /** DeQue guessed letters **/
		Node nodeToDelete = Front;
		Guess Data = nodeToDelete.getGuessData();
		if(Empty()) {
			System.err.println("the Queue is empty");
		}else {
			if(Front == Rear) {
				Front = null;
				Rear = null;
			}else {
				Front = Front.getNext();
				Front.setPrev(null);
				nodeToDelete = null;
			}
		}
		return Data;
	}
	
	public boolean search(String enteredLetter) { /** search for already guessed letter  **/
		if(!Empty()){
			Queue temp = new Queue();/** create a temporary Queue  **/
			Guess current;
			boolean found = false;
			while (!Empty() && !found) {
				current = DeQueue();
				if(current.getGuessed().equals(enteredLetter)) {
					found = true;
				}
				temp.EnQueue(current); /** Dequeue from original and Enqueue into temporary Queue  **/
			}
			while (temp.Front != null) {
				EnQueue(temp.DeQueue());/** Dequeue from  temporary  and Enqueue into original Queue  **/
			}
			if (found)
				return true;
		}
		return false;
	}

	public void display(String typeOfLetter) {/** display guessed letter  **/
		if(Empty())
			return;
		else{
			Queue temp = new Queue();/** create a temporary Queue  **/
			Guess current;
			while (!Empty()) {
				current = DeQueue();
				if( typeOfLetter.equals("VOWELS")){
					if(current.getGuessed().equals("A") | current.getGuessed().equals("E") | current.getGuessed().equals("I") | current.getGuessed().equals("O") | current.getGuessed().equals("U")) {
						current.display();
					}
				}else if( typeOfLetter.equals("REGULAR")) {
					if(!(current.getGuessed().equals("A") | current.getGuessed().equals("E") | current.getGuessed().equals("I") | current.getGuessed().equals("O") | current.getGuessed().equals("U"))) {
						current.display();
					}
				}
				temp.EnQueue(current); /** Dequeue from original and Enqueue into temporary Queue  **/
			}
			while (temp.Front != null) {
				EnQueue(temp.DeQueue());/** Dequeue from  temporary  and Enqueue into original Queue  **/
			}
		}
	}
	

	public void destroyQueue() {// destroy guessed linked list
		while(!Empty()) {
			DeQueue();
		}
	}

}