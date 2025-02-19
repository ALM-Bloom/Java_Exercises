// The body mass index (BMI) is commonly used by health and nutrition professionals 
// to estimate human body fat in populations.

// It is computed by taking the individual's weight (mass) in kilograms and dividing it 
// by the square of their height in meters.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		System.out.println("Your height in m: ");
		double height = cin.nextDouble();
		System.out.println("Your weight in kg: ");
		double weight = cin.nextDouble();
		
		double BMI = weight / (height * height);
		
		System.out.println("Your BMI is " + BMI);
		
	    // Bonus #1 - Imperial Measurements
		// For +10 bonus points, input their weight and height using pounds and inches,
		// and convert to kilograms and meters to figure the BMI.
		
		System.out.println("Your height in inches: ");
		height = cin.nextDouble() / 39.37;
		System.out.println("Your weight in pounds: ");
		weight = cin.nextDouble() / 2.205;
		BMI = weight / (height * height);
		System.out.println("Your BMI is " + BMI);
		// For an extra +3 bonus points (+13 total), input their height in feet and inches.
		
		System.out.println("Your height (feet only): ");
		height = cin.nextDouble() / 3.281;
		System.out.println("Your height (inches): ");
		double height2 = cin.nextDouble() / 39.37;
		System.out.println("Your weight in pounds: ");
		weight = cin.nextDouble();
		BMI = weight / (height * height);
		System.out.println("Your BMI is " + BMI);
	}

}
