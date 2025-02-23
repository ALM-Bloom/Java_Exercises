/* 
 * Make a program which displays a different message depending on the age given.
 * Here are the possible responses:
 * age is less than 16, say "You can't drive."
 * age is less than 18, say "You can't vote."
 * age is less than 25, say "You can't rent a car."
 * age is 25 or over, say "You can do anything that's legal."
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		System.out.println("Hey, What is your name? ");
		String name = cin.next();
		System.out.println("Ok, " + name + ", how old are you?");
		int age = cin.nextInt();
		
		if (age < 16) {
			System.out.println("You can't drive, " + name + ".");
		} 
		if (age < 18) {
			System.out.println("You can't vote, " + name + ".");
		}
		if (age < 25) {
			System.out.println("You can't rent a car, " + name + ".");
		}
		else {
			System.out.println("You can do anything that's legal.");
		}
	}

}
