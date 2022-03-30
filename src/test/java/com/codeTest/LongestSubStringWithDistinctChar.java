package com.codeTest;

public class LongestSubStringWithDistinctChar {

	static boolean areDistinct(String str, int i, int j) {
		
		boolean[] visited = new boolean[256];
		for(int k=i;k<=j;k++) {
			if(visited[str.charAt(k)])
				return false;
			visited[str.charAt(k)]=true;
		}
		return true;
	}
	
	static int longestDistinct(String str) {
		int res=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(areDistinct(str,i,j))
					res=Math.max(res, j-i+1);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(longestDistinct("abaacd"));

	}

}
