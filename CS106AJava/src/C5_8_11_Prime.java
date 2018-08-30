/*
 * File: C5_8_11_Prime.java
 * ------------------------
 * This program check an integer is a prime or not.
 */

import acm.program.*;
import java.lang.Math;

public class C5_8_11_Prime extends ConsoleProgram {
	
	public void run() {
		while(true) {
			int n = readInt("Enter an Integer: ");
			if(isPrime(n)) {
				println(n + " is prime.");
			} else {
				println(n + " is composite.");
			}
		}
	}
	
	/* check a integer is a prime or not */
	private boolean isPrime(int n) {
		double k = Math.sqrt(n);
		for(int i = 2; i <= k; i += 2) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
