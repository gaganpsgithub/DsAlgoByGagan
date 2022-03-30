//package com.test;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//
//public class TestTest {
//	
//	static String destination(HashMap<String, String> map) {
//		
//		HashSet<String> set = new HashSet<String>();
//		String details = "";
//		for(Entry<String, String> map1: map.entrySet()) {
//			set.add(map1.getValue());
//		}
//		
//		for(Entry<String, String> map1: map.entrySet()) {
//			if(!set.contains(map1.getKey())) {
//				details=details+map1.getKey()+map1.getValue();
//				map1.getKey()
//				for(Entry<String, String> map2: map.entrySet()) {
//					details=details+map1.getKey()+map1.getValue();
//				}
//			}
//		}
//		
//		Iterator<String> itr = set.iterator();
//		while(itr.hasNext()) {
//			if(map.get(itr.next())!=null) {
//				details=details+itr.next()+map.get(itr.next());
//			}
//		}
//		
//		
//		
//	}
//	
//	public static void main(String[] args) {
//		
////		Chennai -> Bangalore 
////		 Bombay -> Delhi
////		 Goa    -> Chennai
////		 Delhi  -> Goa
//	
//	HashMap<String, String> initialMap = new HashMap<String, String>();
//		 initialMap.put("Chennai", "Bangalore");
//		 initialMap.put("Bombay", "Delhi");
//		 initialMap.put("Goa", "Chennai");
//		 initialMap.put("Delhi", "Goa");
//		 
//		 System.out.println(destination(initialMap));
//		 
//	}
//}
