package day04demo;

public class ForDemo {
	public static void main(String[] args)
	{
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		int sum1 = 0;
		for(int i = 1; i <= 10; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for(int i = 2; i <= 100; i+=2) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int i = 1; i < 100; i+=2) {
			sum3 += i;
		}
		System.out.println(sum3);
		
		int sum4= 1;
		for(int i = 2; i <= 5; i++) {
			sum4 *= i;
		}
		System.out.println(sum4);
	}
}
