package com.codeTest;

public class LeftMostRepeatingCharacterEff {

	static final int CHAR = 256;
	
	static int leftMostRepeatingChar(String str) {
		
		boolean[] count = new boolean[CHAR];
		int res = 0;
		for(int i=str.length()-1;i>=0;i--) {
			if(count[str.charAt(i)])
				res = i;
			else
				count[str.charAt(i)]=true;
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		String str="geeksforgeeks";
		System.out.println(leftMostRepeatingChar(str));
	}

}
