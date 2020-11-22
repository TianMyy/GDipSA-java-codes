package day05demo;

public class ArrayMin_Max {
	public static void main(String[] args) {
		int[] arr = {34,98,10,25,67};
		//从数组中任意寻找一个元素作为参照物，默认他就是最大值
		//然后遍历其他的元素，依次获取和参照物进行比较，如果大就留下来，小就离开
		//最后参照物里面保存的就是最大值
		int max = getMax(arr);
		int min = getMin(arr);
	    System.out.println("max:" + max);
	    System.out.println("min:" + min);
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
