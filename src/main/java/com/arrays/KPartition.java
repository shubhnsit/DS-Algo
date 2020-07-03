package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

class KPartition
{
	private static boolean checkSum(int sumLeft[], int k)
	{
		boolean r = true;
		for (int i = 0; i < k; i++)
		{
			if (sumLeft[i] != 0)
				r = false;
		}

		return r;
	}


	private static boolean subsetSum(int S[], int n, int sumLeft[],
									int A[], int k)
	{
		if (checkSum(sumLeft, k))
			return true;

		if (n < 0)
			return false;

		boolean result = false;


		for (int i = 0; i < k; i++)
		{
			if (!result && (sumLeft[i] - S[n]) >= 0)
			{
				A[n] = i + 1;

				sumLeft[i] = sumLeft[i] - S[n];

				result = subsetSum(S, n - 1, sumLeft, A, k);

				sumLeft[i] = sumLeft[i] + S[n];
			}
		}

		return result;
	}


	public static void partition(int[] S, int k)
	{
		int n = 8;


		if (n < k) {
			System.out.println("k-Partition of set S is not Possible");
			return;
		}

		int sum = 8;
		int[] A = new int[n];

		int[] sumLeft = new int[k];
		Arrays.fill(sumLeft, sum/k);

		boolean result = (sum % k) == 0 &&
						subsetSum(S, n - 1, sumLeft, A, k);

		if (!result) {
			System.out.println("k-Partition of set S is not Possible");
			return;
		}

		for (int i = 0; i < k; i++)
		{
			System.out.print("Partition " + i + " is: ");
			for (int j = 0; j < n; j++)
				if (A[j] == i + 1)
					System.out.print(S[j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		int S[] = { 7, 3, 5, 12, 2, 1, 5, 3, 8, 4, 6, 4 };
		int k = 5;

		partition(S, 4);
	}
}