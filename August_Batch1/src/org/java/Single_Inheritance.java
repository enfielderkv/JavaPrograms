 package org.java;

public class Single_Inheritance {
	
	
	public void employeeDetails() {
		System.out.println("The employee details is : ");

	}
	
	public void employeeName(String s) {
		// TODO Auto-generated method stub
System.out.println("the name of the employee is : "+ s);
	}
	
	public void employeeNumber(int i ) {
		// TODO Auto-generated method stub
System.out.println("the employee number is :"+ i);
	}
	
	public static void main(String[] args) {
		Single_Inheritance s = new Single_Inheritance();
		
		s.employeeName("francis");
		s.employeeNumber(65);
		s.employeeDetails();
		s.employeeName("sam");
	}

}
