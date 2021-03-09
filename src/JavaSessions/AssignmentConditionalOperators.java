package JavaSessions;

import java.util.Scanner;

public class AssignmentConditionalOperators {
	
	/***
	 * 
	 * Conditional Operators:

	1. Take three numbers from the user and print the greatest number. 

	Test Data
	Input the 1st number: 25.11
	Input the 2nd number: 78 
	Input the 3rd number: 87
	Input the 4th number: 91.90
	Expected Output :
		The greatest: 91.90
	 * @param args
	 */
	public static void main(String[] args) {
		float a = (float)1.11;
		int b = 78;
		int c = 87;
		float d = 91.90f;
		
		float greatest = a;
		
		// Check whether a is greater than b and c
		if ( greatest > b && greatest > c) {
			if(greatest > d) {
				System.out.println("The greatest:" + a);
			}
		}
		else if(b > greatest && b > c) {
			if(b>d) {
				System.out.println("The greatest:" + b);
				
			}
		}
		else if( c> greatest && c > d) {
			System.out.println("The greatest:" + c);
		}
		else {
			System.out.println("The greatest:" + d);
		}
		
		
		
		
		
		
		
		
		
		
		/***
		 * 
		2. Write a Java program to test a number is positive or negative.

			Test Data
			Input number: 35 -- positive number
			Input number: -11 -- negative number
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int number = sc.nextInt();
//		
//		
//		
//		int i = 0;
//		
//		if (i> number) {
//			System.out.println("Input number:" + number + "--negative number");
//		}
//		else {
//			System.out.println("Input number:" + number + "--positive number");
//		}

	}
}



