package sort;

//time complexity: O(nlogn) --> the worst situation:O(n^2)

//希尔排序
//选定一个增长量 h ，作为数据分组的一句， 对分好的每一组进行插入排序， 增长量不断减小，最终减为 1 ，重复进行插入排序
//h 初始值规则：
//int h = 1
//while( h < length ){
// h = 2h + 1;
//}
//h 的减小规则为 h = h/2

public class ShellSort {
	public static void main(String[] args) {
		Integer[] number = {4,3,5,6,2,1};
		shellSort(number);
		for(int temp: number) {
			System.out.print(temp + " ");
		}
	}
	
	public static void shellSort(Comparable[] number) {
		//1.initialize "h" according to number.length
		int h = 1;
		while(h < number.length / 2) {
			h = 2 * h + 1;
		}
		//2.shell sort
		while(h >= 1) {
			//2.1 find the argument that waiting for insert
			for(int i = h; i < number.length; i++) {
				//2.2 insert the argument to the orderly array
				for(int j = i; j >= h; j-= h) {
					//the argument waiting for inserting is number[j], caompare number[j] and [j-h]
					if(greater(number[j-1], number[j])) {
						//exchange arguments
						exchange(number, j-1, j);
					}else {
						//has found the correct position, end loop
						break;
					}
				}
			}
			//decrease the value of "h"
			h = h / 2;
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
