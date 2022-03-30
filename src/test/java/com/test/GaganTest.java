package com.test;

public class GaganTest {

	static int CHAR = 256;
	
	
	static boolean isAnagram(String str1, String str2) {
		
		char[] countArray = new char[CHAR];
		
		if(str1.length()!=str2.length())
			return false;
		for(int i=0;i<str1.length();i++) {
			countArray[str1.charAt(i)]++;
			countArray[str2.charAt(i)]--;
		}
		
		for(int i=0;i<CHAR;i++) {
			if(countArray[i]!=0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String str1= "silent";
		String str2 = "listen";
		System.out.println(isAnagram(str1,str2));

	}

}
