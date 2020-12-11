package day13demo;

import java.util.Scanner;

public class CharacterDemo {
	public static void main(String[] args) {
		int up = 0;
		int low = 0;
		int number = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.next();
		
		char[] chs = input.toCharArray();
		
		for(int i = 0; i < chs.length; i++) {
			char ch = chs[i];
			
			if(Character.isUpperCase(ch)) {
				up++;
			}else if(Character.isLowerCase(ch)) {
				low++;
			}else if(Character.isDigit(ch)) {
				number++;
			}
		}
		
		System.out.println("isUpperCase: "+up);
		System.out.println("isLowerCase: "+low);
		System.out.println("isDigit: "+number);
	}
}
