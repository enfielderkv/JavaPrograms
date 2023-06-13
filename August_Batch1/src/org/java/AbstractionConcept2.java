package org.java;

public class AbstractionConcept2 extends AbstractionConcept {
	 
	
	//partial abstraction

	@Override
	public void vechileLoan() {
		System.out.println("12%");
		
	}
	
	public static void main(String[] args) {
		AbstractionConcept2 aa = new AbstractionConcept2();
		
		aa.vechileLoan();
		aa.personalLoan();
		aa.homeLoan();
	}
	
	
	

}
