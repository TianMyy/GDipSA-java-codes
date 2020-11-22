package day04demo;

//小芳存钱实例
public class WhileBreakDemo {
	public static void main(String[] args) {
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
