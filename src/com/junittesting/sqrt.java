package com.junittesting;

import java.util.Scanner;

public class sqrt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int c = sc.nextInt();
		double result = util.sqrt(c);
		System.out.println("Square root is : " + result);
		
	}
}
