/*
 * Write a program that plays an incredibly stupid number-guessing game. 
 * The user will get one try to guess the secret number. Tell them if they got it right or wrong,
 *  and if they got it wrong, display what the secret number was.
 * You must store the secret number in a variable, and use that variable throughout. 
 * The secret number itself must not appear in the program at all, except in the one line where you store 
 * it into a variable.
 * I know it will be the same number every time the game is played.
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.println("I'M THKING OF A NBR FROM 1-10.  TRY 2 GESS!");
		int number = cin.nextInt();
		
		if (number == 4) {
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 4!");
		} 
		else {
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 4!");
		}
	}

}
