package com.hashing;

public class SubArrayWithgivenSum {

	static boolean subArraywithSum(int[] arr, int sumValue) {
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum +=arr[j];
				if(sum==sumValue)
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,8,6,13,3,-1};
		int sum = 20;
		System.out.println(subArraywithSum(arr, sum));

	}

}
