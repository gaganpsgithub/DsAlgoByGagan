package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class DemoTest {

	static void removeDuplicate(List<List<Integer>> inputList) {
      	
        HashMap<List<Integer>, Integer> hm = new HashMap<List<Integer>, Integer>();
        int count=0;
        for(List<Integer> arr: inputList) {
        	hm.put(arr, count);
        	count++;
        }
        
        for(Entry<List<Integer>, Integer> map:hm.entrySet()){
           System.out.println(map.getKey()); 
           System.out.println(map.getValue()); 
        }
	}
	
//	static void removeDuplicate(int[][] matArr) {
//      	
//        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//        int count=0;
//        for(int[] arr: matArr) {
//        	hm.put(Arrays.toString(arr), count);
//        	count++;
//        }
//        
//        for(Entry<String, Integer> map:hm.entrySet()){
//           System.out.println(map.getKey()); 
//           System.out.println(map.getValue()); 
//        }
//	}
	
	public static void main(String[] args) {
		
		int[][] test={{1, 1, 1, 0},
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {0, 0, 0, 1}};
			
		List<List<Integer>> inputList = new ArrayList<List<Integer>>();
		for(int i=0;i<test.length;i++) {
			List<Integer> list = new ArrayList<Integer>();
			for(int j=0;j<test.length;j++) {
				list.add(test[i][j]);
			}
			inputList.add(list);
		}
//		removeDuplicate(test);
		removeDuplicate(inputList);
	}
}
