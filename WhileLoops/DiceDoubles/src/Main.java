/*
 * Modify your dice game from last time so that it keeps rolling until they get doubles (the same number on both dice).
 * Notice that since there's no user input, this will happen very quickly (all the rolls will happen one right after the other).
 */

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random ranGen = new Random();
		
		System.out.println("HERE COMES THE DICE!");
		
		int firstNumber = 1 + ranGen.nextInt(6);
		int secondNumber = 1 + ranGen.nextInt(6);
		
		System.out.println("Roll #1: " + firstNumber);
		System.out.println("Roll #2: " + secondNumber);
		System.out.println("The total is " + (firstNumber + secondNumber) + "\n");
		while (firstNumber != secondNumber) {

			firstNumber = 1 + ranGen.nextInt(6);
			secondNumber = 1 + ranGen.nextInt(6);
			
			System.out.println("Roll #1: " + firstNumber);
			System.out.println("Roll #2: " + secondNumber);
			System.out.println("The total is " + (firstNumber + secondNumber) + "\n");
		}
	}

}
