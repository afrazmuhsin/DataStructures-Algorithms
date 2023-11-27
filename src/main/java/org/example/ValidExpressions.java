package org.example;

import java.util.Stack;

public class ValidExpressions {
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
                default:{
                    if(stack.isEmpty() || stack.pop()!= c)
                        return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
