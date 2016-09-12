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
	public static void main(String args[])
	   {
	      int num;
	      int i;
	      int factor = 1;
	      String choice = "y";
	      
	    //sysout and prompts for user input
	    		System.out.println("FACTORIAL CALCULATOR");
	    		System.out.println();
	    	
	    	do{
	    		System.out.println("Enter a number from 1 to 10: ");
	    		Scanner k = new Scanner(System.in);
	    		num = k.nextInt();
	 
	     
	         for ( i = 1 ; i <= num ; i++ )
	            factor = factor*i;
	 
	         System.out.println("Factorial of "+ (num) +" is = "+ (factor));
	         System.out.println();
	         
	         System.out.println("Continue? y/n: ");
	         k.nextLine();
	         
	         choice = k.nextLine();
			}while (choice.equals("y"));

	      }
	   }
	