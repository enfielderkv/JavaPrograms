package org.java;

public class TypeCasting {
public static void main(String[] args) {
	int i =120;
	long j= i;
	System.out.println(j);//narrow casting it converts lower to higher
	
	int a ;
	long b = 130;
	a=(int) b;
	System.out.println(a);//widining casting it converts higher to lower
	
	int c = 135;
	long d =c;
	short e = (short) d;
			System.out.println(e);
			
			int h= 123;
			byte v = (byte) h;
			System.out.println(v);
	
}
}
