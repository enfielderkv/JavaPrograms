package org.java;

public class If_Else {
	
	
	public static void main(String[] args) {
		int age = 25;
		if (age<=18 ){
			System.out.println("Adult");
		} else {
			System.out.println("YoungMan");

		}
		
		if (age<=24 && age>20) {
			System.out.println("he is an adult");
		} else {
			System.out.println("he is not the proper guy we are looking for ");

		}
		if (age<=24 || age>20) {
			System.out.println("he is an adult");
		} else {
			System.out.println("he is not the proper guy we are looking for ");

		}
				
	}

}
