package org.java;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;
		System.out.println("********Start**********");
		try {
			c=a/b;
			System.out.println(c);
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("accept the exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Print the exception");
		}
		finally {
			System.out.println("Print the Statement");
		}
		
		System.out.println("*********The End**********");
		
		
	}

}
