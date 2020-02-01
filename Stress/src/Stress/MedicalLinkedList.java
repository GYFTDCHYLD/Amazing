package Stress;

public class MedicalLinkedList {
	
	private Node head;
	
	public void MedicalLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}	
		return false;
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if (temp == null) {
			return true;
		}else {
			temp = null;
			return false;			
		}	
	}
	
	public boolean addToBack(Stress str) {
		if(isFull()) {
			System.out.println("This list is full");
			return false;
		}else {
			Node nextItem = new Node();
			nextItem.setData(str);
			if (isEmpty()) {
				head = nextItem;	
			}else {
				Node current = head;
				while (current.getNext() !=null){
					current = current.getNext();
				}
				current.setNext(nextItem);
			}		
			return true;
		}
	}
	
	public void display() {
		Node current = head;
		while(current  != null) {
		current.getData().display();
		current = current.getNext();	
		}
	}
}
