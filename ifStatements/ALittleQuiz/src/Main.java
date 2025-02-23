// Write an interactive quiz. It should ask the user three multiple-choice or true/false questions 
// about something. It must keep track of how many they get wrong, and print out 
// a "score" at the end.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int puntuation = 3;
		
		System.out.println("Q1) What is the capital of Alaska");
		System.out.println("	1) Melbourne\n	2) Anchorage\n	3) Juneau");
		int option = cin.nextInt();
		if (option == 3) {
			System.out.println("That's correct!");
		} else {
			System.out.println("Incorrect!");
			puntuation--;
		}
		
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("	1) yes\n	2) no");
		option = cin.nextInt();
		if (option == 1) {
			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
			puntuation--;
		} else {
			System.out.println("That's correct!");
		}
		
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("	1) 5\n	2) 11\n	3) 15/3");
		option = cin.nextInt();
		if (option == 2) {
			System.out.println("That's correct!");
		} else {
			System.out.println("Incorrect!");
			puntuation--;
		}
		System.out.println("Overall, you got " + puntuation + " of 3 correct");
	}

}
