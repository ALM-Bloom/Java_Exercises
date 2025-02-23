/*
 * Modify your previous number-guessing game so that they can guess until they get it right. 
 * That means it will keep looping as long as the guess is different from the secret number. Use a while loop.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random numGen = new Random();
		Scanner cin = new Scanner(System.in);
		
		int ranNumber = 1 + numGen.nextInt(10);
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.println("Your guess:");
		int number = cin.nextInt();
		
		while (number != ranNumber) {
			System.out.println("That is incorrect. Guess again.");
			number = cin.nextInt();
		}
		
		System.out.println("That's right! You're a good guesser.");
	}

}
