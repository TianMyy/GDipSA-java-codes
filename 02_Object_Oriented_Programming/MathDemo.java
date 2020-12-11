package day08demo;

public class MathDemo {
	public static void main(String[] args) {
		// get a random number
		double d = Math.random();
		System.out.println(d);
		
		//get a random number (0-100)
		int number = (int)(Math.random() * 100) + 1;
		System.out.println(number);
	}
}
