package ExceptionDemo;

import java.util.Scanner;

public class DemoMain {

	private static boolean debug = false;

	public static void main(String[] args) {

		int a;

		// This exception WILL happen, no matter what.
		// Prevent dividing by zero whenever possible.
		try {
			a = 6 / 0;
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by zero!");
			if (debug) {
				e.printStackTrace();
			}
		}
		
		// This is exception handling for when a user
		// enters an incorrect value.
		try {
			a = getAge();
		} catch (Exception e) {
			System.out.println("Invalid age!");
		}
		
		// This is exception PREVENTION, which is
		// almost always better.
		a = betterGetAge();

	}

	public static int getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your age?");
		return sc.nextInt();

	}
	
	public static int betterGetAge() {
		Scanner sc = new Scanner(System.in);
		
		boolean valid = false;
		int age = 0;
		
		while (!valid) {
			System.out.println("What is your age?");
			if (sc.hasNextInt()) {
				age = sc.nextInt();
				valid = true;
			}
			else {
				System.out.println("Not a valid age!");
			}
			sc.nextLine();
		}
		
		return age;

	}
}
