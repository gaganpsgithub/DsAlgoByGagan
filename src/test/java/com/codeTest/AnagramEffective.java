package com.codeTest;

public class AnagramEffective {

	static final int CHAR = 256;
	
	static boolean isAnagram(String str1, String str2) {
		
		int[] count = new int[CHAR];
		if(str1.length()!=str2.length())
			return false;
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for(int i=0;i<CHAR;i++) {
			if(count[i]!=0)
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "slenti";
		System.out.println(isAnagram(str1,str2));

	}

}
