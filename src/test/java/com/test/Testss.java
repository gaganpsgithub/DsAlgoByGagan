package com.test;

public class Testss {

	static void repeatedChar(String[] str) {
		
		int old = Integer.MAX_VALUE;
		int minSiz=0;
		int index=0;
		for(int i=0;i<str.length;i++) {
			minSiz=Math.min(minSiz, str[i].length());
			index=i;
		}
		
		for(int i=0;i<str.length-1;i++) {
			for(int j=0;j<str[index].length();j++) {
				if(str[i].charAt(j)!=str[index].charAt(j)) {
					old = Math.min(old, j);
					break;
				}	
			}
		}
		System.out.println(str[0].substring(0, old));
	}
	
	public static void main(String[] args) {
		String[] str = {"flower","flow","flight","flock"};
		
		repeatedChar(str);
	}

}
