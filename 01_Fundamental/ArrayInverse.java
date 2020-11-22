package day05demo;

public class ArrayInverse {
	public static void main(String[] args) {
		int[] arr = {12,98,50,34,76,89};
		getInverse(arr);
		printArray(arr);
	}
	public static void getInverse(int[] arr) {
		for(int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	public static void printArray(int[] arr) {
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
