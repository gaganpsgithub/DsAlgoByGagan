package com.hashing;

public class SumWithPairEfficient {

	static boolean isPairedSum(int[] arr, int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==sum)
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr= {8,4,3,9};
		int sum = 13;
		System.out.println(isPairedSum(arr, sum));
	}
}
