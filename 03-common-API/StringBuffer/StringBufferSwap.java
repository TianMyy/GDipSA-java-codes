package day13demo;

public class StringBufferSwap {
	public static void main(String[] args) {
		//String to StringBuffer
		String s = "hello";
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:"+sb);
		System.out.println("sb2:"+sb2);
		System.out.println();
		
		//StringBuffer to String
		StringBuffer buffer = new StringBuffer("java");
		String str = new String(buffer);
		String str2 = buffer.toString();
		System.out.println("str:"+str);
		System.out.println("str2:"+str2);
	}
}
