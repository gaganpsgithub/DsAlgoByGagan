package com.codeTest;

public class LeftMostRepeatingCharacter {

	static int leftMostRepeatingChar(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str="geeksforgeeks";
		System.out.println(leftMostRepeatingChar(str));
	}

}
