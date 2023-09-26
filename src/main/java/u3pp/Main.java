package u3pp;

import java.util.Scanner;

/**
 * Utilize scanners and user input like car
 * 
 * @author Chae Geon Lim
 */

class Main {

	public static void main(String[] args) {

		//YOUR CODE HERE
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();
		while (!input.toUpperCase().equals("STOP")) {
			/* YOUR CODE HERE */
			// yearNumber will represent the int conversion of input and is needed 
			// in the while loop so that it will continually update
			int yearNumber = Integer.parseInt(input);
			boolean toof = LeapYear.isLeapYear(yearNumber);
			if (toof == true)
			{
				System.out.println(yearNumber + " is a leap year");
			}
			else
			{
				System.out.println(yearNumber + " is not a leap year");
			}
			System.out.println("Enter a year (or enter STOP to end): ");
			//Restart the loop and make sure it takes in a value too
			input = sc.nextLine();
		}
		//End scanner
		sc.close();
	}
}