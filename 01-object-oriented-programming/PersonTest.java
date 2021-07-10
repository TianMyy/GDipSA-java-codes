package day07demo;

// Clear the principle of "static"

class Person{
	String name;
	int age;
	//String country;
	static String country;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show() {
		System.out.println("Name: "+name+" Age: "+age+" Country: "+country);
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("Nancy",26,"Singapore");
		p1.show();
		//Person p2 = new Person("Chloe",24,"Singapore");
		Person p2 = new Person("Chloe",24);
		p2.show();
		//Person p3 = new Person("Simon",27,"Singapore");
		Person p3 = new Person("Simon",27);
		p3.show();
		
		p3.country = "America";
		p3.show();
		
		// country all change to America
		// this is the special character of "static", the value of it is shared
		p1.show();
		p2.show();
	}
}
