package com.codeTest;

public class FrequencyOfCharSortedOrderWithoutSpace {

	static void findFreq(String str) {
		int length = str.length();
		int[] count = new int[26];
		for(int i=0;i<length;i++) {
			System.out.println(str.charAt(i)-'a');
			count[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(count[i]>0) {
				System.out.println((char) (i+'a')+"------"+count[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str = "geekforgeeks";
		findFreq(str);

	}

}
