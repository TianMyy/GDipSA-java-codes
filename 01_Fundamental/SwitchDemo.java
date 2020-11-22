package day04demo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//使用键盘录入对象
		System.out.println("Enter an integer(1-7):");
		int week = sc.nextInt();
		
		//switch判断语句
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

}
