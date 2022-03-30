package com.test;

public class Stringtest {

	static void reverseWords(char[] strArray) {
		int start =0;
		for(int end=0;end<strArray.length;end++) {
			if(strArray[end]==' ') {
				reverse(strArray,start ,end-1);
				start=end+1;
			}
		}
		reverse(strArray, start,strArray.length-1);
		reverse(strArray, 0,strArray.length-1);
	}
	
	static void reverse(char[] charArray, int start, int end) {
		
		while(start<=end) {
			char temp = charArray[start];
			charArray[start] =charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		String str = "Welcome to Gfg";
		char[] charArray = str.toCharArray();
		System.out.println("After reversing words in the string:");
        reverseWords(charArray);
        System.out.println(charArray); 
        
//        String s = "Welcome to Gfg";
//        char[] str = s.toCharArray();
//        System.out.println("After reversing words in the string:");
//        reverseWords(str);
//        System.out.println(str);  
	}

}
