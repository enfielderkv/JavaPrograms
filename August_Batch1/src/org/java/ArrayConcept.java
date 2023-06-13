package org.java;

public class ArrayConcept {
	
	static int Wordcount(String string) {
		
		int count=0;
		
		char ch[]=new char[string.length()];
		for(int i=0;i<string.length();i++)
		{
			ch[i]=string.charAt(i);
			
			if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0)))

count++;
		}
		
		return count;
		
		
	}
	
	public static void main(String[] args) {
		
		String s = "Inida Is My Country";
		
		System.out.println(Wordcount(s)+"word");
	}
		
		
		
		
		
		
//		int g[] = new int[10];
//		
//		
//		g[0]= 15;
//		g[1]= 20;
//		g[2]= 30;
//		g[3]=40;
//		g[3]=1005;
//		g[3]=45;
//		g[4]=100;
//		g[5]=75;
//		g[7]=76;
//		g[8]=77;
//		g[6]=78;
//		g[9]=79;
//		//g[11]=85;
//		//g[10]=95;
//		
//		System.out.println(g[2]);
//		System.out.println(g[3]);
//		
//		
//		int size = g.length; 
//    System.out.println(size);
////		
////		
//		System.out.println(g.length);
////		
////		0<10
//		//1<10
//		//upto 10<10 
//		
//		for (int i = 0; i < g.length; i++) {
//			System.out.println(i);
//		}
//		for (int i = 0; i < g.length; i++) {
//			System.out.println(g[i]);
//		}
//		
//		
		
		//int[] arr = {1,2,3,4,5,6,7,8,9,10};
	//	int third = find
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
