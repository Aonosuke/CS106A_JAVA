/*
 * File: A2_6_Hailstone.java
 * -------------------------
 * This program reads in a number from the user and then displays
 * the Hailstone sequence for that number.
 */

import acm.program.*;

public class A2_6_Hailstone extends ConsoleProgram {

	public void run() {
		int n1 = readInt("Enter a number: ");
		int n2 = 0;
		int numCaculate = 0;
		while(n1 <= 0) {
			println("Please enter a positive number.");
			n1 = readInt("Enter a number: ");
		}
		while(n1 != 1) {
			if(n1 % 2 == 0) {
				n2 = n1 / 2;
				println(n1 + " is even, so I take half: " + n2);
			} else {
				n2 = 3 * n1 + 1;
				println(n1 + " is odd, so I make 3n + 1: " + n2);
			}
			n1 = n2;
			numCaculate++;
		}
		println("The process took " + numCaculate + " to reach 1.");
	}
	
}
