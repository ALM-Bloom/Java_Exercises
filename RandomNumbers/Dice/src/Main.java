/*
 * Write a program that simulates a dice roll by picking a random number from 1-6 and then 
 * picking a second random number from 1-6. Add the two values together, and display the total.
 */

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random ranGen = new Random();
		
		System.out.println("HERE COMES THE DICE!");
		int firstNumber = 1 + ranGen.nextInt(6);
		System.out.println("Roll #1: " + firstNumber);
		int secondNumber = 1 + ranGen.nextInt(6);
		System.out.println("Roll #2: " + secondNumber);
		System.out.println("The total is: " + (firstNumber + secondNumber));
	}

}
