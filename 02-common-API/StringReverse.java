package day12demo;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string:");
		String s = scanner.next();
		String result = stringReverse(s);
		System.out.println(result);
	}
	public static String stringReverse(String s) {
		char[] chs = s.toCharArray();
		String result = "";
		for(int i = s.length()-1; i >= 0; i--) {
			result += chs[i];
		}
		return result;
	}
}
