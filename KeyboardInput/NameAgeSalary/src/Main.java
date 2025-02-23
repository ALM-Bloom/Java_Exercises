// Ask the user for their name. Then display their name to prove that you can recall it.
// Ask them for their age. Then display that. Finally, ask them for how much they make
// and display that. You should use the most appropriate data type for each variable.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		String name;
		int age;
		double money;
		
		System.out.println("Introduce your name");
		name = cin.next();
		
		System.out.println("Hi " + name + "! Introduce your age");
		age = cin.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + name + "?"); 
		money = cin.nextDouble();
		
		System.out.println(money + "! I hope that's per hour and not per year! LOL!");
		

	}

}
