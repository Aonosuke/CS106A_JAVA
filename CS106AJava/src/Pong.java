/*
 * File:Pong.java
 * --------------
 * This program imitates the famous Atari video game Pong.
 * Player can control a Rectangle to rebound the ball.
 * You can only play with the computer now, despite the 
 * computer can't move now.
 * Please wait for next version.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;

public class Pong extends GraphicsProgram {

	public void run() {
		int middleLineNum = (getHeight() - 20) / 50;
		double middleRectHeight = (getHeight() - 40 - 20 * (middleLineNum - 1)) / middleLineNum;
		double middleRectTop = 20;
		double middleRectLeft = getWidth() / 2 - 3;
		
		for(int i = 0; i < middleLineNum; i++) {
			GRect Rect = new GRect(middleRectLeft, middleRectTop, 6, middleRectHeight);
			Rect.setFilled(true);
			add(Rect);
			middleRectTop = middleRectTop + middleRectHeight + 20;
		}
		
		GRect LeftRect = new GRect(30, 80, 10, 200);
		GRect RightRect = new GRect(getWidth() - 40, getHeight() / 2 - 40, 10, 80);
		GRect Ball = new GRect(getWidth() / 2 + 200, getHeight() / 2 - 50, 10, 10);
		LeftRect.setFilled(true);
		RightRect.setFilled(true);
		Ball.setFilled(true);
		GLabel LeftScore = new GLabel("02", 250, 50);
		GLabel RightScore = new GLabel("00", 410, 50);
		LeftScore.setFont("Space Age-50");
		RightScore.setFont("Space Age-50");
		add(LeftRect);
		add(RightRect);
		add(Ball);
		add(LeftScore);
		add(RightScore);
	}
	
	public void init() {
		addMouseListeners();
	}
	
	private static final double STAR_SIZE = 20;
	
}
