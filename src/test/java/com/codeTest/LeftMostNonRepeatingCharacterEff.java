package com.codeTest;

public class LeftMostNonRepeatingCharacterEff {

	static final int CHAR = 256;
	
	static int leftMostNonRepeatingChar(String str) {
		int[] common = new int[CHAR];
		for(int i=0;i<str.length();i++) {
			common[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(common[str.charAt(i)]==1)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
//		String str="abccbde";
		String str="geeksforgeek";
		System.out.println(leftMostNonRepeatingChar(str));
	}

}
