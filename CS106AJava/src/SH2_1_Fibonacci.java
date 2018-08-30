/*
 * File: SH2_1_Fibonacci.java
 * --------------------
 * This program creates a table of Fibonacci sequence.
 */

import acm.program.*;

public class SH2_1_Fibonacci extends ConsoleProgram {

	public void run() {
		println("This program lists the Fibonacci sequence");
		println("0");
		println("1");
		for(int i = 1; fibonacci(i) <= MAX_TERM_VALUE; i++) {
			println(fibonacci(i));
		}
		
	}
	
	/*
	 * Return the Fibonacci of n, which is the sum of n-2 
	 * and n-1.
	 */
	private int fibonacci(int n) {
		int a = 0;
		int b = 1;
		int result = 0;
		for(int i = 0; i < n; i++){
			result = a + b;
			a = b;
			b = result;
		}
		return result;
	}
	
	/* private constants */
	private static final int MAX_TERM_VALUE = 10000;
	
}
