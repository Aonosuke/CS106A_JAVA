/*
 * File: C5_8_7_AskYesNoQuestion.java
 * ----------------------------------
 * This program ask user "Would you like instructions?" and
 * return an answer.
 */

import acm.program.*;

public class C5_8_7_AskYesNoQuestion extends ConsoleProgram {
	
	public void run() {
		while(true) {
			if(askYesNoQuestion("Would you like instructions?")) {
				println("Great!");
			} else {
				println("F*ck!");
			}
		}
	}
	
	/*
	 * return the boolean to the question.
	 */
	
	private boolean askYesNoQuestion(String question) {
	    while (true) {
	    	String answer = readLine("Would you like instructions? ");
	         if (!answer.equals("yes") && !answer.equals("no")) {
	             println ("Please enter a yes or no answer.");
	         } else {
	             return answer.equalsIgnoreCase("yes");
	         }
	    } 
	}

}
