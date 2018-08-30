/*
 * File: Hongbao.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class Hongbao extends ConsoleProgram {

	public void run() {
		
		int RunTimes = 1000;
		int[] Player = new int[5];
		int[] Lucky = new int[3];
		int[] HongBao = new int[3];
		int unLucky = rgen.nextInt(5);
		int Counter = 1;
		int RC = 0;
		for(int i = 0; i < 4; i++) {
			Player[i] = 1000;
		}
		Player[4] = 1000;
		for(int k = 0; k < RunTimes; k++) {
			Player[unLucky] -= 100;
			HongBao[0] = rgen.nextInt(1, 98);
			HongBao[1] = rgen.nextInt(1, 99 - HongBao[0]);
			HongBao[2] = 100 - HongBao[0] - HongBao[1];
			Lucky[0] = rgen.nextInt(5);
			while(Counter <= 2) {
				Lucky[Counter] = rgen.nextInt(5);
				if ((Lucky[Counter] != Lucky[Counter - 1]) && (Lucky[Counter] != Lucky[0])) {
					Counter += 1;
				}
			}
			Counter = 1;
			unLucky = Lucky[0];
			for(int i = 0; i < 3; i++) {
				Player[Lucky[i]] += HongBao[i];
				if(i > 0) {
					if (HongBao[i] < HongBao[i-1]) {
						unLucky = Lucky[i];
					}
				}
			}
			RC += 1;
			println ("Round" + RC + "\t" + "P[0]=" + Player[0] + "\t"+"P[1]=" + Player[1]+"\t" 
					+ "P[2]=" + Player[2] + "\t" + "P[3]=" + Player[3] + "\t" + "P[4]=" + Player[4]);
			
		}
		
	}
	
	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
