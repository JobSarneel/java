
import java.util.Scanner;

public class SubtractionQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate two single-digit numbers into number1 and number2
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// If number1 < number2 swap the numbers
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// Promt to answer "What is number1 - number2?"
		
		System.out.print("Hoeveel is " + number1 + " - " + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// Check answer and display whether it is correct
		
		if (number1 - number2 == answer) {
			System.out.println("Dat klopt, goed zo!");
		}
		else {
			System.out.println("Nee, dat klopt niet.");
			System.out.println(number1 + " - " + number2 + " is " + (number1 - number2) + ".");	
		}
		

	}

}
