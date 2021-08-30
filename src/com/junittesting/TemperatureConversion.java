package com.junittesting;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		double temp;
		double cel;
		double far;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature"); 
		temp = sc.nextDouble();
		int choice;
		System.out.println("Enter the choice \n1.Celsius to Farenheit \n2.Farenheit to Celsius");
		choice = sc.nextInt();
		
		util.tempConversion(choice, temp);
		
		
	}
}
