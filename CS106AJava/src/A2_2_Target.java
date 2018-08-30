/*
 * File: A2_2_Target.java
 * ----------------------
 * This program draws an image of an archery target.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class A2_2_Target extends GraphicsProgram {
	
	public void run() {
		double x = getWidth() / 2;
		double y = getHeight() / 2;
		GOval C1 = circle(x, y, RADIUS_1);
		GOval C2 = circle(x, y, RADIUS_2);
		GOval C3 = circle(x, y, RADIUS_3);
		C1.setFillColor(Color.RED);
		C2.setFillColor(Color.WHITE);
		C3.setFillColor(Color.RED);
		add(C1);
		add(C2);
		add(C3);		
	}
	
	/* Private method circle */
	private GOval circle(double x, double y, double r) {
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		return circle;
	}
	
	/* Private constants */
	private static final int RADIUS_1 = 72;
	private static final int RADIUS_2 = 48;
	private static final int RADIUS_3 = 24;

}
