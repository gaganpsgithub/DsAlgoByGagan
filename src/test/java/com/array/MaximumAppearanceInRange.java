package com.array;

public class MaximumAppearanceInRange {

	static int maxOcc(int[] L, int[] R) {
		int[] arr = new int[1000];
		for(int i=0;i<L.length;i++) {
			arr[L[i]]++;
			arr[R[i]+1]--;
		}
		int res=0;
		int max=arr[0];
		
		for(int i=1;i<1000;i++) {
			arr[i]=arr[i]+arr[i-1];
			if(arr[i]>max) {
				max=arr[i];
				res=i;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int L[] = {1, 2, 3}, R[] = {3, 5, 7};

		System.out.println(maxOcc(L, R));

	}

}
