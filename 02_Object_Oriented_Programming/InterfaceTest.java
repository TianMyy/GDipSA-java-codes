package day09demo;

public class InterfaceTest {
	public static void main(String[] args) {
		JumpCat jc = new JumpCat();
		jc.setName("Dola");
		jc.setAge(2);
		jc.show();
		jc.eat();
		jc.jump();
		System.out.println("--------------------");
		
		JumpCat jc2 = new JumpCat("Jerry",3);
		jc2.show();
		jc2.eat();
		jc2.jump();
		System.out.println("--------------------");
		
		JumpDog jd = new JumpDog("Bobbi",4);
		jd.show();
		jd.eat();
		jd.jump();
		
	}
}

interface IJump{
	public abstract void jump();	
}

abstract class Animals{
	private String name;
	private int age;
	
	public Animals() {}
	public Animals(String name,int age) {
		this.name = name;
		this.age = age;
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
	
	public abstract void eat();
	
	public void show() {
		System.out.println(this.name + "---" + this.age);
	}
}

class Dogs extends Animals{
	public Dogs() {}
	public Dogs(String name, int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("Dog " + getName()+" eating");
	}
}

class Cats extends Animals{
	public Cats() {}
	public Cats(String name, int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("Cat " + getName() + " eating");
	}
}

class JumpCat extends Cats implements IJump{
	public JumpCat() {}
	public JumpCat(String name, int age) {
		super(name,age);
	}
	
	public void jump() {
		System.out.println("Cat can jump");
	}
}

class JumpDog extends Dogs implements IJump{
	public JumpDog() {}
	public JumpDog(String name, int age) {
		super(name,age);
	}
	
	public void jump() {
		System.out.println("Dog can jump");
	}
}