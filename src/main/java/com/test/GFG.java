package com.test;
// Java program to count number of
// possible ways to a given score
// can be reached in a game where
// a move can earn 3 or 5 or 10
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GFG
{
	// Returns number of ways to reach score n
	static int count(int n) {
		// table[i] will store count of solutions for
		// value i.
		if(n<0)
			return 0;


		int table[] = new int[n + 1];
		int i;

        // Initialize all table values as 0
		Arrays.fill(table, 0);

		// Base case (If given value is 0)
		table[0] = 1;

		// One by one consider given 2
		// moves and update the table[]
		// values after the index greater
		// than or equal to the value of
		// the picked move
		for (i = 2; i <= n; i++) {
			table[i] += (i - 2) >= 0 ? table[i - 2] : 0;
			table[i] += (i - 4) >= 0 ? table[i - 4] : 0;
			table[i] += (i - 6) >= 0 ? table[i - 6] : 0;


		}
		return table[n];

	}

		// Driver code
		public static void main(String[] args)
		{
			int m = 6;
			System.out.println("Count for " + m + " is " + count(m));

			m = 13;
			System.out.println("Count for " + m + " is " + count(m));
		}
	}
// This code is contributed by Anant Agarwal.



/*for (i=3; i<=n; i++){
table[i] += (i-3)>=0?table[i-3]:0;
table[i] += (i-5)>=0?table[i-5]:0;
table[i] += (i-10)>=0?table[i-10]:0;
}*/