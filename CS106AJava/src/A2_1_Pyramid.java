/*
 * File: A2_1_Pyramid.java
 * -----------------------
 * This program draws a pyramid consisting of bricks arranged in
 * horizontal rows, so that the number of bricks in each row
 * decreases by one as you move up the pyramid.
 */

import acm.graphics.*;
import acm.program.*;

public class A2_1_Pyramid extends GraphicsProgram {

	public void run() {
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			for(int j = 0; j < (BRICKS_IN_BASE - i); j++) {
				double x = (getWidth() - BRICK_WIDTH * BRICKS_IN_BASE) / 2 
						   + BRICK_WIDTH * j + (BRICK_WIDTH / 2) * i;
				double y = getHeight() - BRICK_HEIGHT * (i + 1);
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
		}
	}
	
	/* Private constants */
	private static final int BRICK_WIDTH = 10;
	private static final int BRICK_HEIGHT = 5;
	private static final int BRICKS_IN_BASE = 20;
	
}
