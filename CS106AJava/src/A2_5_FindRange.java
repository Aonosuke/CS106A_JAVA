/*
 * File: A2_5_FindRange.java
 * -------------------------
 * This program reads in a list of integers, one per line, until
 * a sentinel value of 0. When the sentinel is read, the program
 * should display the smallest and largest values in the list.
 */

import acm.program.*;

public class A2_5_FindRange extends ConsoleProgram {

	public void run() {
		println("This program finds the largest and smallest numbers.");
		int a = readInt("? ");
		if(a == SENTINEL) {
			println("The first number you ented should not be a 0.");
		} else {
			int b = readInt("? ");
			if(b == SENTINEL) {
				println("smallest: " + a);
				println("largest: " + a);
			} else {
				int MaxNumber = max(a, b); 
				int MinNumber = min(a, b);
				for(;;) {
					int c = readInt("? ");
					if(c == 0) break;
					MaxNumber = max(MaxNumber, c);
					MinNumber = min(MinNumber, c);
				}
				println("smallest: " + MinNumber);
				println("largest: "+ MaxNumber);
			}
		}
	}
	
	/* Private method max */
	private int max(int i, int j) {
		if(i > j) {
			return i;
		} else {
			return j;
		}
	}
	
	/* Private method min */
	private int min(int i, int j) {
		if(i < j) {
			return i;
		} else {
			return j;
		}
	}
	
	/* Private constants */
	private static final int SENTINEL = 0;
	
}
