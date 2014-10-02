import java.util.Scanner;

public class ComputeArea {
	
	public static void main(String[] args) {
		
		// Step 1: Read in the radius
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a radius
		System.out.print("Please enter a radius: ");		
		double radius = input.nextDouble();
		
		// Step 2: Compute area
		double area = radius*radius*3.141359;
		
		// Step 3: Display the area
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}
