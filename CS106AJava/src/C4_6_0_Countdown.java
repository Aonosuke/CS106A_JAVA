/*
 * File: C4_6_0_Countdown.java
 * -------------------------
 * This program counts backwards from the value START
 * to zero, as in the count down preceding, a rocket
 * launch.
 */

import acm.program.*;

public class C4_6_0_Countdown extends ConsoleProgram {

	public void run() {
		for(int t = START; t >=0; t--) {
			println(t);
		}
		println("Liftoff!");
	}
	
	/* Specifies the value from which to start counting down */
	private static final int START = 10;
	
}
