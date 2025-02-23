/*
 * Make a program which plays a simple game of 20 2 Questions. 
 * The first question should be "animal, vegetable, or mineral?" 
 * Then, the second question should be "is it bigger than a breadbox?"
 *  Then, display one of six possible responses, depending on their answers. 
 *  You can choose what answers to give for each of the six possibilities.
 * Here's a suggestion:
 * size \ type	animal	vegetable	mineral
 * smaller than a breadbox	squirrel	carrot	paper clip
 * bigger than a breadbox	moose	watermelon	Camaro
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("TWO QUESTIONS!\nThink of an object, and I'll try to guess it.");
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		String answer = cin.next();
		System.out.println("Question 2) Is it bigger than a breadbox?");
		String answer2 = cin.next();
		if (answer.equals("animal") && answer2.equals("no")) {
			System.out.println("My guess is that you are thinking of a mouse.");
		}
		else if (answer.equals("animal") && answer2.equals("yes")) {
			System.out.println("My guess is that you are thinking of a squirrel.");
		}
		else if (answer.equals("vegetable") && answer2.equals("yes")) {
			System.out.println("My guess is that you are thinking of a watermelon.");
		}
		else if (answer.equals("vegetable") && answer2.equals("no")) {
			System.out.println("My guess is that you are thinking of a carrot.");
		}
		else if (answer.equals("mineral") && answer2.equals("yes")) {
			System.out.println("My guess is that you are thinking of a Camaro.");
		}
		else if (answer.equals("mineral") && answer2.equals("no")) {
			System.out.println("My guess is that you are thinking of a paper clip.");
		}
		System.out.println("I would ask you if I'm right, but I don't actually care.");
	}

}
