package day04demo;

import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[] args)
	{
		//使用switch判断语句
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your month(1-12):");
		int month = sc.nextInt();
		
		//switch语句，这样写简便但是不好看
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
