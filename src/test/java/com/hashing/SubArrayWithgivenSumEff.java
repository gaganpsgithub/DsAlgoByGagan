package com.hashing;

import java.util.HashSet;

public class SubArrayWithgivenSumEff {

	static boolean subArraywithSum(int[] arr, int sumValue) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			if(h.contains(sum))
				return true;
			if(h.contains(sum-sumValue))
				return true;
			h.add(sum);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,8,6,13,3,-1};
		int sum = 21;
		System.out.println(subArraywithSum(arr, sum));

	}

}
