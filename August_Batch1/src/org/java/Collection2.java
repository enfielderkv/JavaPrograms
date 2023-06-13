package org.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection2 {
	public static void main(String[] args) {
		//List<Integer> cc1 = new LinkedList<Integer>();
		List<Integer> cc1 = new Vector<Integer>();

		
		cc1.add(10);
		cc1.add(20);
		cc1.add(30);
		cc1.add(40);
		cc1.add(50);
		cc1.add(90);
		System.out.println(cc1);// in list the o/p will be in set brackets
	    cc1.add(2, 60);
	    System.out.println(cc1);//you add the value in any index
	    boolean c = cc1.contains(40);
	    System.out.println(c);// always go with the return type
	System.out.println(cc1.contains(80));
	Integer i = cc1.get(4);//get method  cannot support in the set
	System.out.println(i);
	Integer remove = cc1.remove(0);
	System.out.println(remove);
	System.out.println(cc1);
	int size = cc1.size();
	System.out.println(size);
	cc1.clear();
	System.out.println(cc1);
	}



	}


