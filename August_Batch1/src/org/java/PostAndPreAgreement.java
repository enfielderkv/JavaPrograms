package org.java;

public class PostAndPreAgreement {
	public static void main(String[] args) {
		int i =55;
		System.out.println(i);//55
		System.out.println(i++);//post inc 
		System.out.println(++i);//57
		System.out.println(i++);//57,m58
		
		System.out.println(i++);//58,m59
		System.out.println(i++);//59,m60
		System.out.println(++i);//61,m61
		System.out.println(i++ + ++i);
		System.out.println();
	}
	

}
