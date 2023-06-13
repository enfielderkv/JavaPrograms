package org.java;


public class MethodOverriding extends MethodOverloading {

	/*@Override
	public void studentDetails() {
		
		super.studentDetails();
		System.out.println("enter the student details");
	}
	
	@Override
	public void studentDetails(char grade, String score, int mark) {
		
		super.studentDetails(grade, score, mark);
		System.out.println("enter the details");
	}
	@Override
	public void studentDetails(char sport, String match, int six, double speed) {
		// TODO Auto-generated method stub
		super.studentDetails(sport, match, six, speed);
		System.out.println("enter the details");
	}
	
	public static void main(String[] args) {
		MethodOverriding mm = new MethodOverriding();
		mm.studentDetails('r', "jaddu", 99, 138.9);
	}8*/
	
	
	
	
	@Override
	public void studentDetails() {
		// TODO Auto-generated method stub
		super.studentDetails();
		System.out.println("is my first name");
	}
	@Override
	public void studentDetails(char name) {
		// TODO Auto-generated method stub
		super.studentDetails(name);
	}
	@Override
	public void studentDetails(int id) {
		// TODO Auto-generated method stub
		super.studentDetails(id);
		System.out.println("teh number is");
	}
	@Override
	public void studentDetails(String subject) {
		// TODO Auto-generated method stub
		super.studentDetails(subject);
	}
	public static void main(String[] args) {
		MethodOverriding mm = new MethodOverriding();
		
		mm.studentDetails();
		
		
		mm.studentDetails("suresh");
		mm.studentDetails(55);
		
	
}}
