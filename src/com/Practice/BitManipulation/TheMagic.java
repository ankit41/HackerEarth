package com.Practice.BitManipulation;

import java.util.Scanner;

public class TheMagic {
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
		long t = sc.nextLong();
		for (long i = 0; i < t; i++) {
			long n = sc.nextLong();
			long days = countbits(n);
			System.out.println(days);
		}
	}
}
