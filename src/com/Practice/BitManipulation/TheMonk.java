package com.Practice.BitManipulation;

import java.math.BigInteger;
import java.util.Scanner;

public class TheMonk {
	static BigInteger countbits(BigInteger n) {
		BigInteger count = new BigInteger("0");
		BigInteger zero = new BigInteger("0");
		BigInteger k = new BigInteger("1");
		BigInteger a;
		while (!n.equals(zero)) {
			a = n.and(k);

			if (a.equals(k)) {
				count = count.add(k);
			}
			n = n.shiftRight(1);

		}

		return count;
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				BigInteger n = sc.nextBigInteger(), m = sc.nextBigInteger();
				BigInteger h = new BigInteger("1");

				BigInteger p = n.xor(m);
				BigInteger count = countbits(p);
				System.out.println(count);
			}
		} catch (Exception e) {

		}

	}
}
