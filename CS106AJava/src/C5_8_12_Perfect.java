/*
 * File: C5_8_12_Perfect.java
 * --------------------------
 * This program check an integer is a perfect number or not.
 */

import acm.program.*;

public class C5_8_12_Perfect extends ConsoleProgram {

	public void run() {
		for(int i = 2; i < 10000; i++) {
			if(isPerfect(i)) {
				println(i + " is perfect.");
			}
		}
	}
	
	/* check a integer is perfect or not */
	private boolean isPerfect(int n) {
		int k = 1;
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				k = k + i;
			}
		}
		if (k == n) {
			return true;
		} else {
			return false;
		}
	}
	
}
