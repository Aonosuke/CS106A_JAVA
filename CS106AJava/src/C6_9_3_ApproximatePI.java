/*
 * File: C6_9_3_ApproximatePI.java
 * -------------------------------
 * This program simulates throwing darts to a board randomly, and 
 * calculates the approximatePI based on the result of throwing darts.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class C6_9_3_ApproximatePI extends ConsoleProgram {
	
	public void run() {
		int n = 0;
		for(int i = 0; i < 100000; i++) {
			double x = rgen.nextDouble();
			double y = rgen.nextDouble();
			if( (x*x + y*y) < 1 ) {
				n++;
			}
		}
		double approximatePI = (4.0 * n) / 100000.0;
		println("The approximate value of PI is " + approximatePI);
	}
	
	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();

}
