/*
 * This is the original "ball and cups" game where you try to find out which cup has the ball under it. 
 * You may play with three cups and a ball, three cards (two jacks and an ace), or three doors and a car.
 *  Basically, randomly select a cup to hide the "ball". Let the player guess which cup hides the ball. 
 *  The player wins if they guess correctly.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random ranGen = new Random();
		Scanner cin = new Scanner(System.in);
		
		int goodCup = 1 + ranGen.nextInt(3);
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\r\n"
				+ "He glances at you out of the corner of his eye and starts shuffling.\r\n"
				+ "He lays down three cards.");
		System.out.println("\nWhich one is the ace?");
		System.out.println("	##  ##  ##\r\n"
				+ "	##  ##  ##\r\n"
				+ "	1   2   3");
		
		int selection = cin.nextInt();
		
		if (selection == goodCup) {
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
		} else {
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + goodCup);
		}
		cin.close();
	}

}
