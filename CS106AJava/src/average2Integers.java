/*
 * File:average2Integers.java
 * --------------------------
 * This program averages 2 integers.
 */

import acm.program.*;

public class average2Integers extends ConsoleProgram {

	public void run() {
		println("This program averages two numbers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		double avg = (double)(n1 + n2)/3;
		println("The average is" + avg + ".");
	}
	
}
