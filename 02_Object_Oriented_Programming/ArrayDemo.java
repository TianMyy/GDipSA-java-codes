package day08demo;

public class ArrayDemo {

	public static void main(String[] args) {
		//define array
		int[] arr = {28,55,37,46,19};
		
		//loop
		ArrayTool.printArray(arr);
		
		//get max value of array
		int max = ArrayTool.getMax(arr);
		System.out.println("Max: "+ max);

		//get the index of 55
		int index = ArrayTool.getIndex(arr, 55);
		System.out.println("Index: "+index);
	}

}
