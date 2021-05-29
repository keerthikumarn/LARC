package com.leetcode.problems.july.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/
 * week-2-july-8th-july-14th/3384/
 * 
 * Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the sum
 * of zero.
 * 
 * @author kenarayan
 *
 */

public class ThreeSum {

	public static void main(String[] args) {
		System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
	}

	/*private List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		List<Integer> tripletList = null;
		if (nums.length < 3) {
			return finalList;
		}
		int len = nums.length;
		// Sort the array - the only easiest thing that i can do now :(
		Arrays.sort(nums);
		//Karma is that I should assume that sub array elements should be in non-descending order
		for(int i = 0; i < len; i++){
			if(nums[i] > 0) {
				//This is where our karma with 1 num easily ends up !! Job done !!
				break;
			}
			for(int j = i + 1; j < len; j++){
				if(nums[i] + nums[j] > 0) {
					//karma with 2 nums ends up here !! yeppieee
					break;
				}
				for(int k = j + 1; k < len; k++){
					if (nums[i] + nums[j] + nums[k] == 0) {
						tripletList = new ArrayList<Integer>();
						tripletList.add(nums[i]);
						tripletList.add(nums[j]);
						tripletList.add(nums[k]);
						if(!finalList.contains(tripletList)) {
							finalList.add(tripletList);
						}
					}
				}
			}
		}
		return finalList;
	}*/
	
	private static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		List<Integer> tripletList = null;
		if (nums.length < 3) {
			return finalList;
		}
		int len = nums.length;
		// Sort the array - the only easiest thing that i can do now :(
		Arrays.sort(nums);
		//Karma is that I should assume that sub array elements should be in non-descending order
		for(int i = 0; i < len; i++){
			int j = i + 1;
			//initialize the 3rd num to len of the array
			int k = len - 1;
			//validating the conditions wiht ith indexes
			if(i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			//playing with the 2 Sum factor here 
			while(j < k) {
				if(k < len - 1 && nums[k] == nums[k + 1]) {
					k--;
					continue;
				}
				if(nums[i] + nums[j] + nums[k] > 0) {
					k--;
				}
				else if(nums[i] + nums[j] + nums[k] < 0) {
					j++;
				}else{
					tripletList = new ArrayList<Integer>();
					tripletList.add(nums[i]);
					tripletList.add(nums[j]);
					tripletList.add(nums[k]);
					finalList.add(tripletList);
					k--;
					j++;
				}
			}
		}
		return finalList;
	}

}
