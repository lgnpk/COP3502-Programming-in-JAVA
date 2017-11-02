//This program converts feet to meters

import java.util.Scanner;

public class FeetToMeters {
	public static void main(String[] args) {
		System.out.print("Enter a value for feet: ");
		Scanner input = new Scanner(System.in);
		
		double feet = input.nextDouble();
		
		double meter = 0.305 * feet;
		
		System.out.print(feet + " feet is " + meter + " meters.");
		
	}
}
