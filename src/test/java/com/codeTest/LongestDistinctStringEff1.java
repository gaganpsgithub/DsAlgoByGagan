package com.codeTest;

public class LongestDistinctStringEff1 {

	
	
	static int longestDistinctString(String str) {
		int n=str.length();
		int res = 0;
		for(int i=0;i<n;i++) {
			boolean[] visited = new boolean[256];
			for(int j=i;j<n;j++) {
				if(visited[str.charAt(j)]==true) {
					break;
				}
				else {
					res=Math.max(res, j-i+1);
					visited[str.charAt(j)]=true;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		String str = "aaa";
		System.out.println(longestDistinctString(str));

	}

}
