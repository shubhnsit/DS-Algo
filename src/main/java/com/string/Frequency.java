package com.string;

public class Frequency {

    int[] freq = new int[26];

    public static void main(String[] args) {
        String input = "anagram";
        Frequency fb = new Frequency();
        fb.frequency(input);

    }

    private void frequency(String input) {


     for(int i=0;i<input.length();i++){
         freq[input.charAt(i)-'a']++;
     }

     for(int i=0;i<input.length();i++){

         if(freq[input.charAt(i)-'a'] != 0){
             System.out.print(input.charAt(i));
             System.out.print(freq[input.charAt(i)-'a'] + " ");
         }

         freq[input.charAt(i)-'a'] =0;

     }


    }

}
