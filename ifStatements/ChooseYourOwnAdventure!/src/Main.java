/*
 * Make a short "Choose Your Own Adventure" game. 
 * The starting room should give the user two choices. 
 * Then the second room they travel to should give them two more choices. 
 * Finally the third room should give them two choices.
 * This means your game will have eight possible "endings". 
 * Your game will also have a total of fifteen rooms:

        _ R1 _
       /      \
    R2          R3
   /  \        /  \
 R4    R5    R6    R7
 /\    /\    /\    /\
E1 E2 E3 E4 E5 E6 E7 E8
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!\n");
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\r\n"
				+ "\"kitchen\"?");
		String answer = cin.next();
		System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\r\n"
				+ "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\r\n"
				+ "or look in a \"cabinet\".");
		String answer2 = cin.next();
		System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty."
				+ " Would you like to eat some of the food? ('yes' or 'no')");
		String anwer3 = cin.next();
	}

}
