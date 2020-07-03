package com.arrays;

public class CountDecoding {

    public static void main(String[] args) {
        int num = 1234;
       int count = countDecoding(String.valueOf(num).toCharArray(),String.valueOf(num).toCharArray().length);
       System.out.print(count);

    }

    // ascii value of A - 97, B - 98 ...... Z-123
    // num == 1234
    private static int countDecoding(char[] digits, int n) {


        if(n == 0 || n ==1 ){
        return 1;
         }

         if(digits[0] == '0'){
            return 0;
         }
        int count =0;

        if(digits[n-1] > '0'){
        count = countDecoding(digits,n-1);
        }

        if(digits[n-2] == '1' || (digits[n-2] == '2' && digits[n-1]<'7')){
            count += countDecoding(digits,n-2);
    }

      return  count;
    }


}






