package com.Practice.Implementation;

import java.util.Scanner;

public class LittleJhol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		long len = num.length();
		for (int i = 0; i < len; i++) {
			if ((i + 5) < len) {
				if (num.charAt(i) == '1' && num.charAt(i + 1) == '1' && num.charAt(i + 2) == '1'
						&& num.charAt(i + 3) == '1' && num.charAt(i + 4) == '1' && num.charAt(i + 5) == '1') {
					System.out.println("Sorry, sorry!");
					break;
				} else if (num.charAt(i) == '0' && num.charAt(i + 1) == '0' && num.charAt(i + 2) == '0'
						&& num.charAt(i + 3) == '0' && num.charAt(i + 4) == '0' && num.charAt(i + 5) == '0') {
					System.out.println("Sorry, sorry!");
					break;
				}

			}
			if (i == len - 1) {
				System.out.println("Good luck!");
			}
		}

	}
}
