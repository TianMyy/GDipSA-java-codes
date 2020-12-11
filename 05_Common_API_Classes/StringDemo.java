package day12demo;

public class StringDemo {
	public static void main(String[] args) {
		//public String(): empty constructor
		System.out.println("Empty Constructor:");
		String s1 = new String();
		System.out.println("s1:"+s1);
		System.out.println("s1.length:"+s1.length());
		System.out.println();
		
		//public String (byte[] bytes):convert byte[] to String
		System.out.println("Convert byte[] to String");
		byte[] bys = {97,98,99,100,101};
		String s2 = new String(bys);
		System.out.println("s2:"+s2);
		System.out.println("s2.length:"+s2.length());
		System.out.println();
		
		//public String(byte[] bytes, int index, int length)
		String s3 = new String(bys,1,3);
		System.out.println("s3:"+s3);
		System.out.println("s3.length:"+s3.length());
		System.out.println();
		
		//public String(char[] value):convert char[] to String
		char[] c = {'a','b','c','d','e','爱','林','你'};
		String s4 = new String(c);
		System.out.println("s4:"+s4);
		System.out.println("s4.length:"+s4.length());
		System.out.println();
		
		//public String(char[] value, int index, int count)
		String s5 = new String(c,2,4);
		System.out.println("s5:"+s5);
		System.out.println("s5.length:"+s5.length());
		System.out.println();
		
		//public String(String original)
		String s6 = new String("abcde");
		System.out.println("s6:"+s6);
		System.out.println("s6.length:"+s6.length());
		System.out.println();
		
		String s7 = "abcde";
		System.out.println("s7:"+s7);
		System.out.println("s7.length:"+s7.length());
		
	}
}
