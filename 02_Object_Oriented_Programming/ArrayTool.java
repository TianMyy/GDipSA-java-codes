package day08demo;

/*
 * this is a tool class to operate for an array
 * @author Mingyu
 * @Version v1.0
 */

public class ArrayTool {
	/*
	 * private constructor
	 */
	private ArrayTool() {}
	
	/*
	 * for loop the array, format will be {parameter1, parameter2, parameter3......}
	 * @parame arr is the array going to be looped
	 */
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i]);
			}else {
				System.out.println(arr[i] + " ");
			}
		}
	}
	
	/*
	 * method for getting the max value
	 * @param arr is the array to get max value
	 * @return return max value
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[0]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/*
	 * method to get the index of this number first appear in the array
	 * @param arr the array that find in
	 * @param value the found number
	 * @return if appear return index, if not, return -1
	 */
	public static int getIndex(int[] arr, int value) {
		int index = -1;
		
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
}
