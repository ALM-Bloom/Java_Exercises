/*
 * Write a program that compares several Strings using the compareTo() method. 
 * You should display the Strings and display the integer that compareTo() gives you.
 * You must have five examples which result in a number less than 0, 
 * five examples which result in a number greater than 0, and two examples which give you exactly 0.
 *  This means you need a total of twelve examples.
 */

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Time to Compare!\n First, 5 examples which result in less than 0");
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		int i = "axe".compareTo("dog");
		System.out.println(i);
		System.out.print("Comparing \"bee\" with \"beard\" produces ");
		i = "bee".compareTo("beard");
		System.out.println(i);
		System.out.print("Comparing \"great\" with \"perfect\" produces ");
		i = "great".compareTo("perfect");
		System.out.println(i);
		System.out.print("Comparing \"rough\" with \"tough\" produces ");
		i = "rogugh".compareTo("tough");
		System.out.println(i);
		System.out.print("Comparing \"vercel\" with \"nextra\" produces ");
		i = "vercel".compareTo("nextra");
		System.out.println(i);
		
		System.out.println("!\n Now, 5 examples which result greater than 0");
		System.out.print("Comparing \"tekken\" with \"mortal kombat\" produces ");
		i = "tekken".compareTo("mortal kombat");
		System.out.println(i);
		System.out.print("Comparing \"julia\" with \"cloud\" produces ");
		i = "julia".compareTo("cloud");
		System.out.println(i);
		System.out.print("Comparing \"scope\" with \"pound\" produces ");
		i = "scope".compareTo("pound");
		System.out.println(i);
		System.out.print("Comparing \"misticysm\" with \"astronomy\" produces ");
		i = "misticysm".compareTo("astronomy");
		System.out.println(i);
		System.out.print("Comparing \"applebee\" with \"apple\" produces ");
		i = "applebee".compareTo("apple");
		System.out.println(i);
		
		System.out.println("!\n Now, 2 examples which result in 0");
		System.out.print("Comparing \"cast\" with \"cast\" produces ");
		i = "cast".compareTo("cast");
		System.out.println(i);
		System.out.print("Comparing \"past\" with \"past\" produces ");
		i = "past".compareTo("past");
		System.out.println(i);
	}

}
