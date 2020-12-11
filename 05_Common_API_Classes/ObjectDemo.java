package day11demo;

class Students extends Object implements Cloneable{
	private String name;
	private int age;
	
	public Students() {}

	public Students(String name, int age) {
		super();
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
	
}

public class ObjectDemo {
	public static void main(String[] args) throws CloneNotSupportedException{
		Students s1 = new Students();
		System.out.println(s1.hashCode());
		Students s2 = new Students();
		System.out.println(s2.hashCode());
		Students s3 = s1;
		System.out.println(s3.hashCode());
		
		System.out.println("--------------------");
		
		Students s4 = new Students();
		Class c = s4.getClass();
		String str = c.getName();
		System.out.println(str);
		System.out.println(s4.toString());
		
		System.out.println("--------------------");
		
		Students s5 = new Students("Johnny",26);
		Students s6 = new Students("Johnny",26);
		System.out.println(s5.equals(s6));
		System.out.println(s1.equals(s3));
		
		System.out.println("--------------------");
		
		Students ss = new Students();
		//Object obj = ss.clone();
		//Students ss2 = (Students)obj;
	}
}
