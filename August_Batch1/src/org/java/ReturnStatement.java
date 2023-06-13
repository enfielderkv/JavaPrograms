package org.java;

public class ReturnStatement {
	
	private static int addition(int a , int b) {

		return a+b;
		
		
		
	}
	
	private static String stringFrame(String msg) {
		return msg;

	}
	
	
	public static void main(String[] args) {
//		ReturnStatement r = new ReturnStatement();
//		 System.out.println(r.addition(20, 30));
//		 int c = r.addition(50, 60);
//		System.out.println(c);
		int c = addition(80, 90);
		System.out.println(c);
		String s = stringFrame("we execute the return statement");
		System.out.println(s);
	}

}
