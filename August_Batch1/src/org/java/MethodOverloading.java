package org.java;

public class MethodOverloading  {
	
	public void studentDetails() {  // In methodoverloading We must use Parameters and aruguments for each Methods
	System.out.println("kandhavel");

	}

	public void studentDetails(int id) {
		System.out.println("student roll number is: "+id);
	}
	public void studentDetails(char name) {
		System.out.println("student name is:"+name);
	}
	public void studentDetails(String subject) {
		System.out.println("the subject is:"+subject);
	}


	public void studentDetails(char grade,String score,int mark) {
		System.out.println("student performance :"+mark+","+grade+","+score);
	}
	public void studentDetails(char sport, String match, int six, double speed ) {
		System.out.println("person name: six meters: ball speed:"+sport+"."+match+","+six+"m"+","+speed+"km");
		
	}
	public void studentDetails(float f , double d) {
System.out.println("jhjh"+f+d);
	}
	  public static void main(String[] args) {
		MethodOverloading mm = new MethodOverriding();
		mm.studentDetails(65);
	
	
	  }

	}
	
	

