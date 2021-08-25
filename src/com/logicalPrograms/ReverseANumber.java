package com.logicalPrograms;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		
		int rem;
		int num = n;
		int rev = 0;
		
		while(num>0)
		{
			rem = num % 10;
			rev = 10 * rev + rem;
			num = num / 10;
		}
		System.out.println("reverse of number " +n+ " is " +rev);
	}
}
