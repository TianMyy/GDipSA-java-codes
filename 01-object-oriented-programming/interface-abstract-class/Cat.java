package day09demo;

public class Cat extends Animal{
	public Cat() {}
	public Cat(String name, int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("Cat " + getName() + " eating");
	}
}
