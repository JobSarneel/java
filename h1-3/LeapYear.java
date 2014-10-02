import java.util.Scanner;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Prompt user for a year (check what happens if something other than an integer is entered
		
		System.out.print("Voer een jaar in, bijv. '1322': ");
		
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		// Evaluate whether year is a leap year and set boolean isLeapYear
		
		boolean isLeapYear =
				(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		// Output year and whether or not it is a leap year
		
		if (isLeapYear) {
			System.out.println(year + " is een schrikkeljaar.");
		}
		else {
			System.out.println(year + " is geen schrikkeljaar.");
		}

	}

}
