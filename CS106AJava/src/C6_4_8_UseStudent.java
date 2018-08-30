/*
 * File: C6_4_8_UseStudent.java
 * ----------------------------
 * This program use the class Student
 */

import acm.program.*;

public class C6_4_8_UseStudent extends ConsoleProgram {

	public void run() {
		C6_4_2_Student Aonosuke = new C6_4_2_Student("Aonosuke", 314159);
		String a = Aonosuke.toString();
		println(a);
		println(Aonosuke);
	}
	
}
