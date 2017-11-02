//This program computes the volume of a cylinder by first calculating the area and then applying it to
//the volume equation.
import java.util.Scanner;

public class CylinderVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for the radius in centimeters: ");
		double radius = input.nextDouble();
		double area;
		double volume;
		
	
//compute the area		
		area = radius * radius * 3.14;
		System.out.println("The area is: " + area + " centimeters squared.");
		
//Ask for a length to compute the volume
		System.out.print("Input a value for the length of the cylinder in centimeters: ");
		double length = input.nextDouble();
	

//Compute the volume using the area variable above
		volume = area * length;
		System.out.print("The Volume of the cylinder is: " + volume + " centimeters cubed.");
	}	
}
