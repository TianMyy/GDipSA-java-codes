package day09demo;

public class AbstractTest2 {
	public static void main(String[] args) {
		Employee emp = new BasicStaff();
		emp.setName("Peter");
		emp.setId("S001");
		emp.setSalary(6000);
		emp.show();
		emp.work();
		
		emp = new BasicStaff("Alice","S002",6000);
		emp.show();
		emp.work();
		
		emp = new Manager("Tammy","S003",9000,500);
		emp.show();
		emp.work();
	}
}

abstract class Employee{
	private String name;
	private String id;
	private int salary;
	
	public Employee() {}
	public Employee(String name, String id, int salary) {
		this.name = name; 
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public abstract void work();
	public void show() {
		System.out.println(getName() + "---" + getId() + "---" + getSalary());
	}
}

class BasicStaff extends Employee{
	public BasicStaff() {}
	public BasicStaff(String name, String id, int salary) {
		super(name,id,salary);
	}
	
	public void work() {
		System.out.println(getName()+" working with the work principle");
	}
}

class Manager extends Employee{
	private int bonus;
	
	public Manager() {}
	public Manager(String name,String id,int salary,int bonus) {
		super(name,id,salary);
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void work() {
		System.out.println(getName()+" determine work principle with clients");
	}
	
	public void show() {
		System.out.println(getName()+"---"+getId()+"---"+getSalary()+"---"+getBonus());
	}
}
