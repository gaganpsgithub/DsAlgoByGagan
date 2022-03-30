package com.array;

public class PrefixSumArray {

	static int getSum(int[] arr, int left, int right) {
		
		if(left!=0) {
			return  arr[right]-arr[left-1];
		}
		else {
			return arr[right];
		}
	}
	
	static int[] prefixSum(int[] arr) {
		
		int[] prefixSumArray = new int[arr.length];
		prefixSumArray[0]= arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixSumArray[i]=prefixSumArray[i-1]+arr[i];
		}
		return prefixSumArray;
	}
	
	public static void main(String[] args) {
		int[] arr={2, 8, 3, 9, 6, 5, 4};
		
		int[] preFixSumArray = prefixSum(arr);
		int left = 2;
		int right = 4;
		int sum=getSum(preFixSumArray, left, right);

		System.out.println(sum);
	}

}
