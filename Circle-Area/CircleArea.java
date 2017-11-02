
/*this program asks for user input and then
 * computes the area
 * of a circle
 */
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		 System.out.println("Enter a radius: ");
		Scanner input = new Scanner(System.in);
		double rad = input.nextDouble();
		double area;
	
//compute the area
	area = rad * rad * 3.14159265;
	
//Print Results
	 System.out.println("The area of the circle is: " + area);
	 
	}
}
