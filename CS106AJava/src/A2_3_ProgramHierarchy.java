/*
 * File: A2_3_ProgramHierarchy.java
 * --------------------------------
 * This program draws a partial diagram of the acm.program
 * class hierarchy.
 */

import acm.graphics.*;
import acm.program.*;

public class A2_3_ProgramHierarchy extends GraphicsProgram {

	public void run() {
		double x1 = getWidth() / 2 - B_WIDTH * 1.5 - X_SEPERATION;
		double x2 = getWidth() / 2 - B_WIDTH / 2;
		double x3 = getWidth() / 2 + B_WIDTH / 2 + X_SEPERATION;
		double y1 = getHeight() / 2 - B_HEIGHT - Y_SEPERATION / 2;
		double y2 = getHeight() / 2 + Y_SEPERATION /2;
		
		GRect SuperclassBox = new GRect(x2, y1, B_WIDTH, B_HEIGHT);
		GRect SubclassBox1 = new GRect(x1, y2, B_WIDTH, B_HEIGHT);
		GRect SubclassBox2 = new GRect(x2, y2, B_WIDTH, B_HEIGHT);
		GRect SubclassBox3 = new GRect(x3, y2, B_WIDTH, B_HEIGHT);
		
		GLine Line1 = new GLine(getWidth() / 2, y1 + B_HEIGHT, x1 + B_WIDTH / 2, y2);
		GLine Line2 = new GLine(getWidth() / 2, y1 + B_HEIGHT, getWidth() / 2, y2);
		GLine Line3 = new GLine(getWidth() / 2, y1 + B_HEIGHT, x3 + B_WIDTH / 2, y2);
		
		GLabel Superclass = new GLabel("Program", x2 + (B_WIDTH - 60) / 2, y1 + B_HEIGHT / 2 + FONT_SIZE / 2);
		GLabel Subclass1 = new GLabel("GraphicsProgram", x1 + (B_WIDTH - 116) / 2, y2 + B_HEIGHT / 2 + FONT_SIZE / 2);
		GLabel Subclass2 = new GLabel("ConsoleProgram", x2 + (B_WIDTH - 110) / 2, y2 + B_HEIGHT / 2 + FONT_SIZE / 2);
		GLabel Subclass3 = new GLabel("DialogProgram", x3 + (B_WIDTH - 90) / 2, y2 + B_HEIGHT / 2 + FONT_SIZE / 2);
		Superclass.setFont("Helvetica-15");
		Subclass1.setFont("helvetica-15");
		Subclass2.setFont("helvetica-15");
		Subclass3.setFont("helvetica-15");
		
		add(SuperclassBox);
		add(SubclassBox1);
		add(SubclassBox2);
		add(SubclassBox3);
		add(Line1);
		add(Line2);
		add(Line3);
		add(Superclass);
		add(Subclass1);
		add(Subclass2);
		add(Subclass3);
	}
	
	/* Private constants */
	private static final int B_WIDTH = 150;
	private static final int B_HEIGHT = 50;
	private static final int X_SEPERATION = 30;
	private static final int Y_SEPERATION = 60;
	private static final int FONT_SIZE = 15;
	
}
