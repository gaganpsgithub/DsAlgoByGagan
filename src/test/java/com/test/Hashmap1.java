package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Hashmap1 {

//	{{"Martha", "exit"},
//		 {"Paul", "enter"},
//		 {"Martha", "enter"},
//		 {"Martha", "exit"},
//		 {"Jennifer", "enter"},
//		 {"Paul", "enter"},
//		 {"Curtis", "exit"},
//		 {"Curtis", "enter"},
//		 {"Paul", "exit"},
//		 {"Martha", "enter"},
//		 {"Martha", "exit"},
//		 {"Jennifer", "exit"},
//		 {"Paul", "enter"},
//		 {"Paul", "enter"},
//		 {"Martha", "exit"}};
	
	static void badgeEntry(String[][] badge_records) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		HashSet<String> enter = new HashSet<String>();
		HashSet<String> exit = new HashSet<String>();
		
		for(int i=0;i<badge_records.length;i++) {
		
			if(!hm.containsKey(badge_records[i][0])) {
				hm.put(badge_records[i][0], badge_records[i][1]);
			}else if(hm.get(badge_records[i][0])=="exit" && badge_records[i][1]=="enter") {
				hm.put(badge_records[i][0], badge_records[i][1]);
				exit.add(badge_records[i][0]);
			}else if(hm.get(badge_records[i][0])=="enter" && badge_records[i][1]=="exit") {
				hm.remove(badge_records[i][0]);
			}else if(hm.get(badge_records[i][0])=="enter" && badge_records[i][1]=="enter") {
				enter.add(badge_records[i][0]);
			}else {
				exit.add(badge_records[i][0]);
			}
			
		}
		
		System.out.println(hm);
		System.out.println(enter);
		System.out.println(exit);
		
		
		for(Map.Entry<String, String> map:hm.entrySet()) {
			if(map.getValue()=="enter" && !enter.contains(map.getKey()))
				enter.add(map.getKey());
			else if(map.getValue()=="exit" && !exit.contains(map.getKey()))
				exit.add(map.getKey());
		}
		
		System.out.println(hm);
		System.out.println(enter);
		System.out.println(exit);
		
		
		
		
		
//		HashMap<String, List> hm = new HashMap<String, List>();
//		List<String> value;
//		for(int i=0;i<badge_records.length;i++) {
//			
//			if(!hm.containsKey(badge_records[i][0])) {
//				hm.put(badge_records[i][0], Arrays.asList(badge_records[i][1]));
//			}else if(hm.containsKey(badge_records[i][0])) {
//				value=hm.get(badge_records[i][0]);
//				System.out.println(value);
//				System.out.println(badge_records[i][1]);
//				if(!value.contains(badge_records[i][1])) {
//					value.add(badge_records[i][1]);
//				}
//			}
//		}
//		
//		System.out.println(hm);
		
//		HashMap<String, String> hm = new HashMap<String, String>();
//		List<String> exit = new ArrayList<String>();
//		List<String> enter = new ArrayList<String>();
//		for(int i=0;i<badge_records.length;i++) {
//			if(!hm.containsKey(badge_records[i][0])) {
//				hm.put(badge_records[i][0], badge_records[i][1]);
//			}else if(hm.get(badge_records[i][0])=="exit" && badge_records[i][1]=="enter") {
//				if(!exit.contains(badge_records[i][0])) {
//					exit.add(badge_records[i][0]);
//				}
//				hm.put(badge_records[i][0], badge_records[i][1]);
//			}else if(hm.get(badge_records[i][0])=="enter" && badge_records[i][1]=="exit") {
//				hm.remove(badge_records[i][0]);
//			}else if(hm.get(badge_records[i][0])=="exit" && badge_records[i][1]=="exit") {
//				if(!enter.contains(badge_records[i][0])) {
//					hm.put(badge_records[i][0], badge_records[i][1]);
//				}
//			}else if(hm.get(badge_records[i][0])=="enter" && badge_records[i][1]=="enter") {
//				if(!enter.contains(badge_records[i][0])) {
//					enter.add(badge_records[i][0]);
//				}
//				hm.put(badge_records[i][0], badge_records[i][1]);
//			}
//		}
//		System.out.println(hm);
//		System.out.println(exit.size());
//		System.out.println(exit.get(0));
//		System.out.println(exit.get(1));
//		System.out.println(enter.size());
//		System.out.println(enter.get(0));
////		System.out.println(enter.get(1));
	}
	
	public static void main(String[] args) {
		
		 String[][] badge_records = 
		 {{"Martha", "exit"},
		 {"Paul", "enter"},
		 {"Martha", "enter"},
		 {"Martha", "exit"},
		 {"Jennifer", "enter"},
		 {"Paul", "enter"},
		 {"Curtis", "exit"},
		 {"Curtis", "enter"},
		 {"Paul", "exit"},
		 {"Martha", "enter"},
		 {"Martha", "exit"},
		 {"Jennifer", "exit"},
		 {"Paul", "enter"},
		 {"Paul", "enter"},
		 {"Martha", "exit"}};
		 
		 badgeEntry(badge_records);
	

	}

}
