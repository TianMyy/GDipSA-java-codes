package day13demo;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13};
		System.out.println("Before Select Sort:");
		printArray(arr);
		System.out.println("After Select Sort:");
		selectSort(arr);
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
	
	public static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
