package day13demo;

import java.util.Scanner;

public class StringBufferAdvantage2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string:");
		String s = sc.next();
		System.out.println(reverse(s));
	}
	
	public static String reverse(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return sb.toString();
	}
}
