package com.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueQuestions {

	static void printNonUnique(String str) {
		
		Queue<Character> queue = new LinkedList<Character>();
//		Deque<Character> deQueue = new ArrayDeque<Character>();
		for(int i=0;i<str.length();i++) {
			if(!queue.contains(str.charAt(i))) {
				queue.add(str.charAt(i));
			}
			else {
				if(queue.peek()==str.charAt(i)) {
//					queue.remove;
				}
			}
		}
		System.out.println(queue);
	}
	
	public static void main(String[] args) {
		String str = "abccbe";
		printNonUnique(str);

	}

}
