//Logan Peck
//Anders Eriksson
//Kevin Ramos

import java.util.Scanner; 

public class RectangleArea {
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner input = new Scanner(System.in);

		//Prompt user to enter a length of the rectangle
		System.out.print("Length of rectangle: ");
		int length = input.nextInt();
		
		//Prompt user to enter a width of the rectangle
		System.out.print("Width of rectangle: ");
		int width = input.nextInt();

		//compute Area
		int area = length * width;

		//Display results
		System.out.println("The area of the rectangle is: " + area);
	}
}
