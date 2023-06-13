package org.java;

public class ThisAndSuper2 extends ThisAndSuper1 {
	
	
	
	int i = 67;
	
	
	private  void thisSuperMethod() {
     int i =65;
     System.out.println("LV value is : "+i);
     System.out.println("CCV value is : "+this.i);
     System.out.println("PCV valye is : "+super.i);
	}

	
	public static void main(String[] args) {
		ThisAndSuper2 ad = new ThisAndSuper2();
		ad.thisSuperMethod();
		
	}
}
// this current class variable
//super parent class variable