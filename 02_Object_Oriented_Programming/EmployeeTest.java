package day07demo;

class Employee{
	private String employeeId;
	private String name;
	private int age;
	
	public Employee() {}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	public void settName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("EmployeeId: "+employeeId+" Name: "+name+" Age: "+age);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeId("czbk9527");
		e.settName("Peter");
		e.setAge(32);
		System.out.println(e.getEmployeeId()+"---"+e.getName()+"---"+e.getAge());
		e.show();
	}
	
}
