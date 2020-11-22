package day06demo;

import java.util.Scanner;

public class TwoDYangHuiTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows do you want to print? ");
		int row = sc.nextInt();
		int[][] arr = new int[row][row];
		for(int i = 0; i < row; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
			for(int j = 0; j < i+1; j++) {
				if(i > 1 && j > 0 && j < i){
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
