package com.string;

public class LongestPalindromicString {

    public static void main(String[] args) {
        String str = "abcdcba";
        String str1 = "forgeeksskeegfor";
    //    boolean palindrome = isPalindrome(str.toCharArray(), 0, str.toCharArray().length - 1);
        boolean palindrome1 = isPalindrome(str1.toCharArray(), 0, str1.toCharArray().length - 1);
     //   System.out.println(palindrome);
      //  System.out.println(longestPalindrome(str1.toCharArray()));
    }

    private static boolean isPalindrome(char[] chars, int low, int high) {
        if(low==high){
            return true;
        }

        if(chars[low]==chars[high] && isPalindrome(chars,low+1,high-1)){
            return true;
        }

        return false;

    }

    /*private static String longestPalindrome(char[] chars){



      int maxLength = 0;
      int start = 0;
      int i = 1;
      int low = i-1;
      int high = i;

      while(high>low){

          if(chars[low]==chars[high])

      }




        }
*/
}
