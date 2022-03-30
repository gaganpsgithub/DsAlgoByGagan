package com.test;

public class ConseccutiveSubString {

	static void printSubString(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.println(str.substring(i, j+1));
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "SDET";	
		printSubString(str);
	}
}
