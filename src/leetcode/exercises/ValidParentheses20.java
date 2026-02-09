package leetcode.exercises;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
public class ValidParentheses20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean res = isValid("([)]");
		System.out.println(res);

	}
	
	public static boolean isValid(String s) {

        //Basic case
        if (s.isEmpty() || s.length() ==0) return false;

        // we insert in a stack and pop and compare
        Stack<Character> stack = new Stack<>();

        char [] array = s.toCharArray();

        for (char c: array) {
            if (c == '(') {
                stack.add(')');
            } else if (c == '{') {
                stack.add('}');
            } else if (c == '[') {
                stack.add(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.empty();
        
    }

}
