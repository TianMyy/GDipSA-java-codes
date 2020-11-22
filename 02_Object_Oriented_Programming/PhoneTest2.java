package day07demo;

class Phone2{
	private String brand;
	private int price;
	private String color;
	
	public Phone2() {}
	
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

public class PhoneTest2 {
	public static void main(String[] args) {
		Phone2 p = new Phone2();
		p.setBrand("HuaWei");
		p.setPrice(3999);
		p.setColor("Green");
		
		System.out.println(p.getBrand() + "---" + p.getPrice() + "---" + p.getColor());
	}
}
