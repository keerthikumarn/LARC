package com.leetcode.problems.july.week2;


/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3390/
 * 
 * Given two numbers, hour and minutes. Return the smaller angle (in degrees) formed 
 * 
 * between the hour and the minute hand.
 * 
 * @author kenarayan
 *
 */
public class SmallestAngleHourMinute {

	public static void main(String[] args) {
		System.out.println(angleClock(12, 30));
	}
	
	private static double angleClock(int hour, int minutes) {
        double hours = (hour * 60 + minutes) * 0.5;
        double minute = (6 * minutes);
        double angle = Math.abs(hours - minute);
        return Math.min(angle, 360 - angle);
    }

}
