package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
	  
	public static List<Integer> find_Product_in_array(List<Integer> nums)
	{
		int n = nums.size();

		int[] left_element = new int[n];
		int[] right_element = new int[n];

		left_element[0] = 1;
		for (int i = 1; i < n; i++) {
			left_element[i] = nums.get(i-1) * left_element[i - 1];
		}

		right_element[n - 1] = 1;
		for (int j = n - 2; j >= 0; j--) {
			right_element[j] = nums.get(j+1) * right_element[j + 1];
		}

		for (int i = 0; i < n; i++) {
			nums.add(i, left_element[i] * right_element[i]);
		}
	return nums;	
	}
	
	    public static void main(String args[]) 
	    {    List<Integer> nums1 = new ArrayList<Integer>(
	            Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//	    	int[] nums1 = { 1, 2, 3, 4, 5, 6, 7};
//		System.out.println("Original array:\n"+Arrays.toString(nums1));
		System.out.println(find_Product_in_array(nums1).size());
		
	    } 

}
