package com.codeTest;

public class SubsequentOfAnotherString {

	static boolean subSeqString(String str1,String str2) {
		int j=0;
		for(int i=0;i<str1.length() && j<str2.length();i++) {
			if(str1.charAt(i)==str2.charAt(j))
				j++;
		}
		return(j==str2.length());
	}
	
	public static void main(String[] args) {
		String str1="ABC";
		String str2="AC";
		System.out.println(subSeqString(str1,str2));

	}

}
