package com.leetcode.problems.november;


/**
 * https://leetcode.com/explore/featured/card/november-leetcoding-challenge/565/week-2-november-8th-november-14th/3526/
 * @author kenarayan
 *
 */
public class FlippingAnImage {

	public static void main(String[] args) {

	}
	
	public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++) {
            int[] currArr = A[i];
            reverseArray(currArr, A[0].length);
            inverseArray(currArr, A[0].length);
        }
        return A;
    }
    
    private void reverseArray(int[] currArr, int size) {
        for(int i = 0; i < size / 2; i++) {
            int value = currArr[i];
            currArr[i] = currArr[size - 1 - i];
            currArr[size - 1 - i] = value;
        }
    }
    
    private void inverseArray(int[] currArr, int size) {
        for(int i = 0; i < size; i++) {
            if(currArr[i] == 0) {
                currArr[i] = 1;
            } else {
                currArr[i] = 0;
            }
        }
    }

}
