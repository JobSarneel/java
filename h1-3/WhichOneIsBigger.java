// LESSON LEARNED: NESTED IF-ELSE CLAUSES BECOME MESSY PRETTY QUICKLY!!!!


import java.util.Scanner;

public class WhichOneIsBigger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Prompt user for first number, store in firstNumber
		Scanner input = new Scanner(System.in);
		
		System.out.print("Voer a.u.b. een eerste integer in: ");		
		double firstNumber = input.nextInt();
		
		// 2. Prompt user for second number, store in secondNumber
		
		System.out.print("Voer a.u.b. een tweede integer in: ");		
		double secondNumber = input.nextInt();
		
		// 3. Prompt user for third number, store in thirdNumber
		
		System.out.print("Voer a.u.b. een derde integer in: ");		
		double thirdNumber = input.nextInt();
		
		// 4. 
		
		System.out.println("Eerste getal: " + (int)firstNumber);
		System.out.println("Tweede getal: " + (int)secondNumber);
		System.out.println("Derde getal: " + (int)thirdNumber);
		
		// 5. Figure out which one is the biggest using nested if-else statements
		
		if (firstNumber > secondNumber) {
			if (firstNumber > thirdNumber) {
				if (secondNumber > thirdNumber) {
					System.out.println("Het eerste getal, " + (int)firstNumber + ", is het grootst, daarna volgen " + (int)secondNumber + "en"  
							+ (int)thirdNumber);
				}
				else {
					System.out.println("Het eerste getal, " + (int)firstNumber + ", is het grootst, daarna volgen het derde getal,"
					+ (int)thirdNumber + " en het tweede, " + (int)secondNumber);
				}
			}
			else {
				System.out.println("Het derde getal, " + (int)thirdNumber + ", is het grootst, daarna volgen het eerste, " + (int)firstNumber + 
				" en het tweede, " + (int)secondNumber);
			}
		}
		else if (secondNumber > thirdNumber) {
				System.out.println("Het tweede getal, " + (int)secondNumber + ", is het grootst, daarna volgen het derde, " + (int)thirdNumber + 
						", en het eerste, " + (int)firstNumber);
		}
		else {System.out.println("Het derde getal, " + (int)thirdNumber + ", is het grootst, daarna volgen het tweede, " + (int)secondNumber + 
				", en het eerste, " + (int)firstNumber);
		}

	}

}
