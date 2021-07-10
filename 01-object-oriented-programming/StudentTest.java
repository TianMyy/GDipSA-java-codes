package day07demo;

class Student{
	private String name;
	private int age;
	
	public Student() { }
	public Student(String name, int age) {
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

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Jisoo");
		s1.setAge(27);
		System.out.println(s1.getName() + "---" + s1.getAge());
		s1.show();
		
		Student s3 = new Student();
		s3.setName("Bobbi");
		s3.setAge(18);
		System.out.println(s3.getName() + "---" + s3.getAge());
		s3.show();
		
		Student s2 = new Student("Alizabeth", 38);
		System.out.println(s2.getName() + "---" + s2.getAge());
		s2.show();
	}
}
