package day06demo;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		System.out.println(arr); //address value
		System.out.println(arr[0]); //address value
		System.out.println(arr[1]); //address value
		System.out.println(arr[2]); //address value
		System.out.println(arr[0][0]); //0
		System.out.println(arr[0][1]); //0
		System.out.println("--------------------");
		
		int[][] arr2 = new int[3][];
		System.out.println(arr); //address value
		System.out.println(arr[0]); //null
		System.out.println(arr[1]); //null
		System.out.println(arr[2]); //null
		
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[1];
		System.out.println(arr[0]); //address value
		System.out.println(arr[1]); //address value
		System.out.println(arr[2]); //address value
		System.out.println(arr[0][0]); //0
		System.out.println(arr[0][1]); //0
		System.out.println(arr[1][0]); //0
		System.out.println(arr[1][1]); //0
		System.out.println(arr[1][2]); //0
		System.out.println(arr[2][1]); //0
		
		arr[1][0] = 100;
		arr[1][2] = 200;
		System.out.println("--------------------");
		
		int[][] arr3 = {{1,2,3},{4,5},{6}};
		System.out.println(arr); 
		System.out.println(arr[0]); 
		System.out.println(arr[1]); 
		System.out.println(arr[2]); 
		System.out.println(arr[0][0]); //1
		System.out.println(arr[1][0]); //4
		System.out.println(arr[2][0]); //6
		
		System.out.println(arr[0][1]); //2
		System.out.println(arr[1][1]); //5
		//System.out.println(arr[2][1]); ----> error
		
	}
}
