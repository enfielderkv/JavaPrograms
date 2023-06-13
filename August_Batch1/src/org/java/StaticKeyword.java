package org.java;

public  class StaticKeyword {
	
	
	static int i =90;
	
	static String d = "keywords";
	
	public void keywordMethod() {
    
		int f =9;
		System.out.println(f);
		
	}
	public static void keywordvalues() {
 
		String k = "staticName";
		System.out.println(k);
		System.out.println("this method is caleed static method");
		
	}
	static {
		
		char c = 'g';
		System.out.println(c);
		System.out.println("This method is called static block");

}
	public static void main(String[] args) {
		System.out.println(i);
		keywordvalues();
		System.out.println(d);
		//StaticKeyword s = new StaticKeyword();
		//s.keywordMethod();
		
}}