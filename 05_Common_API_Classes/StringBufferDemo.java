package day13demo;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
//		sb.append("hello");
//		sb.append(true);
//		sb.append(12);
//		sb.append(34.56);
		
		System.out.println("Adding function:");
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("StringBuffer 1: "+sb);
		sb.insert(5, "world");
		System.out.println("StringBuffer 2: "+sb);
		System.out.println();
		
		System.out.println("Deleting function:");
		sb.deleteCharAt(1);
		System.out.println("StringBuffer 3: "+sb);
		sb.delete(5, 10);
		System.out.println("StringBuffer 4: "+sb);
		sb.delete(0, sb.length());
		System.out.println("After clear: "+sb);
		System.out.println();
		
		System.out.println("Replace function:");
		StringBuffer sb2 = new StringBuffer();
		sb2.append("hello").append("world").append("java");
		sb2.replace(5, 10, "happiness");
		System.out.println("StringBuffer 5:"+sb2);
		System.out.println();
		
		System.out.println("Reverse function:");
		System.out.println("before:"+sb2);
		sb2.reverse();
		System.out.println("after:"+sb2);
		
	}
}
