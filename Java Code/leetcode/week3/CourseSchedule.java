package com.leetcode.problems.july.week3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CourseSchedule {

	static int index = 0;
	
	public static void main(String[] args) {

	}

	private static int[] findOrder(int numCourses, int[][] prerequisites) {
		Map<Integer, List<Integer>> courseMap = new HashMap<Integer, List<Integer>>();
		initDataFromInputs(courseMap, numCourses, prerequisites);
		int[] resultArr = new int[numCourses];
		int[] courses = new int[numCourses];
		index = numCourses - 1;
		//loop thru the no. of courses
		for(int i = 0; i < numCourses; i++) {
			if(!(isInTopologicalOrder(courseMap, courses, resultArr, i))) {
				return new int[0];
			}
		}
		return resultArr;
	}

	private static boolean isInTopologicalOrder(Map<Integer, List<Integer>> courseMap, int[] courses, int[] resultArr,
			int i) {
		if (courses[i] == 1) {
			return false;
		}
		if (courses[i] == 2) {
			return true;
		}
		courses[i] = 1;
		for (Integer j : courseMap.get(i)) {
			if (!isInTopologicalOrder(courseMap, courses, resultArr, j)) {
				return false;
			}
		}
		courses[i] = 2;
		resultArr[index] = i;
		index--;
		return true;
	}

	private static void initDataFromInputs(Map<Integer, List<Integer>> courseMap, int numCourses, int[][] prerequisites) {
		for (int i = 0; i < numCourses; i++) {
			courseMap.put(i, new LinkedList<Integer>());
		}
		for (int i = 0; i < prerequisites.length; i++) {
			courseMap.get(prerequisites[i][1]).add(prerequisites[i][0]);
		}
	}

}
