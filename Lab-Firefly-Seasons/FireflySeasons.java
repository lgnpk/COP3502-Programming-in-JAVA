//Logan Peck
//Cassidy Schad

import java.util.Scanner;

public class FireflySeasons {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("Year:");
		 int year = input.nextInt();
		 System.out.println("Month:");
		 int month = input.nextInt();
	
	String seasonBeaumonde = null;
	String seasonRegina = null; 
	
	//find Beaumonde first
	
	if (1 <= month && month <= 3) {
	seasonBeaumonde = "Winter"; 
	if (year%5 == 0)
		seasonRegina = "Off-Season";
	else if (year%5 == 1)
		seasonRegina = "Winter";
	else if (year%5 == 2)
		seasonRegina = "Summer";
	else if (year%5 == 3)
		seasonRegina = "Spring";
	else if (year%5 == 4)
		seasonRegina = "Off-Season"; 
	}

	if (4 <= month && month <= 6) {
	seasonBeaumonde = "Spring"; 
	if (year%5 == 0)
		seasonRegina = "Spring";
	else if (year%5 == 1)
		seasonRegina = "Off-Season";
	else if (year%5 == 2)
		seasonRegina = "Winter";
	else if (year%5 == 3)
		seasonRegina = "Autumn";
	else if (year%5 == 4)
		seasonRegina = "Summer";
	}
	
	if (7 <= month && month <= 9) {
		seasonBeaumonde = "Summer";
	if (year%5 == 0)
		seasonRegina = "Summer";
	else if (year%5 == 1)
		seasonRegina = "Spring";
	else if (year%5 == 2)
		seasonRegina = "Off-Season";
	else if (year%5 == 3)
		seasonRegina = "Winter";
	else if (year%5 == 4)
		seasonRegina = "Autumn";
	}
	
	if (10 <= month && month <= 12) {
		seasonBeaumonde = "Autumn";
		
    if (year%5 == 0)
		seasonRegina = "Autumn";
	else if (year%5 == 1)
		seasonRegina = "Summer";
	else if (year%5 == 2)
		seasonRegina = "Spring";
	else if (year%5 == 3)
		seasonRegina = "Off-Season";
	else if (year%5 == 4)
		seasonRegina = "Winter";
	}
	
	 System.out.println("Beaumonde: " + seasonBeaumonde);
	 System.out.println("Regina: " + seasonRegina);
	
	input.close();
	}
}
