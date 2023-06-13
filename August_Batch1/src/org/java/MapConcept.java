package org.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapConcept {
	public static void main(String[] args) {
		
		Map<Integer, Object> m = new HashMap<Integer, Object>();//ascending order
		
		
		//Map<Integer, Object> m = new LinkedHashMap<Integer, Object>();//insertion order
		//Map<Integer, Object> m = new TreeMap<Integer,Object>();//doesn't allow null values
		
		//Map<Integer, Object> m = new ConcurrentHashMap<Integer,Object>();//doesn't allow null values
		
		//Map<Integer, Object> m = new Hashtable<Integer,Object>();//doesn't allow null values
		
		
		//  key   ,value
		m.put(1, "java");
		m.put(2, 100);
		m.put(3, 15.5);
		m.put(4, 's');
		m.put(6, 'n');
		m.put(4, 100);
		m.put(null, 200);
		m.put(0, null);
		System.err.println(m);
		
		Collection<Object> v = m.values();
		System.out.println(v);
		m.values();
		System.out.println(m);
		System.out.println(m.values());//used to get the values in map
		
		
		System.out.println("***********************************");
		Set<Integer> k = m.keySet();
		System.out.println(k);//used to get the key in map
		
		System.out.println("*****************************");
		
		boolean c = m.containsKey(6);
		System.out.println(c);//contains used to check the condition whether it is there are not 
		System.out.println("******************");
		boolean containsValue = m.containsValue("java");
		System.out.println(containsValue);
		System.out.println(m.containsValue('m'));
		int size = m.size();
		System.out.println(size);
		Object object2 = m.get(3);//it is used to get the particular value not the key
		System.out.println(object2);
		Set<Entry<Integer, Object>> entrySet = m.entrySet();
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
		}
		
		m.clear();
		System.out.println(m);
		Object object = m.get(2);//here we given clear method before this so now if we used this get method.
		System.out.println(object);// we cant get the value becoz everything get cleared before this get method
		                          // so you see now the execution will be null.
		
		
		
		
		
	}

}
