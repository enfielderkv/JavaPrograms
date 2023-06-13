package org.java;

public class Switch_case {
	
	public static void main(String[] args) {
		String s = "Agent Vikram";
		
		System.out.println("Find The Correct Agent Name");
		
		switch (s) {
		case "Rolex":
			
			System.out.println("We find Him");

		default:
			
		}
		switch (s) {
		case "Teena":
			
			System.out.println("we found");
		

		default:
			break;
		}
		switch (s) {
		case "Agent Vikram":
			System.out.println("we found him");
			break;

		default:
		System.out.println("we fail to find him");
		}
	}

}
