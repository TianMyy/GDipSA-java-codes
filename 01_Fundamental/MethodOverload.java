package day05demo;

public class MethodOverload {
	public static void main(String[] args) {
		//方法重载就是方法名可以一样只要参数个数或者类型不同即可
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
