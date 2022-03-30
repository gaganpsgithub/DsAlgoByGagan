package com.hashing;

public class LongestSubArrayWithgivenSumNaive {

	static int subArraywithSum(int[] arr, int sumValue) {
		
		int length = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum +=arr[j];
				if(sum==sumValue) {
					length = Math.max(length, j-i+1);
				}
			}	
		}
		return length;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,8,-4,-4,9,-2,2};
		int sum = 0;
		System.out.println(subArraywithSum(arr, sum));

	}

}
