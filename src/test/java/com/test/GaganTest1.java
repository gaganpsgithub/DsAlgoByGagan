package com.test;

public class GaganTest1 {

	static boolean validateSuffle(String expected, String str1, String str2) {
		
//		GO2D2
//		GOD
//		22
		int n=expected.length();
		int m=str1.length();
		int k=str2.length();
		int j=0;
		boolean firstString=false;
		boolean secondString=false;
		for(int i=0; i<n & j<m;i++) {
			if(expected.charAt(i)==str1.charAt(j)) {
				j++;
			}	
			if(j==m)
			{
				firstString=true;
				break;
			}
		}
		
		int z=0;
		for(int x=0; x<n & z<k;x++) {
			if(expected.charAt(x)==str2.charAt(z)) {
				z++;
			}	
			if(z==k)
			{
				secondString=true;
				break;
			}
		}
		
		return (firstString && secondString);
		
	}
	
	public static void main(String[] args) {
		
		String str1 ="GOD";
		String str2 ="22";
		String expected = "G2D2O";
		
		System.out.println(validateSuffle(expected, str1, str2));

	}

}
