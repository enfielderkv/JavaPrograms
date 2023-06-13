package org.java;

public  class FinalConcept {
	
	public  void method() {
		System.out.println("**********************");
		
		
	}
	
	 public final void name(int s) {
System.out.println("enter the value : "+s);
	}
	public  static void finalMethod() {
		  double d = 0.08;
		//d++;
		System.out.println(d);
		System.out.println("print the method");
		//final
		int y = 123;
		y--;
		System.out.println(y);
				
	}
	
	
	
	
	final static int k =543;
	public static void main(String[] args) {
		FinalConcept f = new FinalConcept();
		//System.out.println(f.t);
		System.out.println(k);
		finalMethod();
		f.method();
		f.name(55);
	
		
	}
		


}
