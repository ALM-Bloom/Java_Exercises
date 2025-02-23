/*
 * Make a program which displays an appropriate name for a person, using a combination
 * of nested ifs and compound conditions. Ask the user for a gender, first name, last name and age.
 * If the person is female and 20 or over, ask if she is married. If so, display "Mrs." 
 * in front of her name. If not, display "Ms." in front of her name. If the female is under 20,
 *  display her first and last name.
 *  If the person is male and 20 or over, display "Mr." in front of his name.
 *   Otherwise, display his first and last name.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("What is your gender (M or F):");
		String gender = cin.next();
		System.out.println("First name:");
		String firstName = cin.next();
		System.out.println("Last name:");
		String lastName = cin.next();
		System.out.println("Age:");
		int age = cin.nextInt();

		if (gender.equals("F") && age >= 20) {
			System.out.println("Are you married, " + firstName + " (y or n)?");
			String married = cin.next();
			if (married.equals("y")) {
				System.out.println("Then I shall call you Mrs. " + lastName);
				System.exit(0);
			} 
			System.out.println("Then I shall call you Ms. " + lastName);
		}
		
		else if (gender.equals("M") && age >= 20) {
			System.out.println("Are you married, " + firstName + " (y or n)?");
			String married = cin.next();
			
			if (married.equals("y")) {
				System.out.println("Then I shall call you Mr. " + lastName);
				System.exit(0);
			} 
			System.out.println("Then I shall call you Mr. " + lastName);
		}
		
		else {
			System.out.println("Your name is " + firstName + " and last name is " + lastName);
		}
	}

}
