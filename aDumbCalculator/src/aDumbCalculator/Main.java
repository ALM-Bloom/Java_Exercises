// Make a simple numeric calculator. It should prompt the user for three numbers. 
// Then add the numbers together and divide by 2. Display the result.  
// Your program must support numbers with decimals and not just integers.
package aDumbCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		System.out.println("What is your first number?");
		double firstNumber = cin.nextDouble();
		System.out.println("What is your second number?");
		double secondNumber = cin.nextDouble();
		System.out.println("What is your third number?");
		double thirdNumber = cin.nextDouble();
		
		System.out.print("( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " ) / 2 is... ");
		double result = (firstNumber + secondNumber + thirdNumber) / 2;
		System.out.print(result);
		
	}

}
