/*
 * File: C6_9_1_RandomCard.java
 * ----------------------------
 * This program chooses a card from a deck of 52 cards and displays 
 * the name of the chosen card.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class C6_9_1_RandomCard extends ConsoleProgram {

	public void run() {
		println("This program displays a ramdomly chosen card. ");
		int grade = rgen.nextInt(1,13);
		int suit = rgen.nextInt(1,4);
		String gradeName = null;
		String suitName = null;
		switch(grade) {
		case 1: gradeName = "Ace"; break;
		case 2: gradeName = "2"; break;
		case 3: gradeName = "3"; break;
		case 4: gradeName = "4"; break;
		case 5: gradeName = "5"; break;
		case 6: gradeName = "6"; break;
		case 7: gradeName = "7"; break;
		case 8: gradeName = "8"; break;
		case 9: gradeName = "9"; break;
		case 10: gradeName = "10"; break;
		case 11: gradeName = "Jack"; break;
		case 12: gradeName = "Queen"; break;
		case 13: gradeName = "King"; break;
		}
		switch(suit) {
		case 1: suitName = "Clubs"; break;
		case 2: suitName = "Diamonds"; break;
		case 3: suitName = "Hearts"; break;
		case 4: suitName = "Spades"; break;
		}
		println(gradeName + " of " + suitName);
	}
	
	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
