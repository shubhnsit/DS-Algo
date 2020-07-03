package com.string;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "i like programming very much";
        reverseWords(s);
    }

    private static void reverseWords(String s) {

        String[] words = s.split(" ");
        String[] reverseWords = new String[words.length];

        for(int i=0;i<words.length;i++){
           reverseWords[i]  = reverseString(words[i]);
            System.out.print(reverseWords[i] + " ");
        }
        System.out.println();
        System.out.println(reverseString(Arrays.stream(reverseWords).collect(Collectors.joining(" "))));

    }

    /* Function to print reverse of the passed string */
    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    // like ===>> ekil
    private static String reverseString(String str) {

        char[] charArray = str.toCharArray();

        int i = 0;
        int j = charArray.length-1;

        char temp;

        while(i<=j){
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        return String.valueOf(charArray);

    }


}
