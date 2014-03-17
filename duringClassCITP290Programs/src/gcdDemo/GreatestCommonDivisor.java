package gcdDemo;
import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter another number: ");
		int b = sc.nextInt();
		System.out.println("GCD is : " + GCD(a,b));
		System.out.println("Recursive GCD is : " + GCDRecursive(a,b));
	}

	private static int GCD(int x, int y) {
		while (y != 0) {
			int z = x % y;
			x = y;
			y = z;
		}
		return x;
	}
	
	private static int GCDRecursive(int x, int y) {
		if (y == 0) {
			return x;
		}
		else {
			return GCDRecursive(y, x%y);
		}
	}

}
