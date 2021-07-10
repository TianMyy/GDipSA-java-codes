package day08demo;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int correct = (int)(Math.random() * 100) + 1;
		
		System.out.println("Enter your guess number: ");
		int guess = sc.nextInt();
		int count = 1;
		
		while(guess != correct) {
			if(guess < correct) {
				System.out.println("Smaller than the correct number, try again.");
				guess = sc.nextInt();
				count++;
			}
			if(guess > correct) {
				System.out.println("Bigger than the correct number, try again.");
				guess = sc.nextInt();
				count++;
			}
		}
		System.out.println("Congratulations! You are right in " + count + " times.");
	}
}
