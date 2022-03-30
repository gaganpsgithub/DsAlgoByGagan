package com.String;

public class RotateString {
	
	static boolean isRotated(String str1, String str2) {
		
		for(int i=0;i<str1.length();i++) {
			String strnew=rotateByOne(str1, i);
			System.out.println(strnew);
			if(strnew==str2)
				return true;
		}
		return false;
		
	}
	
	static String rotateByOne(String str, int k) {
		char[] charNew = new char[str.length()];
		char[] charArrayStr1 = str.toCharArray();
		
		for(int i=0;i<=k;i++) {
			charNew[str.length()-1-i]=charArrayStr1[i];
		}
		
		for(int j=k+1;j<str.length();j++) {
			charNew[j-k+1]=charArrayStr1[j];
			System.out.println(charArrayStr1[j]);
			System.out.println(charNew[j-k]);
		}
		
		String s = new String(charNew);
		return s;
	}
	
	public static void main(String[] args) {
		
		String str1="ABCD";
		String str2="CDAB";
		System.out.println(isRotated(str1,str2));
	}

}
