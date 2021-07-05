package day05demo;

import java.util.Scanner;

public class PrintStars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int row = sc.nextInt();
		
		System.out.println("Enter number of columns:");
		int column = sc.nextInt();
		
		printStar(row,column);
	}
	public static void printStar(int a, int b) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
