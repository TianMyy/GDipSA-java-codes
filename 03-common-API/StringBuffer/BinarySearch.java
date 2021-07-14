package day13demo;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66, 77};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value you want to search: ");
		int goal = sc.nextInt();
		
		int result = binarySearch(arr,goal);
		if(result == -1)
			System.out.println("Cannot find.");
		else
			System.out.println("The index of your value is "+result);
	}
	
	public static int binarySearch(int[] arr, int goal) {
		int min = 0;
		int max = arr.length-1;
		int mid = (min+max) / 2;
		
		while(goal != arr[mid]) {
			if(goal < arr[mid]) {
				max = mid - 1;
				mid = (min+max) / 2;
			}else {
				min = mid + 1;
				mid = (min+max) / 2;
			}
			
			if(min > max) {
				return -1;
			}
		}
		
		return mid;
	}
}
