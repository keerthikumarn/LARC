package com.leetcode.problems.november;

import java.util.Stack;

public class BasicCalculator {

	public static void main(String[] args) {
		System.out.println(calculate(" 3+5 / 2 "));
	}
	
	private static int calculate(String s) {
		s = s.trim().replaceAll(" ","");
        //create an array of numbers
        String[] numbers = s.trim().split("[\\+\\-\\*/]+");
        
        //create an array of operands
        String[] operands = s.trim().split("[\\d]+");
        
        //create a stack
        Stack<Integer> numStack = new Stack<Integer>();
        numStack.push(Integer.parseInt(numbers[0]));
        int result = 0;
        //loop thru operands
        for(int i = 1 ; i < operands.length; i++) {
            int temp = Integer.parseInt(numbers[i]);
            /** if OPERAND == "/" */
            if(operands[i].equals("/")) {
                temp = numStack.pop() / temp;
            }
            
            /** if OPERAND == "*" */
            if(operands[i].equals("*")) {
                temp = numStack.pop() * temp;
            }
            
            /** if OPERAND == "-" */
            if(operands[i].equals("-")) {
                temp = -temp;
            }
            numStack.push(temp);
        }
        
        while(numStack.size() > 0) {
            result = result + numStack.pop();
        }
        return result;
    }

}
