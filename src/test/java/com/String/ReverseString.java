package com.String;

public class ReverseString {

	static void ReverseString1(char[] str) {
		
		int start =0;
		for(int end=0;end<str.length;end++) {
			if(str[end]==' ') {
				System.out.println(start);
				System.out.println(end-1);
				reverseSection(str, start, end-1);
				start=end+1;
			}
		}
		reverseSection(str, start, str.length-1);
		reverseSection(str, 0, str.length-1);
		System.out.println(str);
	}
	
	static void reverseSection(char[] strCharArray, int start, int end) {
		
//		char[] strCharArray = str.toCharArray();
		while (start<=end) {
			Character temp = strCharArray[start];
			strCharArray[start] = strCharArray[end];
			strCharArray[end] = temp;
			start ++;
			end --;
		}
	}
	
	public static void main(String[] args) {
		String str = "MY Name is gagan";
		ReverseString1(str.toCharArray());
	}

}
