package com.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class IntersectionOfTwoArraysEfficient {

	static int intersection(int[] arr1, int[] arr2) {
		int count=0;
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int x: arr1) {
			hashSet.add(x);
		}
		for(int y: arr2) {
			if(hashSet.contains(y))
			{
				count++;
				hashSet.remove(y);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,20,10,30,20};
		int[] arr2 = {20,10,10,40};
		System.out.println(intersection(arr1, arr2));
	}

}
