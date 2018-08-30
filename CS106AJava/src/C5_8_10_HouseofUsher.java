/*
 * File: C5_8_10_HouseofUsher.java
 * -------------------------------
 * This program draws a house of Usher.
 */

import acm.graphics.*;
import acm.program.*;

public class C5_8_10_HouseofUsher extends GraphicsProgram {

	public void run() {
		double bx = getWidth() / 4;
		double y = HORIZON;
		double tx = getWidth() * 3 / 4;
		drawBuilding(bx, y);
		drawTrees(tx, y);
	}
	
	/* Draw a building */
	private void drawBuilding(double x, double y) {
		double clx = x - getWidth() * 5 / 28;
		double crx = x + getWidth() * 5 / 28;
		double clrw = getWidth() / 14;
		double fw = clrw * 4;
		double ey = HORIZON - FACE_HEIGHT * 2 / 3;
		drawColumn(clx, y, clrw, COLUMN_HEIGHT, AHEIGHT_LR);
		drawColumn(crx, y, clrw, COLUMN_HEIGHT, AHEIGHT_LR);
		drawColumn(x, y, fw, FACE_HEIGHT, AHEIGHT_FACE);
		drawColumn(x, y, DOOR_WIDTH, DOOR_HEIGHT, AHEIGHT_DOOR);
		drawEyes(x, ey);
	}
	
	/* Draw trees */
	private void drawTrees(double x, double y) {
		double tx1 = x - getWidth() / 6;
		double tx2 = x + getWidth() / 6;
		drawColumn(tx1, y, TREE_WIDTH, TREE_HEIGHT, AHEIGHT_TREE);
		drawColumn(tx2, y, TREE_WIDTH, TREE_HEIGHT, AHEIGHT_TREE);
		drawColumn(x, y, TREE_WIDTH, TREE_HEIGHT, AHEIGHT_TREE);
	}
	
	/* Draw column */
	private void drawColumn(double x, double y, double w, double mh, double ah) {
		GRect main = new GRect(x - w / 2, y - mh, w, mh);
		add(main);
		drawAngle(x, y - mh, w, ah);
	}
	
	/* Draw angle */
	private void drawAngle(double x, double y, double w, double h) {
		add(new GLine(x, y - h, x - w / 2, y));
		add(new GLine(x, y - h, x + w / 2, y));
	}
	
	/* Draw eyes */
	private void drawEyes(double x, double y) {
		add(drawcircle(x - EYES_SPACE / 2, y));
		add(drawcircle(x + EYES_SPACE / 2, y));
	}
	
	/* Draw circle */
	private GOval drawcircle(double x, double y) {
		double r = EYE_RADIUS;
		GOval circle = new GOval(x - r, y - r, r * 2, r * 2);
		return circle;
	}
	
	/* Private constants */
	private static final double HORIZON = 160;
	private static final double COLUMN_HEIGHT = 120;
	private static final double FACE_HEIGHT = 100;
	private static final double AHEIGHT_LR = 20;
	private static final double AHEIGHT_FACE = 30;
	private static final double DOOR_HEIGHT = 30;
	private static final double AHEIGHT_DOOR = 15;
	private static final double DOOR_WIDTH = 20;
	private static final double TREE_WIDTH = 15;
	private static final double TREE_HEIGHT = 80;
	private static final double AHEIGHT_TREE = 30;
	private static final double EYES_SPACE = 25;
	private static final double EYE_RADIUS = 8;
	
}
