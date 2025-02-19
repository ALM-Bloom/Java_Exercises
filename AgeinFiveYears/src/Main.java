// Ask the user for their name. Then display their name to prove that you can recall it.
// Ask them for their age. Then display what their age would be five years from now. 
// Then display what their age would be five years ago.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		String name = cin.next();
		System.out.println("Hi, " + name + "! How old are you?");
		int age = cin.nextInt();
		System.out.println("Did you know that in five years you will be " + (age + 5));
		System.out.println("And five years ago you were " + (age - 5) + " Imagine that!");
		// Usar paréntesis dentro del "println" si se quiere realizar aritmética directamente.

	}

}
