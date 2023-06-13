package org.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection3 {
public static void main(String[] args) {
//	List<Integer> li = new LinkedList<Integer>();
	List<Object> li = new LinkedList<Object>();
	li.add(10);
	li.add(20);
	li.add(30);
	System.out.println(li);
	li.add(2, 40);
	System.out.println(li);
	li.set(1, 80);//its like replace in string concepts
	System.out.println(li);
	
	
	
	List<Object> li2 = new Vector<Object>();
	li2.add(40);
	li2.add(50);
	li2.add(60);
	System.out.println(li2);
//	boolean li3 = li.addAll(li2);
//	System.out.println(li3);
	li.addAll(li2);
	System.out.println(li);
	System.out.println(li);
	int in = li.indexOf(50);
	System.out.println(in);
	
//	li.retainAll(li2);
//	System.out.println(li);
	//System.out.println(li.retainAll(li2));
//	li.clear();
//	System.out.println(li);
	li.removeAll(li2);
	System.out.println(li);
	
}
}
