package org.gl.lab3DSA;

import java.util.Stack;


public class BalancedBrackets {

	//Driver code
	public static void main(String args[]) {

		String expression = "([[{}]]))";

		boolean check = checkBrackets(expression);

		if (check) {
			System.out.println("The entered string has balanced brackets");
		} else {
			System.out.println("The entered string do not contain balanced brackets");
		}
	}

	//function to check if brackets are balanced
	static boolean checkBrackets(String expression) {

		Stack<Character> stack = new Stack<Character>();
		// traversing the expression
		for (int i = 0; i < expression.length(); i++) 
		{
			char x = expression.charAt(i);

			if (x == '{' || x == '(' || x == '[') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			char check;
			
			switch(x) {
			case ')':
				check = stack.pop();
				if (check != '(') {
					return false;
				}
				break;
				
			case '}':
				check = stack.pop();
				if (check != '{') {
					return false;
					}
				break;
				
			case ']':
				check = stack.pop();
				if(check != '[') {
					return false;
				}
				break;
			}
		
		}
		return stack.isEmpty();
	}
}
