/*
 * File:M7_Checkerboard.java
 * -----------------------
 * This program is used to draw a 8*8 checkerboard.
 */

import acm.program.*;
import acm.graphics.*;

public class M7_Checkerboard extends GraphicsProgram {

	/* Number of rows */
	private static final int NROWS = 8;
	
	/* Number of NCOLUMNS */
	private static final int NCOLUMNS = 8;
	
	/*  */
	public void run() {
		int sqSize = getHeight() / NROWS;
		for (int i = 0; i < NROWS; i++) {
			for (int j = 0; j < NCOLUMNS; j++) {
				int x = j * sqSize;
				int y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFilled(((i + j) % 2) != 0);
				add(sq);
			}
		}
	}
	
}
