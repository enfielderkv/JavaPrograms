package org.java;

public class SplitMethod {
	public static void main(String[] args) { 
		String s = "Here After there is no lockdown in chennai";
	
	String[] sp1 = s.split(" ");
	for (int i = 0; i < sp1.length; i++) {
		System.out.println(sp1[i]);
		
	}
	String[] sp2 = s.split("");
	
	for (int i = 0; i < sp2.length; i++) {
		System.out.println(sp2[i]);
	}
       String[] sp3 = s.split(" ");
	
	for (int i = 0; i <4; i++) {
		System.out.println(sp3[i]);
	}
 String[] sp4 = s.split("");
	
	for (int i = 0; i <4; i++) {
		System.out.println(sp4[i]);
	}
	String[] sp5 = s.split(" ");
	for (String str : sp5) {
		System.out.println(str);
		
	}
	
	String[] sp6 = s.split(" ", 4);
	for (int i = 0; i < sp6.length; i++) {
		System.out.println(sp6[i]);
		
	}
	String[] sp7 = s.split(" ", 4);
	for (int i = 0; i < 3; i++) {
		System.out.println(sp7[i]);
		
	}
	String[] sp8 = s.split(" ", 4);
	for (int i = 0; i < 4; i++) {
		System.out.println(sp8[i]);
		
	}
//	String[] sp9 = s.split(" ", 4);
//	for (int i = 0; i < 5; i++) {
//		System.out.println(sp9[i]);
//		
//	}
	String[] sp10= s.split(" ", 3);
	int i = 0;
	while (i<3) {
		System.out.println(sp10[i]);
		i++;
	}
	String[] sp11 = s.split(" ", 4);
	for (String str2 : sp11) {
		System.out.println(str2);
		
	}
	String[] sp12 = s.split(" ");
	int j =0;
	while (j<8) {
		System.out.println(sp12[j]);j++;
		
	}
		
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
}

}
