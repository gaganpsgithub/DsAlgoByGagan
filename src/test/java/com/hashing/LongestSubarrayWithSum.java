package com.hashing;

import java.util.HashMap;

public class LongestSubarrayWithSum {

	static int longestSubArray(int[] arr, int sum) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int preSum=0;
		int res=0;
		for(int i=0;i<arr.length;i++) {
			preSum += arr[i];
			if(preSum==sum)
				res=i+1;
			if(!hm.containsKey(preSum))
				hm.put(preSum, i);
			if(hm.containsKey(preSum-sum))
				res = Math.max(res, i-hm.get(preSum-sum));
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {8,3,1,5,-6,6,2,2};
		int sum = 4;
		System.out.println(longestSubArray(arr, sum));

	}

}
