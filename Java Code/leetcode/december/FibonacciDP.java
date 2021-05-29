package com.algorithms.dp;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FibonacciDP {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Date date = new Date();

		printCurrentTime();
		System.out.println("Fibonacci series without DP : " +fibonacci(num));
		printCurrentTime();
		System.out.println("****************");
		printCurrentTime();
		System.out.println("Fibonacci series with DP : " +fibonacciDP(num));
		printCurrentTime();
	}

	private static long fibonacci(int num) {
		if (num < 3) {
			return 1;
		}
		return fibonacci(num - 2) + fibonacci(num - 1);
	}

	private static long fibonacciDP(int num) {
		long num1 = 1;
		long num2 = 1;
		long currentNum = 2;
		for (int i = 3; i <= num; i++) {
			currentNum = num1 + num2;
			num2 = num1;
			num1 = currentNum;
		}
		return currentNum;
	}

	private static void printCurrentTime() {
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date = new GregorianCalendar();

		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);

		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		System.out.println("Current time is  " + hour + " : " + minute + " : " + second);
	}

}
