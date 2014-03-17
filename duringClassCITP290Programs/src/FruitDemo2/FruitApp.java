package FruitDemo2;

import java.util.Scanner;


public class FruitApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String keepGoing = "y";
		while (keepGoing.equalsIgnoreCase("y")) {
			
			System.out.println("Choose a fruit.");
			System.out.println("1) Apple");
			System.out.println("2) Grape");
			int choice = sc.nextInt();
			sc.nextLine();
			
			Fruit f = null;
			
			switch (choice) {
				case 1:
					System.out.println("What color is your apple?");
					f = new Apple(sc.nextLine());
					break;
				
				case 2:
					System.out.println("What color is your grape?");
					f = new Grape(sc.nextLine());
					break;
			}
			
			f.print();
			
			System.out.println("Would you like to continue? (y/n)");
			keepGoing = sc.nextLine();
		}
		
		System.out.println("You entered " + Fruit.getCount() + " fruit.");

	}

}
