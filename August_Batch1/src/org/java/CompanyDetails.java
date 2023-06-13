package org.java;

public class CompanyDetails extends Single_Inheritance  {
	
	
	public void employeeIn() {
		System.out.println("employee is present today");
  
	}
	public void employeeSalary(int s) {
		// TODO Auto-generated method stub
System.out.println("the employee salary is ;"+ s);
	}
	
	 public static void main(String[] args) {
		CompanyDetails c = new CompanyDetails();
		c.employeeDetails();
		c.employeeName("vel");
		c.employeeNumber(76);
		c.employeeIn();
	}

}
