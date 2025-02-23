/*
 * Make a program that asks for the last name of the user. Depending on their last name,
 * make a statement about how long they have to wait during roll call.
 *  You need to use else ifs to make sure only one statement gets printed.
 * name is "Carswell" or before: say "you don't have to wait long"
 * name is "Jones" or before: say "that's not bad"
 * name is "Smith" or before: say "looks like a bit of a wait"
 * name is "Young" or before: say "it's gonna be a while"
 * name is after "Young": say "not going anywhere for a while?"
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		System.out.println("What's your last name?");
		String name = cin.next();
		
		if (name.compareTo("Carswell") < 0 || name.equals("Carswell")) {
			System.out.println("You don't have to wait long.");
		}
		else if (name.compareTo("Jone") < 0 || name.equals("Jone")) {
			System.out.println("that's not bad");
		} 
		else if (name.compareTo("Smith") < 0 || name.equals("Smith")) {
			System.out.println("looks like a bit of wait");
		}
		else if (name.compareTo("Young") < 0 || name.equals("Young")) {
			System.out.println("it's gonna be a while");
		}
		else {
			System.out.println("not going anywhere for a while?");
		}
	}

}
