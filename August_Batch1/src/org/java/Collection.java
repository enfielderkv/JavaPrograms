package org.java;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		//list<wrapperclass> cc = new  type of list <wrapperclass>();
		//< >Generics
		//Wrapper class-----> converting data types into class objects
		List<Integer> cc1 = new ArrayList<Integer>();
		
		cc1.add(10);
		cc1.add(20);
		cc1.add(30);
		cc1.add(40);
		cc1.add(50);
		cc1.add(90);
		cc1.add(90);
		System.out.println(cc1);// in list the o/p will be in set brackets
	    cc1.add(2, 60);
	    System.out.println(cc1);//you can add the value in any index
	    boolean c = cc1.contains(40);
	    System.out.println(c);// always go with the return type
//	    cc1.contains(50);
//	    System.out.println(cc1);
	System.out.println(cc1.contains(80));
	Integer i = cc1.get(4);//get method  cannot support in the set
	System.out.println(i);
//	cc1.remove(3);
//	System.out.println(cc1);
	Integer remove = cc1.remove(0);// remove method cannot be used in set
	System.out.println(remove);
	System.out.println(cc1);
	int size = cc1.size();
	System.out.println(size);
	cc1.clear();
	System.out.println(cc1);
	}

}
