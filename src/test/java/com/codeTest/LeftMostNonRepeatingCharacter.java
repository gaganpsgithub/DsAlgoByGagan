package com.codeTest;

public class LeftMostNonRepeatingCharacter {

	static int leftMostNonRepeatingChar(String str) {
		for(int i=0;i<str.length();i++) {
			boolean flag = false;
			for(int j=0 ;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=true;
					break;
				}
			}
			if(!flag)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str="abccbde";
		System.out.println(leftMostNonRepeatingChar(str));
	}

}
