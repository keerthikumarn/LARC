package com.leetcode.problems.july.week3;

public class MathPower {

	public static void main(String[] args) {
		System.out.println(myPow(2, 5));
	}

	public static double myPow(double x, int n) {
		if (n < 0) {
			return 1.0 / computePower(x, -n);
		} else {
			return computePower(x, n);
		}
	}

	private static double computePower(double x, int n) {
		if (n == 0) {
			return 1.0;
		}
		if (n == 1) {
			return x;
		}

		double val = computePower(x, n / 2);

		if (n % 2 == 0) {
			return val * val;
		} else {
			return val * val * x;
		}
	}

}
