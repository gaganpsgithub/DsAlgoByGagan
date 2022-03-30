package com.codeTest;

public class PatterSearch {

	static void patternSearches(String str1, String str2) {
		int j=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==str2.charAt(j)) {
				j++;
			}
			if(j==str2.length()) {
				j=0;
				System.out.println(i-j-2);
			}
		}
	}
	
	public static void main(String[] args) {
		String str1 = "AAAAA";
		String str2 = "AAA";
		patternSearches(str1, str2);
	}
}
