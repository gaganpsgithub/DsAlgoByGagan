package com.codeTest;

import java.util.Arrays;

public class AnagramSearch {
	
	static public int CHAR = 256;
	
	static boolean areAnagram(String str, String pat, Integer i) {
		int[] count  = new int[CHAR];
		for(int j=0;j<pat.length();j++) {
			count[pat.charAt(j)]++;
			count[str.charAt(i+j)]--;
		}
		for(int j=0;j<CHAR;j++) {
			if(count[j]!=0)
				return false;
		}
		return true;
		
	}
	static boolean isAnagramPattrnPresent(String str, String pat) {
		for(int i=0;i<=str.length()-pat.length();i++) {
			if(areAnagram(str, pat, i))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String pat = "froe";
		System.out.println("Anagram pattern is present " + isAnagramPattrnPresent(str,pat));

	}

}
