package com.Practice.BitManipulation;

import java.util.Scanner;

public class CastleGate {
	public static void main(String args[]) throws Exception {
	

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), count = 0, n;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				for (int k = j; k <= n; k++) {

					if ((j ^ k) <= n && j != k) {
						count++;
					}
				}
			}
			System.out.println(count);
			count = 0;
		}

	}
}
