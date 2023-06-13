package org.java;

public class Variable_Concept {
	
	//Lv & Cv
	
	
	int b =45;//cv
	
	                  int c ;//cv
	int a= 55;
	
	
	
	
	public void localVariableMethod() {
		
		int a=50;//lv
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		
		//int d;
		//System.out.println(d); lv should assign by a  value
		

	}
	
	
	
	
	public static void main(String[] args) {
		Variable_Concept v = new Variable_Concept();
		v.localVariableMethod();
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.a);
	}
	
	
	
	

}
