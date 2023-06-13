package org.java;

public class VariableConcept2 {
	//LV,CV,SV
	
	int a=70;//cv
	static String s = "static variable" ;//sv
	static int i = 85;// in class variable we can give static keyword and assign it has a static variable
	
	public void evening() {
 
		int f =80;//lv     
		
		//but in LV we can give static
		System.out.println(f);
		
		System.out.println(s);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		VariableConcept2 vv = new VariableConcept2();
		System.out.println(vv.a);
		System.out.println(s);
		System.out.println(i);
		vv.evening();
	}

}
