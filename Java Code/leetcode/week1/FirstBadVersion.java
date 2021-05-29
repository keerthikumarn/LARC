package com.leetcode.problems.may.week1;

public class FirstBadVersion extends VersionControl {

	public static void main(String[] args) {

	}

	public int firstBadVersion(int n) {
		int low = 1;
		int high = n;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (isBadVersion(mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return high;
	}

	@Override
	public boolean isBadVersion(int n) {
		// TODO Auto-generated method stub
		return false;
	}

}
