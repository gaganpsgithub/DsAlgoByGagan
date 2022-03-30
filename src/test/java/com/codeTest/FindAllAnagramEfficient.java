package com.codeTest;


public class FindAllAnagramEfficient {

	static final int CHAR =256;
	static boolean isAnagram(String string1, String string2) {
		if(string1.length()!=string2.length())
			return false;
		char[] count = new char[CHAR];
		for(int i=0;i<string1.length();i++) {
			count[string1.charAt(i)]++;
			count[string2.charAt(i)]--;
		}
		for(int i=0;i<CHAR;i++) {
			if(count[i]!=0)
				return false;
		}
		return true;
	}
	
	static void allAnagram(String[] strArray) {
		for(int i=0;i<strArray.length;i++) {
			for(int j=i+1;j<strArray.length;j++) {
				if(isAnagram(strArray[i],strArray[j])){
					System.out.print(strArray[i]);
					System.out.print(",");
					System.out.print(strArray[j]);
					System.out.print(",");
				}
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		String[] strArray = {"geeksquiz", "geeksforgeeks","abcd", "forgeeksgeeks","zuiqkeegs"};
		allAnagram(strArray);
	}

}
