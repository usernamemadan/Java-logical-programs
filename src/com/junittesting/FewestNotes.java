package com.junittesting;

import java.util.Scanner;

public class FewestNotes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		
		int[] arr = {1, 2, 5, 10, 50, 100, 500, 1000};
		int temp = n;
		
		for( int i=arr.length-1; i>=0; i--)
		{
			System.out.println("Number of " +arr[i]+ " notes: " + temp/arr[i]);
			temp = temp % arr[i];	
		}
		
	}
}
