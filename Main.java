import java.util.ArrayList;
import java.util.Scanner;
//testing
class Inventory {
	public String name, serialNumber;
	String value;
//test
	public Inventory(String name, String serialNumber, String value) {
		this.name = name;
		this.serialNumber = serialNumber;
		this.value = value;
	}

	public String toString() {
		return name + "," + serialNumber + "," + value;
	}
} //why is this??? what is happening! have i not been updating? what is the problem? wow this sucks

class Main {
	public static void main(String[] args) {
		ArrayList<Inventory> arrayList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		// add items
		// delete items
		// update items
		// show all items
		// quit
		while (true) {
			System.out.println("Press 1 to add an item.");
			System.out.println("Press 2 to delete an item.");
			System.out.println("Press 3 to update an item.");
			System.out.println("Press 4 to show all the items.");
			System.out.println("Press 5 to quit the program.");
			int input = scan.nextInt();
			scan.nextLine();
			switch (input) {
				case 1:
					System.out.println("Enter the name:");
					String n = scan.nextLine();
					System.out.println("Enter the serial number:");
					String s = scan.next();
					System.out.println("Enter the value in dollars (whole number):");
					String v = scan.next();
					arrayList.add(new Inventory(n, s, v));
					break;
				case 2:
					System.out.println("Enter the serial number of the item to delete:");
					String its = scan.next();
					for (int i = 0; i < arrayList.size(); i++) {
						if (arrayList.get(i).serialNumber.equals(its)) {
							arrayList.remove(i);
						}
					}
					break;
				case 3:
					System.out.println("Enter the serial number of the item to change:");
					String st = scan.next();
					scan.nextLine();
					for (int i = 0; i < arrayList.size(); i++) {
						if (arrayList.get(i).serialNumber.equals(st)) {
							System.out.println("Enter the new name:");
							String na = scan.nextLine();
							System.out.println("Enter the new value in dollars (whole number):");
							String va = scan.next();
							arrayList.get(i).name = na;
							arrayList.get(i).value = va;
						}
					}
					break;
				case 4:
					for(Inventory i : arrayList){
						System.out.println(i);
					}
					break;
				case 5:
					System.exit(0);
			}
		}
	}
}