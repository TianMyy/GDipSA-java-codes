package day07demo;

import java.util.Scanner;

class MyMath{
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
}

public class MathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int first = sc.nextInt();
		System.out.println("Enter the second integr: ");
		int second = sc.nextInt();
		
		MyMath mm = new MyMath();
		System.out.println("Add: "+mm.add(first, second));
		System.out.println("Substract: "+mm.sub(first,second));
		System.out.println("Multiply: "+mm.mul(first, second));
		System.out.println("Divide: "+mm.div(first, second));
	}
}
