import java.lang.Math;
import acm.program.*;

public class M7_squareRoot extends ConsoleProgram {
	
	public void run() {
		double x = readDouble("Enter x: ");
		double y = Math.sqrt(x);
		println("sqrt= " + y);
	}
	
}
