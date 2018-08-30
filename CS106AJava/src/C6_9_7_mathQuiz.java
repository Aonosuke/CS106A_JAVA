/*
 * File: C6_9_7_mathQuiz.java
 * --------------------------
 * This program gives 5 simple calculation questions randomly
 * per time.
 */

import acm.program.*;
import acm.util.*;

public class C6_9_7_mathQuiz extends ConsoleProgram {
	
	public void run() {
		println("Welcome to Math Quiz ");
		int n = 0;
		while (n < quizNumber) {
			int a = rgen.nextInt(1, 20);
			int b = rgen.nextInt(1, 20);
			boolean addOrSubtract = rgen.nextBoolean();
			int result = 0;
			int answer = 0;
			if (addOrSubtract == true) {
				result = a + b;
				if (result < 20) {
					n++;
					answer = readInt("What is " + a + " + " + b + "? ");
					for(int i = 1; i < answerChances; i++) {
						if (answer == result) {
							println(congratulation());
							break;
						} else {
							answer = readInt("That's incorrect - try a different answer: ");
						}
					}
					if (answer != result) {
						println("No, the answer is " + result);
					}
				}
			} else {
				result = a - b;
				if (result > 0) {
					n++;
					answer = readInt("What is " + a + " - " + b + "? ");
					for(int i = 1; i < answerChances; i++) {
						if (answer == result) {
							println(congratulation());
							break;
						} else {
							answer = readInt("That's incorrect - try a different answer: ");
						}
					}
					if (answer != result) {
						println("No, the answer is " + result);
					}
				}
			}
		}
	}
	
	/* How to congratulation */
	private String congratulation() {
		int n = rgen.nextInt(1, 4);
		String words = null;
		switch (n) {
		case 1: words = "Correct! "; break;
		case 2: words = "You got it!"; break;
		case 3: words = "That's the answer!"; break;
		case 4: words = "You are not a fool!"; break;
		}
		return words;
	}
	
	/* Create an instance variable for the random number generator. */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/* private constants */
	private static final int quizNumber = 5;
	private static final int answerChances = 3;

}
