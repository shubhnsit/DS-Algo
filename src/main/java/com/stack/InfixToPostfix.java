package com.stack;

import java.util.Stack;

public class InfixToPostfix {


    public static void main(String[] args) {

        String input = "A + (B-C) * D";

        String output = convert(input);
        System.out.print(output);

    }

    static String convert(String input){

        char[] inpArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        Stack<Character> s = new Stack<>();


        for(int i=0;i<inpArray.length;i++){

            if(Character.isLetter(inpArray[i])){
             sb.append(inpArray[i]);
            }

            else if(inpArray[i]== '+' || inpArray[i]== '-' || inpArray[i]== '*'){
             s.push(inpArray[i]);
            }

            else if(inpArray[i]=='('){
                s.push(inpArray[i]);
            }

            else if(inpArray[i]==')'){
                char res = s.pop();
                while(res!='('){

                }

            }

        }

        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        return sb.toString();


    }
}
