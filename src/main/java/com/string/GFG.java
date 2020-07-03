package com.string;


import java.util.Arrays;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		smallestDistWin("AABBBCBB");

	}
	//
	static int smallestDistWin(String str){
	    int n = str.length();
	    boolean[] visited = new boolean[256];
	    Arrays.fill(visited,false);
	    int distinct = 0;
	    for(int i = 0; i < n; i++){
	        if(!visited[str.charAt(i)]){
	            visited[str.charAt(i)] = true;
	            distinct++;
	        }
	    }
		System.out.println(distinct);
		int[] curr_count = new int[256];
	    Arrays.fill(curr_count,0);
	    int start = 0;
	    int count =0;
	    int len =Integer.MAX_VALUE;
	    for(int i = 0; i<n;i++){
	        char ch = str.charAt(i);
	        curr_count[ch]++;
	        if(curr_count[ch]==1){
	            count++;
	        }
	        if(count==distinct){
	            while(curr_count[str.charAt(start)]>1){
	                curr_count[str.charAt(start)]--;
	                start++;
	            }
	            len = Math.min(len,i-start+1);
	        }
	    }
	    
	    return len;
	    
	}
}