package org.java;

public class DayOneClass {
	
	
	private void student() {
		System.out.println("the student is absent today"); //p- int,float,long,short,double,char,byte,boolean  NP-- string nad array
		

	}
	
	private  void studentId( int i) {
		// TODO Auto-generated method stub
		System.out.println("the student id is : " + i);
		
		

	}
	private void studentInitial(char a) {
		// TODO Auto-generated method stub
		System.out.println("the student initial initial is : " + a);

	}
	   
	private void studentName(String s ){
		// TODO Auto-generated method stub
System.out.println("the student name is : " +s );

	}
	
	private void studentMark(float f) {
		// TODO Auto-generated method stub
System.out.println("the percentage is : " + f);
	}
	public static void main(String[] args) {
		DayOneClass d = new DayOneClass();
		d.student();
		d.studentId(58);
		d.studentInitial('a');
		d.studentName("david");
		d.studentMark(77.8f);
		ConstructorConcept c = new ConstructorConcept();
		d.studentId(0);
		d.studentName(null);
		
		
		
		
	}
	

}
