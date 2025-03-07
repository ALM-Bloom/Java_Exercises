/*
 * Julio Cesar Chavez Mark VII is an interplanetary space boxer, who currently 
 * holds the championship belts for various weight categories on many different planets 
 * within our solar system. However, it is often difficult for him to recall 
 * what his "target weight" needs to be on earth in order to make the weight class on other planets. 
 * Write a program to help him keep track of this.
 * 
 * It should ask him what his earth weight is, and to enter a number for the planet he wants to
 * fight on. It should then compute his weight on the destination planet based on the table below:
 * #	Planet	Relative gravity
 * 1	Venus	0.78
 * 2	Mars	0.39
 * 3	Jupiter	2.65
 * 4	Saturn	1.17
 * 5	Uranus	1.05
 * 6	Neptune	1.23
 * So, for example, if Julio weighs 128 lbs. on earth, then he would weigh just under 50 lbs.
 *  on Mars, since Mars' gravity is 0.39 times earth's gravity. (128 * 0.39 is 49.92)
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Please enter your current earth weight: ");
		double weight = cin.nextDouble();
		
		System.out.println("I have information for the following planets: ");
		System.out.println("1. Venus	2. Mars		3. Jupiter");
		System.out.println("4. Saturn	5. Uranus	6. Neptune");
		
		System.out.println("Which planet are you visiting?");
		int option = cin.nextInt();
		
		if (option == 1) {
			System.out.println("Your weight would be " + (weight * 0.78) + " on that planet.");
		}
		else if (option == 2) {
			System.out.println("Your weight would be " + (weight * 0.39) + " on that planet.");
		}
		else if (option == 3) {
			System.out.println("Your weight would be " + (weight * 2.65) + " on that planet.");
		}
		else if (option == 3) {
			System.out.println("Your weight would be " + (weight * 1.17) + " on that planet.");
		}
		else if (option == 4) {
			System.out.println("Your weight would be " + (weight * 1.05) + " on that planet.");
		}
		else {
			System.out.println("Your weight would be " + (weight * 1.23) + " on that planet.");
		}
	}

}
