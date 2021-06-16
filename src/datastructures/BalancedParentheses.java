package datastructures;

import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		
		String string = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		char str[] = string.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length; i++) {
			if(str[i] == '(') {
				stack.push(str[i]);
			}else if(str[i] == ')') {
				stack.pop();
			}
		}
		if(stack.isEmpty())
			System.out.println("It is a balanced parentheses");
		else
			System.out.println("It is a unbalanced parentheses");

	}

}
