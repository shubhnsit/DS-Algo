package com.arrays;

import java.util.Arrays;

public class MinimumPlatforms {

    public static void main(String[] args) {

        int start[] = {900,940,950,1100,1500,1800};
        int end[] = {910,1200,1120,1130,1900,2000};

        int result = minimumPlatforms(start,end);
        System.out.print(result);

    }

    private static int minimumPlatforms(int[] start, int[] end) {

        int n = start.length;

        int i=1,j=0;
        Arrays.sort(start);
        Arrays.sort(end);
        int res = 1;
        int platform =1;

        while(i<n && j<n){

            if(start[i]<=end[j]){
                platform++;
                i++;
            }

            else if(start[i]>end[j]){
                platform--;
                j++;
            }

            if(platform>res){
                res = platform;
            }

        }

        return res;

    }


}






