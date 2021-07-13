package day12demo;

public class StringGetDemo {
	public static void main(String[] args) {
		String s = "helloworld";
	
		//int length()
		System.out.println("s.length:"+s.length());
		System.out.println();
				
		//char charAt(int index)
		System.out.println("charAt:"+s.charAt(7));
		System.out.println();
		
		//int indexOf(int ch)
		System.out.println("indexOf:"+s.indexOf('1'));
		System.out.println();
		
		//int indexOf(String str)
		System.out.println("indexOf:"+s.indexOf("owo"));
		System.out.println();
		
		//int indexOf(int ch, int fromIndex)
		System.out.println("indexOf:"+s.indexOf("l",4));
		System.out.println("indexOf:"+s.indexOf("k",4));
		System.out.println("indexOf:"+s.indexOf("l",40));
		System.out.println();
		
		//int indexOf(String str, int fromIndex)
		
		//String substring(int start)
		System.out.println("substring:"+s.substring(5));
		System.out.println("substring:"+s.substring(0));
		System.out.println();
		
		//String substring(int start, int end)
		System.out.println("substring:"+s.substring(3, 8));
		System.out.println("substring:"+s.substring(0, s.length()));
	}
}
