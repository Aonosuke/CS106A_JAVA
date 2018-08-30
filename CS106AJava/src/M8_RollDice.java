/*
 *File:M8_RollDice.java 
 */

import acm.program.*;
import acm.util.*;

public class M8_RollDice extends ConsoleProgram {

	/* Number of sides on each dice */
	private static final int NUM_SIDES = 6;
	
	public void run() {
		int numDice = readInt("Number of dice: ");
		int maxRoll = numDice * NUM_SIDES;
		int numRolls = 0;
		while (true) {
			int roll = rollDice(numDice);
			numRolls++;
			if (roll == maxRoll) break;
			println("Rolled " + roll);
		}
		println("Rolled " + maxRoll + " after " + numRolls + " rolls");
	}
	
	/* Returns the total of ralling numDice dice */
	private int rollDice(int numDice) {
		int total = 0;
		for (int i = 0; i < numDice; i++) {
			total += rgen.nextInt(1, NUM_SIDES);
		}
		return total;
	}
	
	/* Private instance variables */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
