/*
 * File: C5_8_4_CountDigits.java
 * -----------------------------
 * This program counts how many digits an integers includes.
 */

import acm.program.*;

public class C5_8_4_CountDigits extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter an integer: ");
		println("The integer " + n + " has " + countDigits(n) + " digits.");
	}
	
	/* return the digits of an integer */
	private int countDigits(int n) {
		int i = 1;
		while((n / 10) != 0) {
			i ++;
			n = (n / 10);
		}
		return i;
	}
	
}
