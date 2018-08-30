/*
 * File: C6_9_2_ConsecutiveHeads.java
 * ----------------------------------
 * This program simulates tossing a coin until gets 3
 * consecutive heads.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class C6_9_2_ConsecutiveHeads extends ConsoleProgram {

	public void run() {
		int n = 0;
		int totalFlips = 0;
		for(int i = 0; n != 3; i++) {
			if (rgen.nextBoolean() == true) {
				n++;
				println("Heads");
			} else {
				n = 0;
				println("Tails");
			}
			totalFlips = i;
		}
		println("It took " + totalFlips + " flips to get 3 consecutive heads.");
	}
		
	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
