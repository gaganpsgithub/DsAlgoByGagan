package com.codeTest;

public class AnagramSearchEff {
	
	static private int CHAR = 256;
	
	static boolean areSame(int[] charStr, int[] charPat) {
		for(int i=0;i<CHAR;i++) {
			if(charStr[i]!=charPat[i])
				return false;
		}
		return true;
	}
	
	static boolean isAnagramPatternPresent(String str, String pat) {
		
		int[] charStr = new int[CHAR];
		int[] charPat = new int[CHAR];
		
		for(int i=0;i<pat.length();i++) {
			charStr[str.charAt(i)]++;
			charPat[pat.charAt(i)]++;
		}
		
		for(int j=pat.length();j<str.length();j++) {
			if(areSame(charStr, charPat))
				return true;
			charStr[str.charAt(j)]++;
			charStr[str.charAt(j-pat.length())]--;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String pat = "fros";
		System.out.println("Anagram pattern is present " + isAnagramPatternPresent(str,pat));

	}

}
