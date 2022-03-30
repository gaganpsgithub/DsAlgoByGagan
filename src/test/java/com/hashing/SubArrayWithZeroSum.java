package com.hashing;

public class SubArrayWithZeroSum {

	static boolean subArrayZeroSum(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==0)
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
//		int[] arr = {1,4,13,-3,-10,5};
		int[] arr = {-1,4,-3,5,1};
		System.out.println(subArrayZeroSum(arr));

	}

}
