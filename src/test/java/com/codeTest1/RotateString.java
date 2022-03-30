package com.codeTest1;

public class RotateString {
	
	static String rotateNTimes(String[] strArray, Integer k) {
		for(int i=0;i<k;i++) {
			String tempValue = strArray[strArray.length-1];
			for(int j=strArray.length-1;j>=1;j--) {
				strArray[j]=strArray[j-1];
			}
			strArray[0]=tempValue;
		}
		String finalString = "";
		for(int i=0;i<strArray.length;i++) {
			finalString = finalString.concat(" "+strArray[i]); 
		}
		return finalString;
		
	}
	
	static String printRotations(String str, Integer k) {
		String[] splitValue = str.split(" ");
		return rotateNTimes(splitValue,k);
	}
	
	public static void main(String[] args) {
		String str= "My name is Gagan Preet";
		int k = 4;
		System.out.println(printRotations(str,k));

	}

}

