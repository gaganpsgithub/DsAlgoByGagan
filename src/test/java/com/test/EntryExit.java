package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EntryExit {

	static void printExitAndEntryList(String[][] input) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		HashSet<String> noEntry = new HashSet<String>();
		HashSet<String> noExit = new HashSet<String>();
		
		for(int i=0;i<input.length;i++) {
			if(hm.containsKey(input[i][0]) && hm.get(input[i][0])=="enter" && input[i][1]=="exit") {
				hm.remove(input[i][0]);
			}
			else
			{
				hm.put(input[i][0], input[i][1]);
				
				
				if(input[i][1]=="enter")
					noExit.add(input[i][0]);
				else if(input[i][1]=="exit")
					noEntry.add(input[i][0]);
			}
		}
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(noEntry.size());
		for(String x:noEntry) {
			System.out.println(x);
		}
		System.out.println(noExit.size());
		for(String x:noExit) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		
		 String[][] input  = {{"Martha", "exit"},
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
		 
		 printExitAndEntryList(input);
		 
	}

}
