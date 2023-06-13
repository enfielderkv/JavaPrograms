package org.java;

public class ForLoop {
	
	
	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		for (int i = 550; i <= 555; i++) {//550,551
			System.out.println(i);
		}
		for (int i = 550; i <= 555; i++) {//5,5
			System.out.println(5);
		}
		for (int i = 550; i <= 555; i++) {//j,j
			System.out.println("j");
		}
		for (int i = 550; i <= 555; i++) {//*,*
			System.out.print("* ");
		}
	}

}
