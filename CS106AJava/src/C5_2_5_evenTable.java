/*
 * C5_2_5_evenTable.java
 * ---------------------
 * This program create a table of even.
 */

import acm.program.*;

public class C5_2_5_evenTable extends ConsoleProgram {

	public void run() {
		for(int i = 1; i <= 100; i++) {
			if(isEven(i)) println(i);
		}
	}
	
	/* a number is even or odd */
	private boolean isEven(int n) {
		return( n % 2 == 0);
	}
	
}
