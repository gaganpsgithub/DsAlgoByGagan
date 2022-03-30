package com.array;

public class EquilibriumPoint {

	static int findSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		return sum;
	}
	
	static boolean isEquilibrium(int[] arr, int sum) {
		
		int leftSum=0;
		for(int i=0;i<arr.length;i++) {
			if(leftSum==sum-arr[i])
				return true;
			leftSum += arr[i];
			sum -= arr[i];
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,8,-9,22,6};
		
		int sum = findSum(arr);

		boolean isEquil = isEquilibrium(arr, sum);
		System.out.println(isEquil);
	}

}
