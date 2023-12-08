package org.example;

import java.util.Stack;

public class ValidExpressions {

//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//
//
//    Example 1:
//
//    Input: s = "()"
//    Output: true
//    Example 2:
//
//    Input: s = "()[]{}"
//    Output: true
//    Example 3:
//
//    Input: s = "(]"
//    Output: false
//
//
    public boolean validExpressionTest(String expression){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0 ; i< expression.length();i++){
            char c = expression.charAt(i);

            switch(c){
                case '{' : {
                    stack.push('}');
                    break;
                }
                case '(' : {
                    stack.push(')');
                    break;
                }
                case '[' : {
                    stack.push(']');
                    break;
                }
                default: {
                    if(stack.isEmpty() || stack.pop()!= c)
                        return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
