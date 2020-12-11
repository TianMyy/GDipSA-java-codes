package day12demo;

public class StringBooleanDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";
		
		//public boolean equals(Object obj)
		System.out.println("equals:"+s1.equals(s2));	//true
		System.out.println("equals:"+s1.equals(s3));	//false
		System.out.println();
		
		//public boolean eauqlsIgnoreCase(String str)
		System.out.println("equals:"+s1.equalsIgnoreCase(s2));	//true
		System.out.println("equals:"+s1.equalsIgnoreCase(s3));	//true
		System.out.println();
		
		//public boolean contains(String str)
		System.out.println("contains:"+s1.contains("hello"));	//true
		System.out.println("contains:"+s1.contains("hw"));		//false
		System.out.println();
		
		//public boolean startsWith(String str)
		System.out.println("startsWith:"+s1.startsWith("h"));		//true
		System.out.println("startsWith:"+s1.startsWith("hello"));	//true
		System.out.println("startsWith:"+s1.startsWith("world"));	//false
		System.out.println();
		
		//public boolean endsWith(String str)
		
		//public boolean isEmpty()
		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty:"+s4.isEmpty());	//true
		System.out.println("isEmpty:"+s5.isEmpty());	//error
	}
}
