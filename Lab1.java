/*------------------------------------------------------------
// AUTHOR: MORRIS, CHRIS
// FILENAME: LAB1
// SPECIFICATION: SCANNER EXPRESSIONS
// FOR: CSE 110- Lab #1
// TIME SPENT: 57 minutes//--------------------
---------------------------------------*/
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test1, test2, test3;
		final int NUM_TESTS = 3;
		double testAverage;
		
		System.out.print("Enter test score #1:");
		test1 = in.nextInt();
		
		System.out.print("Enter test score #2:");
		test2 = in.nextInt();
		
		System.out.print("Enter test score #3:");
		test3 = in.nextInt();
		
		testAverage = (test1 + test2 + test3) / (double)NUM_TESTS;
		
		String outputPhrase = String.format("Your average test score from %d tests is: ", NUM_TESTS);
		
		System.out.println(outputPhrase + testAverage);
	}
}
