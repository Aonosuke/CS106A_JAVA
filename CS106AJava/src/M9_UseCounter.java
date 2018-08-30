/*
 * File: M9_UseCounter.java
 * ------------------------
 * This program use the class M9_MyCounter.
 */

import acm.program.*;

public class M9_UseCounter extends ConsoleProgram {

	public void run() {
		M9_MyCounter count1 = new M9_MyCounter(); // starts at 1
		M9_MyCounter count2 = new M9_MyCounter(10000);
		
		println("Five values for count1: ");
		countFiveTimes(count1);
		
		println("Five values for count2: ");
		countFiveTimes(count2);
		
		println("Another five values for count1: ");
		countFiveTimes(count1);
	}
	
	private void countFiveTimes(M9_MyCounter counter) {
		for (int i = 0; i < 5; i++) {
			println(counter.nextValue());
		}
	}
	
}
