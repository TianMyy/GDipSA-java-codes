package day05demo;

public class ArraysHandling {
	public static void main(String[] args) {
		int[] arr = {11,12,13,14,15};
		printArray(arr);
		System.out.println();
		getInverse(arr);
		printArray2(arr);
		System.out.println();
		
		int[] arr1 = {34,98,10,25,67};
		// find any value as reference, set as default max
		// then loop other variables, get value and compare with reference, if bigger, set as max
		int max = getMax(arr1);
		int min = getMin(arr1);
	    System.out.println("max:" + max);
	    System.out.println("min:" + min);
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void getInverse(int[] arr) {
		for(int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
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
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
