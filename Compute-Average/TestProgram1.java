import java.util.Scanner;

public class TestProgram1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		//compute average
		
		double average = (number1 + number2 + number3) / 3;
		
		//Display result
		
		System.out.println(average);
	input.close();
	}
	
}
