/*
 * File: A2_4_PythagoreanTheore.java
 * ---------------------------------
 * This program accepts values for a and b as ints and then calculates the
 * solution of c as a double.
 */

import acm.program.*;

public class A2_4_PythagoreanTheorem extends ConsoleProgram {
	
	public void run() {
		println("Enter values to compute Pythagotean theorem.");
		int a = readInt("a: ");
		int b = readInt("b: ");
		double c = Math.sqrt(a * a + b * b);
		println("c = " + c);
	}

}
