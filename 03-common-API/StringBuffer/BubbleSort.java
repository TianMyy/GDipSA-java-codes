package day13demo;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13};
		System.out.println("Before Bubble Sort:");
		printArray(arr);
		System.out.println("After Bubble Sort:");
		bubbleSort(arr);
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			}else {
				System.out.print(arr[i] +", ");
			}
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
