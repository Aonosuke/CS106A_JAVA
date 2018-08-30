/*
 * File: C6_9_5_SlotMachine.java
 * -----------------------------
 * This program simulates a slot machine.
 */

import acm.program.*;
import acm.util.*;

public class C6_9_5_SlotMachine extends ConsoleProgram {

	public void run() {
		String answer1 = readLine("Would you like instructions? ");
		if (answer1.equals("yes")) {
			println("Bazinga! There is no instructions! You fool! ");
		}
		int yourMoney = 50;
		int youGet = 0;
		while(yourMoney > 0) {
			String answer2 = readLine("You have $" + yourMoney + ". Would you like to play? ");
			if (answer2.equals("yes")) {
				String result1 = singleResult();
				String result2 = singleResult();
				String result3 = singleResult();
				if (result1.equals("BAR") && result2.equals("BAR") && result3.equals("BAR")) {
					youGet = 250;
				} else if (result1.equals("BELL") && result2.equals("BELL") && (result3.equals("BELL") 
						|| result3.equals("BAR"))) {
					youGet = 20;
				} else if (result1.equals("PLUM") && result2.equals("PLUM") && (result3.equals("PLUM") 
						|| result3.equals("BAR"))) {
					youGet = 14;
				} else if (result1.equals("ORANGE") && result2.equals("ORANGE") && (result3.equals("ORANGE") 
						|| result3.equals("BAR"))) {
					youGet = 10;
				} else if (result1.equals("CHERRY") && result2.equals("CHERRY") && result3.equals("CHERRY")) {
					youGet = 7;
				} else if (result1.equals("CHERRY") && result2.equals("CHERRY") && (!result3.equals("CHERRY"))) {
					youGet = 5;
				} else if (result1.equals("CHERRY") && (!result2.equals("CHERRY")) && (!result3.equals("CHERRY"))) {
					youGet = 2;
				} else {
					youGet = 0;
				}
				if (youGet > 0) {
					println(result1 + "	" + result2 + "	" + result3 + "	-- You win $" + youGet);
				} else {
					println(result1 + "	" + result2 + "	" + result3 + "	-- You lose");
				}
				println();
				yourMoney = yourMoney - 1 + youGet;			
			}
		}
	}
	
	private String singleResult() {
		int x = rgen.nextInt(1, 6);
		String result = null;
		switch(x) {
		case 1: result = "CHERRY"; break;
		case 2: result = "LEMON"; break;
		case 3: result = "ORANGE"; break;
		case 4: result = "PLUM"; break;
		case 5: result = "BELL"; break;
		case 6: result = "BAR"; break;
		}
		return result;
	}
		
	/*Create an instance variable for the random number generator. */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
