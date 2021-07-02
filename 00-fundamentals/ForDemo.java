package day04demo;

public class ForDemo {
	public static void main(String[] args){
		demo1();
		demo2();
	}
	
	public static void demo1() {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------------------");
		for(int i = 10; i > 0; i--) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------------------");
		int sum1 = 0;
		for(int i = 1; i <= 10; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		System.out.println("--------------------------------");
		int sum2 = 0;
		for(int i = 2; i <= 100; i+=2) {
			sum2 += i;
		}
		System.out.println(sum2);
		System.out.println("--------------------------------");
		int sum3 = 0;
		for(int i = 1; i < 100; i+=2) {
			sum3 += i;
		}
		System.out.println(sum3);
		System.out.println("--------------------------------");
		int sum4= 1;
		for(int i = 2; i <= 5; i++) {
			sum4 *= i;
		}
		System.out.println(sum4);
		System.out.println("--------------------------------");
	}
	
	public static void demo2() {
		for(int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i/ 10 % 10;
			int bai = i / 10 / 10 % 10;
			
			if(i == ge*ge*ge + shi*shi*shi + bai*bai*bai) {
				System.out.println(i);
			}
		}
	}
}
