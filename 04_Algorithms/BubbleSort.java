package sort;

//time complexity: O(n ^ 2)

public class BubbleSort {
	public static void main(String[] args) {
		Integer[] number = {4,3,5,6,2,1};
		bubbleSort(number);
		for(int temp: number) {
			System.out.print(temp + " ");
		}
	}
	
	public static void bubbleSort(Comparable[] number) {
		for(int i = number.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(greater(number[j],number[j + 1])) {
					exchange(number, j, j+1);
				}
			}
		}
	}
	
	private static boolean greater(Comparable v, Comparable w) {
		return v.compareTo(w) > 0;
	}
	
	private static void exchange(Comparable[] number, int i, int j) {
		Comparable temp;
		temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
}
