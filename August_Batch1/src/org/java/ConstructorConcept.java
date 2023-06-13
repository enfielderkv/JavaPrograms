package org.java;

public class ConstructorConcept {

	
	
	public ConstructorConcept() {
		System.out.println("Non - Parametrized constructor");//Default constructor
	}
	
	
 public ConstructorConcept(String s) {
	 System.out.println("its is parametrized constructor :"+s);
 }
 
 public ConstructorConcept(int i) {
	 System.out.println("Parametrized Constructor :"+i);
	
}
	
	public static void main(String[] args) {
	ConstructorConcept c = new ConstructorConcept();
		//ConstructorConcept ccc=new ConstructorConcept ();
		ConstructorConcept cc = new ConstructorConcept("evening batch");
		ConstructorConcept c2 = new ConstructorConcept(58);
		ConstructorConcept c3 = new ConstructorConcept("yghg");
	}
	
	
	
}
// clasnam f = new clasnam