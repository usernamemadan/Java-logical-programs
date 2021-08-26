package com.logicalPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	static Random random = new Random();
	static ArrayList<Integer> arrayList=new ArrayList<>(); 
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scanner.nextInt();
		System.out.println("Enter n digits");
		for( int i=0; i<n; i++)
			arrayList.add(scanner.nextInt());
		int option = 1;
		int count = 0;
		while(option != 0)
		{
			int randomNum = genrateRandomNumber();
			option = processDistictCoupon(randomNum);
			count++;
		}
		System.out.println("Number of random number required to generate given number is :" + count);
		
		
		
	}
	
	public static int genrateRandomNumber()
    {
    	return random.nextInt(10);
    }
	
	public static int processDistictCoupon(int randomNum)
    {
    	int index = arrayList.indexOf(randomNum);
    	if(index != -1)
    	{
    		arrayList.remove(index);
    	}
    	if( arrayList.size() == 0)
    		return 0;
    	else
    		return 1;

    }

	
	
}
