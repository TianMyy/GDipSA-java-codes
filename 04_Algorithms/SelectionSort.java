package sort;

//time complexity: O(n ^ 2)

public class SelectionSort {
	public static void main(String[] args) {
		Integer[] number = {4,3,5,6,2,1};
		selectionSort(number);
		for(int temp: number) {
			System.out.print(temp + " ");
		}
	}
	
	public static void selectionSort(Comparable[] number) {
		for(int i = 0; i < number.length - 2; i++) {
			//define a variable, record the index where smallest number is
			//make it as the position that join the sort first
			int minIndex = i;
			for(int j = i+1; j < number.length; j++) {
				//compare value in minIndex with value in index j
				if(greater(number[minIndex],number[j])) {
					minIndex = j;
				}
			}
			//exchange the value between minIndex and index i
			exchange(number,minIndex,i);
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
