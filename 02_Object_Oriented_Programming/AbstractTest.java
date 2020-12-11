package day09demo;

public class AbstractTest{
	public static void main(String[] args) {
		//test Dog
		Dog d = new Dog();
		d.setName("Bobbi");
		d.setAge(2);
		d.show();
		d.eat();
		
		Dog d2 = new Dog("Tom",3);
		d2.show();
		d2.eat();
		
		Animal a1 = new Dog();
		a1.setName("Peter");
		a1.setAge(1);
		a1.show();
		a1.eat();

		///test cat
		Cat c = new Cat();
		c.setName("Nancy");
		c.setAge(2);
		c.show();
		c.eat();
		
		Cat c2 = new Cat("Lucy",4);
		c2.show();
		c2.eat();
		
		Animal a2 = new Cat("Lily",1);
		a2.show();
		a2.eat();
	}
}
