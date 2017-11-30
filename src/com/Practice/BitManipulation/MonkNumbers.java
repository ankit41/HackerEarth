package com.Practice.BitManipulation;

import java.util.Scanner;

public class MonkNumbers {
	static long countbits(long n) {
		long a, count = 0;
		while (n != 0) {
			a = n & 1;
			if (a == 1) {
				count++;
			}
			n = n >> 1;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(), k = sc.nextInt();
			int[] inp = new int[n];
			int[] sort = new int[n];
			for (int j = 0; j < n; j++) {
				inp[j] = sc.nextInt();
				sort[j] = (int) countbits(inp[j]);

			}

			int temp = 0;
			for (int j = 0; j < n; j++) {
				for (int l = 0; l < n - j - 1; l++) {
					if (sort[l] < sort[l + 1]) {
						temp = sort[l];
						sort[l] = sort[l + 1];
						sort[l + 1] = temp;
					}
				}

			}
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum = sum + sort[j];
			}
			System.out.println(sum);

		}
	}
}
