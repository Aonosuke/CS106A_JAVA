/*
 * File: C6_9_9_BookTest.java
 * --------------------------
 * This program is used to test C6_9_9_LibraryRecord.
 */

import acm.program.ConsoleProgram;

public class C6_9_9_BookTest extends ConsoleProgram{
	
	public void run() {
		C6_9_9_LibraryRecord book1 = new C6_9_9_LibraryRecord("a", "b", 123, "c", 2014, true);
		println("book1 = " + book1);
		String abc = book1.getName();
		println(abc);
	}

}
