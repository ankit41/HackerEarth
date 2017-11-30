package com.Practice.BitManipulation;

import java.util.Scanner;

public class MicroAndBinary {
	static int countbits(String n, int len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (n.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), ways[] = new int[t];
		String[] word = new String[t];
		int[] len = new int[t];
		for (int i = 0; i < t; i++) {
			len[i] = sc.nextInt();
			word[i] = sc.next();
		}
		for (int i = 0; i < t; i++) {
			ways[i] = countbits(word[i], len[i]);
		}

		for (int i = 0; i < t; i++) {
			System.out.println(ways[i]);
		}
	}
}
