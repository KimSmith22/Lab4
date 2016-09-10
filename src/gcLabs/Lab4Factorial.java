/**
 * 
 */
package gcLabs;

import java.util.Scanner;

/**
 * @author Kimberli
 *
 */
public class Lab4Factorial {

	/**
	 * @param args
	 */
	//method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare variables
		int number = 1;
		int i = 1;
		int factorial = 1;
		
		String choice;
		choice = "y";
		
		//sysout and prompts for user input
		System.out.println("FACTORIAL CALCULATOR");
		System.out.println();
		
	//loop
	do{
		System.out.println();
		System.out.println("Enter a number from 1 to 10: ");
		Scanner k = new Scanner(System.in);
		number = k.nextInt();
		System.out.println();
		
		//formula to find factorial
		for( i = 1; i <=number; i++);
			factorial = factorial * i;
		
		//output and prompt
		System.out.println("The factorial of " + (number) + " is " + (factorial));	
		System.out.println();
		
		
	}while (choice.equals("y"));
	}

}
