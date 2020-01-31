package SmokeDetector;

public class SmokeDetector {
	//private  ArrayList<Room> rooms = new ArrayList<Room>();
	private Room rooms[] = new Room[2];
	//private int MAX = rooms.length;
	private float treshhold;
	private int numberOfRooms = 0; 

	public SmokeDetector() {
		super();  
	}

	public SmokeDetector(float treshhold) {
		super();
		this.treshhold = treshhold;
	}

	public /* ArrayList<Room> */Room[]  getRoom() {
		return rooms;
	}

	public int getRoomCount() {
		return numberOfRooms;
	}

	public float getTreshhold() {
		return treshhold;
	}

	public void setTreshhold(float treshhold) {
		this.treshhold = treshhold;
	}

	public boolean addRoomToBeMonitored(Room room) {
		if (getRoomCount() < rooms.length ) {
			rooms[numberOfRooms] = room; 
			//rooms.add(room); 
			numberOfRooms++;
			return true;
		}
		else
			System.out.println(" Can only monitor a maximum of " + rooms.length + " rooms");
			return false;
	}

	public boolean checkAllarm(float smokeLevel) {
		if (smokeLevel > treshhold){
			return true;
		}
		else {
			return false;
		}
	}
}