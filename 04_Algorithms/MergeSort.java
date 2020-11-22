package sort;

//time complexity: O(nlogn) --> the worst situation:O(n^2)

public class MergeSort {
	public static void main(String[] args) {
		Integer[] number = {8,4,5,7,1,3,6,2};
		mergeSort(number);
		for(int temp: number) {
			System.out.print(temp + " ");
		}
	}
	
	////merge assistant array
	public static Comparable[] assist;
	
	public static void mergeSort(Comparable[] number) {
		//1. initialize assistant array "assist"
		assist = new Comparable[number.length];
		//2. define value of variable "lo" and "hi", record the smallest and biggest index
		int lo = 0;
		int hi = number.length - 1;
		//3. use Sort method overload to sort the arguments between "lo" and "hi"
		mergeSort(number, lo, hi);
	}
	
	public static void mergeSort(Comparable[] number, int lo, int hi) {
		//validation
		if(hi <= lo) {
			return;
		}
		//divide the data from "lo" to "hi"
		int mid = lo + (hi - lo)/2;
		//sort respectively
		mergeSort(number, lo, mid);
		mergeSort(number,mid + 1, hi);
		//merge together
		merge(number, lo, mid, hi);
	}
	
	public static void merge(Comparable[] number, int lo, int mid, int hi) {
		//define 3 cursors
		int i = lo;
		int p1 = lo;
		int p2 = mid+1;
		//loop, move cursor p1 and p2, compare the value, find the smaller, put it to "assist"
		while(p1 <= mid && p2 <= hi) {
			if(less(number[p1],number[p2])) {
				assist[i++] = number[p1++];
			}else {
				assist[i++] = number[p2++];
			}
		}
		
		//loop,if cursor p1 haven't finish, still move p1
		while(p1 <= mid) {
			assist[i++] = number[p1++];
		}
		//loop,if cursor p2 haven't finish, still move p2
		while(p2 <= hi) {
			assist[i++] = number[p2++];
		}
		//copy the arguments from "assist" to the original array
		for(int index = lo; index <= hi; index++) {
			number[index] = assist[index];
		}
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
