package com.junittesting;

public class util {
private util() {
		
	}
	
	public static int dayOfWeek(int d, int m, int y) {
		int y0=0, x=0, m0=0, d0=0;
		y0 = y - (14-m)/12;
		x = y0 + (y0/4) - (y0/100) + (y0/400);
		m0 = m + 12 * ((14-m)/12)-2;
		d0 = (d+x+(31*m0)/12)%7;
		return d0;
	}
	
	public static void tempConversion(int choice, double temp) {
		if(choice == 1) {
			double far = (temp*(9/5))+32;
			System.out.println("Temperature in Farenheit = "+ far);
			
		}else if(choice == 2) {
			double cel = (temp - 32)*5/9;
			System.out.println("Temperature in Celsius = " + cel);
		}else {
			System.out.println("Not a valid option");
		}
	}
	
	public static double monthlyPayment(double P, int Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = (P*r) / (1 - (Math.pow(1+r,-n)));
		return payment;
		
	}
	
	public static double sqrt(int c) {
		double t = c;
		double epsilon = 0.000000000000001;

		while(Math.abs(t-(c/t))>(epsilon*t)) {
			t = ((c/t)+t)/2;
		}
		return t;
	}
	
	public static int toBinary(int n) {
		int binary[] = new int[100];    
	    int index = 0;  
	    int count = 0;
	    while(n > 0){    
	      binary[index++] = n%2;    
	      n = n/2;    
	      count++;
	    }   
	    
	    int ans = 0;
	    for(int i=count-1; i>=0; i--)
	    	ans = 10 * ans + binary[i];
	    return ans;
	}
}
