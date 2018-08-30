
public class M9_MyCounter {

	public M9_MyCounter(int startValue) {
		counter = startValue;
	}
	
	public M9_MyCounter() {
		counter = 1;
	}
	
	public int nextValue() {
		int temp = counter;
		counter++;
		return (temp);
	}
	
	private int counter;
	
}
