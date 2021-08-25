package com.logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		
		for(int i = 2; i<=n/2; i++)
		{
			if (n % i == 0) {
				System.out.println(n +" is not a prime number");
				System.exit(0);
			} 
		} 
		
		System.out.println(n + " is a prime number");
	}
}
