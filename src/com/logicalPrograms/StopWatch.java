package com.logicalPrograms;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		System.out.println("enter 1 to start the stopwatch");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long start=0;
		
		if(n == 1)
		{
			System.out.println("stop watch running");
			start = System.currentTimeMillis();
			System.out.println("enter 0 to stop the stopwatch");
		}
		
		while( n !=0 )
			n = scanner.nextInt();
		
		long stop = System.currentTimeMillis();
		long time = ( stop - start)/1000;
		System.out.println("Time elapsed :" + time + " seconds");
		
	}
}
