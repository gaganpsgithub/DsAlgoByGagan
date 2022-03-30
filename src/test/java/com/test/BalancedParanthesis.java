package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {

	static boolean booleanBalancedParanthesis(String str) {
		Deque<Character> deq = new ArrayDeque<Character>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[') {
				deq.push(str.charAt(i));
			}else if(deq.isEmpty()) {
				return false;
			}else if(!notPresent(str.charAt(i), deq.peek())) {
				return false;
			}else {
				deq.pop();
			}
		}
		return deq.isEmpty();	
	}
	
	static boolean notPresent(Character a, Character b) {
		return ((a==')') && (b=='(') || (a==']') && (b=='[') || (a=='}') && (b=='{') );
	}
	
	public static void main(String[] args) {
		String str = "{([])}";
		System.out.println(booleanBalancedParanthesis(str));
		
	}
	
}
