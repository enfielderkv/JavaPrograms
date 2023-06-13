package org.java;

public class ImmutableAndMutable {
	public static void main(String[] args) {
		String suman = "tamil";
		String suresh = "tamil";
		
		System.out.println("***************immutable****************");
		
		int s = suman.hashCode();
		System.out.println(s);
		System.out.println(suresh.hashCode());
		
		
		
		suresh = "hindi";
		System.out.println(System.identityHashCode(suresh));
		
		String david = "Apple";
		String c = david.concat("Iphone");
		
		
		System.out.println(c);
		int h= c.hashCode();
		System.out.println(h);
		String j = david.replace("Apple", "13promax");
		System.out.println(j);
		
		
		
		System.out.println("**********Mutable*************");
		
		StringBuffer Priya = new StringBuffer("Automation");
		StringBuffer Arun = new StringBuffer("Automation");
		StringBuffer jagan = new StringBuffer("manual");
		int p = Priya.hashCode();
		System.out.println(p);
		System.out.println(Arun.hashCode());
		System.out.println(System.identityHashCode(jagan));
		
		StringBuilder sugumar = new StringBuilder("oneplus ");
		
		System.out.println(sugumar);
		StringBuilder a = sugumar.append("Nord");
		System.out.println(a);
		StringBuilder r = sugumar.reverse();
		System.out.println(r);
		StringBuilder f= a.reverse();
		System.out.println(f);
//		
		StringBuilder u = sugumar.replace(3, 7, "CE");
		System.out.println(u);
		
				
		
	}

}
