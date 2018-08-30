import acm.program.*;

public class C8_7_Revise extends ConsoleProgram {
	
	public void run() {
		println("10-----");
		println(Character.isDigit(5));
		println(Character.isDigit('5'));
		println(Character.toUpperCase('5'));
		
		println("\n17-----");
		println("ABCDE".length());
		println("".length());
		println("\t".length());
		println("ABC".charAt(2));
		println("ABCDE".substring(0, 3));
		println("ABCDE".substring(2));
		println("ABCDE".indexOf("C"));
		println("ABCDE".indexOf('Z'));
		println("XYZZY".indexOf('Z', 3));
		println("ABCDE".toLowerCase());
		
		println("\n19-----");
		println("ABCDE".equals("abcde"));
		println("ABCDE".equalsIgnoreCase("abcde"));
		println("ABCDE".compareTo("ABCDE"));
		println("ABCDE".compareTo("ABC"));
		println("ABCDE".compareTo("abcde"));
		println("ABCDE".compareTo("a"));
	}

}
