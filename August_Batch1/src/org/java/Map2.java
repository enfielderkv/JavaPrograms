package org.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map2 {
	
	public static void main(String[] args) {
		
		String s = "for the people of the people by the people";
		String[] word = s.split(" ");
		//System.out.println(word);
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();//here the return type will be in set of entry
		                                               // and also why the return type in set means the key dosen't allow duplicates so thats why
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
				
			}
			
			
		}
		
	}


}
