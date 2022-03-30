package com.codeTest;

public class ReverseString {

	static void reverseWord(char[] str) {
		int start = 0;
		for(int end=0;end<str.length;end++) {
			if(str[end]==' ')
			{
				reverse(str, start, end-1);
				start=end+1;
			}
		}
		reverse(str, start, str.length-1);
		reverse(str, 0, str.length-1);
		System.out.println(str);
	}
	
	static void reverse(char[] str, Integer start, Integer end) {
		while(start<=end) {
			char temp = str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		
		String str = "My Name is Gagan";
		char[] strArray = str.toCharArray();
		reverseWord(strArray);
		
	}

}
