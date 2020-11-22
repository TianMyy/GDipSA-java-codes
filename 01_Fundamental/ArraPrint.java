package day05demo;

public class ArraPrint {
	public static void main(String[] args) {
		int[] arr = {11,12,13,14,15};
		printArray(arr);
		System.out.println();
		printArray2(arr);
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void printArray2(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			}
			else
				System.out.print(arr[i] + ",");
		}
	}
}
