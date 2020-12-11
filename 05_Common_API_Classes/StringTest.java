package day12demo;

public class StringTest {
	public static void main(String[] args) {
		String string = "helloworld";
		for(int x = 0; x < string.length(); x++) {
			char ch = string.charAt(x);
			System.out.println(ch);
		}
	}
}
