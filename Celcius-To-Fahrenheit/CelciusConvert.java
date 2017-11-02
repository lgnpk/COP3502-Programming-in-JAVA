//this program converts an inputted temperature from celcius to fahreinheit

import java.util.Scanner;

public class CelciusConvert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature in celcius: ");
		double celcius = input.nextDouble();
		double fahrenheit;
		
//set up the conversion formula, in other words, define the variable "conversion" as the formula for conversion
		
	fahrenheit = (9.0/5.0) * celcius + 32;
	
//print the results
	
	 System.out.println("The temperature in fahrenheit is: " + fahrenheit + ".");
	 
		
	input.close();	
	}

		
}
