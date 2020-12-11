package day12demo;

public class StringApearance {
	public static void main(String[] args) {
		//how many java in it
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		
		System.out.println("Times of 'java': "+getCount(maxString, minString));	
	}
	public static int getCount(String maxString,String minString) {
		int count = 0;
		int index = maxString.indexOf(minString);
		
		while(index != -1) {
			count++;
			int startIndex = index + minString.length();
			maxString = maxString.substring(startIndex);
			index = maxString.indexOf(minString);
		}
		
		return count;
	}
}
