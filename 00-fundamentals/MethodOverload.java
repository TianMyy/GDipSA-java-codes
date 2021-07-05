package day05demo;

public class MethodOverload {
	public static void main(String[] args) {
		// method overload means method name can be the same, but number of arguments or type is different is
		byte b1 = 3;
		byte b2 = 4;
		System.out.println("byte: " + compare(b1,b2));
		
		short s1 = 5;
		short s2 = 5;
		System.out.println("short: " + compare(s1,s2));
		
		int t1 = 6;
		int t2 = 7;
		System.out.println("int: " + compare(t1,t2));
		
		long l1 = 4;
		long l2 = 4;
		System.out.println("long: " + compare(l1,l2));
	}
	
	public static boolean compare(byte a, byte b) {
		return a == b;
	}
	
	public static boolean compare(short a, short b) {
		return a == b;
	}
	
	public static boolean compare(int a, int b) {
		return a == b;
	}
	
	public static boolean compare(long a, long b) {
		return a == b;
	}
}
