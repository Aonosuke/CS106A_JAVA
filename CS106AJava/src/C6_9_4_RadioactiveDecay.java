/*
 * File: C6_9_4_RadioactiveDecay.java
 * ----------------------------------
 * This program calculates how many atoms left at the end of 
 * every year after decaying.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class C6_9_4_RadioactiveDecay extends ConsoleProgram {

	public void run() {
		int thisAtoms = totalAtoms;
		int year = 0;
		println("There are " + thisAtoms + " atoms initially. ");
		while(thisAtoms > 0) {
			int n = thisAtoms;
			for(int i = 0; i < n; i++) {
				boolean decayornot = rgen.nextBoolean();
				if (decayornot == true) {
					thisAtoms--;
				}
			}
			year++;
			println("There are " + thisAtoms + " atoms at the end of year " + year);
		}
	}
	
	/*Create an instance variable for the random number generator. */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/*Private constants */
	private static final int totalAtoms = 10000;
	
}
