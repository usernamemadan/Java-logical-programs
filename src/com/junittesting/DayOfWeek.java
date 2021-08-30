package com.junittesting;

public class DayOfWeek {
	public static void main(String[] args) {
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		 int d0 = util.dayOfWeek(d, m, y);
		
		System.out.println("Day of the week : " + d0);
	}
}
