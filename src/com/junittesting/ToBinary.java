package com.junittesting;

import java.util.Scanner;

public class ToBinary {
	public static void main(String[] args) {
		System.out.println("Enter the number to be converted to binary");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = util.toBinary(n);
		System.out.println("Binary number = " + ans);
	}
}
