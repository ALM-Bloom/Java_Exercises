// Use several variables to store the names of your classes and their teachers. 
// Then, display a nice little table displaying your schedule. Just FYI, my column of
// courses has a width of 26 characters, and the teacher column has a width of 15. 
// The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and 
// another plus sign.

public class Main {

	public static void main(String[] args) {
		String class1, class2, class3, class4, class5;
		String teacher1, teacher2, teacher3, teacher4, teacher5;
		
		class1 = "IB";
		class2 = "AyED";
		class3 = "AyEDA";
		class4 = "Administración de Sistemas";
		class5 = "CyA";
		
		teacher1 = "Cuco";
		teacher2 = "Tocayo";
		teacher3 = "MiBroder";
		teacher4 = "Sosio";
		teacher5 = "GonzaGonza";
		System.out.println("+-------------------------+");
		System.out.println("|1|            " + class1 + " |   " + teacher1 + "|");
		System.out.println("|2|          " + class2 + " | " + teacher2 + "|");
		System.out.println("|3|       " + class3 + " | " + teacher3 + "|");
		System.out.println("|4| " + class4 + " | " + teacher4 + "|");
		System.out.println("|5|           " + class5 + " |  " + teacher5 + "|");
		System.out.println("+-------------------------+");
	}

}
