import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Prompt user for temperature in degrees Celsius
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a temperature in degrees Celsius: ");		
		int degreesCelsius = input.nextInt();
		
		// 2. Convert to Fahrenheit
		
		double degreesFahrenheit = (9.0/5)*degreesCelsius + 32;
		
		// 3. Display conversion
		
		System.out.println(degreesCelsius + " degrees Celsius is " + degreesFahrenheit + " degrees Fahrenheit.");

	}

}
