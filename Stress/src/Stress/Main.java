package Stress;

public class Main {

	public static void main(String[] args) {
		Stress items[] = new Stress[]{
			new	Stress(1, "Girl", 1000000000),
			new	Stress(2, "School", 312000),
			new	Stress(3, "Work", -1),
		};
		
		MedicalLinkedList list = new MedicalLinkedList();
		for (int i = 0; i < 3; i++) {
			list.addToBack(items[i]);
		}
		System.out.println("Display list");
		list.display();

	}

}
