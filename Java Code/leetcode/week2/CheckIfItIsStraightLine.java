package com.leetcode.problems.may.week2;

/**
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y]
 * represents the coordinate of a point. Check if these points make a straight
 * line in the XY plane.
 * 
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3323/
 * 
 * @author kenarayan
 *
 */

public class CheckIfItIsStraightLine {

	public static void main(String[] args) {
		/*
		 * System.out .println(checkStraightLine(new int[][] { { 1, 1 }, { 2, 2
		 * }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 7, 7 } })); System.out
		 * .println(checkStraightLine(new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4
		 * }, { 4, 5 }, { 5, 6 }, { 6, 7 } }));
		 * System.out.println(checkStraightLine(new int[][] { { 0, 0 }, { 0, 5
		 * }, { 5, 0 }, { 1337, 0 }, { 0, 1337 } }));
		 */
		System.out.println(checkStraightLine(new int[][] { { 2, 1 }, { 4, 2 }, { 6, 3 } }));
	}

	public static boolean checkStraightLine(int[][] coordinates) {
		double baseSlope = 0.0;
		if (coordinates.length == 2) {
			return true;
		}

		int numerator = (coordinates[1][1] - coordinates[0][1]);
		int denominator = (coordinates[1][0] - coordinates[0][0]);

		if (denominator == 0) {
			baseSlope = Integer.MAX_VALUE;
		} else {

			baseSlope = (double) numerator / denominator;

		}
		double currSlope = 0.0;
		for (int i = 1; i < coordinates.length - 1; i++) {
			int num = (coordinates[i + 1][1] - coordinates[i][1]);
			int denom = (coordinates[i + 1][0] - coordinates[i][0]);
			if (denom == 0) {
				currSlope = Integer.MAX_VALUE;
			} else {
				currSlope = (double) num / denom;
			}
			if (baseSlope != currSlope) {
				return false;
			}
		}
		return true;
	}

}
