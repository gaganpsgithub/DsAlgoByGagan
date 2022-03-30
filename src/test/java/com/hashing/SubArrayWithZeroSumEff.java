package com.hashing;

import java.util.HashSet;

public class SubArrayWithZeroSumEff {

	static boolean subArrayZeroSum(int[] arr) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		int pre_sum = 0;
		for(int i=0;i<arr.length;i++) {
			pre_sum += arr[i];
			if(h.contains(pre_sum))
				return true;
			if(pre_sum==0)
				return true;
			h.add(pre_sum);
		}
		return false;
	}
	
	public static void main(String[] args) {
//		int[] arr = {1,4,13,-3,-10,5};
		int[] arr = {-1,4,-2,5,1};
		System.out.println(subArrayZeroSum(arr));

	}

}
