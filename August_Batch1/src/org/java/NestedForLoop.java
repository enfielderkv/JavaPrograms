  package org.java;

public class NestedForLoop {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {//row
			for (int j = 1; j <=3; j++) {//column
				System.out.print(i);
			}
			System.out.println();
			
		}
		for (int i = 1; i <= 3; i++) {//row
			for (int j = 1; j <=3; j++) {//column
				System.out.print(j);
			}
			System.out.println();
		
	}
		for (int i = 1; i <= 3; i++) {//row
			for (int j=1  ; j <=i; j++) {//column
				System.out.print(j+" ");
				//System.out.print(" ");
			}
			System.out.println();
		

}
		for (int i = 1; i <= 3; i++) {//row
			for (int j=1  ; j <=i; j++) {//column
				System.out.print(j+"* ");
				//System.out.print(" ");
			}
			System.out.println();
		

}
		for (int i = 1; i <= 3; i++) {//row
			for (int j=1  ; j <=i; j++) {//column
				System.out.print("* ");
				//System.out.print(" ");
			}
			System.out.println();
		

}
}}