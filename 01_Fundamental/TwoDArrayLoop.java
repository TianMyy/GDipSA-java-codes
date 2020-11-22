package day06demo;

public class TwoDArrayLoop {
	public static void main(String[] args) {
		//define a 2-dimensional array
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11}};
		//arr[0] represent {1,2,3}
		printArray(arr);
	}
	public static void printArray(int[][] arr) {
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr[j].length; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}
