package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMap3 {

	static void badgeCal(String[][] badge_times) {
		
		HashMap<String, List> hm = new HashMap<String, List>();
		List<Integer> lst;
		for(int i=0;i<badge_times.length;i++) {
			if(!hm.containsKey(badge_times[i][0])){
				lst = new ArrayList<Integer>();
				lst.add(Integer.parseInt(badge_times[i][1]));
			}else
			{
				lst=hm.get(badge_times[i][0]);
				lst.add(Integer.parseInt(badge_times[i][1]));
				
			}
			hm.put(badge_times[i][0], lst.stream().sorted().collect(Collectors.toList()));
		}
		List<Integer> lstR; 
		String str1= hm.toString();
		System.out.println(str1);
		for(Map.Entry<String, List> map:hm.entrySet()) {
			lstR = map.getValue();
			int length=Integer.MIN_VALUE;
			int start=-1;
			int end =-1;
			for(int i=0;i<lstR.size();i++) {
				int temp=lstR.get(i)+100;
				for(int j=i+1;j<=lstR.size()-1;j++) {
					if(lstR.get(j)<=temp && j-i+1>length) {
						start=i;
						end=j;
						length=Math.max(length, j-i+1);
					}
					else
					{
						break;
					}
				}
			}
			System.out.println(length);
			System.out.println(map.getKey());
			System.out.println(start);
			System.out.println(end);
			if(length>0) {
				for(int i=start;i<=end;i++) {
					System.out.println(lstR.get(i));
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
	}
}
