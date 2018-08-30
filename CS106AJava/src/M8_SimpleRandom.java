/*
 * File:M8_SimpleRandom.java
 * -------------------------
 * This program generate a random number.
 */

import acm.program.*;
import acm.util.*;

public class M8_SimpleRandom extends ConsoleProgram {

	public void run() {
		int dieRoll = rgen.nextInt(1, 6);
		println("You rolled " + dieRoll);
	}
	
	/*
	 * Private instance variables
	 */
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
