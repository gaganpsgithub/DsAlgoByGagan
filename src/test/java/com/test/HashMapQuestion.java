package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapQuestion {

	static void badgeCal(String[][] badge_times) {
		HashMap<String, List> hm = new HashMap<String, List>();
		List<Integer> sampleList;
		for(int i=0;i<badge_times.length;i++) {
			if(hm.containsKey(badge_times[i][0])) {
				sampleList = hm.get(badge_times[i][0]);
				sampleList.add(Integer.parseInt(badge_times[i][1]));
			}
			else
			{
				sampleList = new ArrayList<Integer>();
				sampleList.add(Integer.parseInt(badge_times[i][1]));
			}
			hm.put(badge_times[i][0], sampleList.stream().sorted().collect(Collectors.toList()));
		}
		System.out.println(hm);
		for(Map.Entry<String, List> map:hm.entrySet()) {
			List<Integer> lst = new ArrayList<Integer>();
			lst = map.getValue();
			for(int i=0; i<lst.size(); i++) {
				int length=0;
				int sum=0;
				int intialSum=0;
				for(int j=i; j<lst.size()-1; j++) {
					intialSum = lst.get(i)+100;
					if(lst.get(j+1)<=intialSum) {
						length=Math.max(length, j-i+1);
					}
				}
				if(length>=2)
				{
					System.out.println(map.getKey());
					System.out.println(length);
					System.out.println(i);
					for(int k=i;k<=length;k++)
						System.out.println(lst.get(k));
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		String[][] badge_times = {
				{"Paul", "1355"},
				{"Jennifer", "1910"},
				{"John", "835"},
				{"John", "830"},
				{"Paul", "1315"},
				{"John", "1615"},
				{"John", "1640"},
				{"Paul", "1405"},
				{"John", "855"},
				{"John", "930"},
				{"John", "915"},
				{"John", "730"},
				{"John", "940"},
				{"Jennifer", "1335"},
				{"Jennifer", "730"},
				{"John", "1630"},
				{"Jennifer", "5"}};
		badgeCal(badge_times);
//		List<List<String>> sample = Arrays.asList({"Paul", "1355"})
		
		
	}

}
