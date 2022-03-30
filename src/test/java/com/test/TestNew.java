package com.test;

public class TestNew {

	static final int CHAR =256;
	
	static void characterCount(String str) {
		
		int[] charcount = new int[CHAR];
		for(int i=0;i<str.length();i++) {
			charcount[str.charAt(i)]++;
		}
		for(int i=0;i<CHAR;i++) {
			if(charcount[str.charAt(i)]!=0)
//				System.out.print(str.charAt(i));
				System.out.print(charcount[i]);
				System.out.println("\n");
		}
		
	}
	
	public static void main(String[] args) {
		
		String str= "my name is gagan";
		
		characterCount(str);
		
//		int input =0;
//		
//		System.out.println(test(input));
		
		
		
	}

}
