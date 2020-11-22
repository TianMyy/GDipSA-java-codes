package day04demo;

public class DoWhileDemo {
	public static void main(String[] args) {
		int x = 0;
		do {
			System.out.println("Hello World");
			x++;
		}while(x < 10);
		
		System.out.println("--------------------");
		
		int sum = 0;
		int a = 1;
		do {
			sum += a;
			a++;
		}while(a <= 100);
		System.out.println(sum);
	}
}
