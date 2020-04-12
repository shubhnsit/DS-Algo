package com.dynamicProgramming;


public class WordBreakProblem {

    static String dictionary[] = { "mobile", "samsung", "sam",
            "sung", "man", "mango",
            "icecream", "and", "go",
            "i", "like", "ice", "cream" };

    public static void main(String[] args) {

        String input = "ilikesamsung";

        wordBreak(input);
    }

    private static void wordBreak(String input) {
        wordBreakUtil(input,input.length(),"");

    }


    private static void wordBreakUtil(String str, int n,String result) {

        for (int i=1; i<=n; i++)
        {
            //extract substring from 0 to i in prefix
            String prefix = str.substring(0, i);

            // if dictionary conatins this prefix, then
            // we check for remaining string. Otherwise
            // we ignore this prefix (there is no else for
            // this if) and try next
            if (dictionaryContains(prefix))
            {
                // if no more elements are there, print it
                if (i == n)
                {
                    // add this element to previous prefix
                    result += prefix;
                    System.out.println(result);
                    return;
                }
                wordBreakUtil(str.substring(i, n-i), n-i,
                        result + prefix + " ");
            }
        }      //end fo

    }

    private static boolean dictionaryContains(String substring) {

        int size = dictionary.length;
        for(int i=0;i<size;i++){
            if(dictionary[i].compareTo(substring)==0)
                return true;
        }
        return false;

    }


}

