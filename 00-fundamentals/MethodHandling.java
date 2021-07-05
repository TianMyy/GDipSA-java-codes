package day05demo;

import java.util.Scanner;

public class MethodHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the second integer: ");
		int y = sc.nextInt();
		
		System.out.println("Enter the third integer: ");
		int z = sc.nextInt();
		
		int result = getMax(x,y);
		System.out.println("Max of two integers is: " + result);
		
		boolean flag = isSame(x,y);
		System.out.println(flag);
		
		int result2 = getMax(x,y,z);
		System.out.println("Max of three integers is: " + result2);
	}
	
	public static int getMax (int a, int b) {
		int c =((a > b) ? a : b);
		return c;
	}
	
	public static boolean isSame (int a, int b) {
		return a == b;
	}
	
	public static int getMax (int a, int b, int c) {
		//return ((a>b) ? ((a>c)? a:c) : ((b>c)? b:c));
		int temp = (a>b)? a:b;
		int max = (temp>c)? temp:c;
		return max;
	}
}