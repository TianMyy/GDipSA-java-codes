package sort;

//time complexity: O(n ^ 2)

public class insertionSort {
	public static void main(String[] args) {
		Integer[] number = {4,3,5,6,2,1};
		insertionSort(number);
		for(int temp: number) {
			System.out.print(temp + " ");
		}
	}
	
	public static void insertionSort(Comparable[] number) {
		for(int i =1; i < number.length; i++) {
			for(int j = i; j > 0; j--) {
				if(greater(number[j-1],number[j])) {
					exchange(number,j-1,j);
				}
				else
					break;
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
