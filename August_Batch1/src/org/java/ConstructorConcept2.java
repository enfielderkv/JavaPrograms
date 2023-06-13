package org.java;

public class ConstructorConcept2 extends ConstructorConcept {
	
	
	public ConstructorConcept2( char c) {
		System.out.println("the character is : "+ c);
	}
	public static void main(String[] args) {
		ConstructorConcept2 c = new ConstructorConcept2('a');
		ConstructorConcept f = new ConstructorConcept("sugumar");
		ConstructorConcept s = new ConstructorConcept(77);
		//ConstructorConcept g = new ConstructorConcept();
	}

}
