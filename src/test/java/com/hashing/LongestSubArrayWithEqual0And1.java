package com.hashing;

public class LongestSubArrayWithEqual0And1 {

	static int longestSubArray(int[] arr) {
		int length=0;
		for(int i=0;i<arr.length;i++) {
			int zeroCount=0;
			int oneCount=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]==0)
					zeroCount+=1;
				if(arr[j]==1)
					oneCount+=1;
				if(zeroCount==oneCount)
					length = Math.max(length, j-i+1);
			}
		}
		return length;
	}
	
	public static void main(String[] args) {	
//		int[] arr = {1,0,1,1,1,0,0};
//		int[] arr = {1,1,1,1};
//		int[] arr = {0,0,1,1,1,1,1,0};
		int[] arr = {0,0,1,0,1,1};
		System.out.println(longestSubArray(arr));
	}
}
