/*
 * Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.
 * For bonus, also add randomly-chosen lotto numbers to the fortune. In Texas, the lotto chooses 6 numbers,
 * each from 1-54.
 */

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random generator = new Random();
		
		String[] phrases = { "You will pass Cya", "You will find happiness with a new love.", 
							  "You will get hired in your job", "You will not get sued", "You will eat" };
		
		int selection = generator.nextInt(5);
		
		System.out.println(phrases[selection]);
		
	}
}
