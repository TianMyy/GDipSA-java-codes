package day13demo;

public class StringSort {
	public static void main(String[] args) {
		String str = "dacgebf";
		System.out.println("Before Sorting:");
		System.out.println(str);
		
		String output = stringSort(str);
		System.out.println("After Sorting:");
		System.out.println(output);
	}
	
	public static String stringSort(String str) {
		char[] chs = str.toCharArray();
		bubbleSort(chs);
		
		String result = String.valueOf(chs);
		return result;
	}
	
	public static void bubbleSort(char[] chs) {
		for(int i = 0; i < chs.length - 1; i++) {
			for(int j = 0; j < chs.length - 1 - i; j++) {
				if(chs[j] > chs[j+1]) {
					char temp = chs[j];
					chs[j] = chs[j+1];
					chs[j+1] = temp;
				}
			}
		}
	}
}
