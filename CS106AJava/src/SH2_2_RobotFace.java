/*
 * File: SH2_2_RobotFace.java
 * --------------------------
 * This program draws a robot-looking face.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class SH2_2_RobotFace extends GraphicsProgram {

	public void run() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		add(createFilledRect(cx, cy, HEAD_WIDTH, HEAD_HEIGHT, Color.GRAY));
		add(createFilledCircle(cx - HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4, EYE_RADIUS, Color.YELLOW));
		add(createFilledCircle(cx + HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4, EYE_RADIUS, Color.YELLOW));
		add(createFilledRect(cx, cy + HEAD_HEIGHT / 4, MOUTH_WIDTH, MOUTH_HEIGHT, Color.WHITE));	
	}
	
	/*
	 * Creates a rectangle centered at (x, y).
	 * The rectangle is set to be filled and colored in the specified color.
	 */
	private GRect createFilledRect(double x, double y, double w, double h, Color color) {
		GRect rectangle = new GRect(x - w / 2, y - h / 2, w, h);
		rectangle.setColor(color);
		rectangle.setFilled(true);
		return rectangle;
	}
	
	/*
	 * Creates a rectangle centered at (x, y).
	 * The rectangle is set to be filled and colored in the specified color.
	 */
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r / 2, r * 2, r * 2);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
	
	// private constants
	private static final double HEAD_WIDTH = 100;
	private static final double HEAD_HEIGHT = 150;
	private static final double EYE_RADIUS = 12;
	private static final double MOUTH_WIDTH = 60;
	private static final double MOUTH_HEIGHT = 20;
	
}
