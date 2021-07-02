package day04demo;

public class NineMultipleInstance {
	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		for(int i = 0; i < 5; i++){
			for(int j = i+1; j > 0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		//九九乘法表
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " x " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
	}
}
