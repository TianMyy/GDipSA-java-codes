package day05demo;

import java.util.Scanner;

public class Method1 {
	//使用三元法取两个数中的最大值
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the second integer: ");
		int y = sc.nextInt();
		
		int result = getMax(x,y);
		System.out.println("Max is: " + result);
		
		boolean flag = isSame(x,y);
		System.out.println(flag);
	}
	
	public static int getMax (int a, int b) {
		int c =((a > b) ? a : b);
		return c;
	}
	
	public static boolean isSame (int a, int b) {
		// 判断两个数是否相等直接返回Boolean表达式
		return a == b;
	}
}