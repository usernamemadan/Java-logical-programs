package com.junittesting;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int x = sc.nextInt();
		System.out.println("Binary value = " + util.toBinary(x));
		int swappedValue = (x & 0x0F) << 4 | (x & 0xF0) >> 4;
		System.out.println("After Swapping");
		util.toBinary(swappedValue);
	    System.out.println(swappedValue);
	} 
}
