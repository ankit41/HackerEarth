package com.Practice.Implementation;

import java.util.Scanner;

public class PrintHackerearth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = 0, a = 0, c = 0, k = 0, e = 0, r = 0, t = 0, count = 0;
		long len = sc.nextLong();
		String name = sc.next();
		for (int i = 0; i < len; i++) {
			char p = name.charAt(i);
			if (p == 'h') {
				h++;
			} else if (p == 'a') {
				a++;
			} else if (p == 'c') {
				c++;
			} else if (p == 'k') {
				k++;
			} else if (p == 'e') {
				e++;
			} else if (p == 'r') {
				r++;
			} else if (p == 't') {
				t++;
			}

		}
		for (int i = 1; i <= h; i++) {
			if (h >= 2 * i && a >= 2 * i && e >= 2 * i && r >= 2 * i && c >= 1 * i && k >= 1 * i && t >= 1 * i) {
				count++;
			}
		}
		System.out.println(count);
	}
}
