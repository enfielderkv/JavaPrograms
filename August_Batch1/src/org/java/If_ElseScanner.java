package org.java;

import java.util.Scanner;

public class If_ElseScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the user age");
		int age = s.nextInt();
		//System.out.println(age);
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
		if (age<=24 || age<20) {
			System.out.println("he is an adult");
		} else {
			System.out.println("he is not the proper guy we are looking for ");

		}
	}

}
