package day13demo;

public class IntegerConstructor {
	public static void main(String[] args) {
		//method 1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii:"+ii);
		
		//method 2
		String s = "100";
		//String s = "abc";  --> NumberFromException
		Integer iii = new Integer(s);
		System.out.println("iii:"+iii);
		
	}
}
