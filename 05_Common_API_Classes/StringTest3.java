package day12demo;

public class StringTest3 {
	public static void main(String[] args) {
		String s = "JavaSE";
		
		//byte[] getBytes()
		byte[] bys = s.getBytes();
		for(int i = 0; i < bys.length; i++) {
			System.out.println(bys[i]);
		}
		System.out.println("--------------------");
		
		//char[] toCharArray()
		char[] chs = s.toCharArray();
		for(int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		System.out.println("--------------------");
		
		//static String valueOf(char[] chs)
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println("--------------------");
		
		//static String valueOf(int i)
		int i = 100;
		String s2 = String.valueOf(i);
		System.out.println(s2);
		System.out.println("--------------------");
		
		//String toLowerCase(), String toUpperCase()
		System.out.println("Lower case:"+s.toLowerCase());
		System.out.println("Upper case:"+s.toUpperCase());
		System.out.println("--------------------");
		
		//String concat(String str)
		String s3 = "hello";
		String s4 = "world";
		String s5 = s3 + s4;
		String s6 = s3.concat(s4);
		System.out.println("s5:"+s5);
		System.out.println("s6:"+s6);
		System.out.println("--------------------");
		
		//exercise
		String ss1 = "helloWorld";
		String result = ss1.substring(0,1).toUpperCase().concat(ss1.substring(1).toLowerCase());
		System.out.println(result);
	}
}
