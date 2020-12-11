package day12demo;

public class StringTest2 {
	public static void main(String[] args) {
		String str = "Hello123World";
		int big = 0;
		int small = 0;
		int number = 0;
		
		//ASCII code: 0->48; A->65; a->97
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				small++;
			}
			if(ch >= 'A' && ch <= 'Z') {
				big++;
			}
			if(ch >= '0' && ch <= '9') {
				number++;
			}
		}
		System.out.println("BigAlphabet:"+big);
		System.out.println("SmallAlphabet:"+small);
		System.out.println("Number:"+number);
	}
}
