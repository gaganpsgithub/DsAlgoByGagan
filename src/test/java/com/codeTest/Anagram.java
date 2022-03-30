package com.codeTest;

import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length())
			return false;
		
		char[] charArray1 = s1.toCharArray();
		Arrays.sort(charArray1);
		String newS1 = new String(charArray1);
		
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray2);
		String newS2 = new String(charArray2);
		
		return newS1.equals(newS2);
	}
	
	
	public static void main(String[] args) {
		String str1 = "test";
		String str2 = "tset";
		
		Anagram ana = new Anagram();
		System.out.println(ana.isAnagram(str1, str2));
	}

}
