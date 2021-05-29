package com.leetcode.problems.april.week2;

import java.util.Stack;

class MinStack {

	Stack<Integer> min;
	Stack<Integer> stack;

	/** initialize your data structure here. */
	public MinStack() {
		stack = new Stack<Integer>();
		min = new Stack<Integer>();
	}

	public void push(int x) {
		int value = 0;
		stack.push(x);
		if(min.isEmpty()) {
			value = Integer.MAX_VALUE;
		}else{
			value = min.peek();
		}
		min.push(Math.min(x, value));
	}

	public void pop() {
		stack.pop();
		min.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min.peek();
	}
}