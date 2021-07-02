package day04demo;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		demo1();
		demo2();
	}

	public static void demo1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer(1-7):");
		int week = sc.nextInt();

		switch(week) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("**Error**");
				break;
		}
	}
	
	public static void demo2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your month(1-12):");
		int month = sc.nextInt();
		// switch this format easy but not clean
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("Winter");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("Summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("Autumn");
				break;
			default:
				System.out.println("**Error**");
		}
	}
}
