package com.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {

	static boolean isclosedCorrectly(char a, char b) {
		return ((a=='{' && b=='}') || (a=='[' && b==']') || (a=='(' && b==')'));
	}
	
	static boolean isParanthesisBalanced(String str) {
		
		Deque<Character> dq = new ArrayDeque<Character>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')
				dq.push(str.charAt(i));
			else {
				if(dq.isEmpty())
					return false;
				else if(!isclosedCorrectly(dq.peek(),str.charAt(i)))
					return false;
				else
					dq.pop();
			}
		}
		return(dq.isEmpty());
	}
	
	public static void main(String[] args) {
		String str = "{{[]}}";
		
		System.out.println(isParanthesisBalanced(str));

	}

}
