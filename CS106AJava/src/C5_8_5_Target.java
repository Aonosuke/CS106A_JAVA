/*
 * File: C5_8_5_Target.java
 * ------------------------
 * This program draws an image of an archery target.
 * The circles of target should be set by variable N_CIRCLES.
 * The radius of outer circle and inner circle should be set 
 * by variable OUTER_RADIUS and INNER_RADIUS.
 */

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class C5_8_5_Target extends GraphicsProgram {

	public void run() {
		for(int i = N_CIRCLES; i >= 1; i--) {
			add(createFilledCircle(i));
		}
	}
	
	/* Return the circles of target */
	private GOval createFilledCircle(int n) {
		int radiusN = INNER_RADIUS + (OUTER_RADIUS - INNER_RADIUS) * (n - 1) / (N_CIRCLES - 1);
		GOval circle = new GOval(getWidth() / 2 - radiusN, getHeight() / 2 - radiusN, radiusN * 2, radiusN *2);
		if((n % 2) ==0) {
			circle.setColor(Color.WHITE);
		} else {
			circle.setColor(Color.RED);
		}
		circle.setFilled(true);
		return circle;
	}
	
	/* private constants */
	private static final int N_CIRCLES = 5;
	private static final int OUTER_RADIUS = 75;
	private static final int INNER_RADIUS = 10;
}
