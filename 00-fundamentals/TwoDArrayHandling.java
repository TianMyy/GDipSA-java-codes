package day06demo;

public class TwoDArrayHandling {
	public static void main(String[] args) {
		//define a 2-dimensional array
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		printArray(arr);
		System.out.println();
		int sum =  getSum(arr);
		System.out.println("Total Income: " + sum);
	}
	
	public static void printArray(int[][] arr) {
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr[j].length; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static int getSum(int[][] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
}
