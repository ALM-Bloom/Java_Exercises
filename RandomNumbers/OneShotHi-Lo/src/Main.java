/*
 * Write a program that picks a random number from 1-100.
 *  Give the user a chance to guess it. If they get it right, tell them so. 
 *  If their guess is higher than the number, say "Too high." 
 *  If their guess is lower than the number, say "Too low." Then quit. (They don't get any more guesses for now.)
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random ranGen = new Random();
		Scanner cin = new Scanner(System.in);
		
		System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
		int number = cin.nextInt();
		int ranNumber = 1 + ranGen.nextInt(100);
		if (number < ranNumber) {
			System.out.println("Sorry, you are too low.  I was thinking of " + ranNumber);
		}
		else if (number > ranNumber) {
			System.out.println("Sorry, you are too high.  I was thinking of " + ranNumber);
		}
		else {
			System.out.println("You guessed it!  What are the odds?!?");
		}
	}

}
