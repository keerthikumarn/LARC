package com.leetcode.problems.april.week3;

public class SearchRotatedSortedArray {

	public static void main(String[] args) {

	}
	
	public static int search(int[] nums, int target) {
		int result = -1;
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int low = 0;
		int high = nums.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if ((nums[0] > target) ^ (nums[0] > nums[mid]) ^ (target > nums[mid])) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		result = low == high && nums[low] == target ? low : result;
		return result;
	}

	public static int search1(int[] nums, int target) {
		if(nums == null || nums.length == 0){
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		while(start < end) {
			int mid = start + (start - end) / 2;
			if(nums[mid] ==  target) {
				return target;
			}
			
			//scan thru the elements from mid to start of the array
			if(nums[start] <= nums[mid]){
				if(target >= nums[start] && target < nums[mid]){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else {
				if(target > nums[mid] && target <= nums[end]){
					start = mid + 1;
				}else{
					end = mid - 1;
				}
			}
		}
		return nums[start] == target ? start : -1;
	}
}
