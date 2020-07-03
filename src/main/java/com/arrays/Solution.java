package com.arrays;// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;
import java.util.*;
import java.util.stream.*;

// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static List<Integer> cellCompete(int[] states, int days) {
        int n = states.length;
        int[] dup = new int[n];

        int start = 0;

        while (days > 0) {
            for (int i = 0; i < n; i++) {
                if (i == 0 && start == states[i + 1]) {
                    dup[i] = 0;
                } else if (i != n - 1 && states[i - 1] == states[i + 1]) {
                    dup[i] = 0;
                } else if (i == n - 1 && start == states[i - 1]) {
                    dup[i] = 0;
                } else
                    dup[i] = 1;
            }
            days--;
            for (int i = 0; i < n; i++) {
                states[i] = dup[i];
                System.out.print(states[i] + " ");
            }
        }

        //List<Integer> list = Arrays.asList(states);

        return Arrays.stream(states).boxed().collect(Collectors.toList());

    }



    public static void main(String[] args) {
        int arr[] = {1, 1,1, 0,1,1,1, 1};
        List<Integer> res = cellCompete(arr,2);


    }
}