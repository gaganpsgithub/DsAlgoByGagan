package com.codeTest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrintUserOccurance {

	
	static HashMap<String, ArrayList<String>> findUser(String[][] input) {
		HashMap<String, ArrayList<String>> hashMapValues = new HashMap<String, ArrayList<String>>();
		for(int i=0;i<input.length;i++) {
			if(hashMapValues.containsKey(input[i][1])) {
				ArrayList<String> hashValues = new ArrayList<String>();
				hashValues = hashMapValues.get(input[i][1]);
				hashValues.add(input[i][0]);
				hashMapValues.put(input[i][1], hashValues);
			}
			else {
				ArrayList<String> hashValues = new ArrayList<String>();
				hashValues.add(input[i][0]);
				hashMapValues.put(input[i][1], hashValues);
			}
		}
		System.out.println(hashMapValues);
		HashMap<String, ArrayList<String>> finalHash = new HashMap<String, ArrayList<String>>();
		for ( Map.Entry<String, ArrayList<String>> entry : hashMapValues.entrySet()) {
			String key = entry.getKey();
			System.out.println(key);
			ArrayList<String> value = entry.getValue();
			System.out.println(value);
			finalHash.put(key, minAndMax(value));
		}
		return finalHash;
	}
	
	static ArrayList<String> minAndMax(ArrayList<String> value) {
		
		int min=Integer.parseInt(value.get(0));
		int max=Integer.parseInt(value.get(0));
		ArrayList<String> valueString = new ArrayList<String>();
		if(value.size()==0) {
			valueString.add("");
			return valueString;
		}else if(value.size()==1) {
			valueString.add(value.get(0));
			return valueString;
		}
		for(int i=1;i<value.size();i++) {
			
			min = Math.min(min, Integer.parseInt(value.get(i)));
			max = Math.max(max, Integer.parseInt(value.get(i)));
		}
		System.out.println(min);
		System.out.println(max);
		
		valueString.add(Integer.toString(min));
		valueString.add(Integer.toString(max));
		
		return valueString;
		
	}
	
	
	
	public static void main(String[] args) {
		
		String[][] logs1 = new String[][] {
	        { "58523", "user_1", "resource_1" },
	        { "62314", "user_2", "resource_2" },
	        { "54001", "user_1", "resource_3" },
	        { "200", "user_6", "resource_5" },
	        { "215", "user_6", "resource_4" },
	        { "54060", "user_2", "resource_3" },
	        { "53760", "user_3", "resource_3" },
	        { "58522", "user_22", "resource_1" },
	        { "53651", "user_5", "resource_3" },
	        { "2", "user_6", "resource_1" },
	        { "100", "user_6", "resource_6" },
	        { "400", "user_7", "resource_2" },
	        { "100", "user_8", "resource_6" },
	        { "54359", "user_1", "resource_3"},
	    };
	    
	    System.out.println(findUser(logs1));

	}

}
