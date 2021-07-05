package day06demo;

import java.util.Scanner;

public class SecretDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your code number(length less than 8): ");
		int number = sc.nextInt();
		String result = setCode(number);
		System.out.println("Result: " + result);
	}
	
	public static String setCode(int number) {
		int[] arr = new int[8];
		int index = 0;
		while(number > 0) {
			arr[index] = number % 10;
			index++;
			number /= 10;
		}
		for(int i = 0; i < index; i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}
		int temp = arr[0];
		arr[0] = arr[index - 1];
		arr[index - 1] = temp;
		
		String s = "";
		for(int i = 0; i < index; i++) {
			s += arr[i];
		}
		return s;
	}
}
