package com.leetcode.problems.april.week3;

import java.util.Stack;

public class ValidParenthesis {

	static boolean isValidParenthesis = false;
	static char OPEN_BRACKET = '(';
	static char CLOSE_BRACKET = ')';
	static char ASTERISK= '*';

	public static void main(String[] args) {
		String str = "(())()())(*))(((((())()*))**))**()(*(()()*)(**(())()**)((**(()(((()()**)())*(*))(())()()*";
		System.out.println(checkValidString(str));
	}
	
	public static boolean checkValidString(String s) {
		if (s.length() <= 0) {
			return true;
		}
		int len = s.length();
		int balance = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == ')') {
				balance--;
			} else {
				balance++;
			}
			if (balance < 0) {
				return false;
			}
		}
		if(balance == 0){
			return true;
		}
		balance = 0;
		for (int i = len - 1; i >= 0; i--) {
			if (s.charAt(i) == '(') {
				balance--;
			} else {
				balance++;
			}
			if(balance < 0){
				return false;
			}
		}
		return true;
	}

	public static boolean checkValidString1(String s){
		int len = s.length();
		Stack<Integer> star = new Stack<Integer>();//to hold all '*' characters
		Stack<Integer> open = new Stack<Integer>(); // to hold all '(' characters
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '*') {
				star.push(i);
			} else if (s.charAt(i) == '(') {
				open.push(i);
			} else {
				if (!open.empty()) {
					open.pop();
				} else if (!star.empty()) {
					star.pop();
				} else {
					return false;
				}
			}
		}
		
		while (!open.empty()) {
			if (star.empty())
				return false;
			else if (open.peek() < star.peek()) {
				open.pop();
				star.pop();
			} else {
				return false;
			}
		}
		return true;
		
	}

	/*public static void validateString(StringBuilder sb, int i) {
		if (i == sb.length()) {
			isValidParenthesis |= valid(sb);
		} else if (sb.charAt(i) == ASTERISK) {
			for (char ch : "() ".toCharArray()) {
				sb.setCharAt(i, ch);
				validateString(sb, i + 1);
				if (isValidParenthesis)
					return;
			}
			sb.setCharAt(i, ASTERISK);
		} else
			validateString(sb, i + 1);
	}

	public static boolean valid(StringBuilder sb) {
		int bal = 0;
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c == OPEN_BRACKET)
				bal++;
			if (c == CLOSE_BRACKET)
				bal--;
			if (bal < 0)
				break;
		}
		return bal == 0;
	}*/

}
