package org.java;

public class FullyAbstraction3 implements Fully_Abstraction,FullyAbstraction2{

	@Override
	public void bike() {
		// TODO Auto-generated method stub
		System.out.println("RE 350");
	}

	@Override
	public void kia() {
		System.out.println("carens");
	}

	@Override
	public void hyundai() {
		// TODO Auto-generated method stub
		System.out.println("creta");
		
	}
	
	public static void main(String[] args) {
		FullyAbstraction3 f = new FullyAbstraction3();
		f.kia();
		f.bike();
		f.hyundai();
	}

}
