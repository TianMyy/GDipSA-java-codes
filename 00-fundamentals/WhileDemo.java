package day04demo;

public class WhileDemo {
	public static void main(String[] args) {
		demo();
		System.out.println("-----------------------------------");
		breakDemo();
	}
	
	public static void demo() {
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
	
	public static void breakDemo() {
		double dayMoney = 2.5;
		double daySum = 0;
		int count = 1;
		double target = 100;
		
		while(true) {
			daySum += dayMoney;
			if(daySum >= target) {
				System.out.println("Spend " + count + " days to save 100 rmb");
				break;
			}
			if(count % 5 == 0) {
				daySum -= 6;
				System.out.println("Day " + count + " spend 6 rmb");
			}
			count++;
		}
	}
}
