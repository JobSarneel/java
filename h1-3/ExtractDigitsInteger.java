import java.util.Scanner;

public class ExtractDigitsInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Prompt user or integer between 0 and 1000, store as integer
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a digit between 0 and 1000: ");		
		int integer = input.nextInt();
		
		// 2. Get last digit: integer%10
		
		int lastDigit = integer%10;
		
		// 3. Get second digit (if any) (integer/10)%10
		
		int secondDigit = (integer/10)%10;
		
		// 4. Get first digit (if any) (integer/100)%%10
		
		int firstDigit = (integer/100)%10;
		
		// 5. Add last, second and first digits: sumDigits
		
		int sumDigits = lastDigit + secondDigit + firstDigit;
		
		// 6. Display sumDigits to user
		
		System.out.println("The sum of the digits in the number " + integer + " is " + sumDigits + ".");

	}

}
