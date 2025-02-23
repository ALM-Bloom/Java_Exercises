// Ask the user for two words and two numbers, and let the person at the keyboard 
// type in some values, but don't bother storing their responses into any variables.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Introduce two numbers");
		int number1, number2;
		number1 = cin.nextInt();
		number2 = cin.nextInt();
		
		System.out.println("Now introduce two words");
		String word1, word2;
		word1 = cin.next();
		word2 = cin.next();
		
		System.out.println("You have introduced " + number1 + " and " + number2);
		System.out.println("And " + word1 + " and " + word2);
	}

}
