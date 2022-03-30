package com.test;

import java.util.HashMap;

public class TwoArray {

	static HashMap<Integer, String[]> longestRepeated(String[] user0, String[] user1){
		
		HashMap<Integer, String[]> hashMap = new HashMap<Integer, String[]>();
		String[] stringArray = new String[user0.length];
		int j=0;
		int count=0;
		for(int i=0;i<user0.length;i++) {
			System.out.println(user0[i]);
			System.out.println(user1[j]);
			if(user0[i]==user1[j]) {
				stringArray[count]=user0[i];
				j++;
				count++;
			}else if(count==0) {
				j++;
			}
			else if(user0[i]!=user1[j] && count!=0) {
				hashMap.put(count, stringArray);
				j=0;
				count=0;
			}
		}
		return hashMap;
	}
	
	public static void main(String[] args) {
		String[] user0 = {"/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"};
	    String[] user1 = {"/start", "/pink", "/register", "/orange", "/red", "a"};
	    
	    HashMap<Integer, String[]> finalHashMap = longestRepeated(user0, user1);
	    System.out.println(finalHashMap.size());
//	    int longest = 0;
//	    for(Map.Entry<Integer, String[]> map: finalHashMap.entrySet()) {
//	    	longest=Math.max(longest, map.getKey());
//	    	
//	    }
//	    System.out.println(longest);
//	    System.out.println(finalHashMap.get(longest));

	}

}
