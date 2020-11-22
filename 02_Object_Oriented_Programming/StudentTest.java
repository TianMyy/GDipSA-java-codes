package day07demo;

class Student{
	private String name;
	private int age;
	
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
}

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Mary");
		s1.setAge(27);
		System.out.println(s1.getName() + "---" + s1.getAge());
		
		Student s2 = new Student();
		s2.setName("John");
		s2.setAge(18);
		System.out.println(s2.getName() + "---" + s2.getAge());
	}
}

