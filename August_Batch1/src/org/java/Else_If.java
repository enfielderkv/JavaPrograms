package org.java;

public class Else_If {
	public static void main(String[] args) {
		int mark= 90;
		if (mark==80) {
			System.out.println("print S grade");
		}
		else if (mark<=70) {
			System.out.println("B grade");
		}
		else if (mark<=60) {
			System.out.println("d grade");
		}
		else if (mark<=60 && mark >=91) {
			System.out.println("A grade");
		}
		else {
			System.out.println("Arrear");
		}
	}

}
