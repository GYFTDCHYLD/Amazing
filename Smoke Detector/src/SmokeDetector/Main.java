package SmokeDetector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room Room1 = new Room();
		Room1.setName("Lab C");
		Room1.setCapacity(23);
		
		Room Room2 = new Room("Lab A", 20);
		
		Room Room3 = new Room(Room1);
		Room3.setName("Lab B");
		
		SmokeDetector Detector = new SmokeDetector((float)50.0);
		
		Detector.addRoomToBeMonitored(Room1);
		Detector.addRoomToBeMonitored(Room2);
		Detector.addRoomToBeMonitored(Room3);
		
		
		
		if(Detector.checkAllarm((float)75.0)) {
			System.out.println("\n " + Detector.getRoomCount() + " Rooms are at risk");
			for(int i=0; i < Detector.getRoomCount(); i++) {
				System.out.println(Detector.getRoom()[i].display());
			}
		}else {
			System.out.println("\n " + Detector.getRoomCount() + " Rooms are safe");
		}
		
		if(Detector.checkAllarm((float)35.0)) {
			System.out.println("\n " +Detector.getRoomCount() + " Rooms are at risk");
			for(int i=0; i < Detector.getRoomCount(); i++) {
				System.out.println(Detector.getRoom()[i].display());
			}
		}else {
			System.out.println("\n " +Detector.getRoomCount() + " Rooms are safe");
		}
	}
}