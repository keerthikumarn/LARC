package com.leetcode.problems.may.week2;

/**
 * 
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3326/
 * 
 * An image is represented by a 2-D array of integers, each integer representing
 * the pixel value of the image (from 0 to 65535).
 * 
 * Given a coordinate (sr, sc) representing the starting pixel (row and column)
 * of the flood fill, and a pixel value newColor, "flood fill" the image.
 * 
 * To perform a "flood fill", consider the starting pixel, plus any pixels
 * connected 4-directionally to the starting pixel of the same color as the
 * starting pixel, plus any pixels connected 4-directionally to those pixels
 * (also with the same color as the starting pixel), and so on. Replace the
 * color of all of the aforementioned pixels with the newColor.
 * 
 * At the end, return the modified image.
 * 
 * @author kenarayan
 *
 */

public class FloodFill {

	public static void main(String[] args) {

	}

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc]; // current color no.of the given cell i.e. image[i][j]
        if (color != newColor) {
        	fillColor(image, sr, sc, color, newColor);
        }
        return image;
    }

	public void fillColor(int[][] image, int row, int col, int color, int newColor) {
		if (image[row][col] == color) {
			image[row][col] = newColor;
			//Traverse thru all the directions from the mid point cell i.e. UP - DOWN - RIGHT - LEFT
			if (row >= 1) {
				fillColor(image, row - 1, col, color, newColor);
			}
			if (col >= 1) {
				fillColor(image, row, col - 1, color, newColor);
			}
			if (row + 1 < image.length) {
				fillColor(image, row + 1, col, color, newColor);
			}
			if (col + 1 < image[0].length) {
				fillColor(image, row, col + 1, color, newColor);
			}
		}
	}

}
