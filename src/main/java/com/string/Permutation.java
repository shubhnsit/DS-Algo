package com.string;

import java.util.HashSet;

public class Permutation {


    // used set to avoid duplicates
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        String s = "abca";

        permute(s.toCharArray(),0,s.toCharArray().length);
    }

    // fix A and change position of b and c --> similarly for b and c
    private static void permute(char[] arr,int low,int high) {


        if(low==high) {

            if(!set.contains(String.valueOf(arr))){
                set.add(String.valueOf(arr));
                System.out.println(arr);
            }

        }
        else {
            for (int i = low; i <= high - 1; i++) {
                char temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;

                permute(arr, low + 1, high);

                temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;

            }
        }

    }


    }

