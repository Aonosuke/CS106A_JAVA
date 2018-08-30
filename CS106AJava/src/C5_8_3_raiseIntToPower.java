/*
 * File: C5_8_3_raiseIntToPower.java
 * ---------------------------------
 * This program compute the power of two integers.
 */

import acm.program.*;

public class C5_8_3_raiseIntToPower extends ConsoleProgram {
	
	public void run() {
		int n = readInt("Enter the base number: ");
		int k = readInt("Enter the exponent number: ");
		for(int i = 0; i <= k; i++) {
			println(raiseIntPower(n, i));
		}
	}
	
	/* return the power. */
	private int raiseIntPower(int n, int k) {
		int result = 1;
		for(int i = 1; i <= k; i++) {
			result = result * n;
		}
		return result;
	}
	
}
