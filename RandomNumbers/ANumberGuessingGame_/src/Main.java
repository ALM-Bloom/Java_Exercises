/*
 * Modify your incredibly stupid number-guessing game to actually pick a random number 
 * from 1 to 10 and have the user try to guess that. Tell them if they get it right or wrong, 
 * and if they get it wrong, show them what the random number was.
 * They will still only get one try.
 */

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Random randoNumber = new Random();
		
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.println("Your guess:");
		int number = cin.nextInt();
		int guess = 1 + randoNumber.nextInt(10);
		
		if (number == guess) {
			System.out.println("That's right!  My secret number was " + guess + "!");
		}
		else {
			System.out.println("Sorry, but I was really thinking of " + guess + "!");
		}
	}

}
