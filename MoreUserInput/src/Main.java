/* Ask the user for several pieces of information, and display 
 * them on the screen afterward as a summary.
 * -first name
 * -last name
 * -grade (classification)
 * -student id number
 * -login name
 * -GPA (0.0 to 4.0)
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Please enter the following information: ");
		System.out.println("First name: ");
		String name = cin.next();
		System.out.println("Lastname: ");
		String lastName = cin.next();
		System.out.println("Grade (9-12): ");
		int grade = cin.nextInt();
		System.out.println("Student ID: ");
		int studentId = cin.nextInt();
		System.out.println("Login: ");
		String credentials = cin.next();
		System.out.println("GPA (0.0-4.0): ");
		double gpa = cin.nextDouble();
		
		System.out.println("Your Information:\n	Login: " + credentials + "\n	ID: " + studentId);
		System.out.println("	First Name: " + lastName + ", " + name + "\n	GPA: " + gpa + 	"\n	Grade: " + grade);
	}

}
