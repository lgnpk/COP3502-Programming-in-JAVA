//Logan Peck
//Cassidy Schad

import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner input = new Scanner(System.in);

		//Prompt user to enter a number
		System.out.print("Input 1: ");
		int input1 = input.nextInt();
		
		//Prompt user to enter a second number
		System.out.print("Input 2: ");
		int input2 = input.nextInt();

		//If else statements
		if (input1 == input2) { 
		System.out.println("Bingo!");
		}
		else if (input1 < input2)
		System.out.println(input1 + " < " + input2);
		else if (input1 > input2)
		System.out.println(input1 + " > " + input2);
		 
	input.close();	
	}
}

