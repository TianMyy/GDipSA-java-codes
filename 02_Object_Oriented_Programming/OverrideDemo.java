package day08demo;

class Phone{
	public void call(String name) {
		System.out.println("Call "+name+".");
	}
}

class NewPhone extends Phone{
	public void call(String name) {
		// use the method in the super class
		super.call(name);
		System.out.println("Listen to weather broadcast.");
	}
}


public class OverrideDemo {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call("Nancy");
	}
}
