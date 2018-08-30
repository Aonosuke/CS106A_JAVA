/*
 * File: C5_8_1_Quadratic.java
 * ---------------------------
 * This program compute the solution of quadratic equation.
 */

import acm.program.*;
import java.lang.Math;

public class C5_8_1_Quadratic extends ConsoleProgram {

	public void run() {
		println("Enter coefficients for the quadratic equation:");
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");
		if((b * b - 4 * a * c) >= 0) {
			println("The first solution is " + solution1(a, b, c));
			println("The second solution is " + solution2(a, b, c));
		} else {
			println("no sulution.");
		}
	}
	
	/* return the solution1. */
	private double solution1(int a, int b, int c) {
		double result = (- b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		return result;
	}
	
	/* return the solution2. */
	private double solution2(int a, int b, int c) {
		double result = (- b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		return result;
	}
	
}
