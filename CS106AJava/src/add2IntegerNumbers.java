/*
 * File:add2IntegerNumbers.java
 * ----------------------------
 * This program adds 2 integer numbers.
 */

import acm.program.*;

public class add2IntegerNumbers extends ConsoleProgram {

	public void run() {
		println("This program add two numbers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int total = n1 + n2;
		println("The total is" + total + ".");
	}
	
}