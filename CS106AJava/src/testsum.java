/*
 * File: testsum.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;

public class testsum extends ConsoleProgram {

	public void run() {
		
		double s = 0;
		double ds = 0;
		double upper = 100000;
		double dx = 0.01;
		double y = 5;
		double oldy = 0;
		for (double i = dx; i <= upper; i += dx) {
			oldy = y;
			y = 5 * Math.sin(i) / i;
			ds = (oldy + y) * dx / 2;
			s += ds;
		}
		println(s);
		
	}
	
	
}
