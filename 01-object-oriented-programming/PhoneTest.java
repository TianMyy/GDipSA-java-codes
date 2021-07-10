package day07demo;

class Phone{
	private String brand;
	private int price;
	private String color;
	
	public Phone() {}
	public Phone(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p.getBrand() + "---" + p.getPrice() + "---" + p.getColor());
		
		p.setBrand("HuaWei");
		p.setPrice(4999);
		p.setColor("Green");
		System.out.println(p.getBrand() + "---" + p.getPrice() + "---" + p.getColor());
		
		Phone p2 = new Phone("XiaoMi", 3999, "Blue");
		System.out.println(p2.getBrand() + "---" + p2.getPrice() + "---" + p2.getColor());
	}
}
