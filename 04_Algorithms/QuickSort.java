package sort;

public class QuickSort {
	public static void main(String[] args) {
		Integer[] number = {6,1,2,7,9,3,4,5,8};
		quickSort(number);
		for(int temp: number) {
			System.out.print(temp + " ");
		}
	}
	
	public static void quickSort(Comparable[] number) {
		int lo = 0;
		int hi =number.length - 1;
		quickSort(number,lo,hi);
	}
	
	public static void quickSort(Comparable[] number, int lo, int hi) {
		if(hi <= lo) {
			return;
		}
		int partition = partition(number,lo,hi);
		quickSort(number,lo,partition - 1);
		quickSort(number,partition + 1,hi);
	}
	
	public static int partition(Comparable[] number, int lo, int hi) {
		Comparable key = number[lo];
		int left = lo;
		int right = hi + 1;
		while(true) {
			while(less(key,number[--right])) {
				if(right == lo) {
					break;
				}
			}
			while(less(number[++left],key)) {
				if(left == hi) {
					break;
				}
			}
			if(left >= right) {
				break;
			}else {
				exchange(number,left,right);
			}
		}
		exchange(number,lo,right);
		return right;
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	private static void exchange(Comparable[] number, int i, int j) {
		Comparable temp;
		temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
}
