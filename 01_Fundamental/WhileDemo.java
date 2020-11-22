package day04demo;

public class WhileDemo {
	public static void main(String[] args) {
		double height = 0.01;
		double target = 8848;
		int count = 0;
		while(height < target) {
			count++;
			height = height * 2;
			System.out.println(height);
		}
		System.out.println("Need fold " + count + " times.");
	}
}
