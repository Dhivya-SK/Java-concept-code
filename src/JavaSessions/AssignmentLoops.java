package JavaSessions;

public class AssignmentLoops {

	public static void main(String[] args) {
		
		/***
		 * Print odd numbers using for and while loop
		 */
		// while loop
		int odd = 1;
		while(odd<=10) {
			System.out.println(odd);//1 3 5 7 9 
			odd = odd + 2;
		}
		
		System.out.println("--------------------------------------");
		
		//for loop
		for(int oddNum = 1; oddNum <= 10; oddNum = oddNum +2) {
			System.out.println(oddNum);
		}
		
		
		System.out.println("--------------------------------------");
		/**
		 * 1. WAP to print following output:
		I am Batman

		I am Batman

		I am Batman

		I am Batman

		I am Batman
		 */
		
		for(int i = 0; i<=5; i++) {
			System.out.println("I am Batman");
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		/**
		 * . WAP to print following output:
			I am Batman 1

			I am Batman 2

			I am Batman 3

			I am Batman 4

			I am Batman 5

			I am Batman 6

			I am Batman 7

			I am Batman 8

			I am Batman 9
		 */
		for(int i=1; i <=9; i++) {
			System.out.println("I am Batman " +i);
			System.out.println();
		}
		
		/***
		 * 
			3. WAP to print 10 to 1 using for, while and do-while loop
		 */
		//for loop
		System.out.println("For loop");
		for(int d=10;d>=1;d--) {
			System.out.println(d);
		}
		
		System.out.println("--------------------------------------");
		
		//while loop
		System.out.println("while loop");
		int l = 10;
		while (l>=1) {
			System.out.println(l);
			l--;
		}
		
		// do-while loop
		System.out.println("do -while loop");
		int m = 10;
		do {
			System.out.println(m);
			m--;
		}
		while(m>=1);
		
		/***
		 * 4. Write a program in Java to print "Hello World" ten times using while loop
		 */
		int q = 1;
		while(q<=10) {
			System.out.println("Hello World");
			q++;
		}
		
		/***
		 *  Write a program in Java to print 1 to 10 using while loop but 
		 *  quit if multiple of 7 is encountered
		 */
		int o = 1;
		while(o<=10) {
		
			System.out.println(o);
			if (o % 7 == 0) {
				
				break;
			}
			o++;
			
		}
		
		/***
		 * 6. Try to print the following pattern on the console:
			n = 4
			n = 3
			n = 2
			n = 1
			n = 0
		 */
		for(int n=4;n>=0;n--) {
			System.out.println("n = "+ n);
			
		}
		
		/***
		 * 7. Write a program to print the following pattern using for loop:

			00 01 02 03 04 05 06 07 08 09 
			10 11 12 13 14 15 16 17 18 19 
			20 21 22 23 24 25 26 27 28 29 
			30 31 32 33 34 35 36 37 38 39 
		 */
		for(int s=0; s<=3;s++) {
			for (int t =0;t<=9;t++) {
				System.out.print(s+""+t+" ");
			}
			System.out.println();
		}
	}


}
