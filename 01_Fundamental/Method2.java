package day05demo;

import java.util.Scanner;

public class Method2 {
	//使用三元法取三个数中的最大值
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the second integer: ");
		int y = sc.nextInt();
		
		System.out.println("Enter the third integer: ");
		int z = sc.nextInt();
		
		int result = getMax(x,y,z);
		System.out.println("Max is: " + result);
	}
	
	public static int getMax (int a, int b, int c) {
		//这样阅读性不强
		//return ((a>b) ? ((a>c)? a:c) : ((b>c)? b:c));
		int temp = (a>b)? a:b;
		int max = (temp>c)? temp:c;
		return max;
	}
}
