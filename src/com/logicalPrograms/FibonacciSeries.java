package com.logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		System.out.println("enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.print("fibonacci series: " + num1 + "  " + num2);
		for( int i = 2; i < n; i++ )
		{
			num3 = num1 + num2;
			System.out.print("  " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
