package day08demo;

class Animal{
	private String name;
	private int age;
	private String color;
	
	public Animal() {}
	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat() {
		System.out.println("It's time to Eating.");
	}
}

class Dog extends Animal{
	public Dog() {}
	public Dog(String name, int age, String color) {
		super(name,age,color);
	}
	
	public void lookDoor() {
		System.out.println("Looking door.");
	}
}

class Cat extends Animal{
	public Cat() {}
	public Cat(String name, int age, String color) {
		super(name,age,color);
	}
	
	public void playGame() {
		System.out.println("Playing games");
	}
}

public class ExtendsDemo {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.setName("meow meow");
		c1.setAge(2);
		c1.setColor("white");
		System.out.println("Cat:"+c1.getName()+", Age:"+c1.getAge()+", Color:"+c1.getColor());
		c1.eat();
		c1.playGame();
		System.out.println("---------------------");
		
		Dog d1 = new Dog("Tommy",3,"brown");
		System.out.println("Dog:"+d1.getName()+", Age:"+d1.getAge()+", Color:"+d1.getColor());
		d1.eat();
		d1.lookDoor();
		System.out.println("---------------------");
		
		Dog d2 = new Dog();
		d2.setName("Bobbi");
		d2.setAge(4);
		d2.setColor("black");
		System.out.println("Dog:"+d2.getName()+", Age:"+d2.getAge()+", Color:"+d2.getColor());
		d2.eat();
		d2.lookDoor();
	}
}
