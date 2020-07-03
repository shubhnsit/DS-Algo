package com.misc;

import java.util.Stack;

public class Paranthesis {

    public static void main(String[] args) {

        String exp = "{}{[()({})]()}{";
        boolean res = isBalanced(exp);
        System.out.print(res);
    }

    private static boolean isBalanced(String exp) {

        Stack<Character> s = new Stack<>();

        for(int i=0;i<exp.length();i++){

                if(exp.charAt(i)=='{' || exp.charAt(i)=='[' || exp.charAt(i)=='('){
                    s.push(exp.charAt(i));
                }

                else if(!s.isEmpty() && matches(exp.charAt(i),s.peek())){
                    s.pop();
                }
                else{
                    return false;
                }

            }

            if(s.isEmpty()) {
                System.out.println(s.toString());
                return true;
            }


        return false;
    }

    private static boolean matches(char c, Character peek) {

        if((peek== '{' && c == '}')  || (peek== '(' && c == ')') || (peek== '[' && c == ']') )
            return true;

        return false;

    }

    }
