package org.java;

import java.util.Scanner;

public class ScannerConcept {
	
	
	
	public static void main(String[] args) {
		                                                       // nextLine,nextInt,next
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("enter the name");
		String word = scan.next(); // word should  not have space
		System.out.println("the name is : " + word);
		 
		System.out.println("second name");
		String word2 = scan.next();
		System.out.println("the second name is : "+ word2);
		
		
		
		scan.nextLine();
		System.out.println("enter the sentence");
		String sentence = scan.nextLine();
		System.out.println("the cat is on the wall"+ sentence);
	
		
        System.out.println("enter the number");
		int number = scan.nextInt();
		System.out.println("the number is " + number);
		
		
	}

}
