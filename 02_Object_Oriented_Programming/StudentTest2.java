package day07demo;

class Student2{
	private String name;
	private int age;
	
	public Student2() { }
	public Student2(String name, int age) {
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
	
	public void show() {
		System.out.println(name + "---" + age);
	}
}

public class StudentTest2 {
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.setName("Mary");
		s1.setAge(27);
		System.out.println(s1.getName() + "---" + s1.getAge());
		s1.show();
		
		Student2 s2 = new Student2("John",18);
		System.out.println(s2.getName() + "---" + s2.getAge());
		s2.show();
	}
}
